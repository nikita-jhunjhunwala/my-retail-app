package com.target.retail.common.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Fulfillment {

    private Boolean is_po_box_prohibited;
    private String po_box_prohibited_message;
    private Float box_percent_filled_by_volume;
    private Float box_percent_filled_by_weight;
    private Float box_percent_filled_display;

}