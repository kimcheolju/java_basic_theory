package cond.ex;
/*
요청한 평점 이상의 영화 추천해주기
 */
public class MovieRateEx {
    public static void main(String[] args) {
        double rating = 8;
        
        // 평점 9점일 때 어바웃 타임
        if(rating <= 9) {
            System.out.println("'어바웃타입'을 추천합니다.");
        }

        // 평점 8점일 때 토이 스토리
        if(rating <= 8) {
            System.out.println("'토이 스토리'을 추천합니다.");
        }

        // 평점 7점일 때 고질라
        if(rating <= 7) {
            System.out.println("'고질라'을 추천합니다.");
        }
    }
}
