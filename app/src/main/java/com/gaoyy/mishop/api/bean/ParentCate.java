package com.gaoyy.mishop.api.bean;

/**
 * Created by gaoyy on 2018/1/6 0006.
 */

public class ParentCate
{
    private int status;
    private String parentCateName;

    public ParentCate(int status, String parentCateName)
    {
        this.status = status;
        this.parentCateName = parentCateName;
    }

    public int getStatus()
    {
        return status;
    }

    public String getParentCateName()
    {
        return parentCateName;
    }
}
