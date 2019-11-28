package cuentas;

import java.io.Serializable;

public class Cuenta implements Serializable {
//  Atributos de clase
    private String usuario;
    private double saldo;
    private int nroCuenta;
    private String password;
    static int indiceCuenta = 0;

    Cuenta(String usuario, int nroCuenta, String password) {
        this.usuario = usuario;
        this.nroCuenta = nroCuenta;
        this.password = password;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    int getNroCuenta() {
        return nroCuenta;
    }

    public String getUsuario() {
        return usuario;
    }

    String getPassword() {
        return password;
    }

    String mostrarDatos(){
        String datos = String.format("Usuario: %s\nNúmero de cuenta: %d\nSaldo: $"+saldo, usuario, nroCuenta);
        return datos;
    }

    public void incrementarSaldo(double saldo) {
        this.saldo += saldo;
    }
    public boolean descontarSaldo(double monto){
        boolean exito = true;
        if (this.saldo < monto){
            exito = false;
        } else this.saldo -= monto;
        return exito;
    }

    int getIndiceCuenta() {
        return indiceCuenta;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
