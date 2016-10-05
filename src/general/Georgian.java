package general;
import students.*;
import java.util.*;

/**
 *
 * @author Mark Chipp 200180985 <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public class Georgian 
{
    public static void main(String[] args)
    {
        //arraylist that will hold student objects
        ArrayList<Student> myStudentList = new ArrayList();
        Scanner read = new Scanner(System.in);
        boolean keepGoing = true;
        int input = 3;
        
        ServiceClass.getInitialMessage();
        input = read.nextInt();
        
        while(keepGoing)
        {
            if(input == 1)
            {
                //gather part time student information
                String firstName, lastName, address, phoneNumber;
                int year, month, day, courseCount;
                boolean innerKeepGoing = true;
                
                do
                {
                    ServiceClass.inputPrompt("first name");
                    if(ServiceClass.stringCheck(firstName = read.nextLine()))
                    {
                        innerKeepGoing = false;
                    }
                }while(innerKeepGoing);
            }
            else if(input == 2)
            {
                
            }
            else if(input == 3)
            {
                //set loop check to exit loop
                keepGoing = false;
            }
            else
            {
                ServiceClass.invalidInput();
            }
        }
    }
}
