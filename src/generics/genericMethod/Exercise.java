package generics.genericMethod;

import java.util.Arrays;
/*
* swapping  two data
*
* */
public class Exercise {
    public static <T> void swap(T[] array, int i, int j) {
        T t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static void main(String[] args) {
        String[] a = {"1", "2", "3"};
        System.out.println("Before swapping :" + Arrays.toString(a));
        swap(a, 0, 2);
        System.out.println("after swapping :" + Arrays.toString(a));
    }
}
