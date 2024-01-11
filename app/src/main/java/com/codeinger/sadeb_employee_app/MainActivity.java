package com.codeinger.sadeb_employee_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;

import com.codeinger.sadeb_employee_app.adapter.VewpagerAdapter;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    int[] images = {R.drawable.girl1, R.drawable.girl1, R.drawable.girl1, R.drawable.girl1,
            R.drawable.girl1, R.drawable.girl1, R.drawable.girl1, R.drawable.girl1};

    VewpagerAdapter viewpagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager =findViewById(R.id.viewPagerimage);

        viewpagerAdapter = new VewpagerAdapter(MainActivity.this, images);

        viewPager.setAdapter(viewpagerAdapter);
    }
}
