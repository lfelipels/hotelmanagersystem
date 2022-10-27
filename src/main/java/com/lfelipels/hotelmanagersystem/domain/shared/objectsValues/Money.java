package com.lfelipels.hotelmanagersystem.domain.shared.objectsValues;

import com.lfelipels.hotelmanagersystem.infraestructure.persistency.hibernate.types.MoneyType;
import org.hibernate.annotations.TypeDef;

import java.text.NumberFormat;
import java.util.Currency;

public class Money {
    private Integer value;
    private Currency currency;

    public Money(Integer value, Currency currency) {
        this.asserts(value);
        this.value = value;
        this.currency = currency;
    }

    private void asserts(Integer value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Money should have a positive value");
        }
    }

    public String formated() {
        NumberFormat formater = NumberFormat.getInstance();
        formater.setCurrency(this.currency);
        formater.setMaximumFractionDigits(this.currency.getDefaultFractionDigits());
        formater.setMinimumFractionDigits(this.currency.getDefaultFractionDigits());

        Double value = Double.valueOf(this.value) / 100;

        return String.format(
                "%s %s",
                this.currency.getSymbol(),
                formater.format(value)
        );
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.formated();
    }
}
