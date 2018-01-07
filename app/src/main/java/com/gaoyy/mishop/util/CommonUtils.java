package com.gaoyy.mishop.util;

import android.content.Context;
import android.content.res.Configuration;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Toast;

import com.gaoyy.mishop.api.Constant;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by gaoyy on 2017/5/6 0006.
 */

public class CommonUtils
{
    private static Toast mToast = null;

    public static boolean isEmpty(String str)
    {
        if (str == null || str.length() == 0 || str.equalsIgnoreCase("null") || str.isEmpty() || str.equals(""))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * showToast
     *
     * @param context
     * @param msg
     */
    public static void showToast(Context context, String msg)
    {
        if (null != msg && !CommonUtils.isEmpty(msg))
        {
            if (mToast == null)
            {
                mToast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
            }
            else
            {
                mToast.setText(msg);
                mToast.setDuration(Toast.LENGTH_SHORT);
            }
            mToast.show();
        }
    }

    /**
     * showToast
     *
     * @param context
     * @param msgId
     */
    public static void showToast(Context context, int msgId)
    {
        if (mToast == null)
        {
            mToast = Toast.makeText(context, msgId, Toast.LENGTH_SHORT);
        }
        else
        {
            mToast.setText(msgId);
            mToast.setDuration(Toast.LENGTH_SHORT);
        }
        mToast.show();
    }


    /**
     * 获取当前时间
     *
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static String getCurrentTime()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date curDate = new Date(System.currentTimeMillis());//获取当前时间
        String str = formatter.format(curDate);
        return str;
    }


    /**
     * @param view
     * @param msg
     */
    public static void showSnackBar(View view, String msg)
    {
        Snackbar.make(view, msg, Snackbar.LENGTH_SHORT).show();
    }

    /**
     * 设置下拉刷新loading颜色
     *
     * @param context
     * @param layout
     */
    public static void setSwipeLayoutProgressBackgroundColor(Context context, SwipeRefreshLayout layout)
    {
        layout.setProgressBackgroundColorSchemeResource(android.R.color.white);
        layout.setColorSchemeResources(android.R.color.holo_blue_light,
                android.R.color.holo_red_light, android.R.color.holo_orange_light,
                android.R.color.holo_green_light);
        layout.setProgressViewOffset(false, 0, (int) TypedValue
                .applyDimension(TypedValue.COMPLEX_UNIT_DIP, 24, context.getResources()
                        .getDisplayMetrics()));
    }


    /**
     * 【DEBUG】用于输出http请求信息
     *
     * @param msg
     */
    public static void httpDebugLogger(String msg)
    {
        Log.d(Constant.TAG, "[-HTTP LOG-]" + "==========" + msg + "==========");
    }

    /**
     * 【ERROR】用于输出http请求错误信息
     *
     * @param msg
     */
    public static void httpErrorLogger(String msg)
    {
        Log.e(Constant.TAG, "[-HTTP LOG-]" + "==========" + msg + "==========");
    }


    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dip2px(Context context, float dpValue)
    {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dip(Context context, float pxValue)
    {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    /**
     * 获取屏幕的最小宽度
     * @param context
     */
    public static int getSmallestScreenWidthDp(Context context)
    {
        Configuration config = context.getResources().getConfiguration();
        int smallestScreenWidth = config.smallestScreenWidthDp;
        return smallestScreenWidth;
    }

}
