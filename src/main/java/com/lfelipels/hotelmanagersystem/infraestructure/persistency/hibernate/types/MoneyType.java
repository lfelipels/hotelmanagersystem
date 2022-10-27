package com.lfelipels.hotelmanagersystem.infraestructure.persistency.hibernate.types;

import com.lfelipels.hotelmanagersystem.domain.shared.objectsValues.Money;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.usertype.UserType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Currency;

@Converter(autoApply = true)
public class MoneyType implements AttributeConverter<Money, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Money money) {
        return money.getValue();
    }

    @Override
    public Money convertToEntityAttribute(Integer integer) {
        return new Money(integer, Currency.getInstance("BRL"));
    }
}
