package com.gaoyy.mishop.adapter;

import android.content.Context;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.gaoyy.mishop.R;
import com.gaoyy.mishop.api.bean.CateInfo;

import java.util.List;

import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;

/**
 * Created by gaoyy on 2018/1/6 0006.
 */

public class CateChildAdapter extends BaseAdapter implements StickyListHeadersAdapter
{

    private LayoutInflater inflater;
    private List<CateInfo.DataBeanXX.GoodsBean> data;
    private Context context;

    public CateChildAdapter(Context context, List<CateInfo.DataBeanXX.GoodsBean> data)
    {
        inflater = LayoutInflater.from(context);
        this.data = data;
        this.context = context;
    }

    @Override
    public View getHeaderView(int position, View convertView, ViewGroup parent)
    {
        ChildHeaderViewHolder headerViewHolder;
        if (convertView == null)
        {
            headerViewHolder = new ChildHeaderViewHolder();
            convertView = inflater.inflate(R.layout.item_cate_child_header, parent, false);
            headerViewHolder.headerTv = (TextView) convertView.findViewById(R.id.cate_child_header_tv);
            convertView.setTag(headerViewHolder);
        }
        else
        {
            headerViewHolder = (ChildHeaderViewHolder) convertView.getTag();
        }
        headerViewHolder.headerTv.setText(data.get(position).getName());
        return convertView;
    }

    @Override
    public long getHeaderId(int position)
    {
        return Long.parseLong(data.get(position).getId());
    }

    @Override
    public int getCount()
    {
        return data.size();
    }

    @Override
    public Object getItem(int position)
    {
        return data.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ChildItemViewHolder childItemViewHolder;

        if (convertView == null)
        {
            childItemViewHolder = new ChildItemViewHolder();
            convertView = inflater.inflate(R.layout.item_cate_child, parent, false);
            childItemViewHolder.childCateRv = (RecyclerView) convertView.findViewById(R.id.cate_child_rv);
            convertView.setTag(childItemViewHolder);
        }
        else
        {
            childItemViewHolder = (ChildItemViewHolder) convertView.getTag();
        }


        List<List<CateInfo.DataBeanXX.GoodsBean.DataBeanX>> subList = data.get(position).getData();
        childItemViewHolder.childCateRv.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
        childItemViewHolder.childCateRv.setItemAnimator(new DefaultItemAnimator());
        CateChildSubAdapter cateChildSubAdapter = new CateChildSubAdapter(subList);
        childItemViewHolder.childCateRv.setAdapter(cateChildSubAdapter);

        return convertView;

    }

    public static class ChildHeaderViewHolder
    {
        TextView headerTv;
    }

    public static class ChildItemViewHolder
    {
        RecyclerView childCateRv;
    }
}
