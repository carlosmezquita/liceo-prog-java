package com.liceolapaz.des.jcml;

public class Complejo extends Numero{
    private final int real;
    private final int imaginaria;

    public Complejo(int real, int imaginaria){
        super();
        this.real = real;
        this.imaginaria = imaginaria;
    }
    @Override
    Numero suma(Numero operendo) {
        if(operendo instanceof Complejo){
            Complejo op = (Complejo)operendo;
            Numero resultado= null;
        }
        return null;
    }

    @Override
    Numero resta(Numero operando) {
        return null;
    }

    @Override
    Numero multiplicacion(Numero operando) {
        return null;
    }

    @Override
    Numero division(Numero operando) {
        return null;
    }

    @Override
    String mostrar() {
        return null;
    }
}
