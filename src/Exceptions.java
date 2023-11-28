public class Exceptions {

    public static void main(String[] args) {
        //multiple catch blocks can be used
        try {
            String str = "A char string";
            System.out.println("Before");
            char ch = str.charAt(20);
            System.out.println("After");
        }
        //You can catch multiple exceptions in the same block
        catch (StringIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("String length too small or empty");
        }
        //After the exception in the try block is caught, everything after won't execute
        finally {
            System.out.println("Ending code");
        }

        //try-with-resources allows us to omit the finally clause by automatically
        //calling close at the end of the method

        /* if using try block, you must have one of the three options
        try-catch-finally, try-catch, or try-finally
         */
    }
}
