package com.gaoyy.mishop.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.gaoyy.mishop.R;
import com.gaoyy.mishop.api.Constant;
import com.gaoyy.mishop.api.bean.CateInfo;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by gaoyy on 2018/1/6 0006.
 */

public class CateChildGridAdapter extends BaseQuickAdapter<CateInfo.DataBeanXX.GoodsBean.DataBeanX.DataBean, BaseViewHolder>
{
    public CateChildGridAdapter(@Nullable List<CateInfo.DataBeanXX.GoodsBean.DataBeanX.DataBean> data)
    {
        super(R.layout.item_cate_child_grid, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, CateInfo.DataBeanXX.GoodsBean.DataBeanX.DataBean item)
    {
        helper.setText(R.id.cate_child_grid_tv, item.getGood_name());
        ImageView iv = helper.getView(R.id.cate_child_grid_iv);

        Picasso.with(mContext)
                .load(item.getGood_pic())
                .placeholder(R.mipmap.default_pic_small_inverse)
                .error(R.mipmap.ic_cart_normal)
                .fit()
                .tag(Constant.TAG)
                .into(iv);

    }
}
