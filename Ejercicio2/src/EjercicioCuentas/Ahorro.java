package EjercicioCuentas;

public class Ahorro extends Cuenta {
	private long interes;

    public Ahorro(int numeroCuenta, String titular) {
        super(numeroCuenta, titular);
        
    }

    @Override
    public void deposito(long valor) {
        
    	if(valor < 0) {
    		System.out.println("Valor ingresado no valido...");
    	} else {
    	
    	this.saldo += valor;
        this.interes = this.saldo * 3 / 100;
        this.saldo += this.interes;
        System.out.println("Depósito de " + valor + " realizado. Interés de " + this.interes);
    	}
    }

    @Override
    public void retiro(long valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente. No se puede realizar el retiro.");
        } else {
            this.saldo -= valor;
            System.out.println("Retiro de " + valor + " realizado. Saldo actual: " + this.saldo);
        }
    }
}
