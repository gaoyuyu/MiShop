package com.gaoyy.mishop.entity;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

/**
 * Created by gaoyy on 2017/12/16 0016.
 */

public class MultipleRecItem implements MultiItemEntity
{

    public static final int TOP = 1;
    public static final int NORMAL = 2;
    public static final int LIST = 3;


    private int itemType;
    private int isMore;
    private List data;
    private String singleImg;
    private String title;
    private String headerBgImgUrl;


    public MultipleRecItem(int itemType, List data)
    {
        this.itemType = itemType;
        this.data = data;
    }

    public MultipleRecItem(int itemType, String title, int isMore,String headerBgImgUrl, List data)
    {
        this.itemType = itemType;
        this.data = data;
        this.title = title;
        this.headerBgImgUrl = headerBgImgUrl;
        this.isMore = isMore;
    }

    public MultipleRecItem(int itemType, String singleImg)
    {
        this.itemType = itemType;
        this.singleImg = singleImg;
    }


    @Override
    public int getItemType()
    {
        return itemType;
    }

    public String getSingleImg()
    {
        return singleImg;
    }

    public List getData()
    {
        return data;
    }

    public String getTitle()
    {
        return title;
    }

    public String getHeaderBgImgUrl()
    {
        return headerBgImgUrl;
    }

    public int getIsMore()
    {
        return isMore;
    }
}
