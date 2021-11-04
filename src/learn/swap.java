package learn;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = input.nextInt();
        System.out.print("Enter the number : ");
        int b = input.nextInt();
        int temp = a;
        a = b ;
        b = temp;
        System.out.println("the output is : " + a +" " + b);
        System.out.println("Hence the number is swapped . ");
    }
}
