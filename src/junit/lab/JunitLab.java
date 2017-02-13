/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.lab;

/**
 *
 * @author tuf25223
 */
public class JunitLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date d1 = new Date(2006,11,25);
        Date d2 = new Date(2009,9,20);
        int days = d1.daysTo(d2);
        
        System.out.println(days);
    }
    
   
}
