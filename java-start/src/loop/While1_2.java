package loop;
/*
조건문 While
while(조선식) {
    코드
}

- 조건식을 확인하여 참일 때까지 블럭안에 코드를 실행
- 블럭이 끝나면 다시 조건식 검사로 돌아가서 조건식을 검사한다.
 */
public class While1_2 {
    public static void main(String[] args) {
        int count = 0;

        while (count < 3 ) {
            count ++;
            System.out.println("현재 숫자는:" + count);
        }
    }
}
