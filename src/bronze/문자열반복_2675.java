package bronze;

import java.util.Scanner;

public class 문자열반복_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트케이스 받고 nextLine으로 개행문자 제거
        int t = sc.nextInt();
        sc.nextLine();

        // 본격 로직 시작
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            String[] strs = s.split(" ");

            int n = Integer.parseInt(strs[0]);
            // 문자열 하나하나를 리스트로
            String[] letters = strs[1].split("");

            // 이제 각각*n 출력
            for (int j = 0; j < letters.length; j++) {
                int k = 0;
                while (k < n) {
                    System.out.print(letters[j]);
                    k++;
                }
            }
            //각 케이스마다 줄바꿈
            System.out.println();
        }

    }
}
