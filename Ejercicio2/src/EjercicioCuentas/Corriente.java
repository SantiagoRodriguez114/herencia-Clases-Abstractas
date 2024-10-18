package EjercicioCuentas;

public class Corriente extends Cuenta {
    private long sobregiro;

    public Corriente(int numeroCuenta, String titular, long sobregiro) {
        super(numeroCuenta, titular);
        this.sobregiro = sobregiro; 
    }

    @Override
    public void deposito(long valor) {
        this.saldo += valor; 


        System.out.println("Depósito de " + valor + " realizado. Saldo actual: " + saldo);
    }

    @Override
    public void retiro(long valor) {
        long saldoTotal = saldo + sobregiro; 

        if (valor > saldoTotal) {
            System.out.println("Saldo insuficiente. No se puede realizar el retiro.");
        } else {
            saldo -= valor; 

            
            if (saldo < 0) {
                sobregiro += saldo; 
            
            }

            System.out.println("Retiro de " + valor + " realizado. Saldo actual: " + saldo + ", Sobregiro restante: " + sobregiro);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n Sobregiro disponible: " + sobregiro;
    }
}
