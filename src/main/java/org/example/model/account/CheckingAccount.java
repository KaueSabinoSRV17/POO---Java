package org.example.model.account;

import java.math.BigDecimal;

public class CheckingAccount extends Account {

    private final static BigDecimal TAX_VALUE = BigDecimal.valueOf(12);
    private final static BigDecimal INITIAL_VALUE = BigDecimal.valueOf(50);

    public CheckingAccount(String owner) {
        super(owner);
        this.balance = INITIAL_VALUE;
    }

    @Override
    public void payMaintenanceTax() {
        this.balance = balance.subtract(TAX_VALUE);
    }
}
