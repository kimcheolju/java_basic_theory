package loop;
/*
문제: 1부터 하나씩 증가하는 수를 3번 더해라 (1~3더하기)
 */
public class While2_1 {
    public static void main(String[] args) {
        int count = 1;
        int endNum = 100;
        int sum = 0;
        while(count <= endNum) {
            sum += count;
            System.out.println("i:" + count + " sum="+sum);

            count++;

        }

    }
}
