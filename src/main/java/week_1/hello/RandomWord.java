package week_1.hello;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int i = 1;
        String champion = "";

        while (!StdIn.isEmpty()) {
            String challenger = StdIn.readString();
            if (StdRandom.bernoulli(1d / i)) {
                champion = challenger;
            }
            i++;
        }

        System.out.println(champion);
    }
}
