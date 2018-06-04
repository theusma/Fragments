package br.com.bossini.viewpagercomfragmentsads3anmca;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;

/**
 * Created by Matheus on 12/05/18.
 * RA: 816117912
 */


public class MyTabsListener implements ActionBar.TabListener {

    private ViewPager viewPager;
    private int index;

    public MyTabsListener(ViewPager vp, int index) {
        this.viewPager = vp;
        this.index = index;
    }
    public void onTabSelected(ActionBar.Tab tab,
                              FragmentTransaction ft) {
        viewPager.setCurrentItem(index);
    }
    @Override
    public void onTabUnselected(ActionBar.Tab tab,
                                FragmentTransaction ft) {
    }
    @Override
    public void onTabReselected(ActionBar.Tab tab,
                                FragmentTransaction ft) {
    }

}