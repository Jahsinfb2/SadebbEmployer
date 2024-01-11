package com.codeinger.sadeb_employee_app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.codeinger.sadeb_employee_app.R;

import java.util.Objects;

public class VewpagerAdapter extends PagerAdapter {

    Context context;

    int[] images;

    LayoutInflater LayoutInflater;


    public VewpagerAdapter(Context context, int[] images) {
        this.context = context;
        this.images = images;
        LayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        View itemView = LayoutInflater.inflate(R.layout.imageitem, container, false);

        ImageView imageView = itemView.findViewById(R.id.imageviewmain);

        imageView.setImageResource(images[position]);

        Objects.requireNonNull(container).addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, @NonNull Object object) {

        container.removeView((LinearLayout) object);
    }
}
