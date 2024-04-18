package loop;

/*
반복문에서 break는 루프 자체를 종료한다.

문제: 1부터 시작해서 숫자를 계속 누적해서 더하다가 합계가 10보다 처음으로 큰 값은 얼마인가?(for문 이용)
 */
public class Break3 {
    public static void main(String[] args) {
        int limit = 10; // 비교 숫자
        int sum = 0; // 누적합

        for(int i = 1;i<limit;i++) {
            sum += i;
            System.out.println("누적 합:" + sum);

            if(sum > limit) {
                break;
            }
        }
    }
}
