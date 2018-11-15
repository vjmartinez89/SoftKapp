package com.vjmartinez.softkapp.adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Permite paginar un grupo de fragmentos
 */
public class PagerAdapter extends FragmentStatePagerAdapter
{

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * Seleccion de un fragmento en particular de la lista
     * @param i
     * @return
     */
    @Override
    public Fragment getItem(int i) {
        return null;
    }

    /**
     * Cantidad de fragmentos a paginar
     * @return
     */
    @Override
    public int getCount() {
        return 0;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}
