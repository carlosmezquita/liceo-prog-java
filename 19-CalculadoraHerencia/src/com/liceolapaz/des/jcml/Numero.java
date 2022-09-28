package com.liceolapaz.des.jcml;

abstract public class Numero {
    abstract Numero suma(Numero operendo);
    abstract Numero resta(Numero operando);
    abstract Numero multiplicacion(Numero operando);
    abstract Numero division(Numero operando);
    abstract String mostrar();
}
