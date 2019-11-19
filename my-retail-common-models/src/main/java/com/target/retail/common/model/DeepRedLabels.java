package com.target.retail.common.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@NoArgsConstructor
@Data
public class DeepRedLabels {

    private Float total_count;
    ArrayList < Object > labels;

}
