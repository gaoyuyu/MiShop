package com.gaoyy.mishop.main.home;


import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.gaoyy.mishop.R;
import com.gaoyy.mishop.adapter.MainPagerAdapter;
import com.gaoyy.mishop.base.BaseFragment;
import com.gaoyy.mishop.main.BlankFragment;
import com.gaoyy.mishop.main.home.recommend.RecommendFragment;
import com.gaoyy.mishop.main.home.recommend.RecommendPresenter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends BaseFragment
{
    private TabLayout homeTablayout;
    private ViewPager homeViewpager;

    private static final String[] homeTabTitles = {"推荐", "手机", "智能", "电视", "盒子", "电脑", "生活周边", "全面屏"};

    private List<Fragment> homeFragmentList = new ArrayList<>();

    private MainPagerAdapter mainPagerAdapter;

    public HomeFragment()
    {
        // Required empty public constructor
    }

    public static HomeFragment newInstance()
    {
        return new HomeFragment();
    }


    @Override
    protected int getFragmentLayoutId()
    {
        return R.layout.fragment_home;
    }

    @Override
    protected void assignViews()
    {
        super.assignViews();
        homeTablayout = (TabLayout) findViewById(R.id.home_tablayout);
        homeViewpager = (ViewPager) findViewById(R.id.home_viewpager);
    }

    @Override
    protected void configViews()
    {
        super.configViews();
        for (int i = 0; i < homeTabTitles.length; i++)
        {
            if (i == 0)
            {
                RecommendFragment recommendFragment = RecommendFragment.newInstance();
                homeFragmentList.add(recommendFragment);
                new RecommendPresenter(recommendFragment);
            }

            else
            {
                homeFragmentList.add(new BlankFragment());
            }
        }
        mainPagerAdapter = new MainPagerAdapter(activity, getChildFragmentManager(), homeTabTitles, homeFragmentList);

        homeViewpager.setAdapter(mainPagerAdapter);

        homeTablayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        homeTablayout.setupWithViewPager(homeViewpager);
        homeTablayout.setBackgroundColor(getResources().getColor(android.R.color.white));
        homeTablayout.setTabsFromPagerAdapter(mainPagerAdapter);
    }
}
