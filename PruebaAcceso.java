public class PruebaAcceso {
  public static void main(String[] args) {
    Cuenta cuenta = new Cuenta();
    // hasta aqui si hago todo esto y veo que el saldo es menor que retirar
    // el saldo va a seguir siendo 200

    // tuve que comentar esto porque al poner private a la propiedad saldo
    // esto provoco que no sea visible
    cuenta.setSaldo(200);
    ;
    cuenta.retirar(300);

    // // Pero si hago esto el resultado va a ser -100

    // cuenta.saldo -= 300;
    // // Encapsulamiento: consiste en ocultar los detalles internos de una clase y
    // // exponer solo lo necesario para su uso externo.Por eso
    // // Existen los modificadores de acceso el public y private
    System.out.println(cuenta.getSaldo());
  }
}
