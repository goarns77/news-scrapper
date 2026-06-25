package oop.search.application;

import oop.search.domain.NewsResult;

import java.util.List;

public interface NewsPublisher {
    //호출을 통해 (System.out / 웹 요청으로 issue 등록)
    void publish (String topic, List<NewsResult> newsResults);
}
