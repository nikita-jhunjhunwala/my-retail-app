package com.target.retail.common.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@Data
public class AvailableToPromiseNetwork {

    private String product_id;
    private String id_type;
    private Float available_to_promise_quantity;
    private String street_date;
    private String availability;
    private Float online_available_to_promise_quantity;
    private Float stores_available_to_promise_quantity;
    private String availability_status;
    ArrayList< Object > multichannel_options;
    private Boolean is_infinite_inventory;
    private String loyalty_availability_status;
    private String loyalty_purchase_start_date_time;
    private Boolean is_loyalty_purchase_enabled;
    private Boolean is_out_of_stock_in_all_store_locations;
    private Boolean is_out_of_stock_in_all_online_locations;

}
