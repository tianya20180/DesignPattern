/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 策略模式;

/**
 *
 * @author wangxi
 */
public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior=new FlyWithNoWay();
        quackBehavior=new Quack();
    }

    @Override
    public void display() {
        System.out.println("Model Duck");
    }
    
    
}
