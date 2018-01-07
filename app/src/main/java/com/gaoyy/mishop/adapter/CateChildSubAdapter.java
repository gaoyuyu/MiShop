package com.gaoyy.mishop.adapter;

import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.gaoyy.mishop.R;
import com.gaoyy.mishop.api.bean.CateInfo;

import java.util.List;

/**
 * Created by gaoyy on 2018/1/6 0006.
 */

public class CateChildSubAdapter extends BaseQuickAdapter<List<CateInfo.DataBeanXX.GoodsBean.DataBeanX>, BaseViewHolder>
{
    public CateChildSubAdapter(@Nullable List<List<CateInfo.DataBeanXX.GoodsBean.DataBeanX>> data)
    {
        super(R.layout.item_cate_child_sub,data);
    }

    @Override
    protected void convert(BaseViewHolder helper, List<CateInfo.DataBeanXX.GoodsBean.DataBeanX> item)
    {
        helper.setText(R.id.cate_child_sub_tv,item.get(0).getName());

        RecyclerView subRv = helper.getView(R.id.cate_child_sub_rv);
        List<CateInfo.DataBeanXX.GoodsBean.DataBeanX.DataBean> gridData = item.get(0).getData();

        GridLayoutManager manager = new GridLayoutManager(mContext, 3, LinearLayoutManager.VERTICAL, false);
        subRv.setLayoutManager(manager);

        CateChildGridAdapter cateChildGridAdapter = new CateChildGridAdapter(gridData);
        subRv.setAdapter(cateChildGridAdapter);




    }
}
