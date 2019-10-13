/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wangxi
 */
public class WeatherData implements Subject{
    public List observers;
    private float temp;
    private float hum;
    private float pre;
    public WeatherData(){
        observers=new ArrayList<Observer>();
    }
    
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        
    }

    @Override
    public void removeObserver(Observer o) {
        int i=observers.indexOf(o);
        if(i>0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for(int i=0;i<observers.size();i++){
            Observer o=(Observer) observers.get(i);
            o.update(temp,hum,pre);
        }
    }
    public void dataChanged(){
        notifyObserver();
    }
    public void setData(float temp,float hum,float pre){
        this.temp=temp;
        this.hum=hum;
        this.pre=pre;
        dataChanged();
    }
    
    
    
}
