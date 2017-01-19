package com.example.administrator.tablayout.adapter;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Adapter;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/1/19.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter{


    ArrayList<Fragment> fragments = new ArrayList<>();
    ArrayList<String> tabTitles = new ArrayList<>();

    public ViewPagerAdapter(android.support.v4.app.FragmentManager fm){
        super(fm);
    }

    public void addFragments(Fragment fragments,String tabTitles){
        this.fragments.add(fragments);
        this.tabTitles.add(tabTitles);


    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    public CharSequence getPageTitle(int position) {
        return tabTitles.get(position);
    }


}
