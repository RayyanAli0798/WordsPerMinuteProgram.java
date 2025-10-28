import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class WPSProgram {

    static String[] Words = {"suit", "track", "mix", "annoying",
                      "children","silence","peace","shirt",
                      "truck","japan","bottle","laptop","printer","compiler"};
    public static void main(String[] args)throws InterruptedException {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("3");
        Thread.sleep(1000);

        System.out.println("2");
        Thread.sleep(1000);

        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("Go!!!");

        for (int i = 0;i < 10; i++){
            System.out.print(Words[rand.nextInt(13) ] + " ");
        }
        System.out.println();

        double start = LocalTime.now().toNanoOfDay();
        String typedWords = scanner.nextLine();
        double end = LocalTime.now().toNanoOfDay();
        double timeTaken = end - start;
        double seconds = timeTaken / 1000000000.0;
        int characters = typedWords.length();
        int wpm = (int) ((((double) characters /  5) / seconds)* 60);
        System.out.println("Your words per minutes are: " + wpm + "!");

    }
}
