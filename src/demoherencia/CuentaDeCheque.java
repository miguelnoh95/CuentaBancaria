/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia;

/**
 *
 * @author Edeco
 */
public class CuentaDeCheque extends CuentaBancaria {
    private int ChequesEmitidos;
    private int ChequesRebotados;
    
    public CuentaDeCheque (int numeroDeCuenta, String Cliente){
        super(numeroDeCuenta, Cliente);
        super.depositar(2000.0);
        ChequesEmitidos = 0;
        ChequesRebotados = 0;
    }
    public boolean Retirar(double Cantidad){
        boolean seEfectuoRetiro = super.retirar(Cantidad);
        if (seEfectuoRetiro == true){
            ChequesEmitidos = ChequesEmitidos + 1;
        }
        else {
            ChequesRebotados ++;
        }
        return seEfectuoRetiro;
    }
    public double calcularinteresPorChequesEmitidos() {
        double comision = (ChequesEmitidos - 5.0) * 5.0;
        return comision;
    }
    public double calcularcomisionPorChequesRebotados() {
        return ChequesRebotados * 100.0;
    }
}
