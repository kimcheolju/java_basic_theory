package cond;
/*
독립조건(조건이 독립적으로 유지되어야 하는 경우)
: 모든 경우에 대해 else로 조건을 묶는게 정답은 아니다, 때로 독립된 조건으로 유지되어야 하는 경우도 있다.

ex) 문제
1) 아이템 가격이 10,000원 이상일 때, 1,000원 할인
2) 나이가 10살 이하 일 대, 1000원 할인
 */
public class If5 {
    public static void main(String[] args) {
        int price = 10000; // 아이템 가격
        int age = 10;
        int discount = 0;

        if(price >= 10000) {
            discount += 1000;
            System.out.println("10,000원 이상 구매, 1,000원 할인");
        }

        if(age <= 10) {
            discount += 1000;
            System.out.println("어린이 1,000원 할인");
        }

        price -= discount;

        System.out.println("총 할인 금액: " + discount + "원");
        System.out.println("최종금액: " + price + "원");
    }
}
