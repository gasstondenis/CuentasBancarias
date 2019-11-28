package cuentas;


import java.util.ArrayList;

public class AltaBaja {
    private int contadorCuentas;
    private boolean creado;
    private Almacenamiento almacenamiento = new Almacenamiento();

    boolean crearCuenta(ArrayList arrayCuentas){
        creado = almacenamiento.modArchivoCuenta(arrayCuentas);
        if (creado) Cuenta.indiceCuenta++;
        return creado;
    }
    boolean borrarCuenta(ArrayList<Cuenta> cuenta){
        creado = almacenamiento.modArchivoCuenta(cuenta);
        if (creado) Cuenta.indiceCuenta--;
        return creado;
    }

    int getContadorCuentas() {
        return contadorCuentas;
    }
}
