package actionPattern.ObserverPattern;

public class TestUse {
    public static void main(String[] args){
        //创建主题
        WeatherService weatherService = WeatherService.INSTANCE;

        //添加观察者
        weatherService.addClient(new ClientAndroid());
        weatherService.addClient(new ClientIphone());

        //更新主题
        weatherService.updateWeachter(new WeatherInfo(System.currentTimeMillis(), "多云"));
        weatherService.updateWeachter(new WeatherInfo(System.currentTimeMillis()+1000*60*60*24, "多云转晴"));
        weatherService.updateWeachter(new WeatherInfo(System.currentTimeMillis()+1000*60*60*24, "晴"));
    }
}
