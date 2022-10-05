package mao.android_viewpager.apapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

import mao.android_viewpager.R;
import mao.android_viewpager.entity.ViewPagerInfo;

/**
 * Project name(项目名称)：android_ViewPager
 * Package(包名): mao.android_viewpager.apapter
 * Class(类名): ViewPagerAdapter
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/5
 * Time(创建时间)： 13:08
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class ViewPagerAdapter extends PagerAdapter
{

    private static final String TAG = "ViewPagerAdapter";

    /**
     * 上下文
     */
    private final Context context;

    /**
     * 列表
     */
    private final List<ViewPagerInfo> list;

    /**
     * 视图列表
     */
    private final List<View> viewList;


    public ViewPagerAdapter(Context context, List<ViewPagerInfo> list)
    {
        this.context = context;
        this.list = list;

        viewList = new ArrayList<>(list.size());

        for (ViewPagerInfo viewPagerInfo : list)
        {
            View view = LayoutInflater.from(context).inflate(R.layout.item_viewpager, null);
            TextView title = view.findViewById(R.id.title);
            title.setText(viewPagerInfo.getTitle());
            ImageView icon = view.findViewById(R.id.icon);
            icon.setImageResource(viewPagerInfo.getIcon());
            TextView content = view.findViewById(R.id.content);
            content.setText(viewPagerInfo.getContent());
            viewList.add(view);
        }
    }

    @Override
    public int getCount()
    {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object)
    {
        return view == object;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position)
    {
        Log.d(TAG, "instantiateItem: p:" + position);
        View view = viewList.get(position);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object)
    {
        Log.d(TAG, "destroyItem: P:" + position);
        container.removeView(viewList.get(position));
    }
}
