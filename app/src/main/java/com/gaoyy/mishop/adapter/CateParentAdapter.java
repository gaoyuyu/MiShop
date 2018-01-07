package com.gaoyy.mishop.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.gaoyy.mishop.R;
import com.gaoyy.mishop.api.bean.ParentCate;

import java.util.List;

/**
 * Created by gaoyy on 2018/1/6 0006.
 */

public class CateParentAdapter extends BaseQuickAdapter<ParentCate, BaseViewHolder>
{

    public CateParentAdapter(@Nullable List<ParentCate> data)
    {
        super(R.layout.item_cate_parent, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ParentCate item)
    {
        helper.setText(R.id.cate_parent_text, item.getParentCateName());
    }
}
