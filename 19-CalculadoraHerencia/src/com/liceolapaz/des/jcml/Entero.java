package com.liceolapaz.des.jcml;
import com.liceolapaz.des.jcml.Numero;

public class Entero extends Numero {
private final int valor;
//Constructor asocia
public Entero(int i) {
    //La palabra clave super en Java es una variable de referencia que se usa para referir objetos de clase padre
    super();
     this.valor = i;
}

    @Override
    Numero suma(Numero operando) {
      if (operando instanceof Entero) {
          Entero op = (Entero) operando;
          return new Entero(op.valor + this.valor);
      }
        System.out.println("No es un número entero");
        return null;
    }

    @Override
    Numero resta(Numero operando) {
        if (operando instanceof Entero op) {
            return new Entero(op.valor - this.valor);
        }
        System.out.println("No es un número entero");
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
        String show = String.valueOf(this.valor);
        return null;
    }
}