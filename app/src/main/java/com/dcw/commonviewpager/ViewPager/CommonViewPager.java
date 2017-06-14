package com.dcw.commonviewpager.ViewPager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.dcw.commonviewpager.Indicator.CircleIndicatorView;
import com.dcw.commonviewpager.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author： duchunwei
 * @Date: 2017/6/14   10:53
 * @Email： duchunwei_it@163.com
 */

public class CommonViewPager<T> extends RelativeLayout {

    private ViewPager mViewPager;
    private CommonViewPagerAdaptr mAdapter;
    private CircleIndicatorView mCircleIndicatorView;
    private List<T> mDatas = new ArrayList<>();

    private int currentPosition = 0;

    public CommonViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        View view = LayoutInflater.from(getContext())
                .inflate(R.layout.common_view_pager_layout, this, true);
        mViewPager = (ViewPager) view.findViewById(R.id.common_view_pager);
        mCircleIndicatorView = (CircleIndicatorView)
                view.findViewById(R.id.common_view_pager_indicator_view);
    }

    /**
     * 设置页数据
     *
     * @param data
     * @param creator
     */
    public void setPages(List<T> data, ViewPagerHolderCreator creator) {
        mDatas = data;
        mAdapter = new CommonViewPagerAdaptr(creator, data);
        mViewPager.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
        mCircleIndicatorView.setUpWithViewPager(mViewPager);
    }

    /**
     * 设置当前页
     *
     * @param currentItem
     */
    public void setCurrentItem(int currentItem) {
        mViewPager.setCurrentItem(currentItem);
    }

    /**
     * 获取当前页
     *
     * @return
     */
    public int getCurrentItem() {
        return mViewPager.getCurrentItem();
    }

    /**
     * 设置偏移量
     *
     * @param limit
     */
    public void setOffscreenPageLimit(int limit) {
        mViewPager.setOffscreenPageLimit(limit);
    }

    /**
     * 设置切换动画
     *
     * @param reverseDrawingOrder
     * @param transformer
     */
    public void setPagerTransformer(boolean reverseDrawingOrder,
                                    ViewPager.PageTransformer transformer) {
        mViewPager.setPageTransformer(reverseDrawingOrder, transformer);
    }

    public void addOnPageChangeListener(ViewPager.OnPageChangeListener listener) {
        mViewPager.addOnPageChangeListener(listener);
    }

    /**
     * 设置指示器是否隐藏
     *
     * @param visible
     */
    private void setIndicatorVisible(boolean visible) {
        if (visible) {
            mCircleIndicatorView.setVisibility(VISIBLE);
        } else {
            mCircleIndicatorView.setVisibility(GONE);
        }
    }

    public ViewPager getmViewPager() {
        return mViewPager;
    }


}
