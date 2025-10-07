package bronze;

import java.util.Scanner;

public class chocolate_2163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N x M 정수 받기
        int N = sc.nextInt();
        int M = sc.nextInt();

        int ans = ((N-1) + N*(M-1));
        System.out.println(ans);
    }
}
