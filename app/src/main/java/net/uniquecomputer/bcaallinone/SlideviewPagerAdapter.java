package net.uniquecomputer.bcaallinone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SlideviewPagerAdapter extends PagerAdapter {

    Context ctx;

    public SlideviewPagerAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater= (LayoutInflater) ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.slide_screen,container,false);

        ImageView logo;view.findViewById(R.id.logo);

        ImageView ind1;view.findViewById(R.id.ind1);
        ImageView ind2;view.findViewById(R.id.ind2);
        ImageView ind3;view.findViewById(R.id.ind3);

        TextView title=view.findViewById(R.id.Titalon);
        TextView desc=view.findViewById(R.id.descipone);

        ImageView next=view.findViewById(R.id.next);
        ImageView back=view.findViewById(R.id.back);
        switch (position)
        {
            case 0:
                logo.setImageResource(R.drawable.cjavapy);
                ind1.setImageResource(R.drawable.seleted);
                ind2.setImageResource(R.drawable.unselected);
                ind3.setImageResource(R.drawable.unselected);

                title.setText("Online Complier");
                desc.setText("Online Complier C , C++ , Java , Python , PHP , Html Css Java Script.");
                back.setVisibility(View.GONE);
                next.setVisibility(View.VISIBLE);
                break;

            case 1:
                logo.setImageResource(R.drawable.converter);
                ind1.setImageResource(R.drawable.unselected);
                ind2.setImageResource(R.drawable.seleted);
                ind3.setImageResource(R.drawable.unselected);

                title.setText("Currency Conver");
                desc.setText("Currency Converter Like INR to USD , USD To EUR , Etc..");
                back.setVisibility(View.VISIBLE);
                next.setVisibility(View.VISIBLE);
                break;


            case 2:
                logo.setImageResource(R.drawable.complierdev);
                ind1.setImageResource(R.drawable.unselected);
                ind2.setImageResource(R.drawable.unselected);
                ind3.setImageResource(R.drawable.seleted);

                title.setText("Android App Developer sagar Dhadke");
                desc.setText("Android App Developer Sagar Dhadke ");
                back.setVisibility(View.VISIBLE);
                next.setVisibility(View.GONE);
                break;


        }


        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}