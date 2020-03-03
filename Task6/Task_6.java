package Task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_6 {

    static void packing(int capacity, Thing[] things) {
        int[] stuff = new int[things.length];
        int maxValue = 0;


        for (int i = 0; i < Math.pow(2, things.length) ; i++) {
            int val = 0;
            int wt = 0;
            int[] tempStuff = new int[things.length];

            for (int j = 0; j < things.length ; j++) {
                int check = 1 << j;
                if ((i & check) > 0) {
                    tempStuff[j] = 1;
                    wt += things[j].getWeight();
                    val += things[j].getValue();
                }
            }

            if (wt <= capacity && val > maxValue) {
                maxValue = val;
                stuff = tempStuff;
            }
        }


        System.out.print("There is ");
        for (int i = 0; i < stuff.length; i++) {
            if (stuff[i] == 1)
                System.out.print(things[i].getName() + " ");
        }
        System.out.println("in your backpack");
        System.out.println("The common value is " + maxValue);
    }



    public static void main(String[] args) throws IOException {
        int capacity;
        Thing[] things;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.println("Type your backpack capacity in integer");
                try {
                    capacity = Integer.parseInt(reader.readLine());
                    if (capacity < 1)
                        System.out.println("The backpack capacity can't be less than 1");
                    else break;
                } catch (NumberFormatException e) {
                    System.out.println("You entered invalid characters");
                }
            }

            while (true) {
                try {
                    System.out.println("Type the number of things that you have");
                    int thingNumbers = Integer.parseInt(reader.readLine());
                    if (thingNumbers > 0) {
                        things = new Thing[thingNumbers];
                        break;
                    } else
                        System.out.println("You have no things");

                } catch (NumberFormatException e) {
                    System.out.println("You entered invalid characters");
                }
            }


            for (int i = 0; i < things.length; ) {
                String thingName;
                int thingWeight;
                int thingValue;

                System.out.println("Type the name of thing " + (i + 1));
                thingName = reader.readLine();
                System.out.println("Type the " + thingName + " weight in integer");
                try {
                    thingWeight = Integer.parseInt(reader.readLine());
                    if (thingWeight < 1) {
                        System.out.println("the thing weight cannot be less than 1");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("You entered invalid characters");
                    continue;
                }
                System.out.println("Type the " + thingName + " value in integer");
                try {
                    thingValue = Integer.parseInt(reader.readLine());
                    if (thingValue < 0) {
                        System.out.println("the thing value cannot be less than 0");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("You entered invalid characters");
                    continue;
                }

                things[i] = new Thing(thingName, thingWeight, thingValue);
                i++;
            }

        reader.close();

        packing(capacity, things);

    }
}
