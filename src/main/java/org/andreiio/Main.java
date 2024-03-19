package org.andreiio;

import org.andreiio.scraping.ScrapingService;
import org.andreiio.product.Source;
import org.andreiio.scraping.ScrapingServiceConfig;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String link = "https://www.emag.ro/set-50-bucati-buburuze-decorative-de-paste-cu-autocolant-plastic-1-5x1-cm-m-deco-house-544/pd/DYVSZSMBM/?ref=profiled_categories_home_banner_com_1_6&provider=rec&recid=rec_93_c479561c4a133a51baa2d297df79b6edaf82aea01211ad4060f63a447ee31092_1710520222&scenario_ID=93";
        String selector = ".product-new-price";


        var config = new ScrapingServiceConfig(new HashSet<String>(), 20 * 1000);
        config.NEEDS_SELENIUM.add("www.emag.ro");
        var scrapingService = new ScrapingService(config);
        Source s = new Source(link, selector, scrapingService);
        System.out.println(s.getPrice());

    }
}