import java.util.Random;

public class Slip7A {
    public static void main(String[] args) {
        Random random = new Random();

        NumberGeneratorThread generatorThread = new NumberGeneratorThread(random);
        NumberSquareThread squareThread = new NumberSquareThread(generatorThread);
        NumberCubeThread cubeThread = new NumberCubeThread(generatorThread);

        generatorThread.start();
        squareThread.start();
        cubeThread.start();
    }
}

class NumberGeneratorThread extends Thread {
    private Random random;

    public NumberGeneratorThread(Random random) {
        this.random = random;
    }

    public void run() {
        try {
            while (true) {
                int number = random.nextInt(100);
                System.out.println("Generated number: " + number);

                if (number % 2 == 0) {
                    NumberSquareThread.setNumber(number);
                } else {
                    NumberCubeThread.setNumber(number);
                }

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setSquareThread(NumberSquareThread numberSquareThread) {
    }

    public void setCubeThread(NumberCubeThread numberCubeThread) {
    }
}

class NumberSquareThread extends Thread {
    private static int number;

    public NumberSquareThread(NumberGeneratorThread generatorThread) {
        generatorThread.setSquareThread(this);
    }

    public static void setNumber(int number) {
        NumberSquareThread.number = number;
    }

    public void run() {
        try {
            while (true) {
                if (number % 2 == 0) {
                    int square = number * number;
                    System.out.println("Square of " + number + ": " + square);
                }

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class NumberCubeThread extends Thread {
    private static int number;

    public NumberCubeThread(NumberGeneratorThread generatorThread) {
        generatorThread.setCubeThread(this);
    }

    public static void setNumber(int number) {
        NumberCubeThread.number = number;
    }

    public void run() {
        try {
            while (true) {
                if (number % 2 != 0) {
                    int cube = number * number * number;
                    System.out.println("Cube of " + number + ": " + cube);
                }

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
