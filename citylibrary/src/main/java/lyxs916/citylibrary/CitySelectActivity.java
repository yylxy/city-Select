package lyxs916.citylibrary;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lyxs916.myview.GridViewForScrollView;


/**
 * 选择城市 视图
 * <p>
 * 使用方法 ：
 * 1，调用startUi()，启动选择城市页面
 * 2，在onActivityResult()中回调,返回名称为 ："city"，"cityId";
 * 返回code:setResult(RESULT_OK, intent)
 * <p>
 * 3.如要设置城市调用：startUi(Activity context, ArrayList<ItemCityData> listData);
 * 4.如要设置城市与热门城市调用：startUi(Activity context, ArrayList<ItemCityData> listData, ArrayList<String> hotCityDatas);
 * 5.如果只设置热门城市，调用startUi(Activity context, ArrayList<ItemCityData> listData, ArrayList<String> hotCityDatas);城市数据集合传null既可
 *
 * @author Administrator
 */
public class CitySelectActivity extends Activity  {
    public PinyinComparator comparator = new PinyinComparator();

    ArrayList<ItemCityData> listData = new ArrayList<ItemCityData>();
    private SortAdapter adapter;

    //索引条
    private MyViewSideBar sideBar;
    private ListView listView;
    //中心提示
    private TextView dialogTxt;
    //头部
    private View headView;
    //返回
    private ImageView back;
    //搜索
    private SearchView searchView;
    //热门城市
    private GridViewForScrollView hotCity;
    private ArrayList<String> hotCityDatas = new ArrayList<>();
    private ArrayAdapter hotAdapter;

    private CityData cityData = new CityData();

    /**
     * 启动UI
     */
    public static void startUi(Activity context) {
        Intent intent = new Intent(context, CitySelectActivity.class);
        context.startActivityForResult(intent, 99);
    }


    /**
     * 启动UI,设置城市数据
     */
    public static void startUi(Activity context, ArrayList<ItemCityData> listData) {
        Intent intent = new Intent(context, CitySelectActivity.class);
        intent.putExtra("listData", listData);
        context.startActivityForResult(intent, 99);


    }

    /**
     * 启动UI,设置城市数据与热门城市数据
     */
    public static void startUi(Activity context, ArrayList<ItemCityData> listData, ArrayList<String> hotCityDatas) {
        Intent intent = new Intent(context, CitySelectActivity.class);
        if (listData != null) {
            intent.putExtra("listData", listData);
        }
        if (hotCityDatas != null) {
            intent.putExtra("hotCityDatas", hotCityDatas);
        }
        context.startActivityForResult(intent, 99);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city_addressed_city_activity);


