package Chapter03;

/**
 * 혼자 공부하는 자바 Chapter 03-10 풀이
 * @date 2022.12.06
 * @author 구남석
 * @version 18.0.1.1(java)
 */

public class Chapter03_2_10Test {
    public static void main(String[] args) throws Exception {
        int var1 = 10;
        int var2 = 3;
        int var3 = 14;

        double var4 = var1 * var1 * (Double.parseDouble(var2 + "." + var3));
        System.out.println("원의 넓이 : " + var4);
    }
}