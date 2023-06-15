package mySolutions;

import java.time.Instant;
import java.util.Arrays;

public class scratch {

    ////////////////////////////////////////////////////////////////
    // BigO introduction
    ////////////////////////////////////////////////////////////////
    static String[] nemo = new String[] {"Nemo"};
    static String[] everyone = new String[] {"dory", "bruce", "marlin", "Nemo", "gill",
        "bloat", "nigel", "squirt", "darla", "hank"};

    // how long does it take to find Nemo?
    // what is the BigO?
    public static void findNemo(String[] nemo) {

        for (int i = 0; i < nemo.length; i++) {
            if (nemo[i].equals("Nemo")) {
                System.out.println("Found NEMO!");
            }
        }
    }

    static int[] boxes = new int[] {0, 1, 2, 3, 4, 5};

    public static void logFirstTwoBoxes(int[] boxes) {
        System.out.println(boxes[0]); // O(1)
        System.out.println(boxes[1]); // O(1)
    }
    public static void main(String[] args) {
            findNemo(everyone); // O(n) --> linear Time

            logFirstTwoBoxes(boxes); // O(1) --> Constant Time
        }
}
