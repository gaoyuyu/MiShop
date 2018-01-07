package com.gaoyy.mishop.adapter;

import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.gaoyy.mishop.R;
import com.gaoyy.mishop.api.Constant;
import com.gaoyy.mishop.api.bean.RecInfo;
import com.gaoyy.mishop.util.CommonUtils;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by gaoyy on 2017/12/17 0017.
 */

public class RecSubListAdapter extends BaseQuickAdapter<RecInfo.DataBean.GoodsBeanX.GoodsBean,BaseViewHolder>
{
    public RecSubListAdapter(@Nullable List<RecInfo.DataBean.GoodsBeanX.GoodsBean> data)
    {
        super(R.layout.item_rec_list_sub,data);
    }

    @Override
    protected void convert(BaseViewHolder helper, RecInfo.DataBean.GoodsBeanX.GoodsBean item)
    {
        if(!item.getCate().equals("5"))
        {
            helper.setGone(R.id.rec_list_normal_layout,true);
            helper.setGone(R.id.rec_list_sub_mz_layout,false);

            ImageView iv = helper.getView(R.id.rec_list_sub_good_img);
            Picasso.with(mContext)
                    .load(item.getPic())
                    .placeholder(R.mipmap.default_pic_small_inverse)
                    .fit()
                    .centerCrop()
                    .tag(Constant.TAG)
                    .into(iv);
            helper.setText(R.id.rec_list_sub_good_name,item.getGood_name());
            helper.setText(R.id.rec_list_sub_good_descr,item.getGoog_descr());
            helper.setText(R.id.rec_list_sub_good_price,item.getGood_price_n());
        }
        else
        {
            helper.setGone(R.id.rec_list_normal_layout,false);
            helper.setGone(R.id.rec_list_sub_mz_layout,true);


            View descrView = LayoutInflater.from(mContext).inflate(R.layout.item_rec_list_sub_mz_descr,null);
            TextView mzName = (TextView) descrView.findViewById(R.id.rec_list_sub_mz_name);
            TextView mzDescr = (TextView) descrView.findViewById(R.id.rec_list_sub_mz_descr);
            TextView mzPrice = (TextView) descrView.findViewById(R.id.rec_list_sub_mz_price);

            mzName.setText(item.getGood_name());
            mzDescr.setText(item.getGoog_descr());
            mzPrice.setText(item.getGood_price_n());

            LinearLayout parent = (LinearLayout)(mzName.getParent());
            parent.setLayoutParams(new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f));

            View imgView = LayoutInflater.from(mContext).inflate(R.layout.item_rec_list_sub_mz_img,null);
            ImageView iv = (ImageView) imgView.findViewById(R.id.rec_list_sub_mz_img);
            Picasso.with(mContext)
                    .load(item.getPic())
                    .placeholder(R.mipmap.default_pic_small_inverse)
                    .fit()
                    .centerCrop()
                    .tag(Constant.TAG)
                    .into(iv);


            iv.setLayoutParams(new LinearLayout.LayoutParams(0, CommonUtils.dip2px(mContext,175), 1.0f));
            LinearLayout mzLayout = helper.getView(R.id.rec_list_sub_mz_layout);
            mzLayout.removeAllViews();

            if(helper.getAdapterPosition() % 2 ==1)
            {
                mzLayout.addView(imgView);
                mzLayout.addView(descrView);
            }
            else
            {
                mzLayout.addView(descrView);
                mzLayout.addView(imgView);
            }

        }

    }
}
