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
public class QuackScilence implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("我不会叫");
    }
    
}
