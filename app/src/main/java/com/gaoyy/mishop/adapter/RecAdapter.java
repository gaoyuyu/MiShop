package com.gaoyy.mishop.adapter;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.gaoyy.mishop.R;
import com.gaoyy.mishop.api.Constant;
import com.gaoyy.mishop.api.bean.RecInfo;
import com.gaoyy.mishop.entity.MultipleRecItem;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by gaoyy on 2017/12/16 0016.
 */

public class RecAdapter extends BaseMultiItemQuickAdapter<MultipleRecItem, BaseViewHolder>
{
    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public RecAdapter(List<MultipleRecItem> data)
    {
        super(data);

        addItemType(MultipleRecItem.TOP, R.layout.item_rec_top);
        addItemType(MultipleRecItem.NORMAL, R.layout.item_rec_normal);
        addItemType(MultipleRecItem.LIST, R.layout.item_rec_list);
    }

    @Override
    protected void convert(BaseViewHolder helper, MultipleRecItem item)
    {

        switch (helper.getItemViewType())
        {
            case MultipleRecItem.TOP:
                List<String> data = item.getData();
                ImageView left = helper.getView(R.id.rec_top_left);
                ImageView rightTop = helper.getView(R.id.rec_top_right_top);
                ImageView rightBottom = helper.getView(R.id.rec_top_right_bottom);

                Picasso.with(mContext)
                        .load(data.get(0))
                        .fit()
                        .centerCrop()
                        .tag(Constant.TAG)
                        .placeholder(R.mipmap.default_pic_small_inverse)
                        .into(left);

                Picasso.with(mContext)
                        .load(data.get(1))
                        .fit()
                        .centerCrop()
                        .tag(Constant.TAG)
                        .placeholder(R.mipmap.default_pic_small_inverse)
                        .into(rightTop);

                Picasso.with(mContext)
                        .load(data.get(2))
                        .fit()
                        .centerCrop()
                        .tag(Constant.TAG)
                        .placeholder(R.mipmap.default_pic_small_inverse)
                        .into(rightBottom);

                break;
            case MultipleRecItem.NORMAL:

                ImageView normalImg = helper.getView(R.id.rec_normal_img);

                Picasso.with(mContext)
                        .load(item.getSingleImg())
                        .fit()
                        .placeholder(R.mipmap.default_pic_small_inverse)
                        .into(normalImg);
                break;
            case MultipleRecItem.LIST:

                RecyclerView rv = helper.getView(R.id.rec_list_rv);
                int isMore = item.getIsMore();

                List<RecInfo.DataBean.GoodsBeanX.GoodsBean> goods = item.getData();

                RecSubListAdapter recSubListAdapter = new RecSubListAdapter(goods);

                rv.setAdapter(recSubListAdapter);

                helper.setText(R.id.list_header_cate, item.getTitle());
                ImageView headerBg = helper.getView(R.id.list_header_img);

                Picasso.with(mContext)
                        .load(item.getHeaderBgImgUrl())
                        .fit()
                        .centerCrop()
                        .tag(Constant.TAG)
                        .placeholder(R.mipmap.default_pic_small_inverse)
                        .into(headerBg);

                if (isMore == 1)
                {
                    helper.setGone(R.id.rec_more_layout, true);
                    helper.setText(R.id.rec_more_text, "更多" + item.getTitle() + "产品 >");
                }
                else if (isMore == 0)
                {
                    helper.setGone(R.id.rec_more_layout, false);
                }

                if (item.getTitle().equals("米家智能"))
                {
                    LinearLayoutManager manager = new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false);
                    rv.setLayoutManager(manager);
                }
                else
                {
                    //注意，这里不能写成new GridLayoutManager(mContext,2)，要有第三个第四个参数
                    GridLayoutManager manager = new GridLayoutManager(mContext, 2, LinearLayoutManager.VERTICAL, false);
                    rv.setLayoutManager(manager);
                }
                break;
        }


    }


}
