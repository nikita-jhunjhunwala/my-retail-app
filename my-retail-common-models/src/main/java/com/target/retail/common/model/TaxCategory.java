package com.target.retail.common.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class TaxCategory {

    private String tax_class;
    private Float tax_code_id;
    private String tax_code;

}
