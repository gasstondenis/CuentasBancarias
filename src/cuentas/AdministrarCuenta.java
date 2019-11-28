package cuentas;


import java.util.ArrayList;


public class AdministrarCuenta {
    private Almacenamiento almacenamiento = new Almacenamiento();
    private AltaBaja altaBaja = new AltaBaja();
    ListaCuentas listaCuentas = new ListaCuentas();



    public boolean darDeAlta(Cuenta cuenta) {
        boolean creado;
        listaCuentas.arrayCuentas.add(cuenta);
        creado = altaBaja.crearCuenta(listaCuentas.arrayCuentas);
        return creado;
    }

    public boolean darDeBaja(int nroCuenta, String password){
        boolean exito = false;
        Cuenta objeto;
        int indice;
        objeto = buscarCuenta(nroCuenta);
        if (objeto != null) {
            if (objeto.getPassword().equals(password)) {
                indice = objeto.getIndiceCuenta();
                listaCuentas.arrayCuentas.remove(indice);
                exito = altaBaja.borrarCuenta(listaCuentas.arrayCuentas);
            }
        }
        return exito;
    }


    Cuenta buscarCuenta(int nroCuenta){
        Cuenta cuenta = null;
        if (listaCuentas.arrayCuentas != null) {
            while (listaCuentas.arrayCuentas.iterator().hasNext()){
                if ((listaCuentas.arrayCuentas.iterator().next()).getNroCuenta() == nroCuenta){
                    cuenta = listaCuentas.iterador().next();
                    break;
                }
            }
        }
        return cuenta;
    }
    public void setArreglo (){
        try {
            listaCuentas.arrayCuentas = almacenamiento.busquedaArchivoCuenta();
        } catch (NullPointerException e){
            almacenamiento.modArchivoCuenta(listaCuentas.arrayCuentas);
        }
    }

    boolean extraerSaldo(Cuenta cuenta, double monto){
        boolean retorno = true;
        return cuenta.descontarSaldo(monto);

    }
    void acreditarSaldo(Cuenta cuenta, double monto){
        cuenta.incrementarSaldo(monto);
    }

    int contadorCuentas(){
        return altaBaja.getContadorCuentas();
    }


}
