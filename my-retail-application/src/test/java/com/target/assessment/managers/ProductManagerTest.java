package com.target.assessment.managers;

import com.target.assessment.clients.PriceServiceClient;
import com.target.assessment.clients.ProductServiceClient;
import com.target.assessment.contracts.Price;
import com.target.assessment.contracts.ProductsDataWithPrice;
import com.target.assessment.exceptions.MyRetailApplicationException;
import com.target.retail.common.model.Product;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class ProductManagerTest extends Mockito{

    @Test
    public void testGetProductDataWithPrice() throws MyRetailApplicationException {

        String id = "123";
        String currency = "INR";
        Double value = 123.00;

        ProductServiceClient productServiceClient = mock(ProductServiceClient.class);
        PriceServiceClient priceServiceClient = mock(PriceServiceClient.class);
        Product product = mock(Product.class, RETURNS_MOCKS);
        Price price = new Price(currency, value);

        when(productServiceClient.getProductById(id)).thenReturn(product);
        when(priceServiceClient.getProductPriceById(id)).thenReturn(price);

        ProductManager productManager = new ProductManager(productServiceClient, priceServiceClient);
        ProductsDataWithPrice response = productManager.getProductDataWithPrice(id);
        Assert.assertEquals(response.getCurrentPrice().getCurrencyCode(), currency);
        Assert.assertEquals(response.getCurrentPrice().getValue(), value);

    }

    @Test(expected = MyRetailApplicationException.class)
    public void testPriceNull() throws MyRetailApplicationException {
        String id = "123";

        ProductServiceClient productServiceClient = mock(ProductServiceClient.class);
        PriceServiceClient priceServiceClient = mock(PriceServiceClient.class);
        Product product = mock(Product.class, RETURNS_MOCKS);

        when(productServiceClient.getProductById(id)).thenReturn(product);
        when(priceServiceClient.getProductPriceById(id)).thenReturn(null);

        ProductManager productManager = new ProductManager(productServiceClient, priceServiceClient);
        ProductsDataWithPrice response = productManager.getProductDataWithPrice(id);
    }

    @Test(expected = MyRetailApplicationException.class)
    public void testProductItemNull() throws MyRetailApplicationException {
        String id = "123";
        String currency = "INR";
        Double value = 123.00;

        ProductServiceClient productServiceClient = mock(ProductServiceClient.class);
        PriceServiceClient priceServiceClient = mock(PriceServiceClient.class);
        Product product = new Product();
        Price price = new Price(currency, value);

        when(productServiceClient.getProductById(id)).thenReturn(product);
        when(priceServiceClient.getProductPriceById(id)).thenReturn(price);

        ProductManager productManager = new ProductManager(productServiceClient, priceServiceClient);
        ProductsDataWithPrice response = productManager.getProductDataWithPrice(id);
    }

}
