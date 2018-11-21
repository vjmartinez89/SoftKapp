package com.vjmartinez.softkapp.adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.vjmartinez.softkapp.fragments.ExamlpleFragments;
import com.vjmartinez.softkapp.fragments.UserHistory2Fragment;
import com.vjmartinez.softkapp.fragments.UserHistory3Fragment;

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
        Fragment fragment = null;
        switch (i){
            case 0:
                return new UserHistory2Fragment();
            case 1:
                return new UserHistory3Fragment();
            case 2:
                return new ExamlpleFragments();
        }
        return null;
    }

    /**
     * Cantidad de fragmentos a paginar
     * @return
     */
    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "HU_1";
            case 1:
                return "HU_2";
            case 2:
                return "HU_3";
        }
        return super.getPageTitle(position);
    }
}
