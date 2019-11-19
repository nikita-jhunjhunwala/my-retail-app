package com.target.retail.common.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PackageDimensions {

    private String weight;
    private String weight_unit_of_measure;
    private String width;
    private String depth;
    private String height;
    private String dimension_unit_of_measure;

}