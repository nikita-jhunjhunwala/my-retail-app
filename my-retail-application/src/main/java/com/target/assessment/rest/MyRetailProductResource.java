package com.target.assessment.rest;


import com.target.assessment.contracts.ProductsDataWithPrice;
import com.target.assessment.exceptions.MyRetailApplicationException;
import com.target.assessment.managers.ProductManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class MyRetailProductResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyRetailProductResource.class);

    @Autowired
    private ProductManager productManager;

    @GetMapping(value = "/{id}")
    public ProductsDataWithPrice getProductDataWithPriceById(@PathVariable("id") String id) throws MyRetailApplicationException {
        try {
            return productManager.getProductDataWithPrice(id);
        } catch (MyRetailApplicationException e) {
            LOGGER.error("Error getting product details with price : ", e);
            throw new MyRetailApplicationException(e.getMessage());
        }
    }

}
