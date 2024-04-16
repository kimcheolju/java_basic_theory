package cond;
/*
삼항연산자
: 단순히 참과 거짓에 의해 값을 구하는 경우 삼항 연산자 또는 조건 연산자라고 불리는 ?: 연산자를 사용할 수 있다.
이 연산자를 사용하면 if문과 비교해서 코드를 단순화 시킬 수 있다.
 */
public class CondOp2 {
    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자";

        System.out.println("age:" + age + " status:" + status);
    }
}
