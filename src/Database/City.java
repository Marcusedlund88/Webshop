package Database;

public class City {

    private int cityID;
    private String cityName;

    public City() { }

    public City(int cityID, String cityName) {
        this.cityID = cityID;
        this.cityName = cityName;
    }

    public String getCityName(){
        return cityName;
    }
    @Override
    public String toString(){
        return "City{" +
                "id=" + cityID +
                ", countyName='" + cityName +
                '}';

    }
}
