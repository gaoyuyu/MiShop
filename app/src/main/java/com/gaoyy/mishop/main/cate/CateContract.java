package com.gaoyy.mishop.main.cate;

import com.gaoyy.mishop.api.bean.CateInfo;
import com.gaoyy.mishop.base.BasePresenter;
import com.gaoyy.mishop.base.BaseView;

import java.util.List;

/**
 * Created by gaoyy on 2018/1/6 0006.
 */

public class CateContract
{
    interface View extends BaseView<Presenter>
    {
        void showLoading();

        void hideLoading();

        boolean isActive();

        void showCate(List<String> parentCates, List<CateInfo.DataBeanXX.GoodsBean> childCates);
    }

    interface Presenter extends BasePresenter
    {
        void loadCateData();
    }
}
