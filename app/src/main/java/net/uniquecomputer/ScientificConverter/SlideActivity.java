package net.uniquecomputer.ScientificConverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.WindowManager;

public class SlideActivity extends AppCompatActivity {

   public static ViewPager viewSlider;
    SlideviewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);

        viewSlider=findViewById(R.id.viewSlider);
        adapter=new SlideviewPagerAdapter(this);
        viewSlider.setAdapter(adapter);
        if (isOpenAlread())
        {
            Intent intent=new Intent(SlideActivity.this,MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK| Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
        else
        {
            SharedPreferences.Editor editor=getSharedPreferences("slide",MODE_PRIVATE).edit();
            editor.putBoolean("slide",true);
            editor.commit();
        }

    }

    private boolean isOpenAlread() {

        SharedPreferences sharedPreferences=getSharedPreferences("slide",MODE_PRIVATE);
        boolean result=sharedPreferences.getBoolean("slide",false);
        return result;

    }
}