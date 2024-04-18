package loop;
/*
문제2
:짝수 10개 출력
 */
public class WhileEx2 {
    public static void main(String[] args) {
        int num = 1;
        //        while
        System.out.println("While");
        while (num <= 10) {
            System.out.println(num*2);
            num++;
        }
    }
}
