public class RandomWalkSim implements Simulation {
    private int numSteps;

    public RandomWalkSim(int numSteps) {
        this.numSteps = numSteps;
    }

    @Override
    public double runOneTrial() {
        int x = 0, y = 0;

        for (int stepNum = 0; stepNum < this.numSteps; stepNum++) {
            int direction = (int)(Math.random()*4);
            if (direction == 0) x++;
            if (direction == 1) x--;
            if (direction == 2) y++;
            if (direction == 3) y--;
        }

        return distanceToOriginFrom(x, y);
    }

    private static double distanceToOriginFrom(int x, int y) {
        return Math.sqrt(x*x + y*y);
    }
}
