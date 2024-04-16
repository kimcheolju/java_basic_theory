package cond;
/*
독립조건(조건이 독립적으로 유지되어야 하는 경우)
: 모든 경우에 대해 else로 조건을 묶는게 정답은 아니다, 때로 독립된 조건으로 유지되어야 하는 경우도 있다.

ex) 문제
// else if 이기 때문에 앞에 조건만 충족하고, 아래의 조건이 충족하더라도
할인을 받지 못하는 오류를 범함
 */
public class If6 {
    public static void main(String[] args) {
        int price = 10000; // 아이템 가격
        int age = 10;
        int discount = 0;

        if(price >= 10000) {
            discount += 1000;
            System.out.println("10,000원 이상 구매, 1,000원 할인");
        } else if(age <= 10) {
            discount += 1000;
            System.out.println("어린이 1,000원 할인");
        } else{
            System.out.println("할인 없음");
        }

        price -= discount;

        System.out.println("총 할인 금액: " + discount + "원");
        System.out.println("최종금액: " + price + "원");
    }
}
