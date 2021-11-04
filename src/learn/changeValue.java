package learn;

import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        int[] arr = {12,23,34,45,56};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] num)
    {
        num[0] =99;
         // Here num is not the pass by the reference, but it is the pass by value of the copy of the reference.
        // And what we are doing here is that we are going to change the value of the array via num .
    }  // if we make change to object via reference variable , then same object will be changed.
}
     // output is [99,23,34,45,56]
