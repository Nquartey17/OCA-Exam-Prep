import java.net.MalformedURLException;
import java.net.URL;

//Extend Exception class to create custom exception
public class Exceptions extends Exception{
    //code for creating a custom exception
    public Exceptions (String message) {
        super(message);
    }

    public static void main(String[] args) {
        //multiple catch blocks can be used
        try {
            String str = "A char string";
            System.out.println("Before");
            char ch = str.charAt(20);
            System.out.println("After");
        }
        //You can catch multiple exceptions in the same block
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Problem in main: " + e.getMessage());
            e.printStackTrace();
        }
        //After the exception in the try block is caught, everything after won't execute


        //try-with-resources allows us to omit the finally clause by automatically
        //calling close at the end of the method

        /* if using try block, you must have one of the three options
        try-catch-finally, try-catch, or try-finally
         */

        try {
            openHttpConnection2("http://www.google.com");
        } catch (MalformedURLException e) {
            System.out.println("The URL is incorrect");
        }
    }

    public static void openHttpConnection() {
        try {
            //line doesn't work without try catch (compile exception)
            URL site = new URL("http://www.google.com");
        } catch (MalformedURLException e) {
            System.out.println("The URL is incorrect");
        }
    }

    //any method that calls our method will be forced to try and catch
    public static void openHttpConnection2(String url) throws MalformedURLException {
        URL site = new URL(url);
    }
}
