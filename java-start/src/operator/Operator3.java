package operator;

/*
연산자 우선순위
: 기본적인 수학 연산과 같이 +과-보다 *과/나눗셈을 우선으로 연산한다.
이때, 괄호를 사용하면 괄호안의 연산과정을 우선으로 수행한다.
 */
public class Operator3 {
    public static void main(String[] args) {
        int sum1 = 1 + 2 * 3; // 1 + (2*3) = 7
        int sum2 = (1 + 2) * 3;
        System.out.println(sum1);
        System.out.println(sum2);

    }
}
