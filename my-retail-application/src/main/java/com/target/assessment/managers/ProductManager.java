package com.target.assessment.managers;

import com.target.assessment.clients.PriceServiceClient;
import com.target.assessment.clients.ProductServiceClient;
import com.target.assessment.contracts.Price;
import com.target.assessment.contracts.ProductsDataWithPrice;
import com.target.assessment.exceptions.MyRetailApplicationException;
import com.target.retail.common.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ProductManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductManager.class);

    @Autowired
    private ProductServiceClient productServiceClient;

    @Autowired
    private PriceServiceClient priceServiceClient;

    //only for unit tests : couldn't get spring dependencies to work for some reason
    ProductManager(ProductServiceClient productServiceClient, PriceServiceClient priceServiceClient) {
        this.productServiceClient = productServiceClient;
        this.priceServiceClient = priceServiceClient;
    }

    public ProductManager() {
    }

    public ProductsDataWithPrice getProductDataWithPrice(String id) throws MyRetailApplicationException {
        Product productDetails = productServiceClient.getProductById(id);
        Price productPrice = priceServiceClient.getProductPriceById(id);

        ProductsDataWithPrice result = new ProductsDataWithPrice();

        //todo: separate validation class
        if (productDetails != null && productDetails.getItem() != null && productDetails.getItem().getProductDescription() != null && productDetails.getItem().getProductDescription().getTitle() != null && productPrice != null) {
            String productName = productDetails.getItem().getProductDescription().getTitle();
            result.setId(id);
            result.setProductName(productName);
            result.setCurrentPrice(productPrice);

        } else {
            LOGGER.error("Incomplete product details received");
            throw new MyRetailApplicationException("Incomplete product details received");
        }

        return result;
    }

}
