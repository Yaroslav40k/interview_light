package com.andersen.interview.type;

import java.util.HashMap;
import java.util.Map;

public class TaxIdType {

    public static final String GB_VAT = "gb_vat"; // Great Britain
    public static final String IN_GST = "in_gst"; // India
    public static final String US_EIN = "us_ein"; // United States

    public static Map<String,String> countryToTaxIdType  = new HashMap<>();

    static {
        countryToTaxIdType.put("USA", "us_ein");
        countryToTaxIdType.put("GBR", "gb_vat");
        countryToTaxIdType.put("IND", "in_gst");
    }


}
