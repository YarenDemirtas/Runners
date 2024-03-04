
 public class Main {
    public static void main(String[] args) {
        Runner[] runners = {
                new Runner("kadir", 341),
                new Runner("gökhan", 273),
                new Runner("hakan", 278),
                new Runner("suzan", 329),
                new Runner("pınar", 445),
                new Runner("mehmet", 402),
                new Runner("ali", 388),
                new Runner("emel", 270),
                new Runner("fırat", 243),
                new Runner("james", 334),
                new Runner("jale", 412),
                new Runner("ersin", 393),
                new Runner("deniz", 299),
                new Runner("gözde", 343),
                new Runner("anıl", 317),
                new Runner("burak", 265)
        };
        int minIndex = Runner.findMinTimeIndex(runners);
        System.out.println("\n En iyi koşucu: " + runners[minIndex].name + " - " + runners[minIndex].time + " dakika");

        Runner secondBestRunner = Runner.findSecondBestRunner(runners);
        System.out.println("\n İkinci en iyi koşucu: " + secondBestRunner.name + " - " + secondBestRunner.time + " dakika");

        Runner thirdBestRunner = Runner.findThirdBestRunner(runners);
        System.out.println("\n Üçüncü en iyi koşucu: " + thirdBestRunner.name + " - " + thirdBestRunner.time + " dakika");

        Runner.classifyRunners(runners);
    }
}

