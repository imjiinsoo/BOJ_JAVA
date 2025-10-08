package bronze;

import java.util.Scanner;

public class 화성수학_5355 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        // 사용자가 입력한 엔터를 nextInt가 읽지 않고 넘겨서, 그걸 없애주기 위해 nextLine 한번 쓰기
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            // 한 줄 전체를 받아오기
            String s = sc.nextLine();

            // 띄어쓰기로 구분해서 리스트로 만들기
            String[] strs = s.split(" ");

            //실제 연산 하기
            double a = Double.parseDouble(strs[0]);

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].equals("@")) {
                    a = a * 3;
                } else if (strs[j].equals("%")) {
                    a = a + 5;
                } else if (strs[j].equals("#")) {
                    a = a - 7;
                }
            }

            // printf로 소수 2번째 자리까지 나오게 포맷팅하고 \n 넣어주기
            System.out.printf("%.2f\n", a);

        }
    }
}
