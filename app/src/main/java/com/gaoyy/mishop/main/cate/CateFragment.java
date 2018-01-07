package com.gaoyy.mishop.main.cate;


import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;

import com.gaoyy.mishop.R;
import com.gaoyy.mishop.adapter.CateChildAdapter;
import com.gaoyy.mishop.adapter.CateParentAdapter;
import com.gaoyy.mishop.api.bean.CateInfo;
import com.gaoyy.mishop.api.bean.ParentCate;
import com.gaoyy.mishop.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

public class CateFragment extends BaseFragment implements CateContract.View
{
    private RecyclerView cateParentRv;
    private StickyListHeadersListView cateChildLv;
    private CateContract.Presenter mCatePresenter;
    private CateParentAdapter cateParentAdapter;
    private List<ParentCate> parentCateList = new ArrayList<>();
    private CateChildAdapter cateChildAdapter;

    public CateFragment()
    {
        // Required empty public constructor
    }

    public static CateFragment newInstance()
    {
        CateFragment fragment = new CateFragment();
        return fragment;
    }

    @Override
    protected int getFragmentLayoutId()
    {
        return R.layout.fragment_cate;
    }

    @Override
    protected void assignViews()
    {
        super.assignViews();
        cateParentRv = (RecyclerView) findViewById(R.id.cate_parent_rv);
        cateChildLv = (StickyListHeadersListView) findViewById(R.id.cate_child_lv);
    }

    @Override
    protected void configViews()
    {
        super.configViews();

        mCatePresenter.loadCateData();

    }

    @Override
    public void showLoading()
    {

    }

    @Override
    public void hideLoading()
    {

    }

    @Override
    public boolean isActive()
    {
        return isAdded();
    }

    @Override
    public void showCate(List<String> parentCates, List<CateInfo.DataBeanXX.GoodsBean> childCates)
    {
        for (String cateName : parentCates)
        {
            parentCateList.add(new ParentCate(0,cateName));
        }
        cateParentAdapter = new CateParentAdapter(parentCateList);

        cateParentRv.setLayoutManager(new LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false));
        cateParentRv.setItemAnimator(new DefaultItemAnimator());

        cateParentRv.setAdapter(cateParentAdapter);

        cateChildAdapter = new CateChildAdapter(activity,childCates);
        cateChildLv.setAdapter(cateChildAdapter);
        LinearSnapHelper mLinearSnapHelper = new LinearSnapHelper();

    }


    @Override
    public void setPresenter(CateContract.Presenter presenter)
    {
        if (presenter != null)
        {
            mCatePresenter = presenter;
        }
    }
}
