package com.gaoyy.mishop.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;

import com.gaoyy.mishop.R;
import com.gaoyy.mishop.api.Constant;
import com.gaoyy.mishop.application.ExitApplication;
import com.gaoyy.mishop.util.CommonUtils;


public abstract class BaseActivity extends AppCompatActivity
{
    private long firstTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        Log.d(Constant.TAG,"============================");
        Log.d(Constant.TAG,"屏幕最小宽度："+CommonUtils.getSmallestScreenWidthDp(this)+"dp");
        Log.d(Constant.TAG,"============================");


        DisplayMetrics mDisplayMetrics = new DisplayMetrics();//屏幕分辨率容器
        getWindowManager().getDefaultDisplay().getMetrics(mDisplayMetrics);
        int width = mDisplayMetrics.widthPixels;
        int height = mDisplayMetrics.heightPixels;
        float density = mDisplayMetrics.density;
        int densityDpi = mDisplayMetrics.densityDpi;
        Log.d(Constant.TAG,"Screen Ratio: ["+width+"x"+height+"],density="+density+",densityDpi="+densityDpi);
        Log.d(Constant.TAG,"Screen mDisplayMetrics: "+mDisplayMetrics);

        ExitApplication.getInstanse().addActivity(this);

        //加载布局
        initContentView();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//强制竖屏

        //初始化view
        assignViews();
        //初始化toolbar
        initToolbar();
        //配置views
        configViews();
        //设置监听器
        setListener();

    }

    @Override
    protected void onResume()
    {
        super.onResume();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
    }

    protected abstract void initContentView();

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



    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        // TODO Auto-generated method stub
        if (keyCode == KeyEvent.KEYCODE_BACK)
        {
            if ((System.currentTimeMillis() - firstTime) > 2000)
            {
                // 如果两次按键时间间隔大于2000毫秒，则不退出
                CommonUtils.showToast(this, getResources().getString(R.string.exit_after_press_again));
                firstTime = System.currentTimeMillis();// 更新mExitTime
            }
            else
            {
                ExitApplication.getInstanse().exit();
                //设置别名为空，不接受推送，必须在killProcess之前
                android.os.Process.killProcess(android.os.Process.myPid());
            }

            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}
