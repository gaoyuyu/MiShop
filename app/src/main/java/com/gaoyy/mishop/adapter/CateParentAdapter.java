package com.gaoyy.mishop.adapter;

import android.support.annotation.Nullable;
import android.widget.LinearLayout;
import android.widget.TextView;

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
        LinearLayout parentLayout = helper.getView(R.id.cate_parent_layout);
        TextView pv = helper.getView(R.id.cate_parent_text);
        parentLayout.setTag(item);
        helper.setText(R.id.cate_parent_text, item.getParentCateName());
        if(item.getStatus() == 0)
        {
            helper.setVisible(R.id.cate_parent_left_divider,false);
            pv.setTextColor(mContext.getResources().getColor(R.color.rec_main_shop_paper_text_color));
        }
        else
        {
            helper.setVisible(R.id.cate_parent_left_divider,true);
            pv.setTextColor(mContext.getResources().getColor(R.color.rec_item_good_price));
        }
    }

}
