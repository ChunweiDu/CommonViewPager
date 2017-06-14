package com.dcw.commonviewpager.Indicator;

import android.content.res.Resources;
import android.util.TypedValue;

/**
 * @Author： duchunwei
 * @Date: 2017/6/14   10:43
 * @Email： duchunwei_it@163.com
 * 隐藏工具类
 */

public class DisplayUtils {

    public static int dpToPx(int dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, Resources.getSystem().getDisplayMetrics());
    }

    public static int pxToDp(float px) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_PX, px, Resources.getSystem().getDisplayMetrics());
    }
}
