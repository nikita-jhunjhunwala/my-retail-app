package com.target.retail.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Product {

    @JsonProperty(value="deep_red_labels")
    DeepRedLabels deepRedLabels;

    @JsonProperty(value="available_to_promise_network")
    AvailableToPromiseNetwork availableToPromiseNetwork;

    @JsonProperty(value="item")
    Item item;

    @JsonProperty(value="circle_offers")
    CircleOffers circleOffers;

}
