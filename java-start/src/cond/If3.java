package cond;

/*
else if

 */
public class If3 {
    public static void main(String[] args) {
        int age = 14;

        /*
        아래의 코드가 비효율적
        1) 불필요한 조건 검사: 이미 조건을 만족해도 불필요한 조건을 비교함
        2) age <= 7과 age >=8 조건에서 결과적으로 중복 체크함
         */
        if(age <= 7){
            System.out.println("미취학");
        }
        if(age >=8 && age <= 13){
            System.out.println("초등학생");
        }
        if(age>=14 && age <=16){
            System.out.println("중학생");
        }
        if(age>= 17 && age <= 19){
            System.out.println("고틍학생");
        }
        if(age>=20) {
            System.out.println("성인");
        }
    }
}
