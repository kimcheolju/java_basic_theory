package operator.ex;
/*
문제2
// 아래 값의 합과 평균을 출력하는 프로그램을 작성하시오.
double var1 = 1.5;
double var2 = 2.5;
double var3 = 3.5;
 */
public class OperationEx2 {
    public static void main(String[] args) {
        double var1 = 1.5;
        double var2 = 2.5;
        double var3 = 3.5;
        double sum = var1 + var2 + var3;
        double average = sum / 3;
        System.out.println("sum :" + sum);
        System.out.println("average :" + average);
        
    }
}
