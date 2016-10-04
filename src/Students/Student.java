package Students;

import java.util.*;

/**
 *
 * @author Mark Chipp <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public class Student
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
        //this.birthDate = new GregorianCalendar();
        this.courseFee = 500.00;
    }
    
    /**
     * Method to calculate the total course fee
     * @return 
     */
    public double calculateCourseFee()
    {
        return courseFee*courseCount;
    }
            
    
}
