package cuentas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class ListaCuentas implements Serializable {
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

    public Iterator<Cuenta> iterador() {
        return new IteradorCuentas();
    }

    class IteradorCuentas implements Iterator<Cuenta>{
        public int posicion = 0;
        public boolean existe = false;


        @Override
        public boolean hasNext(){
            return posicion<arrayCuentas.size();
        }

        @Override
        public Cuenta next() {
            Cuenta resultado = arrayCuentas.get(posicion);
            posicion++;
            existe = true;
            return resultado;
        }

        @Override
        public void remove() {
            if (existe) {
                arrayCuentas.remove(posicion - 1);
                posicion--;
                existe = false;
            }
        }
    }
}


