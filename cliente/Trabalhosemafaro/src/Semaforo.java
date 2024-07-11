/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elias
 */
import javax.swing.*;
import java.awt.*;

class Semaforo {
    private boolean aberto;
    private boolean fechado;
    private boolean atencao; // Pode ser usado um único atributo
    private String tipo; // digital ou tradicional
    private int tempoAberto;
    private int tempoFechado;

    public Semaforo(String tipo, int tempoAberto, int tempoFechado) {
        this.tipo = tipo;
        this.tempoAberto = tempoAberto;
        this.tempoFechado = tempoFechado;
        this.aberto = false;
        this.fechado = true;
        this.atencao = false;
    }

    public void abre() {
        aberto = true;
        fechado = false;
        atencao = false;
    }

    public void fecha() {
        aberto = false;
        fechado = true;
        atencao = false;
    }

    public void tempo(int t) {
        // implementação do tempo (aberto, fechado, atenção)
    }

    public boolean estaAberto() {
        return aberto;
    }

    public boolean estaFechado() {
        return fechado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTempoAberto() {
        return tempoAberto;
    }

    public void setTempoAberto(int tempoAberto) {
        this.tempoAberto = tempoAberto;
    }

    public int getTempoFechado() {
        return tempoFechado;
    }

    public void setTempoFechado(int tempoFechado) {
        this.tempoFechado = tempoFechado;
    }
}
