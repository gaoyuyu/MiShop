package com.gaoyy.mishop.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by gaoyy on 2016/8/24 0024.
 */
public class MainPagerAdapter extends FragmentStatePagerAdapter
{
    private String[] tabType;
    private List<Fragment> fragmentList;
    private Context context;

    public MainPagerAdapter(Context context, FragmentManager fm, String[] tabType, List<Fragment> fragmentList)
    {
        super(fm);
        this.context = context;
        this.tabType = tabType;
        this.fragmentList = fragmentList;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return tabType[position];
    }

    @Override
    public Fragment getItem(int position)
    {
        return fragmentList.get(position);
    }

    @Override
    public int getCount()
    {
        return tabType.length;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object)
    {

        //java.lang.NullPointerException: Attempt to invoke virtual method 'android.os.Handler android.support.v4.app.FragmentHostCallback.getHandler()' on a null object reference
        //这里空实现，解决上面的报错
        //或者homeViewpager.setOffscreenPageLimit(5);
    }
}
