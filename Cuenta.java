
class Cuenta {
  private double saldo1;
  private int agencia;
  int numero;
  crearUsuario titular;

  // La propiedad "static" lo que nos va a decir es que esta variable no va a ser
  // de la instancia. Esta variable va a ser de la clase. la palabra static nos
  // está diciendo que esta variable que está aquí no va a ser alterada por la
  // instancia sino directamente por nuestra clase cuenta.por Ejemplo:
  private static int total = 0;

  // Este es el contructor el cual nos permite poder manejar a la clase
  // desde su concepcion
  // public Cuenta(int agencia) {
  // if (agencia <= 0) {
  // this.agencia = 1;
  // System.out.println("No se permite el numero 0");
  // } else {
  // this.agencia = agencia;
  // }
  // }

  public void depositar(double valor) {
    this.saldo1 += valor;
  }

  public boolean retirar(double valor) {
    if (this.saldo1 >= valor) {
      this.saldo1 = this.saldo1 - valor;
      return true;
    } else {
      return false;
    }
  }

  public boolean transferir(double valor, Cuenta cuenta) {
    if (this.saldo1 >= valor) {
      this.saldo1 = this.saldo1 - valor;
      cuenta.depositar(valor);
      return true;
    } else {
      return false;
    }
  };
  // por convencion en java se dice si vas a definir un metodo
  // para obtener el valor de una variable privada ese valor debe comenzar con get
  // por ej: getSaldo(){}

  public double getSaldo() {
    return this.saldo1;
  }

  public void setSaldo(double saldo) {
    this.saldo1 = saldo;
  }

  // set es para asignar, y podría ser por ejemplo setAgencia y si yo le voy a
  // asignar valor a esa variable, ¿qué debería hacer? Mandarle un argumento a ese
  // método con el valor que yo le quiero poner. En ese caso es un tipo entero y
  // va a ser nuevaAgencia. Abrimos llaves, el método tiene que ser público y en
  // este caso yo no deseo retornar alguna cosa cuando asigno esa nuevaAgencia.

  public void setAgencia(int agencia) {
    if (agencia > 0) {
      this.agencia = agencia;
    }
  }

  public int getAgencia() {
    return agencia;
  }

  // metodo static para poder usarlo en las instancia de la cuenta y se usa de la
  // siguiente manera.
  // Cuenta.getTotal();
  public static int getTotal() {
    return Cuenta.total;
  }
}

// la funcion set es la que tiene el parametro l otro solo devuenve
