package zorx.algorithms;

import java.util.Scanner;

/**
 * Created by ZorX on 2018/9/12.
 */
public class JewelsAndStones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input J : ");
        String J = scanner.next();
        System.out.print("Input S : ");
        String S = scanner.next();
        System.out.println(numJewelsInStones(J, S));

    }

    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        char[] strJ = J.toCharArray();
        char[] strS = S.toCharArray();
        for (int i = 0; i < strS.length; i++) {
            for (int j = 0; j < strJ.length; j++) {
                if (strS[i] == strJ[j])
                    count ++;
            }
        }
        return count;
    }
}
