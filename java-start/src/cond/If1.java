package cond;

/*
if 문 (조건문)
조건이 참인 경우에만 수행
 */

public class If1 {
    public static void main(String[] args) {
        int age = 20; // 사용자의 나이
        
        if(age >= 18) {
            System.out.println("성인 입니다.");
        }
        
        if(age < 18) {
            System.out.println("미성년자 입니다.");
        }
        
        
    }
}
