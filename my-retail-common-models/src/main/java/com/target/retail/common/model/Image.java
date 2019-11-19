package com.target.retail.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@Data
public class Image {

    @JsonProperty(value = "base_url")
    private String baseUrl;

    @JsonProperty(value = "primary")
    private String primary;

    @JsonProperty(value = "content_labels")
    private ArrayList<Object> contentLabels;




}
