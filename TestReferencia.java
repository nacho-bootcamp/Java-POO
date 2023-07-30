public class TestReferencia {
  public static void main(String[] args) {
    crearUsuario nacho = new crearUsuario();

    nacho.nombre = "Ignacio";
    nacho.documento = "43269745";
    nacho.telefono = "3884686043";

    Cuenta cuentaDeNacho = new Cuenta();

    cuentaDeNacho.agencia = 1;
    cuentaDeNacho.titular = nacho;

    System.out.println(cuentaDeNacho.titular.documento);
  }
}
