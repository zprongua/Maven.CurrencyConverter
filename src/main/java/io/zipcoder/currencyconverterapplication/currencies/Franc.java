package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Franc implements ConvertableCurrency {
    CurrencyType ct = CurrencyType.FRANC;

    public CurrencyType getCurrencyType() {
        return this.ct;
    }

    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / this.getCurrencyType().getRate();
    }
}
