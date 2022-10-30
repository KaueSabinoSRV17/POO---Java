package org.example.model.account;

import java.math.BigDecimal;
import java.util.UUID;

public abstract class Account implements IAccount {
    protected UUID number;
    protected String owner;
    protected BigDecimal balance;
    protected boolean open;

    public Account(String owner) {
        this.owner = owner;
        this.number = UUID.randomUUID();
        this.open = true;
    }

    public BigDecimal deposit(BigDecimal ammount) {
        if (!open) {
            System.out.println("Error: Cannot deposit to closed account");
        }
        this.balance = balance.add(ammount);
        return ammount;
    }

    public BigDecimal withdraw(BigDecimal ammount) {
        boolean validTransaction = balance.compareTo(BigDecimal.ONE) > 0 && open;
        if (!validTransaction) {
            System.out.println("ERROR: Cannot withdraw from negative balance");
        }
        this.balance = balance.subtract(ammount);
    }
    public void closeAccount() {
        
    }
}
