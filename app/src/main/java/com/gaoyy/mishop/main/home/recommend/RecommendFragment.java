package com.gaoyy.mishop.main.home.recommend;


import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gaoyy.mishop.R;
import com.gaoyy.mishop.adapter.RecAdapter;
import com.gaoyy.mishop.api.Constant;
import com.gaoyy.mishop.base.BaseFragment;
import com.gaoyy.mishop.entity.MultipleRecItem;
import com.squareup.picasso.Picasso;
import com.wang.avi.AVLoadingIndicatorView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import cn.bingoogolapple.bgabanner.BGABanner;

public class RecommendFragment extends BaseFragment implements RecommendContract.View
{

    private List<String> advList = new ArrayList<>();
    private static List<String> newsList = new ArrayList<>();
    private BGABanner banner;
    private LinearLayout recHeaderReallyWant;
    private LinearLayout recHeaderSimDeposit;
    private LinearLayout recHeaderMiSim;
    private LinearLayout recHeaderPickPhone;
    private LinearLayout recHeaderNewProd;
    private static TextView recHeaderNews;
    private static int newIndex = 0;

    private static PaperHandler paperHandler;

    private RecommendContract.Presenter mRecommedPresenter;

    private RecyclerView recRv;
    private AVLoadingIndicatorView recLoading;

    private RecAdapter recAdapter;

    @Override
    public void showLoading()
    {
        recRv.setVisibility(View.GONE);
        recLoading.show();
    }

    @Override
    public void hideLoading()
    {
        recRv.setVisibility(View.VISIBLE);
        recLoading.hide();
    }

    @Override
    public void startPaperTimerTask(List<String> news)
    {
        newsList = news;
        Timer timer = new Timer();
        RecommendFragment.PaperTimerTask task = new RecommendFragment.PaperTimerTask();
        // 第二个参数0.1s后执行task,经过第三个参数5s再次执行
        timer.schedule(task, 100, 3000);
    }

    @Override
    public boolean isActive()
    {
        return isAdded();
    }

    @Override
    public void showRecData(List<String> advList, List<MultipleRecItem> data)
    {
        recAdapter = new RecAdapter(data);
        recRv.setAdapter(recAdapter);
        recAdapter.addHeaderView(initHeaderView());

        recRv.addOnScrollListener(new RecyclerView.OnScrollListener()
        {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState)
            {
                if (newState == RecyclerView.SCROLL_STATE_IDLE)
                {
                    Picasso.with(activity).resumeTag(Constant.TAG);
                }
                else
                {
                    Picasso.with(activity).pauseTag(Constant.TAG);
                }
            }
        });

        recRv.setLayoutManager(new LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false));
        recRv.setItemAnimator(new DefaultItemAnimator());


        banner.setAdapter(new BGABanner.Adapter<ImageView, String>()
        {
            @Override
            public void fillBannerItem(BGABanner banner, ImageView itemView, String model, int position)
            {
                Picasso.with(activity)
                        .load(model)
                        .placeholder(R.mipmap.default_pic_small_inverse)
                        .tag(Constant.TAG)
                        .into(itemView);
            }
        });
        banner.setData(advList,null);
    }

    @Override
    public void setPresenter(RecommendContract.Presenter presenter)
    {
        if (presenter != null)
        {
            mRecommedPresenter = presenter;
        }
    }


    public static class PaperHandler extends Handler
    {
        @Override
        public void handleMessage(Message msg)
        {
            if (newIndex > newsList.size() - 1)
            {
                newIndex = 0;
            }
            recHeaderNews.setText(newsList.get(newIndex));
            newIndex++;
            super.handleMessage(msg);
        }
    }

    public static class PaperTimerTask extends TimerTask
    {

        @Override
        public void run()
        {
            Message message = new Message();
            message.what = newIndex;
            if (paperHandler != null)
            {
                paperHandler.sendMessage(message);
            }
        }
    }

    public RecommendFragment()
    {
        // Required empty public constructor
    }

    public static RecommendFragment newInstance()
    {
        return new RecommendFragment();
    }

    @Override
    protected int getFragmentLayoutId()
    {
        return R.layout.fragment_recommend;
    }

    @Override
    protected void assignViews()
    {
        super.assignViews();
        recRv = (RecyclerView) findViewById(R.id.rec_rv);
        recLoading = (AVLoadingIndicatorView) findViewById(R.id.rec_loading);
    }

    @Override
    protected void configViews()
    {
        super.configViews();
        paperHandler = new PaperHandler();
        mRecommedPresenter.loadRecData();
    }


    public View initHeaderView()
    {
        View header = LayoutInflater.from(activity).inflate(R.layout.item_rec_header, null);
        banner = (BGABanner)header.findViewById(R.id.rec_header_banner);
        recHeaderReallyWant = (LinearLayout) header.findViewById(R.id.rec_header_really_want);
        recHeaderSimDeposit = (LinearLayout) header.findViewById(R.id.rec_header_sim_deposit);
        recHeaderMiSim = (LinearLayout) header.findViewById(R.id.rec_header_mi_sim);
        recHeaderPickPhone = (LinearLayout) header.findViewById(R.id.rec_header_pick_phone);
        recHeaderNewProd = (LinearLayout) header.findViewById(R.id.rec_header_new_prod);
        recHeaderNews = (TextView) header.findViewById(R.id.rec_header_news);
        return header;
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Picasso.with(activity).cancelTag(Constant.TAG);
    }
}
