package loop;
/*
문제3
: 누적 합 계산
 */
public class WhileEx3 {
    public static void main(String[] args) {
        int i = 1, sum = 0, max = 10;
        //        while
        System.out.println("While");
        while (i <= max) {
            sum +=i;
            System.out.println(sum);
            i++;
        }
    }
}
