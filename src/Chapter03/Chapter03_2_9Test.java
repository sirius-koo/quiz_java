package Chapter03;

import java.util.Scanner;

/**
 * 혼자 공부하는 자바 Chapter 03-2 예제 9번 풀이
 * @date 2022.12.01
 * @author 구남석
 * @version 18.0.1.1(java)
 */

public class Chapter03_2_9Test {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 수: ");
        String inputData1 = scanner.nextLine();
        double inputData_1 = Double.parseDouble(inputData1);

        System.out.print("두 번째 수: ");
        String inputData2 = scanner.nextLine();
        double inputData_2 = Double.parseDouble(inputData2);

        System.out.println("-----------");

        if(((int) inputData_1 == 0) | (inputData_2 == 0.0)) {
            System.out.println("결과:무한대");
        }
        else {
            System.out.printf("결과:%.2f", inputData_1 / inputData_2);
        }
        }

}
