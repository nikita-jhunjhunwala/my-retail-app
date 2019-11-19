package com.target.assessment.clients;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.target.assessment.Constants;
import com.target.assessment.exceptions.MyRetailApplicationException;
import com.target.assessment.http.AbstractHttpClient;
import com.target.retail.common.model.Product;
import com.target.retail.common.model.ProductItem;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ProductServiceClient extends AbstractHttpClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceClient.class);

    private static transient ObjectMapper mapper = new ObjectMapper();

    public ProductServiceClient() {
        super(HttpClients.createDefault());
    }

    public Product getProductById(String id) throws MyRetailApplicationException {
        try {
            String productDataUrl = Constants.PRODUCT_BASE_URL + id + Constants.PRODUCT_QUERY_STRING;

            HttpResponse responseProduct = executeGet(productDataUrl);
            ProductItem productData = convertHttpResponseToProduct(responseProduct);

            return productData.getProduct();

        } catch (Exception e) {
            throw new MyRetailApplicationException("Couldn't retrieve product details", e);
        }
    }

    private ProductItem convertHttpResponseToProduct(HttpResponse response) throws IOException {

        LOGGER.debug("response status for get product details : ", response.getStatusLine().toString());
        HttpEntity httpEntity = response.getEntity();
        Header header = httpEntity.getContentType();
        LOGGER.debug("response header for get product details : ", header.toString());
        if (httpEntity != null) {
            String contentString = EntityUtils.toString(httpEntity);
            LOGGER.debug("ContentString:" + contentString);
            ProductItem result = getMapper().readValue(contentString, ProductItem.class);
            return result;
        }
        return null;
    }

    private ObjectMapper getMapper() {
        if (mapper == null) {
            mapper = new ObjectMapper();
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        }
        return mapper;
    }

}
