package operator;

/*
전위, 후위 연산자
- ++a: 증감 연산자를 피연산자 앞에 둘 수 있다. 이것을 앞에 있다고 해서 전위(Prefix) 증감연산자라 한다. (일단 값을 증가 시키고 처리)
- a++: 증감 연산자를 피연산자 뒤에 둘 수 있다. 이것을 뒤에 있다고 해서 후위(postfix) 증감연산자라 한다. (다 처리하고 증가)
*/

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        // 전위 증감 연산자 예시
        b = ++a; //a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);
        
        // 후위 증감 연산자 예시
        a = 1;
        b = 0;
        b = a++;
        System.out.println("a = " + a + ", b = " + b);

    }
}
