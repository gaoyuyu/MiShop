package com.gaoyy.mishop.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.gaoyy.mishop.R;
import com.gaoyy.mishop.api.Constant;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaoyy on 2017/12/16 0016.
 */

public class RecAdvPageAdapter extends PagerAdapter
{

    private List<String> data;
    private List<ImageView> views = new ArrayList<>();
    private Context context;

    public RecAdvPageAdapter(Context context,List<String> data)
    {
        this.context = context;
        this.data = data;
        for(int i=0;i<data.size();i++)
        {
            ImageView iv = new ImageView(context);
            iv.setScaleType(ImageView.ScaleType.FIT_XY);
            views.add(iv);
        }
    }

    @Override
    public int getCount()
    {
        return data.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position)
    {
        ImageView iv = views.get(position);
        Picasso.with(context)
                .load(data.get(position))
                .tag(Constant.TAG)
                .placeholder(R.mipmap.default_pic_small_inverse)
                .into(iv);
        container.addView(iv);
        return iv;
    }

    @Override
    public boolean isViewFromObject(View view, Object object)
    {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object)
    {
        container.removeView(views.get(position));
    }
}
