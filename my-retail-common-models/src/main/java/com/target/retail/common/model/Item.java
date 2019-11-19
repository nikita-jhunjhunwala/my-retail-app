package com.target.retail.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public class Item {

    private String tcin;

    @JsonProperty(value = "bundle_components")
    private BundleComponents bundleComponents;

    private String dpci;

    private String upc;

    @JsonProperty(value = "product_description")
    ProductDescription productDescription;

    @JsonProperty(value = "buy_url")
    private String buyUrl;

    @JsonProperty(value = "enrichment")
    private Enrichment enrichment;

    @JsonProperty(value = "return_method")
    private String returnMethod;

    @JsonProperty(value = "handling")
    private Handling handling;

    @JsonProperty(value = "recall_compliance")
    private RecallCompliance recallCompliance;

    @JsonProperty(value = "tax_category")
    private TaxCategory taxCategory;

    @JsonProperty(value = "display_option")
    private DisplayOption displayOption;

    @JsonProperty(value = "fulfillment")
    private Fulfillment fulfillment;

    @JsonProperty(value = "package_dimensions")
    private PackageDimensions packageDimensions;

    @JsonProperty(value = "environmental_segmentation")
    private EnvironmentalSegmentation environmentalSegmentation;

    @JsonProperty(value = "manufacturer")
    private Manufacturer manufacturer;

    @JsonProperty(value = "product_vendors")
    private List<ProductVendor> productVendors;

    @JsonProperty(value = "product_classification")
    private ProductClassification productClassification;

    @JsonProperty(value = "product_brand")
    private ProductBrand productBrand;

    @JsonProperty(value = "item_state")
    private String itemState;

    @JsonProperty(value = "specifications")
    private ArrayList<Object> specifications;

    @JsonProperty(value = "attributes")
    private Attributes attributes;

    @JsonProperty(value = "country_of_origin")
    private String countryOfOrigin;

    @JsonProperty(value = "relationship_type_code")
    private String relationshipTypeCode;

    @JsonProperty(value = "subscription_eligible")
    private Boolean subscriptionEligible;

    @JsonProperty(value = "ribbons")
    private ArrayList<Object> ribbons;

    @JsonProperty(value = "tags")
    private ArrayList<Object> tags;

    @JsonProperty(value = "ship_to_restriction")
    private String shipToRestriction;

    @JsonProperty(value = "estore_item_status_code")
    private String estoreItemStatusCode;

    @JsonProperty(value = "is_proposition_65")
    private Boolean isProposition65;

    @JsonProperty(value = "return_policies")
    private ReturnPolicies returnPolicies;

    @JsonProperty(value = "gifting_enabled")
    private Boolean gifting_enabled;

    @JsonProperty(value = "packaging")
    private Packaging packaging;


}
