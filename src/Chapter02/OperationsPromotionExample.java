package Chapter02;

public class OperationsPromotionExample {
    public static void main(String[] args) {
        byte byteValue1 = 10;
        byte byteValue2 = 20;
        // byte byteValue3 = byteValue1 + byteValue2;
        // ㄴ컴파일 에러 : byte 변수가 피연산자로 사용되면 int 타입으로 변환되어 연산되므로 byte 변수에 저장하면 범위 초과로 컴파일 에러 발생
        int intValue1 = byteValue1 + byteValue2;
        System.out.println(intValue1);

        char charValue1 = 'A';
        char charValue2 = 1;
        // char charValue3 = charValue1 + charValue2;
        // ㄴ컴파일 에러 : char 타입으로 저장된 변수는 유니코드(정수)로 변환되어 저장하므로 char 변수에 연산을 적용하면 컴파일 에러 발생
        int intValue2 = charValue1 + charValue2; // char 타입으로 저장된 변수는 유니코드로 변환 = 정수값으로 변환됨
        System.out.println("유니코드=" + intValue2);
        System.out.println("출력문자=" + (char) intValue2); // 강제변환을 통해 유니코드에 해당하는 문자를 변환

        int intValue3 = 10;
        int intValue4 = intValue3 / 4;
        System.out.println(intValue4);

        int intValue5 = 10;
        // int intValue6 = 10 / 4.0;
        // ㄴ컴파일 에러 : 10 / 4.0의 값은 실수형이 나오지만 변수 타입을 실수가 아닌 정수 타입으로 저장하여 컴파일 에러 발생
        double doubleValue = intValue5 / 4.0; // 실수연산을 위해서 x와 y 둘 중 하나 또는 둘 모두 double 타입으로 변환해야 함
        System.out.println(doubleValue);

        int x = 1;
        int y = 2;
        double result = (double) x / y; // x와 y 모두 double 타입으로 바꾼 예시
        // double result = (double) (x / y); : (x / y) 먼저 연산되어 0이 되고, 여기에 (double) 0을 적용해서 0.0.이 됨
        System.out.println(result);
    }
}
