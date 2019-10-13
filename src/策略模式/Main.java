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
public class Main {
    public static void main(String[] args){
        Duck model=new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();
        
    }
}
