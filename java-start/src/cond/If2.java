package cond;

/*
else 문
: if문에서 만족하는 조건이 없을 때 실행하는 코드 제공
 */

public class If2 {
    public static void main(String[] args) {
        int age = 20;
        
        if(age >= 18) {
            System.out.println("성인입니다.");
        }else {
            System.out.println("미성연자입니다.");
        }
    }
}
