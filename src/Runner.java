public class Runner {
    String name;
    int time;

    public Runner(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public static int findMinTimeIndex(Runner[] runners) {
        int minIndex = 0;

        for (int i = 1; i < runners.length; i++) {
            if (runners[i].time < runners[minIndex].time) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static Runner findSecondBestRunner(Runner[] runners) {
        int minIndex = findMinTimeIndex(runners);
        int secondMinIndex = (minIndex == 0) ? 1 : 0;

        for (int i = 0; i < runners.length; i++) {
            if (i != minIndex && runners[i].time < runners[secondMinIndex].time) {
                secondMinIndex = i;
            } else if (i != minIndex && i != secondMinIndex && runners[i].time == runners[secondMinIndex].time) {
                secondMinIndex = i;
            }
        }

        return runners[secondMinIndex];
    }

    public static Runner findThirdBestRunner(Runner[] runners) {
        int minIndex = findMinTimeIndex(runners);
        int secondMinIndex = (minIndex == 0) ? 1 : 0;
        int thirdMinIndex = (secondMinIndex == 0) ? 1 : 0;

        for (int i = 0; i < runners.length; i++) {
            if (i != minIndex && runners[i].time < runners[secondMinIndex].time) {
                thirdMinIndex = secondMinIndex;
                secondMinIndex = i;
            } else if (i != minIndex && i != secondMinIndex && i != thirdMinIndex && runners[i].time == runners[secondMinIndex].time) {
                thirdMinIndex = i;
            } else if (i != minIndex && i != secondMinIndex && runners[i].time < runners[thirdMinIndex].time) {
                thirdMinIndex = i;
            } else if (i != minIndex && i != secondMinIndex && i != thirdMinIndex && runners[i].time == runners[thirdMinIndex].time) {
                thirdMinIndex = i;
            }
        }

        return runners[thirdMinIndex];
    }

    public static void classifyRunners(Runner[] runners) {
        int classA = 0, classB = 0, classC = 0;

        for (Runner runner : runners) {
            if (runner.time >= 200 && runner.time <= 299) {
                classA++;
            } else if (runner.time >= 300 && runner.time <= 399) {
                classB++;
            } else {
                classC++;
            }
        }

        System.out.println("A -> " + classA);
        System.out.println("B -> " + classB);
        System.out.println("C -> " + classC);
    }
}