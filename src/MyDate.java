public class MyDate implements Comparable {
    public int day, month, year; //Should be private, made public to use in other class
    public MyDate(int month, int day, int year) {
        this.day = day;
        this.year = year;
        this.month = month;
    }

    @Override
    public int compareTo(Object o) {
        /* if num is positive, date should come after the m/d/y passed in
           if negative, date should come before m/d/y passed in
           if equal, return 0. This sorts dates in order. Switch subtraction for reverse
        * */
        MyDate d = (MyDate) o;
        if (year != d.year) {
            return year - d.year;
        }
        if (month != d.month) {
            return month - d.year;
        }
        if (day != d.day) {
            return day - d.day;
        }
        return 0;
    }
}
