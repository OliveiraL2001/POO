/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author elias
 */
package cruzamento;

import javax.swing.*;
import java.awt.*;

public class Semaforo extends JPanel {
    private Color vermelho = Color.BLACK;
    private Color amarelo = Color.BLACK;
    private Color verde = Color.BLACK;
    private JLabel timerLabel;
    private int tempo;

    public Semaforo() {
        setPreferredSize(new Dimension(150, 300));
        timerLabel = new JLabel("0", SwingConstants.CENTER);
        timerLabel.setFont(new Font("Serif", Font.BOLD, 24));
        setLayout(new BorderLayout());
        add(timerLabel, BorderLayout.EAST);
    }

    public void setLuz(String cor) {
        vermelho = cor.equals("vermelho") ? Color.RED : Color.BLACK;
        amarelo = cor.equals("amarelo") ? Color.YELLOW : Color.BLACK;
        verde = cor.equals("verde") ? Color.GREEN : Color.BLACK;
        repaint();
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
        timerLabel.setText(String.valueOf(tempo));
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
