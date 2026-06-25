package oop.search.domain;

//value object
//Immutable > Java '변화' > Heap 메모리의 형변환을 통해 대부분 감지
//기본 Java 객체는 불변 객체로 만드는 과정을 만들어야 함 > Record는 원래 immutable. setter X. 멤버 변수를 한 번 생성자로 만들면 수정 X.
//API 불러오기를 바탕으로 제작 << 보통 사용
//또는 개념적 설계를 바탕으로 제작
//record 레코드명 (멤버변수를 생성자 패러미터처럼 추가)
//https://developers.naver.com/docs/serviceapi/search/news/news.md#%EC%9D%91%EB%8B%B5-%EC%98%88

public record NewsResult(
    String title,
    String description,
    String url,
    String pubDate
    //original URL은 생략

) {
    public static void main(String[] args){
        NewsResult result = new NewsResult("환율 1600원 고점 찍나","현재 1550원, 해외 자산 관리에 주의해야","https://naver.com","2026.12.32");
        System.out.println("result : "+result);
        System.out.println("result.title = " + result.title);
//        result.title = "2000원 되나?"; // 막혀있다
    }


}