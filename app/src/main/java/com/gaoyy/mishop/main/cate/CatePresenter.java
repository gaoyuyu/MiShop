package com.gaoyy.mishop.main.cate;

import android.support.annotation.NonNull;

import com.gaoyy.mishop.api.RetrofitService;
import com.gaoyy.mishop.api.bean.CateInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by gaoyy on 2018/1/6 0006.
 */

public class CatePresenter implements CateContract.Presenter
{
    private CateContract.View mCateView;

    public CatePresenter(CateContract.View mCateView)
    {
        this.mCateView = mCateView;
        mCateView.setPresenter(this);
    }

    @Override
    public void loadCateData()
    {

        Call<CateInfo> call = RetrofitService.sApiService.cate();
        call.enqueue(new Callback<CateInfo>()
        {
            @Override
            public void onResponse(@NonNull Call<CateInfo> call, @NonNull Response<CateInfo> response)
            {
                if (!mCateView.isActive())
                {
                    return;
                }

                CateInfo cateInfo = response.body();
                if (cateInfo != null && cateInfo.isSuccess())
                {
                    List<String> parentCates = cateInfo.getData().getCate();
                    List<CateInfo.DataBeanXX.GoodsBean> childCates = cateInfo.getData().getGoods();
                    mCateView.showCate(parentCates,childCates);
                }
            }

            @Override
            public void onFailure(@NonNull Call<CateInfo> call, @NonNull Throwable t)
            {

            }
        });
    }
}
