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
public class Date {
    private int year, month, day;
    
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public int getYear(){
        return this.year;
    }
    public int getdDay(){
        return this.day;
    }
    public int getMongth(){
        return this.month;
    }
    
    public int daysTo(Date date) {
       int resultDay = Math.abs(this.day - date.day);
       int resultMonth = Math.abs(this.month - date.month)*30;
       int resultYears = Math.abs(this.year - date.year)*365;
     
       return resultYears + resultMonth + resultDay;
    }
    
}
