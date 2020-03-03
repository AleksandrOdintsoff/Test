package Task1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1 {


    private static boolean primeNumber(int number) {
        boolean prime = true;
        if (number < 2)
            prime = false;
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Enter an integer");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;

                 while (true) {
                     try {
                         number = Integer.parseInt(reader.readLine());break;
                     } catch (NumberFormatException e) {
                         System.out.println("The entered character is not an integer\nTry again");
                     }
                 }
        reader.close();
                if (number == 2)
                    System.out.println("The entered number is even and prime");
                else {
                    if (number % 2 == 0)
                        System.out.println("The entered number is even and not prime");
                    else {
                        if (primeNumber(number))
                            System.out.println("The entered number is odd and prime");
                        else
                            System.out.println("the entered number is odd and not prime");
                    }
                }

    }
}
