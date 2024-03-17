package org.andreiio;

import org.andreiio.product.ScrapingService;
import org.andreiio.product.Source;

public class Main {
    public static void main(String[] args) {
        String link = "https://www.emag.ro/set-50-bucati-buburuze-decorative-de-paste-cu-autocolant-plastic-1-5x1-cm-m-deco-house-544/pd/DYVSZSMBM/?ref=profiled_categories_home_banner_com_1_6&provider=rec&recid=rec_93_c479561c4a133a51baa2d297df79b6edaf82aea01211ad4060f63a447ee31092_1710520222&scenario_ID=93";
        String selector = ".product-new-price";
        ScrapingService scrapingService = new ScrapingService();
        Source s = new Source(link, selector, scrapingService);
        System.out.println(s.getPrice());
    }
}