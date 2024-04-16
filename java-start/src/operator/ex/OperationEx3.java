package operator.ex;
/*
문제3
- int형 변수 score를 선언하세요.
- score가 80점 이상이고, 100점 이하면 true, 아니면 false를 출력하세요
 */
public class OperationEx3 {
    public static void main(String[] args) {
        int score;
        score = 80;
        boolean result = (score >= 80) && (score <= 100);
        System.out.println(result);
        
    }
}
