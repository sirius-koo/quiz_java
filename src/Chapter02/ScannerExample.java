package Chapter02;

import java.util.Scanner; // Scanner가 java.util 패키지에 있다는 것을 컴파일러에게 알려주는 역할, 없다면 컴파일 에러 발생

public class ScannerExample {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String inputData;

        while(true) {
            inputData = scanner.nextLine();
            System.out.println("입력된 문자열: \"" + inputData + "\"");
            if (inputData.equals("q")) {
                break;
            }
        }

        System.out.println("종료");
    }
}
