package com.dcw.commonviewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dcw.commonviewpager.ViewPager.ViewPagerHolder;

/**
 * @Author： duchunwei
 * @Date: 2017/6/14   11:28
 * @Email： duchunwei_it@163.com
 */
public class ViewImageHolder implements ViewPagerHolder<DataEntry> {

    private ImageView imageView;
    private TextView textView;

    @Override
    public View createView(Context context) {
        //返回ViewPager页面展示的布
        View view = LayoutInflater.from(context).inflate(R.layout.view_pager_item, null);
        imageView = (ImageView) view.findViewById(R.id.viewPager_item_image);
        textView = (TextView) view.findViewById(R.id.item_desc);
        return view;
    }

    @Override
    public void onBind(Context context, int position, DataEntry data) {
        //数据绑定
        imageView.setImageResource(data.getImageResId());
        textView.setText(data.getDesc());
    }
}
