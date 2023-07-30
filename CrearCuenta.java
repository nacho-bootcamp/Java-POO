// public class CrearCuenta {
//   public static void main(String[] args) {
//     Cuenta primeraCuenta = new Cuenta();
//     primeraCuenta.saldo = 1000;
//     System.out.println(primeraCuenta.saldo);
//   }
// }

public class CrearCuenta {

  public static void main(String[] args) {

    Cuenta primeraCuenta = new Cuenta();
    primeraCuenta.saldo = 200;
    System.out.println(primeraCuenta.saldo);

    primeraCuenta.saldo += 100;
    System.out.println(primeraCuenta.saldo);

    Cuenta segundaCuenta = primeraCuenta;
    segundaCuenta.saldo = 50;

    System.out.println("primera cuenta tiene " + primeraCuenta.saldo);
    System.out.println("segunda cuenta tiene " + segundaCuenta.saldo);

    Cuenta cuentaDeEri = new Cuenta();
    cuentaDeEri.depositar(1000);
    System.out.println(cuentaDeEri.saldo);

    cuentaDeEri.transferir(400, primeraCuenta);

    System.out.println(cuentaDeEri.saldo);
    System.out.println(primeraCuenta.saldo);

  }
}