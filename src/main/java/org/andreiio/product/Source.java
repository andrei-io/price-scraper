package org.andreiio.product;

import org.andreiio.scraping.ScrapingService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Source {

    private final String link;
    private final String selector;
    private final ScrapingService scrapingService;

    public Source(String link, String selector, ScrapingService scrapingService) {
        this.link = link;
        this.selector = selector;
        this.scrapingService = scrapingService;
    }

    public float getPrice() {
        try {
            String rawHtml = this.scrapingService.getHtml(this.link);
            Document doc = Jsoup.parse(rawHtml);

            // TODO: handle null check / price missing
            var raw = doc.selectFirst(this.selector).text().trim();
            Pattern pattern=Pattern.compile("[-]?[0-9]*\\.?[0-9]+");
            Matcher matcher=pattern.matcher(raw);

            while(matcher.find()) {
                return Float.parseFloat(matcher.group());
            }
        } catch (Exception e) {
            // TODO: handle this
            System.out.println(e.getMessage());
        }
        return 0;
    }

}
