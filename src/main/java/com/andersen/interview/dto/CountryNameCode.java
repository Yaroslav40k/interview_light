package com.andersen.interview.dto;

public enum CountryNameCode {

    UNITED_STATES("USA", "^([07][1-7]|1[0-6]|2[0-7]|[35][0-9]|[468][0-8]|9[0-589])-?\\d{7}$"),
    INDIA("IND", "^([0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[1-9A-Z]{1}Z[0-9A-Z]{1})$"),
    UNITED_KINGDOM("GBR", "^((GB)?([0-9]{9}([0-9]{3})?|[A-Z]{2}[0-9]{3}))$");

    private final String countryCode;

    private final String taxIdPattern;

    CountryNameCode(String countryCode, String taxIdPattern) {
        this.countryCode = countryCode;
        this.taxIdPattern = taxIdPattern;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getTaxIdPattern() {
        return taxIdPattern;
    }

    public static CountryNameCode findByCountryCode(String countryCode) throws Exception {
        for (CountryNameCode country : values()) {
            if (country.countryCode.equals(countryCode)) {
                return country;
            }
        }
        throw new Exception(String.format("Country with ISO code [%s] not found", countryCode));
    }


}
