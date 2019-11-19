package com.target.retail.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class RecallCompliance {

    @JsonProperty(value = "is_product_recalled")
    private Boolean isProductRecalled;

}
