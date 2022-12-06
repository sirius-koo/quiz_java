package Chapter03;

import java.util.Scanner;

/**
 * 혼자 공부하는 자바 Chapter 03-11 풀이
 * @date 2022.12.06
 * @author 구남석
 * @version 18.0.1.1(java)
 */
public class Chapter03_2_11Test {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("아이디:");
        String name = scanner.nextLine();

        System.out.print("패스워드:");
        String strPassword = scanner.nextLine();
        int password = Integer.parseInt(strPassword);

        if (name.equals("java")) {
            if (password == 12345) {
                System.out.println("로그인 성공");
            } else {
                System.out.println("로그인 실패:패스워드가 틀림");
            }
        } else {
            System.out.println("로그인 실패:아이디 존재하지 않음");
        }
    }
}
