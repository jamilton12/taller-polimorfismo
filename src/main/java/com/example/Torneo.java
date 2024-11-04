package com.example;

import com.example.atletas.Atleta;

public class Torneo {

  public Torneo() {
  }

  public void organizarCompetencia(Atleta atleta) {

    atleta.mostarInformacion();
    int puntaje = atleta.realizarCompetencia();
    System.out.println("Puntaje: " + puntaje);
    System.out.println("-------------------");
  }


}
