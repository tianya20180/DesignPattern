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
public interface Observer {//观察者接口
    public void update(float temp,float humidity,float perssure);
    
}
