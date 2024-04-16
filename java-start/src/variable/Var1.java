package variable;

/*
패키지(package)
- 패키지는 지금 단계에서는 자바 파일을 구분하기 위한 폴더로 이해
- variable 라는 패키지를 만들었다면, 해당 패키지에 들어가는 자바파일 첫줄에 package variable; 와 같이
  소속된 패키지를 선언해 주어야 한다.

- 자바 파일이 위치하는 패키지와 package variable 선언위차기 같아야한다.
 */

/*
 모든 프로그래밍 언어는 이런 문제를 해결하기 위해 변수(variable)이라는 기능을 제공한다.
 */
public class Var1 {
    // psvm
    public static void main(String[] args) {
//        var num = 20;
        System.out.println(20); // 변경 -> 20
        System.out.println(20); // 변경 -> 20
        System.out.println(20); // 변경 -> 20
    }
}
