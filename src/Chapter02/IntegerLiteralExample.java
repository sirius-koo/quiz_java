package Chapter02;

public class IntegerLiteralExample {
    public static void main(String[] args) {
        int var1 = 0b1011; // 2진수
        int var2 = 0206; // 8진수
        int var3 = 365; // 10진수
        int var4 = 0xB3; // 16진수

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);

        // byte 타입 변수 예제 코드
        byte var_1 = -128;
        byte var_2 = 0;
        byte var_3 = 127;
        System.out.println(var_1);
        System.out.println(var_2);
        System.out.println(var_3);
        // 오류 발생 코드 : byte var_4 = 128; byte의 메모리 크기 범위는 -128~127
    }
}
