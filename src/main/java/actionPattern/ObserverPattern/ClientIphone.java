package actionPattern.ObserverPattern;

/**
 * 具体的客户端
 */
public class ClientIphone implements Client {
    private String name = "苹果服务";
    private WeatherInfo info;

    public void getWeather(WeatherInfo info){
        this.info = info;
        delMsg();
    }

    private void delMsg(){
        System.out.println(name + "收到最新天气：time=" + info.getTime() + " " + info.getWeather());
    }
}
