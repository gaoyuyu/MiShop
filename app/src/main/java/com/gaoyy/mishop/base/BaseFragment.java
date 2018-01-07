package com.gaoyy.mishop.base;

import android.os.Bundle;
import android.view.View;

import com.gaoyy.mishop.R;


public abstract class BaseFragment extends LazyFragment
{
    private View rootView;
    private int toolbarColor = R.color.colorPrimary;
    protected BaseActivity activity;

    /**
     * 设置Fragment的layout布局
     *
     * @return
     */
    protected abstract int getFragmentLayoutId();

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if (getArguments() != null)
        {
            getParamsData();
        }
    }

    @Override
    protected void onCreateViewLazy(Bundle savedInstanceState)
    {
        super.onCreateViewLazy(savedInstanceState);
        setContentView(getFragmentLayoutId());
        activity = (BaseActivity) getActivity();
        setHasOptionsMenu(true);
//        assignViews(rootView);
        assignViews();
        initToolbar();
        configViews();
        setListener();
    }

    //    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
//    {
//
//        if (rootView == null)
//        {
//            rootView = inflater.inflate(getFragmentLayoutId(), container, false);
//        }
//        activity = (BaseActivity) getActivity();
//        setHasOptionsMenu(true);
//
//        assignViews(rootView);
//        initToolbar();
//        configViews();
//
//        setListener();
//
//        return rootView;
//    }

    /**
     * 获取传递过来的参数
     */
    protected void getParamsData()
    {

    }

    protected void assignViews()
    {

    }

    protected void initToolbar()
    {

    }

    protected void configViews()
    {
    }

    protected void setListener()
    {
    }
}
