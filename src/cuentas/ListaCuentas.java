package cuentas;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaCuentas {
    public ArrayList<Cuenta> arrayCuentas = null;


    public  ListaCuentas(){
        arrayCuentas = new ArrayList<Cuenta>();
    }

    public void setArrayCuentas(ArrayList<Cuenta> arrayCuentas) {
        this.arrayCuentas = arrayCuentas;
    }

    public ArrayList<Cuenta> getArrayCuentas() {
        return arrayCuentas;
    }
}


