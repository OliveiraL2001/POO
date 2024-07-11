package semafaro2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elias
 */



import semafaro2.AnalogCounter;
import javax.swing.*;
import java.awt.*;

public class Semaforo extends JPanel {
    private Color vermelho = Color.BLACK;
    private Color amarelo = Color.BLACK;
    private Color verde = Color.BLACK;
    private AnalogCounter contador;

    public Semaforo() {
        setPreferredSize(new Dimension(150, 300));
        contador = new AnalogCounter();
        setLayout(new BorderLayout());
        add(contador, BorderLayout.EAST);
    }

    public void setLuz(String cor) {
        vermelho = cor.equals("vermelho") ? Color.RED : Color.BLACK;
        amarelo = cor.equals("amarelo") ? Color.YELLOW : Color.BLACK;
        verde = cor.equals("verde") ? Color.GREEN : Color.BLACK;
        repaint();
    }

    public void setTempo(int tempo) {
        contador.setNumber(tempo);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(vermelho);
        g.fillOval(50, 30, 60, 60);
        g.setColor(amarelo);
        g.fillOval(50, 110, 60, 60);
        g.setColor(verde);
        g.fillOval(50, 190, 60, 60);
    }
}
