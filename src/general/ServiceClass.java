package general;

/**
 *
 * @author Mark Chipp 200180985 <mark.chipp@mygeorgian.ca, mark.chipp@live.ca>
 */
public class ServiceClass 
{
    public static void getInitialMessage()
    {
        System.out.println("Welcome to Georgian!\n"
        + " Please enter an option:\n"
        + "1. Create new Part time student.\n"
        + "2. Create new Full time student.\n"
        + "3. Exit.\n");
    }
    
    public static void invalidInput()
    {
        System.out.println("Invalid input! Please try again.");
    }
    
    public static boolean stringCheck(String testString)
    {
        return testString.trim().isEmpty();
    }
    
    public static void inputPrompt(String text)
    {
        System.out.println("Please enter the " + text + ":");
    }
}
