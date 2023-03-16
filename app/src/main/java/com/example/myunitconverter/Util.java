package com.example.myunitconverter;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Util {
    public static BigDecimal convert(BigDecimal fromInput, BigDecimal fromValue, BigDecimal toValue){
        BigDecimal toWatt = fromInput.multiply(fromValue);
        return toWatt.divide(toValue, 12, RoundingMode.HALF_EVEN).stripTrailingZeros();
    }
}
