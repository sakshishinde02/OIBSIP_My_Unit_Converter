package com.example.myunitconverter;

import java.math.BigDecimal;

public class Unit {
    private String symbol;
    private String name;
    private BigDecimal value;

    public Unit(String symbol, String name, String value) {
        this.symbol = symbol;
        this.name = name;
        this.value = new BigDecimal(value);
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return name+" ["+symbol+"]";
    }
}
