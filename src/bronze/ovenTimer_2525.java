package bronze;

import java.util.Scanner;

public class ovenTimer_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 일단 시간이랑 분 받기
        int h = sc.nextInt();
        int m = sc.nextInt();

        // 소요 시간 받기
        int time = sc.nextInt();

        // 분 + 소요 시간 더하기
        m = m + time;

        // 분이 60 넘어가면 60으로 나눠서 몫만큼 시간에 더하기
        if (m >= 60) {
            h = h + (m / 60);
            m = m % 60;
        }

        // 시간이 24를 넘어가면 24로 나눈 나머지로
        if (h >= 24) {
            h = h % 24;
        }

        System.out.println(h + " " + m);
    }
}
