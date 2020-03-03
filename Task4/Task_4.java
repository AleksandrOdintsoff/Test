package Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_4 {
    public static <ong> void main(String[] args) throws IOException {
        System.out.println("Type text");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        System.out.println("type the word");
        String word = reader.readLine().toLowerCase();
        reader.close();

        String [] words = text.toLowerCase().replaceAll("\\p{Punct}", "").split("\\s+");
        int count = 0;
        for (String s : words ) {
            if (s.equals(word))
                count++;
        }
        System.out.println("The word \"" + word + "\" appears in the text " + count + " times.");
    }
}
