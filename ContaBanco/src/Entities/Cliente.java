package Entities;

public class Cliente {
  private Integer number;
  private String agencia, nome;
  private Double saldo;

  public Cliente(Integer number, String agencia, String nome, Double saldo) {
    this.number = number;
    this.agencia = agencia;
    this.nome = nome;
    this.saldo = saldo;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public String getAgencia() {
    return agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getSaldo() {
    return saldo;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }

  @Override
  public String toString() {

    return String.format(
        "Olá %s , obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.",
        getNome(), getAgencia(), getNumber(), getSaldo());
  }

}
