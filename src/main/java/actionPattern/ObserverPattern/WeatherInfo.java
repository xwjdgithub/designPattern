package actionPattern.ObserverPattern;

/**
 * 存放天气信息的类
 */
public class WeatherInfo {
    private long time;
    private String weather;

    public long getTime() {
        return time;
    }

    public String getWeather() {
        return weather;
    }

    public WeatherInfo(long time, String weather){
        this.time = time;
        this.weather = weather;
    }

    public boolean equals(Object object){
        WeatherInfo info = (WeatherInfo)object;
        return info.time == this.time && info.weather.equals(this.weather);
    }
}
