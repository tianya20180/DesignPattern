/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 观察者模式;

/**
 *
 * @author wangxi
 */
public class ConditionDisplay implements Observer,DisplayElement{
    private float temp;
    private float hum;
    private float pre;
    private Subject weatherData;
    
    public ConditionDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }
    
    @Override
    public void update(float temp, float humidity, float perssure) {
        this.temp=temp;
        this.hum=humidity;
        this.pre=perssure;
        display();
    }

    @Override
    public void display() {
        System.out.println("temp:"+temp+"humditi:"+hum+"perssure:"+pre);
    }
    
}
