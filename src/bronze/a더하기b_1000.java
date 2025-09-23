package bronze;

import java.util.Scanner;

public class a더하기b_1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // nextInt는 공백이나 줄바꿈을 기준으로 숫자를 읽음
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
