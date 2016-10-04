package Students;

import java.util.*;

/**
 *
 * @author Mark Chipp <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public abstract class Student
{
    //private data members
    private String firstName, lastName, address, phoneNumber;
    //variables holding dates for birthday
    private int year, motnh, day, courseCount;
    private GregorianCalendar birthDate;
    //fee variable
    private double courseFee;
    
    //**constructors**\\
    public Student()
    {}
    
    //overloaded constructor
    public Student(String firstName, String lastName, String address, String phoneNumber, int year, int month, int day)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthDate = new GregorianCalendar();
        this.birthDate.set(Calendar.YEAR, year);
        this.birthDate.set(Calendar.MONTH, month-1);
        this.birthDate.set(Calendar.DATE, day);
        
        this.courseFee = 500.00;
    }
    
    /**
     * Method to calculate the total course fee
     * @return 
     */
    public abstract double calculateCourseFee();
    
    /**
     * Method to get the course fee
     * @return 
     */
    public double getCourseFee()
    {
        return courseFee;
    }
    
    /**
     * Method to get the course fee
     * @return 
     */
    public int getCourseCount()
    {
        return courseCount;
    }
    
    /**
     * Method to set the course fee 
     * @param fee
     */
    public void setCourseFee(double fee)
    {
        courseFee = fee;
    }
    
    /**
     * Method to set the course count 
     * @param count
     */
    public void setCourseCount(int count)
    {
        courseCount = count;
    }
}