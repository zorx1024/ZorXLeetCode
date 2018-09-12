package zorx.algorithms;

import java.util.Scanner;

/**
 * Created by ZorX on 2018/9/11.
 */
public class NimGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(canWinNim(n));
    }

    public static boolean canWinNim(int n) {
        return n % 4 == 0 ? false : true;
    }
}
