package Students;

/**
 *
 * @author Mark Chipp <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public class PartTimeStudent extends Student
{
    public PartTimeStudent(String firstName, String lastName, String address,
            String phoneNumber, int year, int month, int day, int courseCount)
    {
        super(firstName,lastName,address,phoneNumber,year,month,day);
        super.setCourseCount(courseCount);
    }
    
    /**
     * Method to calculate the total course fee
     * @return 
     */
    @Override
    public double calculateCourseFee()
    {
        if(super.getCourseCount() >0 && super.getCourseCount() < 2)
        {
            super.setCourseFee(700.00);
        }
        else if(super.getCourseCount() >0 && super.getCourseCount() < 2)
        {
            super.setCourseFee(800.00);
        }
        return super.getCourseFee()*super.getCourseCount();
    }
}
