package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {
    CurrencyType ct = CurrencyType.CHINESE_YR;

    public CurrencyType getCurrencyType() {
        return this.ct;
    }

    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / this.getCurrencyType().getRate();
    }
}
