package cond.ex;
/*
문제: 홀수 짝수 찾기
 */
public class EvenOddEx {
    public static void main(String[] args) {
        int x = 1;
        System.out.println(
                (x % 2 == 1) ? "홀수" : "짝수"
        );
    }
}
