package com.target.retail.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@Data
public class Enrichment {

    @JsonProperty(value = "images")
    ArrayList < Image > images;

    @JsonProperty(value = "sales_classification_nodes")
    ArrayList< Object > salesClassificationNodes;
}
