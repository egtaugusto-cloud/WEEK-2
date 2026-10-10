/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author 292024
 */
public class GradeThresholdChecker {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // GRADE THRESHOLD CHECKER
        
        int stdaveg = 90;
        int absences = 3;
        
        System.out.println ("Average: " + stdaveg);
        System.out.println ("Absences: " + absences);
        boolean passed = (stdaveg >= 75 && absences <= 3) || (stdaveg >= 90); 
        
        boolean studentgrd = stdaveg <= 95 && passed;
        System.out.println ("Did the Student passed? " +  studentgrd);
        System.out.println ("The Average Grade of the Student passed the required grade");
      
        
        
        
        
    }
    
}

