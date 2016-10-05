package students;

/**
 *
 * @author Mark Chipp <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public class FullTimeStudent extends Student
{
    public FullTimeStudent(String firstName, String lastName, String address,
            String phoneNumber, int year, int month, int day, int courseCount)
    {
        super(firstName,lastName,address,phoneNumber,year,month,day);
        super.setCourseCount(4);
    }
    
    /**
     * Method to calculate the total course fee
     * @return 
     */
    @Override
    public double calculateCourseFee()
    {
        return super.getCourseFee()*super.getCourseCount();
    }

}
