/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.lab;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tuf25223
 */
public class JunitLabTest {
    
    public JunitLabTest() {
    }

//    @Test
//    public void testDay() {
//        Date d1 = new Date(2000,1,14);
//        Date d2 = new Date(2000,1,27);
//        assertEquals("Should return 13 days",13, d1.daysTo(d2));
//    }
    
//    @Test
//    public void testMonth() {
//        Date d1 = new Date(2000,11,27);
//        Date d2 = new Date(2000,9,27);
//        assertEquals("Should return 60 days",60, d1.daysTo(d2));
//    }
    
//      @Test
//      public void testYear() {
//          Date d1 = new Date(2002,11,27);
//          Date d2 = new Date(2005,11,27);
//          assertEquals("Should return 1095 days",1095, d1.daysTo(d2));
//      }
    
    @Test
    public void testMonthDaysYears() {
        //3 years + 2 month + 5 days = 1160 days
        Date d1 = new Date(2006,11,25);
        Date d2 = new Date(2009,9,20);
        assertEquals("Should return 1160 days",1160, d1.daysTo(d2));
    }
    
}
