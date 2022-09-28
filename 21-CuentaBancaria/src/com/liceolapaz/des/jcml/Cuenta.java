package com.liceolapaz.des.jcml;

public abstract class Cuenta {
    protected abstract Cuenta withdraw(Cuenta cantidad);
    protected abstract Cuenta deposit(Cuenta cantidad);
}