        parseIntent();
        init();
        addLitener();
        addListAdapter();

    }

    public void parseIntent() {
        try {
            if (getIntent().getSerializableExtra("hotCityDatas") != null) {
                hotCityDatas.addAll((ArrayList<String>) getIntent().getSerializableExtra("hotCityDatas"));
            }
            if (getIntent().getSerializableExtra("listData") != null) {
                listData.addAll((ArrayList<ItemCityData>) getIntent().getSerializableExtra("listData"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (hotCityDatas.size() == 0) {
            cityData.gerHotCityData(hotCityDatas);
        }

        if (listData.size() == 0) {
            cityData.gerCityData(listData);
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    /**
     * listView 添加 adapter
     */
    private void addListAdapter() {
        listView.addHeaderView(headView);
        adapter = new SortAdapter(getApplicationContext(), listData);
        listView.setAdapter(adapter);
        // 保存之前把拼音添加上
        addPinYin(listData);
        // 更新适配器中的集合
        adapter.list = listData;
        // 更新适配器
        adapter.notifyDataSetChanged();

    }

    /**
     * 初始化
     */
    private void init() {
        back = (ImageView) findViewById(R.id.back);
        searchView = (SearchView) findViewById(R.id.searchView);

        sideBar = (MyViewSideBar) findViewById(R.id.sb_me_addressed_city);
        dialogTxt = (TextView) findViewById(R.id.tv_me_addressed_citytxt_dialog);
        sideBar.setmTextDialog(dialogTxt);
        listView = (ListView) findViewById(R.id.lv_me_addressed_city_listView);
        headView = getLayoutInflater().inflate(R.layout.city_head_hot_city, null);
        hotCity = (GridViewForScrollView) headView.findViewById(R.id.hotCity);


        //添加监听
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }



    /**
     * 根据城市名返回id
     *
     * @param s
     */
    private void returnNameId(String s) {

        int cityid = 0;
        for (int i = 0; i < listData.size(); i++) {
            if ((s + "市").equals(listData.get(i).getCityName())) {
                cityid = listData.get(i).getCityID();
            }
        }
        Intent intent = new Intent();
        intent.putExtra("city", s);
        intent.putExtra("cityId", String.valueOf(cityid));
        setResult(RESULT_OK, intent);
        finish();
    }


    /**
     * 添加拼音并排序
     */
    private void addPinYin(List<ItemCityData> data) {

        /**
         * 往实体中添加数据,这里添加的都把中文转成拼音之后的
         */
        try {
            filledData(data);
        } catch (BadHanyuPinyinOutputFormatCombination e1) {
            e1.printStackTrace();
        }
        /**
         * 排序 sort by a-z
         */
        Collections.sort(listData, comparator);

    }

    /**
     * 添加监听
     */
    private void addLitener() {

        // 索引条的监听
        sideBar.setOnTouchingLetterChangedListener(new MyViewSideBar.OnTouchingLetterChangedListener() {

            public void onTouchingLetterChanged(String str) {
                int position = adapter.getPositionForSection(str.charAt(0));
                if (position != -1)
                    listView.setSelection(position);

            }
        });


        // 设置选中的背景，目前是透明的
        listView.setSelector(new ColorDrawable(Color.TRANSPARENT));
        listView.setOnItemClickListener(new OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                position = position - 1;
                Toast.makeText(getApplicationContext(), ((ItemCityData) adapter.getItem(position)).getCityName(),
                        Toast.LENGTH_SHORT).show();
                /**
                 * 把选择的数据返回过去
                 */
                Intent intent = new Intent();
                intent.putExtra("city", ((ItemCityData) adapter.getItem(position)).getCityName());
                intent.putExtra("cityId", String.valueOf(listData.get(position).getCityID()));
                setResult(RESULT_OK, intent);
                finish();// 此处一定要调用finish()方法

            }
        });


        /**
         * 搜索数据的过滤
         */
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                try {
                    filerData(newText);
                } catch (BadHanyuPinyinOutputFormatCombination badHanyuPinyinOutputFormatCombination) {
                    badHanyuPinyinOutputFormatCombination.printStackTrace();
                }

                return false;
            }
        });

        /**
         * 热门城市的选择
         */
        hotCity.setAdapter(hotAdapter = new ArrayAdapter<String>(this, R.layout.city_item_hot_city, hotCityDatas));
        hotCity.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                returnNameId(hotCityDatas.get(position));
            }
        });


    }

    /**
     * 添加数据
     *
     * @param date
     * @return
     * @throws BadHanyuPinyinOutputFormatCombination
     */
    private void filledData(List<ItemCityData> date) throws BadHanyuPinyinOutputFormatCombination {

        for (int i = 0; i < date.size(); i++) {
            //判断是不是重庆市，如果是字母为C(多音字否则会赋值为Z)
            if (date.get(i).getCityName().equals("重庆市")) {
                date.get(i).setSortLetters("C");
            } else {
                ItemCityData itemCityData = date.get(i);
                // 汉字转换成拼音
                String pinyin = PinYinKit.getPingYin(date.get(i).getCityName());
                // 截取第一个字母并转成大写
                String sortString = pinyin.substring(0, 1).toUpperCase();
                // 正则表达式，判断首字母是否是英文字母
                if (sortString.matches("[A-Z]")) {
                    itemCityData.setSortLetters(sortString.toUpperCase());
                } else {
                    itemCityData.setSortLetters("#");
                }
            }
        }

    }

    /**
     * 搜索时过滤数据
     *
     * @param str
     * @throws BadHanyuPinyinOutputFormatCombination
     */
    private void filerData(String str) throws BadHanyuPinyinOutputFormatCombination {
        List<ItemCityData> fSortModels = new ArrayList<ItemCityData>();

        //包含搜索字的排到一起
        for (int i = 0; i < listData.size(); i++) {

            if (listData.get(i).getCityName().contains(str)) {
                fSortModels.add(listData.get(i));
            }

        }
        // 比较排序
        Collections.sort(fSortModels, comparator);
        // 更新adapter listview 数据源
        adapter.updateListView(fSortModels);
    }


}
