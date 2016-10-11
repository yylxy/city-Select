package lyxs916.json;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/8/4.
 * gson的默认值处理
 * gson的注解
 *
 * @Expose 是否序列化与反序列化
 * @SerializedName 序列化时候的名称
 */

public class GsonHelper {


    public static Gson getGson() {
        return new GsonBuilder()
                .registerTypeAdapter(int.class, new JsonTypeAdapter.IntegerTypeAdapter())
                .registerTypeAdapter(long.class, new JsonTypeAdapter.LongTypeAdapter())
                .registerTypeAdapter(float.class, new JsonTypeAdapter.FloatTypeAdapter())
                .registerTypeAdapter(double.class, new JsonTypeAdapter.DoubleTypeAdapter())
                .serializeNulls()
                .create();
    }



    /**
     * 解析泛型集合
     *
     * @param jsonArray
     * @param cls
     * @param <T>
     * @return
     */
    public static <T> List<T> jsonToCollection(JSONArray jsonArray, Class<T> cls) {
        if (TextUtils.isEmpty(jsonArray.toString())) {
            return null;
        }
        ArrayList<T> list = new ArrayList<T>();
        try {
            for (int i = 0; i < jsonArray.length(); i++) {
                list.add(jsonToObject(jsonArray.getJSONObject(i).toString(), cls));
            }

            return list;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return list;
    }




    /**
     * 解析一个泛型对象
     *
     * @param jsonResult
     * @param cls
     * @param <T>
     * @return
     */
    public static <T> T jsonToObject(String jsonResult, Class<T> cls) {
        if (TextUtils.isEmpty(jsonResult)) {
            return null;
        }
        try {
            T t = GsonHelper.getGson().fromJson(jsonResult, cls);
            return t;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
