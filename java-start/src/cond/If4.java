package cond;
/*
if else: 앞선 조건에서 참이 나오면 후의 조건이 실행되지 않고 지나감
 */
public class If4 {
    public static void main(String[] args) {
        int age = 14;
        if(age <= 7){
            System.out.println("미취학");
        } else if(age <= 13){
            System.out.println("초등학생");
        } else if(age <=16){
            System.out.println("중학생");
        }else if(age <= 19){
            System.out.println("고틍학생");
        }else {
            System.out.println("성인");
        }
    }
}
