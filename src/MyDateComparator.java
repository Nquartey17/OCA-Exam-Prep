import java.util.Comparator;

public class MyDateComparator  implements Comparator {
    //Use to compare any two objects
    //Useful when comparing elements of a heterogeneous collection and third-party classes
    //you don't have to source to
    @Override
    public int compare(Object o1, Object o2) {
        MyDate d1 = (MyDate) o1;
        MyDate d2 = (MyDate) o2;
        if (d1.year != d2.year) {
            return d1.year - d2.year;
        }
        if (d1.month != d2.month) {
            return d1.month - d2.year;
        }
        if (d1.day != d2.day) {
            return d1.day - d2.day;
        }
        return 0;
    }
}
