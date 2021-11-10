package Clases.TE8;

import java.util.ArrayList;

public class YouTubeChannel implements Subject{
    private ArrayList<Observer> observers;
    private String channelName;
    private String status;

    public YouTubeChannel(String channelName, String status){
        this.observers = new ArrayList<>();
        this.channelName = channelName;
        this.status = status;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        if (observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers){
            o.update(status);
        }
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObserver();
    }
}
