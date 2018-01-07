package com.gaoyy.mishop.main.home.recommend;

import com.gaoyy.mishop.base.BasePresenter;
import com.gaoyy.mishop.base.BaseView;
import com.gaoyy.mishop.entity.MultipleRecItem;

import java.util.List;

/**
 * Created by gaoyy on 2018/1/1 0001.
 */

public class RecommendContract
{
    interface View extends BaseView<Presenter>
    {
        void showLoading();
        void hideLoading();
        void startPaperTimerTask(List<String> newsList);
        boolean isActive();
        void showRecData(List<String> advList, List<MultipleRecItem> data);
    }

    interface Presenter extends BasePresenter
    {
        void loadRecData();
    }
}
