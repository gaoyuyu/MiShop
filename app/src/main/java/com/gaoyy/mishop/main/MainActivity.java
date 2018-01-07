package com.gaoyy.mishop.main;

import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.gaoyy.mishop.R;
import com.gaoyy.mishop.adapter.MainPagerAdapter;
import com.gaoyy.mishop.base.BaseActivity;
import com.gaoyy.mishop.main.cate.CateFragment;
import com.gaoyy.mishop.main.cate.CatePresenter;
import com.gaoyy.mishop.main.home.HomeFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity
{
    private static final String[] mainTabTitle = {"首页", "分类", "发现", "购物车", "我的"};
    private static final int[] mainTabSelector = {R.drawable.selector_tab_home, R.drawable.selector_tab_cate, R.drawable.selector_tab_find, R.drawable.selector_tab_cart, R.drawable.selector_tab_mine};


    private RelativeLayout activityMain;
    private RelativeLayout mainSearchBar;
    private ViewPager mainViewpager;
    private TabLayout mainTablayout;


    private MainPagerAdapter mainPagerAdapter;
    private List<Fragment> fragmentList = new ArrayList<>();


    @Override
    protected void initContentView()
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void assignViews()
    {
        super.assignViews();
        activityMain = (RelativeLayout) findViewById(R.id.activity_main);
        mainSearchBar = (RelativeLayout) findViewById(R.id.main_search_bar);
        mainViewpager = (ViewPager) findViewById(R.id.main_viewpager);
        mainTablayout = (TabLayout) findViewById(R.id.main_tablayout);
    }

    @Override
    protected void configViews()
    {
        super.configViews();

        for (int i = 0; i < mainTabTitle.length; i++)
        {
            if (i == 0)
            {
                fragmentList.add(HomeFragment.newInstance());
            }
            else if (i == 1)
            {
                CateFragment cateFragment = CateFragment.newInstance();
                fragmentList.add(cateFragment);
                new CatePresenter(cateFragment);
            }
            else
            {
                fragmentList.add(new BlankFragment());
            }
        }


        mainPagerAdapter = new MainPagerAdapter(this, getSupportFragmentManager(), mainTabTitle, fragmentList);
        mainViewpager.setAdapter(mainPagerAdapter);

        mainTablayout.setTabMode(TabLayout.MODE_FIXED);
        mainTablayout.setupWithViewPager(mainViewpager);
        mainTablayout.setBackgroundColor(getResources().getColor(android.R.color.white));
        mainTablayout.setTabsFromPagerAdapter(mainPagerAdapter);
        for (int i = 0; i < mainTabTitle.length; i++)
        {
            TabLayout.Tab itemTab = mainTablayout.getTabAt(i);
            if (itemTab != null)
            {
                itemTab.setCustomView(R.layout.item_home_tab);
                View tabRoot = itemTab.getCustomView();
                ImageView tabImg = (ImageView) tabRoot.findViewById(R.id.item_home_tab_img);
                TextView tabText = (TextView) tabRoot.findViewById(R.id.item_home_tab_text);
                tabImg.setImageDrawable(getResources().getDrawable(mainTabSelector[i]));
                tabText.setText(mainTabTitle[i]);
            }
        }
        mainTablayout.getTabAt(0).getCustomView().setSelected(true);
//        mainViewpager.setOffscreenPageLimit(mainTabTitle.length);
    }
}
