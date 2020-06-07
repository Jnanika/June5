/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author manju
 */
public class CalculatorNew {
    static double a=10,b=12;
    public static double add(double a, double b)
    {
        return a+b;
    }
    public static double subtract(double a, double b)
    {
        return a-b;
    }
    public static void main(String[] args)
    {
        a++;
//        CalculatorNew c = new CalculatorNew();
//        System.out.println("Add:" + c.add(a,b));
        System.out.println("Add New:" + add(a,b));
        System.out.println("Add New:" + add(a,b));
//        a = 10;
//        b=12;
//System.out.println("Add:" + add(a,b));
//System.out.println("Sub:" + subtract(a,b));
    }
}
