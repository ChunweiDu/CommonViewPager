package com.dcw.commonviewpager.ViewPager;

import android.content.Context;
import android.view.View;

/**
 * @Author： duchunwei
 * @Date: 2017/6/14   09:58
 * @Email： duchunwei_it@163.com
 * 通用的ViewPagerHolder接口
 */

public interface ViewPagerHolder<T> {
    /**
     * 创建View
     *
     * @param context 上下文
     * @return view
     */
    View createView(Context context);

    /**
     * 绑定数据
     *
     * @param context  上下文
     * @param position 位置
     * @param data     数据
     */
    void onBind(Context context, int position, T data);
}
