package cond.ex;
/*
학점 계산기
 */
public class DistanceEx {
    public static void main(String[] args) {
        int distance = 9;
        String transportation;
        if(distance > 100) {
            transportation = "비행기";
        } else if (distance <= 100 && distance > 10) {
            transportation = "자동차";
        } else if (distance <= 10 && distance > 1) {
            transportation = "자전거";
        } else{
            transportation = "도보";
        }
        System.out.println(transportation + "를 이용하세요.");
    }
}
