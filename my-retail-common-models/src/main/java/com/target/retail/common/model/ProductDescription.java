package com.target.retail.common.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@Data
public class ProductDescription {

    private String title;
    ArrayList< String > bullet_description;

}


