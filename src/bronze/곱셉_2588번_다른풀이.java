package bronze;

import java.util.Scanner;

public class 곱셉_2588번_다른풀이 {
    public static void main(String[] args) {

        // substring을 이용한 풀이
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        String b = sc.next();
//
//        int num1 = Integer.parseInt(b.substring(2,3));
//        int num2 = Integer.parseInt(b.substring(1,2));
//        int num3 = Integer.parseInt(b.substring(0,1));
//
//        System.out.println(num1 * a);
//        System.out.println(num2 * a);
//        System.out.println(num3 * a);
//        System.out.println(Integer.parseInt(b) * a);

        // 아스키코드 값을 이용(charAt도 사용)

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();

        // charAt을 해도 숫자 값 그대로가 반환되는게 아닌 아스키코드 값이 반환됨. 그래서 -'0'을 해서 실제 int값이 반환되게 함
        // '0'의 아스키코드 값은 48. 48을 빼면 십진수로 계산 결과 나옴
        System.out.println(a * (b.charAt(2)-'0'));
        System.out.println(a * (b.charAt(1)-'0'));
        System.out.println(a * (b.charAt(0)-'0'));
        System.out.println(a * Integer.parseInt(b));

    }
}
