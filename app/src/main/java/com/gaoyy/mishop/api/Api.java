package com.gaoyy.mishop.api;


import com.gaoyy.mishop.api.bean.CateInfo;
import com.gaoyy.mishop.api.bean.RecInfo;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by gaoyy on 2017/5/6 0006.
 */

public interface Api
{
//    @Headers("Cache-Control: public, max-age=3600")
//    @GET("homeRec.json")
    @GET("homeRec")
    Call<RecInfo> homeRec();
    
    @GET("cate")
    Call<CateInfo> cate();
}
