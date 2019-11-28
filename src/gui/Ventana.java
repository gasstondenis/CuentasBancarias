package gui;

import cuentas.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JPanel panelPrincipal;
    private JPanel panelOpciones;


    public Ventana(){
        this.setSize(450, 230);
        this.setResizable(false);
        this.setMinimumSize(new Dimension(350, 200));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        setPanelPrincipal();
        etiquetas();
        botones();
        camposTexto();
    }
    private void setPanelPrincipal(){
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        //panelPrincipal.setBackground(Color.orange);

        this.getContentPane().add(panelPrincipal);
    }
    private void setPanelOpciones(){
        panelOpciones = new JPanel();
        panelOpciones.setLayout(null);

        this.getContentPane().add(panelOpciones);
    }
    private void etiquetas(){
        JLabel etSaldo = new JLabel("Saldo: ");
        JLabel etDni = new JLabel("DNI: ");
        JLabel etNombreApellido = new JLabel("Nombre y Apellido: ");
        JLabel etNroCuenta = new JLabel("Número de cuenta: ");

        etNombreApellido.setBounds(10, 15, 170, 20);
        etNombreApellido.setFont(new Font("Ubuntu", Font.BOLD, 14));
        etDni.setBounds(10, 35, 110, 20);
        etDni.setFont(new Font("Ubuntu", Font.BOLD, 14));
        etNroCuenta.setBounds(10, 55, 200, 20);
        etNroCuenta.setFont(new Font("Ubuntu", Font.BOLD, 14));
        etSaldo.setBounds(10, 75, 200, 20);
        etSaldo.setFont(new Font("Ubuntu", Font.BOLD, 14));

        panelPrincipal.setLayout(null);
        panelPrincipal.add(etNombreApellido);
        panelPrincipal.add(etDni);
        panelPrincipal.add(etNroCuenta);
        panelPrincipal.add(etSaldo);
    }
    private void botones(){
        JButton btSalir = new JButton("Salir");
        btSalir.setBounds(355, 160, 70, 28);
        btSalir.setForeground(Color.black);
        btSalir.setBackground(Color.white);
        btSalir.setFont(new Font("Ubuntu", 1, 14));
        //btSalir.setBorder(BorderFactory.createLineBorder(Color.black, 1,true ));


        //Oyente de accion para btSalir
        ActionListener salir = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(-1);
            }
        };
        btSalir.addActionListener(salir);
        panelPrincipal.add(btSalir);
    }
    private void camposTexto(){
        JTextField txNombreApellido = new JTextField();
        JTextField txDni = new JTextField();
        JTextField txNroCuenta = new JTextField();
        JTextField txSaldo = new JTextField();
        //txNombreApellido
        txNombreApellido.setBounds(150, 15, 250, 20);
        txNombreApellido.setFont(new Font("Ubuntu", 0, 14));

        //txDni
        txDni.setBounds(150, 35, 250, 20);
        txDni.setFont(new Font("Ubuntu", 0, 14));
        //txDni.setBorder(BorderFactory.createLineBorder(Color.black, 1, true));


        //txNroCuenta
        txNroCuenta.setBounds(150, 55, 250, 20);
        txNroCuenta.setFont(new Font("Ubuntu", 0, 14));

        //txSaldo
        txSaldo.setBounds(150, 75, 250, 20);
        txSaldo.setFont(new Font("Ubuntu", 0, 14));
        panelPrincipal.add(txNombreApellido);
        panelPrincipal.add(txDni);
        panelPrincipal.add(txNroCuenta);
        panelPrincipal.add(txSaldo);

    }


}
