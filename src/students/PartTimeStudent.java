package students;

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
     * Method which determines amount of courses and calculates fee
     * @return 
     */
    @Override
    public double calculateCourseFee()
    {
        //selection statement that will determine the fee
        if(super.getCourseCount() >0 && super.getCourseCount() < 2)
        {
            super.setCourseFee(700.00);
        }
        else if(super.getCourseCount() >1 && super.getCourseCount() < 3)
        {
            super.setCourseFee(650.00);
        }
        else if(super.getCourseCount() >2 && super.getCourseCount() < 4)
        {
            super.setCourseFee(600.00);
        }
        else if(super.getCourseCount() >3)
        {
            super.setCourseFee(500.00);
        }
        //return the calculated fee
        return super.getCourseFee()*super.getCourseCount();
    }
}
