package lyxs916.citylibrary;


import java.io.Serializable;

public class ItemCityData implements Serializable{
    /**
     * 城市id
     */
    private int CityID;
    /**
     * 城市名字
     */
    private String CityName;
    /**
     * 省id
     */
    private int ProvinceID;

    /**
     * 字母排序的索引
     */
    private String sortLetters = null;

    public ItemCityData() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ItemCityData(int cityID, String cityName) {
        super();
        CityName = cityName;
        CityID = cityID;

    }

    public ItemCityData(String cityName, int cityID, int provinceID, String sortLetters) {
        super();
        CityName = cityName;
        CityID = cityID;
        ProvinceID = provinceID;
        this.sortLetters = sortLetters;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public int getCityID() {
        return CityID;
    }

    public void setCityID(int cityID) {
        CityID = cityID;
    }

    public int getProvinceID() {
        return ProvinceID;
    }

    public void setProvinceID(int provinceID) {
        ProvinceID = provinceID;
    }

    public String getSortLetters() {
        return sortLetters;
    }

    public void setSortLetters(String sortLetters) {
        this.sortLetters = sortLetters;
    }

    @Override
    public String toString() {
        return "ItemCityData [CityName=" + CityName + ", CityID=" + CityID + ", ProvinceID=" + ProvinceID
                + ", sortLetters=" + sortLetters + "]";
    }

}
