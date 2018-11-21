package com.vjmartinez.softkapp;

import android.content.res.ColorStateList;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.squareup.picasso.Picasso;
import com.vjmartinez.softkapp.adapters.PagerAdapter;

import de.hdodenhof.circleimageview.CircleImageView;

public class FragmentActivity extends AppCompatActivity {

    private CircleImageView civAcfProfile;
    private TabLayout tlAcfTabFragments;
    private ViewPager vpAcfViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        initComponents();
        initAdapters();
      //  initEvents();
    }

    private void initComponents() {
        civAcfProfile = (CircleImageView)findViewById(R.id.civ_acf_profile);
        tlAcfTabFragments = (TabLayout)findViewById(R.id.tl_acf_tab_fragments);
        vpAcfViewPager = (ViewPager)findViewById(R.id.vp_acf_view_pager);
        Picasso.with(this).load(R.mipmap.ic_launcher_round).into(this.civAcfProfile); //Infla la imagen con Picasso
    }

    private void initAdapters() {
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        vpAcfViewPager.setAdapter(pagerAdapter);
        tlAcfTabFragments.setupWithViewPager(vpAcfViewPager);
        tlAcfTabFragments.setSelectedTabIndicatorColor(ContextCompat.getColor(this,R.color.colorPrimary));
        tlAcfTabFragments.setTabTextColors(ColorStateList.valueOf(ContextCompat.getColor(this,R.color.colorPrimaryDark )));
    }
}
