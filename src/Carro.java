public class Carro { // extends Object
  // nome, modelo, fabricante, numero do chassi e valor de mercado
  private String nome; // privado -> acesso apenas interno (encapsulamento)
  private String modelo;
  private String fabricante;
  private String numeroChassi;
  private float valorMercado; // não se usa float/double para dinheiro

  // construtor (new ) (construtor não é um método)
  public Carro(String nome, String modelo, String fabricante, String numeroChassi, float valorMercado) {

    this.nome         = nome; // este objeto
    this.modelo       = modelo;
    this.fabricante   = fabricante;
    this.numeroChassi = numeroChassi;
    this.valorMercado = valorMercado;

  }

  // getters/acessores (para ler o objeto)
  public String getFabricante() {
    return fabricante;
  }

  public String getNome() {
    return nome;
  }

  public String getModelo() {
    return modelo;
  }

  public String getNumeroChassi() {
    return numeroChassi;
  }

  public float getValorMercado() {
    return valorMercado;
  }

  @Override public String toString() { // assinatura do método
    return "Código: " + this.numeroChassi + " Modelo: " + this.modelo;
  }
}
