package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2 {


    private static int greatestCommonDivisor(int a, int b) {

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return Math.abs(a);
    }

    private  static int leastCommonMultiple(int a, int b) {
        return Math.abs( a / greatestCommonDivisor(a, b) * b);
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Enter two integers");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = 0;
        int number2 = 0;

            while (true) {
                try {
                    number1 = Integer.parseInt(reader.readLine());
                    number2 = Integer.parseInt(reader.readLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("The entered characters are not integers\nTry again");
                }
            }
        reader.close();
        System.out.println("The least common multiple is " + leastCommonMultiple(number1, number2));
        System.out.println("The greatest common divisor is " + greatestCommonDivisor(number1, number2));
    }
}
