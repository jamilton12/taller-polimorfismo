package com.example;

import com.example.atletas.Corredor;
import com.example.atletas.Nadador;
import com.example.atletas.Saltador;

public class Main {
    public static void main(String[] args) {
        
        Torneo torneo = new Torneo();
        Torneo torneo1 = new Torneo();
        Torneo torneo2 = new Torneo();
        Corredor corredor = new Corredor("Juan");
        torneo.organizarCompetencia(corredor);

        System.out.println("Hello, World!");

        Nadador nadador = new Nadador("Pedro");
        torneo1.organizarCompetencia(nadador);

        Saltador saltador = new Saltador("Maria");
        torneo2.organizarCompetencia(saltador);

    }
}