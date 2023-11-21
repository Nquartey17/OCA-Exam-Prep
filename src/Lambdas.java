// import static (packageName).methodName

//import static com.intertech.SafeDriver.*;
// double distance = SafeDriver.SAFE_FOLLOWING_DISTANCE; would not work unless you included line below
//import static com.intertech.SafeDriver;
public class Lambdas {
    // Specify the implementation of the class without having to redefine the method signature,
    // just pass in the body

    public static void cutCheck(Payable p) {
        double updatedSalary = p.raiseSalary(.04);
        //cut check with new updatedSalary
    }

    public static void main(String[] args) {
        double salary = 75_000;
        cutCheck(
//                (double percentage) -> { return salary + (percentage * salary) ;}
                // method parameters ->             method body

                //with one parameter this can be simplified to exclude type and ()
                // percentage -> { return salary + (percentage * salary) ;}

                //if there's only one statement in the body, you can remove {}, return, and ;
                 percentage -> salary + (percentage * salary)

        );
    }
}

