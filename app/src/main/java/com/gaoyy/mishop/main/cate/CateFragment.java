package com.gaoyy.mishop.main.cate;


import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AbsListView;

import com.chad.library.adapter.base.BaseQuickAdapter;
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
    public void showCate(List<String> parentCates, final List<CateInfo.DataBeanXX.GoodsBean> childCates)
    {
        for (int i = 0; i < parentCates.size(); i++)
        {
            if (i == 0)
            {
                parentCateList.add(new ParentCate(1, parentCates.get(i)));
            }
            else
            {
                parentCateList.add(new ParentCate(0, parentCates.get(i)));
            }

        }
        cateParentAdapter = new CateParentAdapter(parentCateList);

        cateParentRv.setLayoutManager(new LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false));
        cateParentRv.setItemAnimator(new DefaultItemAnimator());

        cateParentRv.setAdapter(cateParentAdapter);

        cateChildAdapter = new CateChildAdapter(activity, childCates);
        cateChildLv.setAdapter(cateChildAdapter);

        cateParentAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener()
        {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position)
            {
                int select = -1;
                for(int i=0;i<childCates.size();i++)
                {
                    int index = Integer.valueOf(childCates.get(i).getId())-1;
                    if(index == position)
                    {
                        select = i;
                    }
                }
                updateParentCateType(position);
                cateChildLv.setSelection(select);

            }
        });

        cateChildLv.setOnScrollListener(new AbsListView.OnScrollListener()
        {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState)
            {

            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount)
            {
                CateInfo.DataBeanXX.GoodsBean cate = childCates.get(firstVisibleItem);
                int groupId = Integer.valueOf(cate.getId())-1;
                cateParentRv.smoothScrollToPosition(groupId);
                updateParentCateType(groupId);
            }
        });

    }


    @Override
    public void setPresenter(CateContract.Presenter presenter)
    {
        if (presenter != null)
        {
            mCatePresenter = presenter;
        }
    }


    private void updateParentCateType(int position)
    {
        for (int i = 0; i < parentCateList.size(); i++)
        {
            ParentCate parentCate = parentCateList.get(i);

            if (position == i)
            {
                parentCate.setStatus(1);
                parentCateList.remove(i);
                parentCateList.add(i, parentCate);
            }
            else
            {
                parentCate.setStatus(0);
                parentCateList.remove(i);
                parentCateList.add(i, parentCate);
            }
        }
        cateParentAdapter.setNewData(parentCateList);
    }
}
