/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

/**
 *
 * @author Farasi
 */
public class SistemaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan Pérez", "12345678", "San Juan Sac");
        Cliente cliente2 = new Cliente("Ana López", "87654321", "San Pedro Sac");

        CuentaBancaria cuenta1 = new CuentaBancaria("001", cliente1);
        CuentaBancaria cuenta2 = new CuentaBancaria("002", cliente2);

        Banco banco = new Banco("Banco Central");
        banco.agregarCuenta(cuenta1);
        banco.agregarCuenta(cuenta2);

        cuenta1.depositar(500);
        cuenta1.retirar(200);
        cuenta2.depositar(1000);
        cuenta2.retirar(1200);

        banco.mostrarCuentas();
    }
    
}
