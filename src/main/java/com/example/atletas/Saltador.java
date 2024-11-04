package com.example.atletas;

public class Saltador  implements Atleta {
  private String nombre;

  public Saltador(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public int realizarCompetencia() {
    return (int) (Math.random() * 10);
  }

  @Override
  public void mostarInformacion() {
    System.out.println("Atleta: " + this.nombre + " Competencia: Salto");
  }

}