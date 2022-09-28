package com.liceolapaz.des.jcml;

public class CuentaPremium extends Cuenta {
    private final double amount;

    public CuentaPremium(double amount) {
        super();
        this.amount = amount;
    }

    @Override
    protected Cuenta withdraw(Cuenta cantidad) {
        return null;
    }

    @Override
    protected Cuenta deposit(Cuenta cantidad) {
        return null;
    }

}
