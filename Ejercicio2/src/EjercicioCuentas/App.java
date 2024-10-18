package EjercicioCuentas;

public class App {
    public static void main(String[] args) {
        Ahorro cuentaAhorro = new Ahorro(12345, "Pablo");
        System.out.println(cuentaAhorro);
        cuentaAhorro.deposito(1000); 
        System.out.println(cuentaAhorro);
        
        cuentaAhorro.retiro(500);    
        System.out.println(cuentaAhorro); 
        
        cuentaAhorro.retiro(600);   
        System.out.println(cuentaAhorro);
      
//        Corriente cuentaCorriente = new Corriente(67890, "Ana", 500);
//        System.out.println(cuentaCorriente);
//        cuentaCorriente.deposito(1000);
//        System.out.println(cuentaCorriente);
//
//        cuentaCorriente.retiro(1300);
//        System.out.println(cuentaCorriente);
//        
//        cuentaCorriente.deposito(300);
//        System.out.println(cuentaCorriente);
    }        
}
