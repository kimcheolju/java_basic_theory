package cond;
/*
switch를 쓰는 이유는
: 조금 더 직관 적인 코드

if vs switch
: if문은 대조연산자를 모두 사용 가능한 광범위의 조건 판별이라면,
switch는 그 값이 동일할 경우에만 동작하기 때문에, 간결한 코드작성이 필요할 때 사용된다.
*/
public class Switch2 {
    public static void main(String[] args) {
      int grade = 3;
      int coupon;

      switch (grade) {
          case 1:
              coupon = 1000;
              break;
          case 2:
              coupon = 2000;
              break;
          case 3:
              coupon = 3000;
              break;
          default:
              coupon = 500;
              break;
      }
        System.out.println("발급 받은 쿠폰:" + coupon + "원");
    }
}
