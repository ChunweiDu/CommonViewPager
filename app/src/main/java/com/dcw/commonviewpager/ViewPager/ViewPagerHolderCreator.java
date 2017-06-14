package com.dcw.commonviewpager.ViewPager;

/**
 * @Author： duchunwei
 * @Date: 2017/6/14   10:04
 * @Email： duchunwei_it@163.com
 * ViewHolder生成器
 */

public interface ViewPagerHolderCreator<VH extends ViewPagerHolder> {
    /**
     * 创建ViewHolder
     *
     * @return
     */
    VH createViewHolder();
}
