import java.util.Arrays;
import java.util.Scanner;

public class Labone{
    public static void main(String []args) {
        {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Test Value");
             int n = sc.nextInt();
            if (n == 0) {
                String Zero[]= new String[0];
                Zero[0]="Zero does not return any values";

            }else if (n < 0)
                System.out.println("Please enter a positive integer");
            else
                System.out.println(Arrays.toString(fizzBuzz(n)));
        }
    }

    public static String[] fizzBuzz(final int n) {
        String Array[] = new String[n];


        for (int i = 1; i <= n; i++) {

            if (i % 5 == 0 && i % 3 == 0) {
                Array[i - 1] = "fizz buzz";
            } else if (i % 3 == 0) {
                Array[i - 1] = "fizz";
            } else if (i % 5 == 0) {
                Array[i - 1] = "buzz";
            } else {
                Array[i - 1] = String.valueOf(i);
            }


        }
        return Array;
    }

}
