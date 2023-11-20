public class Arrays {

    public static void main(String[] args) {
        //arraycopy
        int[] array = {1,2,3};
        int[] temp = array;
        array = new int[4];

        //array to copy from, start index, array to copy to, start index, how far to go
        System.arraycopy(temp, 0, array, 0, temp.length);
        temp = null;
        System.out.println();

        //2d arrays
        String arr2d[][] = {
                {"1","a"},
                {"2","b"},
                {"3", "c"}
        };
        System.out.println("array len= " + arr2d.length);
        System.out.println("array[0] len= " + arr2d[0].length);
        //If Arrays.sort() can't find a value it will get the index where it should be and multiply by -1
        System.out.println();

    }

    //this method will take 0 or more ints thanks to varargs(...)
    // variable number of arguements without having to use an array
    public void myMethodTakesLotsOfInts (int... manyInts) {
        for (int i : manyInts) {
            // do work here
        }
    }
}
