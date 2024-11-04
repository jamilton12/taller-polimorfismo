package com.example.atletas;

public class Nadador implements Atleta {
  private String nombre;

  public Nadador(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public int realizarCompetencia() {
    return (int) (Math.random() * 10);
  }

  @Override
  public void mostarInformacion() {
    System.out.println("Atleta: " + this.nombre + " Competencia: Natación");
  }

}
