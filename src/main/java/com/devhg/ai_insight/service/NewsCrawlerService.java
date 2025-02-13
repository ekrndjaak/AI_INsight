package com.devhg.ai_insight.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class NewsCrawlerService {
    public List<String> crawlNews() throws IOException {
        String url = "https://www.newsway.co.kr/news/view?ud=2025021315253825094";
        Document doc = Jsoup.connect(url).get();
        List<String> headlines = new ArrayList<>();

        for (Element headline : doc.select(".news_title")){
            headlines.add(headline.text());
        }

        return headlines;
    }
}
