/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import java.util.ArrayList;

/**
 *
 * @author Farasi
 */
public class Banco {
    private String nombre;
    private ArrayList<CuentaBancaria> listaCuentas;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.listaCuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        listaCuentas.add(cuenta);
        System.out.println("Cuenta agregada al banco " + nombre);
    }

    public void mostrarCuentas() {
        for (CuentaBancaria cuenta : listaCuentas) {
            cuenta.mostrarInformacion();
            System.out.println("--------------------");
        }
    }
}
