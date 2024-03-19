package org.andreiio.scraping;

import java.util.HashSet;

public final class ScrapingServiceConfig {
    public final HashSet<String> NEEDS_SELENIUM;
    public final int MAX_WAIT_TIME_MILLIS;

    public ScrapingServiceConfig(HashSet<String> NEEDS_SELENIUM, int MAX_WAIT_TIME_MILLIS) {
        this.NEEDS_SELENIUM = NEEDS_SELENIUM;
        this.MAX_WAIT_TIME_MILLIS = MAX_WAIT_TIME_MILLIS;
    }

}
