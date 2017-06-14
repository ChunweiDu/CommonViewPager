package com.dcw.commonviewpager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dcw.commonviewpager.ViewPager.CommonViewPager;
import com.dcw.commonviewpager.ViewPager.ViewPagerHolderCreator;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private CommonViewPager viewPager;
    private List<DataEntry> mDatas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        initView();

    }

    private void initView() {
        viewPager = (CommonViewPager) findViewById(R.id.main_common_view_pager);
        //设置数据
        viewPager.setPages(mDatas(), new ViewPagerHolderCreator<ViewImageHolder>() {
            @Override
            public ViewImageHolder createViewHolder() {
                //返回ViewPagerHolder
                return new ViewImageHolder();
            }
        });
    }

    private List<DataEntry> mDatas() {

        for (int i = 0; i < 5; i++) {
            DataEntry entry = new DataEntry(R.mipmap.ic_launcher, "banner" + i);
            mDatas.add(entry);
        }
        return mDatas;
    }

}
