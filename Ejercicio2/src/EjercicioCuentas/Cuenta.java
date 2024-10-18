package EjercicioCuentas;

public abstract class Cuenta {
    protected int numCuenta;
    protected String titular;
    protected long saldo;
    
    public Cuenta(int numCuenta, String titular) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.saldo = 0;
    }
    
    public long getSaldo() {
        return saldo;
    }

    public abstract void deposito(long valor);
    public abstract void retiro(long valor);

    @Override
    public String toString() {
        return "Cuenta #" + numCuenta + "\n titular=" + titular + "\n saldo=" + saldo;
    }

    
}
