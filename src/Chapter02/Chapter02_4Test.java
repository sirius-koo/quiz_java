package Chapter02;

import java.util.Scanner;

/**
 * 02_4 마무리 퀴즈 2번 풀이
 *@author 구남석
 *@version 18.0.1.1, 주석 연습 해보기
 */
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
    }
}
