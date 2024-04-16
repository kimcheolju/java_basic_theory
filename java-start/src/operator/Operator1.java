package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 출력 a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff); // 출력 a - b = 3

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi); // 출력 a * b = 10

        // 나눗셈
        int div = a / b; // int로 받기 때문에 소수점을  제거, double로 받아도 2.0으로 몫만 받음
        System.out.println("a / b = " + div); // 출력 a / b = 2

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod); // 출력 a / b = 1

        //  0으로 나누는 연산을 허용하지 않음
//        int z = 10/0;   // by zero 발생

    }
}
