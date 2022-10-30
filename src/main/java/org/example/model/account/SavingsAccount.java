package org.example.model.account;

import java.math.BigDecimal;

public class SavingsAccount extends Account {
    private final static BigDecimal TAX_VALUE = BigDecimal.valueOf(7);
    private final static BigDecimal INITIAL_VALUE = BigDecimal.valueOf(150);

    public SavingsAccount(String owner) {
        super(owner);
        this.balance = INITIAL_VALUE;
    }

    @Override
    public void payMaintenanceTax() {
        this.balance = balance.subtract(TAX_VALUE);
    }

}
