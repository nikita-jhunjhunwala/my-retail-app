package com.target.retail.common.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ProductClassification {

    private String product_type;
    private String product_type_name;
    private String item_type_name;
    ItemType item_type;

}
