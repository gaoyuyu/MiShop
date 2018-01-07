package com.gaoyy.mishop.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by gaoyy on 2017/12/18 0018.
 */

public class NetworkUtils
{
    /**
     * 是否有网络
     *
     * @return
     */
    public static boolean isNetworkConnected(Context context)
    {
        if (context != null)
        {
            ConnectivityManager mConnectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
            if (mNetworkInfo != null)
            {
                return mNetworkInfo.isAvailable();
            }
        }
        return false;
    }

    /**
     * 是否连上wifi
     *
     * @return 是否连上wifi
     */
    static public boolean isWifiConnected(Context context)
    {

        ConnectivityManager mConnectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo mWiFiNetworkInfo = mConnectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        if (mWiFiNetworkInfo != null)
        {
            return mWiFiNetworkInfo.isAvailable();
        }
        return false;
    }

    /**
     * 是否有数据网络
     *
     * @param context 上下文
     * @return 是否
     */
    static public boolean isMobileConnected(Context context)
    {
        if (context != null)
        {
            ConnectivityManager mConnectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mMobileNetworkInfo = mConnectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
            if (mMobileNetworkInfo != null)
            {
                return mMobileNetworkInfo.isAvailable();
            }
        }
        return false;
    }


}
