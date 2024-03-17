package org.andreiio.product;

public class Product {
    private float minPrice = -1;
    private String storeName;
    private final Source[] sources;

    public Product(Source[] sources) {
        this.sources = sources;
    }

    public float getMinPrice() {
        for(Source s :  this.sources) {
            float price = s.getPrice();
            if(this.minPrice < price)
                this.minPrice = price;
        }
        return this.minPrice;
    }
}
