package com.lfelipels.hotelmanagersystem.unit.domain.shared.objectsValues;

import com.lfelipels.hotelmanagersystem.domain.shared.objectsValues.Money;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Currency;

public class MoneyTest {

    @Test
    public void makeMoney() {
        Money money = new Money(1000, Currency.getInstance("BRL"));
        Assertions.assertEquals(1000, money.getValue());
        Assertions.assertEquals("R$ 10,00", money.formated());
    }

    @Test
    public void moneyWithNotPositiveValueShouldThrowException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Money money = new Money(0, Currency.getInstance("BRL"));
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Money money = new Money(-10, Currency.getInstance("BRL"));
        });
    }


    @Test
    public void makeBRLMoney() {
        Money money = new Money(1000, Currency.getInstance("BRL"));
        Assertions.assertEquals(1000, money.getValue());
        Assertions.assertEquals("R$ 10,00", money.formated());
    }

    @Test
    public void makeUSDMoney() {
        Money money = new Money(1000, Currency.getInstance("USD"));
        Assertions.assertEquals(1000, money.getValue());
        Assertions.assertEquals("US$ 10,00", money.formated());
    }
}
