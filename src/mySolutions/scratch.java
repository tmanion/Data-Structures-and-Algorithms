package mySolutions;

import java.time.Instant;
import java.util.Arrays;

public class scratch {
    static String[] nemo = new String[] {"Nemo"};
    static String[] everyone = new String[] {"dory", "bruce", "marlin", "Nemo", "gill",
        "bloat", "nigel", "squirt", "darla", "hank"};}

    // how long does it take to find Nemo?
    // what is the BigO?
    public static void findNemo(String[] nemo) {
        Instant t0 = Instant.now();
        for (int i = 0; i < nemo.length; i++) {
            if (nemo[i].equals("Nemo")) {
                System.out.println("Found NEMO!");
            }
        }
        Instant t1 = Instant.now();
        System.out.println("Call to findNemo took " + (t1.toEpochMilli() - t0.toEpochMilli()) + " milliseconds.");
    }

    public static void main(String[] args) {
            findNemo(everyone);
        }
}
