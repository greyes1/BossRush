package rush.boss.edu.bossrush;

import java.util.Random;
import java.util.Scanner;

public class RNG {

    static int getRandomNumber(int max) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int output;

        max = input.nextInt();

        output = random.nextInt(max - 1) + 1;

        return output;

    }
}
