package bronze;

import java.util.Scanner;

public class a더하기b_11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a+b;
            System.out.println("Case #" + (i+1) + ": " + a + " + " + b + " = " + sum);
        }
    }
}
//Case #1: 1 + 1 = 2
//Case #2: 2 + 3 = 5
//Case #3: 3 + 4 = 7
//Case #4: 9 + 8 = 17
//Case #5: 5 + 2 = 7
