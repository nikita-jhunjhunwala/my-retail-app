package com.target.assessment.clients;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.target.assessment.exceptions.MyRetailApplicationException;
import com.target.assessment.http.AbstractHttpClient;
import com.target.assessment.contracts.Price;
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
public class PriceServiceClient extends AbstractHttpClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(PriceServiceClient.class);
    private static transient ObjectMapper mapper = new ObjectMapper();

    public PriceServiceClient() {
        super(HttpClients.createDefault());
    }

    public Price getProductPriceById(String id) throws MyRetailApplicationException {
        try {
            /*
            String productPriceUrl = PRICE_BASE_URL + id + PRICE_QUERY_STRING;

            HttpResponse response = executeGet(productPriceUrl);
            Price productPrice = convertHttpResponseToPrice(response);
            */
            return new Price("USD", 13.69);

        } catch (Exception e) {
            throw new MyRetailApplicationException("Couldn't retrieve price details", e);
        }
    }

    private Price convertHttpResponseToPrice(HttpResponse response) throws IOException {

        LOGGER.debug("response status for get product price : ", response.getStatusLine().toString());
        HttpEntity httpEntity = response.getEntity();
        Header header = httpEntity.getContentType();
        LOGGER.debug("response header for get product price : ", header.toString());
        if (httpEntity != null) {
            String contentString = EntityUtils.toString(httpEntity);
            LOGGER.debug("ContentString:" + contentString);
            Price result = getMapper().readValue(contentString, Price.class);
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
