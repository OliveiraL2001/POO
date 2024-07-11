package semafaro2;


import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

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

public class AnalogCounter extends JPanel {
    private int number;

    public AnalogCounter() {
        setPreferredSize(new Dimension(150, 300));
        setOpaque(false);
    }

    public void setNumber(int number) {
        this.number = number;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawDigit(g, number, 10, 70);
    }

    private void drawDigit(Graphics g, int num, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(10));

        int[][] segments = {
            {1, 1, 1, 1, 1, 1, 0}, // 0
            {0, 1, 1, 0, 0, 0, 0}, // 1
            {1, 1, 0, 1, 1, 0, 1}, // 2
            {1, 1, 1, 1, 0, 0, 1}, // 3
            {0, 1, 1, 0, 0, 1, 1}, // 4
            {1, 0, 1, 1, 0, 1, 1}, // 5
            {1, 0, 1, 1, 1, 1, 1}, // 6
            {1, 1, 1, 0, 0, 0, 0}, // 7
            {1, 1, 1, 1, 1, 1, 1}, // 8
            {1, 1, 1, 1, 0, 1, 1}  // 9
        };

        int segmentLength = 50;
        int segmentThickness = 10;
        int segmentGap = 10;

        int[][] segmentCoords = {
            {x + segmentGap, y, x + segmentLength, y},                             // Top
            {x + segmentLength + segmentGap, y, x + segmentLength + segmentGap, y + segmentLength}, // Top-right
            {x + segmentLength + segmentGap, y + segmentLength + segmentGap, x + segmentLength + segmentGap, y + 2 * segmentLength + segmentGap}, // Bottom-right
            {x + segmentGap, y + 2 * segmentLength + 2 * segmentGap, x + segmentLength, y + 2 * segmentLength + 2 * segmentGap}, // Bottom
            {x, y + segmentLength + segmentGap, x, y + 2 * segmentLength + segmentGap}, // Bottom-left
            {x, y, x, y + segmentLength},                                          // Top-left
            {x + segmentGap, y + segmentLength + segmentGap, x + segmentLength, y + segmentLength + segmentGap}  // Middle
        };

        for (int i = 0; i < 7; i++) {
            if (segments[num][i] == 1) {
                g2.drawLine(segmentCoords[i][0], segmentCoords[i][1], segmentCoords[i][2], segmentCoords[i][3]);
            }
        }
    }
}


//
//import javax.swing.*;
//import java.awt.*;
//
//public class Semaforo extends JPanel {
//    private Color vermelho = Color.BLACK;
//    private Color amarelo = Color.BLACK;
//    private Color verde = Color.BLACK;
//    private JLabel timerLabel;
//    private int tempo;
//
//    public Semaforo() {
//        setPreferredSize(new Dimension(200, 300)); // Ajuste o tamanho para acomodar o temporizador
//        timerLabel = new JLabel("0", SwingConstants.CENTER);
//        timerLabel.setFont(new Font("Serif", Font.BOLD, 48)); // Fonte grande para o temporizador
//        setLayout(null);
//        timerLabel.setBounds(50, 10, 100, 50); // Ajuste a posição do temporizador
//        add(timerLabel);
//    }
//
//    public void setLuz(String cor) {
//        vermelho = cor.equals("vermelho") ? Color.RED : Color.BLACK;
//        amarelo = cor.equals("amarelo") ? Color.YELLOW : Color.BLACK;
//        verde = cor.equals("verde") ? Color.GREEN : Color.BLACK;
//        repaint();
//    }
//
//    public void setTempo(int tempo) {
//        this.tempo = tempo;
//        timerLabel.setText(String.format("%02d", tempo)); // Formatação do temporizador
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.setColor(vermelho);
//        g.fillOval(70, 80, 60, 60);
//        g.setColor(amarelo);
//        g.fillOval(70, 160, 60, 60);
//        g.setColor(verde);
//        g.fillOval(70, 240, 60, 60);
//    }
//}
//
//

