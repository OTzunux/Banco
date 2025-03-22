/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Farasi
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private Cliente propietario;

    public CuentaBancaria(String numeroCuenta, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.propietario = propietario;
        this.saldo = 0.0;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Error: El monto debe ser mayor a 0.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Error: Saldo insuficiente o monto inválido.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }
    
    public void mostrarInformacion() {
        propietario.mostrarDatos();
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
    }
}
