package com.alurachallenges.modelos;

import java.util.ArrayList;
import java.util.List;

public class historial {
    private int cont = 0;
    private List<String> historial = new ArrayList<>();

    public void insertarHistorial(String movimiento) {
        historial.add(movimiento);
    }

    public void mostrarHistorial() {
        for (String movimiento : historial) {
            System.out.println("Movimiento Realizado: " + movimiento);
        }
    }
}
