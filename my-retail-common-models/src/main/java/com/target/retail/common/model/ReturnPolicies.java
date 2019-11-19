package com.target.retail.common.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ReturnPolicies {

    private String user;
    private String policyDays;
    private String guestMessage;

}