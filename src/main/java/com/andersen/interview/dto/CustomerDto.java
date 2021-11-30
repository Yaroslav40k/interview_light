package com.andersen.interview.dto;

public class CustomerDto {

    private String name;

    private String billingCountryCode;

    private String taxId;

    private String taxIdType;

    public CustomerDto() {

    }

    public CustomerDto(String name, String billingCountryCode, String taxId, String taxIdType) {
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

    public String getTaxIdType() {
        return taxIdType;
    }

    public void setTaxIdType(String taxIdType) {
        this.taxIdType = taxIdType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CustomerDto that = (CustomerDto) o;

        if (name != null ? !name.equals(that.name) : that.name != null) {
            return false;
        }
        if (billingCountryCode != null ? !billingCountryCode.equals(that.billingCountryCode) : that.billingCountryCode != null) {
            return false;
        }
        if (taxId != null ? !taxId.equals(that.taxId) : that.taxId != null) {
            return false;
        }
        return taxIdType != null ? taxIdType.equals(that.taxIdType) : that.taxIdType == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (billingCountryCode != null ? billingCountryCode.hashCode() : 0);
        result = 31 * result + (taxId != null ? taxId.hashCode() : 0);
        result = 31 * result + (taxIdType != null ? taxIdType.hashCode() : 0);
        return result;
    }

}
