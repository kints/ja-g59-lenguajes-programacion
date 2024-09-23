// Clase base Auto
public class Auto {
  private int numeroDeRuedas;
  private String tipoDeCombustible;
  private int velocidadMaxima;
  private String color;
  private int numeroDePuertas;

  // Constructor
  public Auto(int numeroDeRuedas, String tipoDeCombustible, int velocidadMaxima, String color, int numeroDePuertas) {
    this.numeroDeRuedas = numeroDeRuedas;
    this.tipoDeCombustible = tipoDeCombustible;
    this.velocidadMaxima = velocidadMaxima;
    this.color = color;
    this.numeroDePuertas = numeroDePuertas;
  }

  // Getters y Setters
  public int getNumeroDeRuedas() {
    return numeroDeRuedas;
  }

  public void setNumeroDeRuedas(int numeroDeRuedas) {
    this.numeroDeRuedas = numeroDeRuedas;
  }

  public String getTipoDeCombustible() {
    return tipoDeCombustible;
  }

  public void setTipoDeCombustible(String tipoDeCombustible) {
    this.tipoDeCombustible = tipoDeCombustible;
  }

  public int getVelocidadMaxima() {
    return velocidadMaxima;
  }

  public void setVelocidadMaxima(int velocidadMaxima) {
    this.velocidadMaxima = velocidadMaxima;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getNumeroDePuertas() {
    return numeroDePuertas;
  }

  public void setNumeroDePuertas(int numeroDePuertas) {
    this.numeroDePuertas = numeroDePuertas;
  }

  // Métodos
  public void prenderAuto() {
    System.out.println("El auto está encendido.");
  }

  public void acelerar() {
    System.out.println("El auto está acelerando.");
  }

  public void llenarCombustible() {
    System.out.println("El auto está llenando combustible.");
  }
}

// Subclase AutoDeportivo
class AutoDeportivo extends Auto {
  public AutoDeportivo(int numeroDeRuedas, String tipoDeCombustible, int velocidadMaxima, String color,
      int numeroDePuertas) {
    super(numeroDeRuedas, tipoDeCombustible, velocidadMaxima, color, numeroDePuertas);
  }

  @Override
  public void acelerar() {
    System.out.println("El auto deportivo está acelerando rápidamente.");
  }
}

// Subclase AutoSedan
class AutoSedan extends Auto {
  public AutoSedan(int numeroDeRuedas, String tipoDeCombustible, int velocidadMaxima, String color,
      int numeroDePuertas) {
    super(numeroDeRuedas, tipoDeCombustible, velocidadMaxima, color, numeroDePuertas);
  }

  @Override
  public void acelerar() {
    System.out.println("El auto sedán está acelerando suavemente.");
  }

  @Override
  public void llenarCombustible(Combustible Gasolina) {

  }

  @Override
  public void llenarCombustible(Combustible Electrico) {

  }

  @Override
  public void llenarCombustible(Combustible Diesel) {

  }
}

// Subclase AutoFamiliar
class AutoFamiliar extends Auto {
  public AutoFamiliar(int numeroDeRuedas, String tipoDeCombustible, int velocidadMaxima, String color,
      int numeroDePuertas) {
    super(numeroDeRuedas, tipoDeCombustible, velocidadMaxima, color, numeroDePuertas);
  }

  @Override
  public void acelerar() {
    System.out.println("El auto familiar está acelerando con seguridad.");
  }
}
