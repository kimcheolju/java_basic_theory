package operator;

/*
 증가 갑소 연산자를 줄여서 증감연산자라고 함

 */
public class OperatorAdd1 {
    public static void main(String[] args) {
        int a = 0;
        a = a + 1; // 1
        System.out.println("a = " + a); // 1
        a = a + 1; //2
        System.out.println("a = " + a); // 2

        //  증갑 연산자
        ++ a; // a = a + 1 // 3
        System.out.println("a = " + a);
        ++ a; // a = a + 1 // 4
        System.out.println("a = " + a);
    }
}
