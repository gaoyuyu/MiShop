package com.gaoyy.mishop.main.home.recommend;

import android.support.annotation.NonNull;
import android.util.Log;

import com.gaoyy.mishop.api.Constant;
import com.gaoyy.mishop.api.RetrofitService;
import com.gaoyy.mishop.api.bean.RecInfo;
import com.gaoyy.mishop.entity.MultipleRecItem;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by gaoyy on 2018/1/1 0001.
 */

public class RecommendPresenter implements RecommendContract.Presenter
{
    private RecommendContract.View mRecommedView;

    public RecommendPresenter(RecommendContract.View mRecommedView)
    {
        this.mRecommedView = mRecommedView;
        mRecommedView.setPresenter(this);
    }

    @Override
    public void loadRecData()
    {
        Call<RecInfo> call = RetrofitService.sApiService.homeRec();
        mRecommedView.showLoading();
        call.enqueue(new Callback<RecInfo>()
        {
            @Override
            public void onResponse(@NonNull Call<RecInfo> call, @NonNull Response<RecInfo> response)
            {
                if (!mRecommedView.isActive())
                {
                    return;
                }


                RecInfo recInfo = response.body();
                if (recInfo != null && recInfo.isSuccess())
                {
                    mRecommedView.hideLoading();
                    List<String> advList = recInfo.getData().getAdv();
                    List<String> newsList = recInfo.getData().getNewspaper();

                    List<String> normalList = recInfo.getData().getNormal();
                    List<RecInfo.DataBean.GoodsBeanX> goodsList = recInfo.getData().getGoods();
                    Log.d(Constant.TAG, "normal-->" + normalList.toString());

                    // TODO: 2018/1/1 0001 startTask
                    if (newsList.size() != 0)
                    {
                        mRecommedView.startPaperTimerTask(newsList);
                    }

                    List<String> top = recInfo.getData().getTop();

                    List<MultipleRecItem> data = new ArrayList<MultipleRecItem>();
                    data.add(new MultipleRecItem(MultipleRecItem.TOP, top));
                    for (int i = 0; i < normalList.size(); i++)
                    {
                        data.add(new MultipleRecItem(MultipleRecItem.NORMAL, normalList.get(i)));
                    }
                    for (int i = 0; i < goodsList.size(); i++)
                    {
                        data.add(new MultipleRecItem(MultipleRecItem.LIST, goodsList.get(i).getCate(), Integer.valueOf(goodsList.get(i).getMore()), goodsList.get(i).getHeaderBg(), goodsList.get(i).getGoods()));
                    }

                    Log.d(Constant.TAG, "data-->" + data.size());

                    // TODO: 2018/1/1 0001 loadheaderviewpager
                    mRecommedView.showRecData(advList, data);
                }
            }

            @Override
            public void onFailure(@NonNull Call<RecInfo> call, @NonNull Throwable t)
            {

            }
        });
    }

}
