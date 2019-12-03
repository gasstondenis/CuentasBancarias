package cuentas;


import java.util.ArrayList;

public class AltaBaja {
    private boolean creado;
    private Almacenamiento almacenamiento = new Almacenamiento();

    boolean crearCuenta(ArrayList<Cuenta> arrayCuentas){
        creado = almacenamiento.modArchivoCuenta(arrayCuentas);
        return creado;
    }
    boolean borrarCuenta(ArrayList<Cuenta> cuenta){
        creado = almacenamiento.modArchivoCuenta(cuenta);
        return creado;
    }
}
