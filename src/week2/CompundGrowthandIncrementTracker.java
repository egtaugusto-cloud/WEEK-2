/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author 292024
 */
public class CompundGrowthandIncrementTracker {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // COMPOUND GROWTH AND INCREMENT TRACKER 
     
        int initBalance = 5000;
        
        initBalance += 50;
        System.out.println("Total Balance (+=) = " + initBalance);
        
        initBalance -= 20;
        System.out.println ("Total Balance (-=) " + initBalance);
        
        initBalance *= 2;
        System.out.println ("Total Balnace (*=) = " + initBalance);
        
        int count = 10;
        System.out.println (count++);
        System.out.println (count);
        
        System.out.println (++count);
        System.out.println (count);
        
        // count++ increments the first value which is 10, then increments it that is why it becomes 11
        // ++count increments 12 because of 11 (it adds +1 to it) then printed both as 12 
        
        
        
    
    }
    
}
