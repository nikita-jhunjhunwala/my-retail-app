package com.target.retail.common.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Attributes {

    private String gift_wrapable;
    private String has_prop65;
    private String is_hazmat;
    private String manufacturing_brand;
    private Float max_order_qty;
    private String street_date;
    private String media_format;
    private String merch_class;
    private Float merch_classid;
    private Float merch_subclass;
    private String return_method;
    private String ship_to_restriction;

}