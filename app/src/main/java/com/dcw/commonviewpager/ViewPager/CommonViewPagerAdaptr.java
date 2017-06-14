package com.dcw.commonviewpager.ViewPager;

import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.dcw.commonviewpager.R;

import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * @Author： duchunwei
 * @Date: 2017/6/14   10:07
 * @Email： duchunwei_it@163.com
 * 通用的ViewPager适配器
 */

public class CommonViewPagerAdaptr<T> extends PagerAdapter {

    private List<T> mDatas;
    //ViewHoder生成器
    private ViewPagerHolderCreator mCreator;

    public CommonViewPagerAdaptr(ViewPagerHolderCreator mCreator, List<T> mDatas) {
        this.mCreator = mCreator;
        this.mDatas = mDatas;
        Log.d(TAG, "CommonViewPagerAdaptr:mDatas: " + mDatas.size() + "max:" + Integer.MAX_VALUE);
    }

    @Override
    public int getCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //用接口提供的布局
        View view = getView(position, null, container);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    private View getView(int position, View view, ViewGroup container) {
        ViewPagerHolder holder = null;
        if (view == null) {
            //创建Holder
            holder = mCreator.createViewHolder();
            view = holder.createView(container.getContext());
            view.setTag(R.id.common_view_pager_item_tag, holder);
        } else {
            holder = (ViewPagerHolder) view.getTag(R.id.common_view_pager_item_tag);
        }
        if (holder != null && mDatas != null && mDatas.size() > 0) {
            //数据绑定
            holder.onBind(container.getContext(), position, mDatas.get(position));
        }
        return view;
    }
}
