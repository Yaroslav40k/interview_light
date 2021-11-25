package com.andersen.interview.dto;

import com.andersen.interview.config.TaxIdType;

public class CustomerDto {

    private String name;

    private String billingCountryCode;

    private String taxId;

    private TaxIdType taxIdType;

    public CustomerDto() {

    }

    public CustomerDto(String name, String billingCountryCode, String taxId, TaxIdType taxIdType) {
        this.name = name;
        this.billingCountryCode = billingCountryCode;
        this.taxId = taxId;
        this.taxIdType = taxIdType;
    }

    public CustomerDto(String name, String billingCountryCode, String taxId) {
        this.name = name;
        this.billingCountryCode = billingCountryCode;
        this.taxId = taxId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBillingCountryCode() {
        return billingCountryCode;
    }

    public void setBillingCountryCode(String billingCountryCode) {
        this.billingCountryCode = billingCountryCode;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public TaxIdType getTaxIdType() {
        return taxIdType;
    }

    public void setTaxIdType(TaxIdType taxIdType) {
        this.taxIdType = taxIdType;
    }

}
