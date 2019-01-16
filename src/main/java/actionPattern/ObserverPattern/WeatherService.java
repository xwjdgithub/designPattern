package actionPattern.ObserverPattern;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * 具体的服务主题
 * 用枚举来定义，实现单例效果
 */
public enum  WeatherService implements IWeatherService{
    INSTANCE;

    private LinkedList<WeatherInfo> weatherInfos = new LinkedList<WeatherInfo>();
    private LinkedHashSet<Client> clients = new LinkedHashSet<Client>();//存放观察者

    //添加观察者
    public void addClient(Client client){
        clients.add(client);
    }

    //删除观察者
    public boolean deleteClient(Client client){
        return clients.remove(client);
    }

    //通知
    public void notifyClients(){
        Iterator<Client> iterator = clients.iterator();
        while (iterator.hasNext()){
            iterator.next().getWeather(weatherInfos.peekFirst());
        }
    }

    //主题内容更新
    public void updateWeachter(WeatherInfo info){
        if(weatherInfos.size() > 0 && weatherInfos.peekFirst().equals(info)){
            return;
        }
        weatherInfos.push(info);
        if(weatherInfos.size() > 0){
            notifyClients();
        }
    }
}
