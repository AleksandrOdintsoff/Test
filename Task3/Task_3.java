package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Type text");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine().toLowerCase();
        reader.close();

        String[] words = text.split("\\s+");
        Arrays.sort(words);

        System.out.println("The word count is " + words.length);
        for (String s : words) {
            System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1));
        }
    }
}
