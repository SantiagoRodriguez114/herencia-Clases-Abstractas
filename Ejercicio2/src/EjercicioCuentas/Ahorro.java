package EjercicioCuentas;

class Ahorro extends Cuenta {
    private long interes;

    public Ahorro(int numeroCuenta, String titular) {
        super(numeroCuenta, titular);
        this.interes = 3; 
    }

    @Override
    public void deposito(long valor) {
        saldo += valor;
        
        long interesCalculado = saldo * interes / 100;
        saldo += interesCalculado;
        System.out.println("Depósito de " + valor + " realizado. Se ha aplicado un interés de " + interesCalculado);
    }

    @Override
    public void retiro(long valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente. No se puede realizar el retiro.");
        } else {
            saldo -= valor;
            System.out.println("Retiro de " + valor + " realizado. Saldo actual: " + saldo);
        }
    }

   

    
}

