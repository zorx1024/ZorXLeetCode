package zorx.algorithms;

import java.util.Scanner;

/**
 * Created by ZorX on 2018/9/12.
 */
public class ToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        String str = scanner.next();
        System.out.println(toLowerCase(str));
    }

    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }
}
