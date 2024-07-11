/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elias
 */

import java.util.ArrayList;
import java.util.List;

class Cruzamento {
    private List<Semaforo> semaforos;

    public Cruzamento() {
        semaforos = new ArrayList<>();
    }

    public void adicionaSemaforo(Semaforo semaforo) {
        semaforos.add(semaforo);
    }

    public void sincroniza() {
        // lógica de sincronização dos semáforos
    }

    public int totalDeSemaforos() {
        return semaforos.size();
    }

    public List<Semaforo> getSemaforos() {
        return semaforos;
    }
}
