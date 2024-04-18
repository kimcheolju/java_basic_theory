package loop;
/*
문제: 피라미드 출력
 */
public class NestedEx2 {
    public static void main(String[] args) {
        int rows = 100;
        for(int i = 1; i <= rows; i++) {
            for(int j = 100; j > i; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
