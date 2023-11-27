import java.util.*;
import java.util.Collections;

public class Collections2 {

    //you can turn varargs collections into a list, example below
    //List<MyDate> dates = Arrays.asList(new MyDate(2,1,2020), new MyDate(3,10,1980));

    /* Example 2
    MyDate[] datesArray = { new MyDate(2,1,2020), new MyDate(3,10,1980) };
    List<MyDate> dates = Arrays.asList(datesArray));
    */


    /*
    asList is a method in the Arrays class, so the code below doesn't work
    List<MyDate> dates = Collections.asList();
    List<MyDate> dates2 = new ArrayList<>(); // LEGAL
    dates2 = dates2.asList(
        new MyDate(2,1,2020), new MyDate(3,10,1980)); // ILLEGAL
     */


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Barry Allen");
        list.add("Wally West");
        list.add("Jay Garrick");
        Collections.sort(list);
        Collections.binarySearch(list, "Wally West");
        Collections.reverse(list);
        Collections.shuffle(list);

    }


}
