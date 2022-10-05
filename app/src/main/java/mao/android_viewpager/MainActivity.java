package mao.android_viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import mao.android_viewpager.apapter.ViewPagerAdapter;
import mao.android_viewpager.entity.ViewPagerInfo;

public class MainActivity extends AppCompatActivity
{

    private static final String TAG = "MainActivity";

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

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
            {
                Log.d(TAG, "onPageScrolled: " + position);
                //toastShow("页面滑动中：" + (position + 1));
            }

            @Override
            public void onPageSelected(int position)
            {
                Log.d(TAG, "onPageSelected: " + position);
                toastShow("页面滑动结束：" + (position + 1));
            }

            @Override
            public void onPageScrollStateChanged(int state)
            {
                Log.d(TAG, "onPageScrollStateChanged: " + state);
                toastShow("页面滑动状态变化：" + state);
            }
        });

    }

    /**
     * 显示消息
     *
     * @param message 消息
     */
    private void toastShow(String message)
    {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}