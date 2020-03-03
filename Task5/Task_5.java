package Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_5 {

    private static boolean isPalindrome (int num) {

            if (num < 10)
                return true;
            else {
                String s = String.valueOf(num);
                int factor = s.length() / 2;
                char [] numbers = s.toCharArray();
                for (int j = 0; j < factor; j++) {
                    if (numbers[numbers.length - (1+j)] != numbers[j])
                        return false;
                }
                return true;
            }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Type an integer from 0 to 100");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
                while (true) {
                    try {
                        number = Integer.parseInt(reader.readLine());
                        if (number < 0 || number > 100)
                            System.out.println("The entered integer does not meet the conditions of the task\nTry again");
                        else break;
                    } catch (NumberFormatException e) {
                        System.out.println(" The entered character is not an integer");
                    }
                }


        ArrayList<Integer> palindromes = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            if (isPalindrome(i))
                palindromes.add(i);
        }


        System.out.println(palindromes);
    }

}
