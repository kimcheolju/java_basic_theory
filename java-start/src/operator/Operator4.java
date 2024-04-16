package operator;

/*
연산자 우선순위

 */

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3; // (2 * 2) + (3 * 3)
        int sum4 = (2 * 2) + (3 * 3);
        // 연산 결과는 같더라도, 괄호를 넣어주면 가독성이 올라가기 때문에 괄호를 추가해주는 것이 좋다.
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }
}
