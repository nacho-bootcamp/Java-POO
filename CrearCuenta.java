// public class CrearCuenta {
// public static void main(String[] args) {
// Cuenta primeraCuenta = new Cuenta();
// primeraCuenta.saldo = 1000;
// System.out.println(primeraCuenta.saldo);
// }
// }

// ========================================>
public class CrearCuenta {

  public static void main(String[] args) {

    Cuenta primeraCuenta = new Cuenta();
    primeraCuenta.setSaldo(200);
    System.out.println(primeraCuenta.getSaldo());

    primeraCuenta.setSaldo(primeraCuenta.getSaldo() + 100);
    System.out.println(primeraCuenta.getSaldo());

    Cuenta segundaCuenta = primeraCuenta;
    segundaCuenta.setSaldo(50);

    System.out.println("primera cuenta tiene " + primeraCuenta.getSaldo());
    System.out.println("segunda cuenta tiene " + segundaCuenta.getSaldo());

    Cuenta cuentaDeEri = new Cuenta();
    cuentaDeEri.depositar(1000);
    System.out.println(cuentaDeEri.getSaldo());

    cuentaDeEri.transferir(400, primeraCuenta);

    System.out.println(cuentaDeEri.getSaldo());
    System.out.println(primeraCuenta.getSaldo());

  }
}