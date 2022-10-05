package mao.android_viewpager.entity;

/**
 * Project name(项目名称)：android_ViewPager
 * Package(包名): mao.android_viewpager.entity
 * Class(类名): ViewPagerInfo
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/5
 * Time(创建时间)： 13:05
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class ViewPagerInfo
{
    /**
     * 标题
     */
    private String title;
    /**
     * 图标
     */
    private int icon;
    /**
     * 内容
     */
    private String content;

    /**
     * Instantiates a new View pager info.
     */
    public ViewPagerInfo()
    {

    }

    /**
     * Instantiates a new View pager info.
     *
     * @param title   the title
     * @param icon    the icon
     * @param content the content
     */
    public ViewPagerInfo(String title, int icon, String content)
    {
        this.title = title;
        this.icon = icon;
        this.content = content;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     * @return the title
     */
    public ViewPagerInfo setTitle(String title)
    {
        this.title = title;
        return this;
    }

    /**
     * Gets icon.
     *
     * @return the icon
     */
    public int getIcon()
    {
        return icon;
    }

    /**
     * Sets icon.
     *
     * @param icon the icon
     * @return the icon
     */
    public ViewPagerInfo setIcon(int icon)
    {
        this.icon = icon;
        return this;
    }

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent()
    {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     * @return the content
     */
    public ViewPagerInfo setContent(String content)
    {
        this.content = content;
        return this;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("title：").append(title).append('\n');
        stringbuilder.append("icon：").append(icon).append('\n');
        stringbuilder.append("content：").append(content).append('\n');
        return stringbuilder.toString();
    }
}
