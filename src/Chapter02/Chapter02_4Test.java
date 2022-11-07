package Chapter02;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Chapter02_4Test {
    public static void main(String[] args) {
        // 02_4 3번 문제 구현
        Scanner scanner = new Scanner((System.in));

        System.out.println("[필수 정보 입력]");
        System.out.print("1. 이름: ");
        String strName = scanner.nextLine();

        System.out.print("2. 주민번호 앞 6자리: ");
        String  strSocialNum = scanner.nextLine();

        System.out.print("3. 전화번호: ");
        String strTelNumber = scanner.nextLine();

        System.out.println("[입력한 내용]");
        System.out.println(strName);
        System.out.println(strSocialNum);
        System.out.println(strTelNumber);

        /**
         * 02_4 마무리 퀴즈 2번 풀이
         *
         * @author 구남석
         * @version 1.0?, 주석 연습 해보기

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 수: ");
        String strNum1 = scanner.nextLine();

        System.out.print("두번째 수: ");
        String strNum2 = scanner.nextLine();

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        int result = num1 + num2;
        System.out.println("덧셈 결과:" + result);
         */
    }
}
