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
public class practicefeb11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     double age,credit, cash;
      age=22;
      credit=12000;
      cash=50000;
      if(age>=18&&(cash>=10000||credit>=10000))
      {
          System.out.println("customer can rent car");
      }
      else{
          System.out.println("customer not eligible");
    }
    
}
}