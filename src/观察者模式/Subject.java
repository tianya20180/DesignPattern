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
public interface Subject {//主题接口
    public void registerObserver(Observer o);//注册观察者
    public void removeObserver(Observer o);//删除观察者
    public void notifyObserver();//通知所有的观察者
    
}
