package com.dcw.commonviewpager;

/**
 * @Author： duchunwei
 * @Date: 2017/6/14   11:41
 * @Email： duchunwei_it@163.com
 * model类
 */
public class DataEntry {

    private int imageResId;
    private String desc;

    public DataEntry(int imageResId, String desc) {
        this.imageResId = imageResId;
        this.desc = desc;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
