package mao.android_viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import mao.android_viewpager.apapter.ViewPagerAdapter;
import mao.android_viewpager.entity.ViewPagerInfo;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.ViewPager);

        List<ViewPagerInfo> list = new ArrayList<>(10);
        for (int i = 1; i <= 10; i++)
        {
            ViewPagerInfo viewPagerInfo = new ViewPagerInfo()
                    .setTitle("标题" + i)
                    .setIcon(R.drawable.test)
                    .setContent("内容" + i + ".......");
            list.add(viewPagerInfo);
        }

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this, list);

        viewPager.setAdapter(viewPagerAdapter);

    }
}