import java.util.Scanner;
import java.util.function.Function;

public class RandomWalk {
    private static final int MAX_TRIALS = 10000;

    public static void main(String[] args) {
        //findAverageOf(new RandomWalkSim(100), MAX_TRIALS);
        String s = "hello";
        String[] letters = s.split("");
        System.out.println(letters.length);
    }

    public static double findAverageOf(Simulation s, int trials) {
        double sum = 0;
        for (int i = 0; i < trials; i++) {
             sum += s.runOneTrial();
        }

        return sum/trials;
    }

    private static void displayTableOfExpectedDistancesUpTo(int maxNumSteps) {
        System.out.println("Num steps \t Expected end distance");
        for (int steps = 1; steps <= maxNumSteps; steps++) {
       //     double avEndDist = getExpectedEndDistanceFor(steps);
        //    System.out.println(steps + "\t\t\t" + avEndDist);
        }
    }
}
