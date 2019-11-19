package com.target.assessment.contracts;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ProductsDataWithPrice {

    String id;
    String productName;
    Price currentPrice;

    public String getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public Price getCurrentPrice() {
        return currentPrice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCurrentPrice(Price currentPrice) {
        this.currentPrice = currentPrice;
    }
}
