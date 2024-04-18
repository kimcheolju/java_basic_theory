package loop;
/*
조건에 만족하지 않더라도 한번은 실행하고자 할 때,
do-while을 사용한다.
 */
public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;
        while (i<3) {
            System.out.println("현재 숫자는:" + i);
            i++;
        }
    }
}
