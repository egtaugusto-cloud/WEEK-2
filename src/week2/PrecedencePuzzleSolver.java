/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author 292024
 */
public class PrecedencePuzzleSolver {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // PRECEDENCE PUZZLE SOLVER
        
      int a = 6, b = 12, c = 18;
        boolean x = true, y = false;
      
        // In my prediction this is true
        boolean result1 = (a+b) * 2 >= c && x || y;
        System.out.println ("a + b * 2 =  " + (a+b)*2);
        System.out.println ("a + b * 2 is less than or equal to c? = " + result1 + "\n"); 
        
        // Prediction True 
        boolean result2 = (c % b) == 6 && 50 > b || (a / c) <= a;
        System.out.println ("c % b = " + (c%b));
        System.out.println("result2 = " + result2 + "\n");
        
        //Prediction is False
        boolean result3 = b-- + c/a <= 5 || x && y;
        System.out.println ("c/a >= " + (c/a));
        System.out.println("result3 = " + result3);
        
        
        
       
    }
}
