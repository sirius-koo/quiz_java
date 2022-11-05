package Chapter02;

public class BooleanExample {
    public static void main(String[] args) {
        boolean stop = true; // stop이 false 값으로 저장되면, else 블록이 실행되어 "시작합니다."를 출력한다.
        if(stop) {
            System.out.println("중지합니다.");
        }
        else {
            System.out.println("시작합니다.");
        }
    }
}
