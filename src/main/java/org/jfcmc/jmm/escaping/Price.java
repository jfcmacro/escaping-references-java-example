package org.jfcmc.jmm.escaping;

import java.util.Map;
import java.util.HashMap;

public class Price {

    private Map<String, Double> rates;
    private Double value;

    public Price(Double value) {
        this.value = value;
        rates = new HashMap<>();
        rates.put("USD", 1d);
        rates.put("GBP", 0.6);
        rates.put("EUR", 0.8);
    }

    public Double convert(String toCurrency) {

        if (toCurrency.equals("USD")) {
            return value;
        }
        else {
            Double conversion = rates.get("USD") / rates.get(toCurrency);
            value = conversion * value;
            return value;
        }
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
