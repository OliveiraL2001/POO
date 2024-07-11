/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semafaro2;

/**
 *
 * @author elias
 */

//
//
//
//import javax.swing.*;
//import java.awt.*;
//
//public class Semaforo extends JPanel {
//    private int number;
//
//    public Semaforo() {
//        setPreferredSize(new Dimension(150, 300));
//        setOpaque(false);
//    }
//
//    public void setNumber(int number) {
//        this.number = number;
//        repaint();
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        drawDigit(g, number, 0, 0);
//    }
//
//    private void drawDigit(Graphics g, int num, int x, int y) {
//        Graphics2D g2 = (Graphics2D) g;
//        g2.setStroke(new BasicStroke(10));
//
//        int[][] segments = {
//            {1, 1, 1, 1, 1, 1, 0}, // 0
//            {0, 1, 1, 0, 0, 0, 0}, // 1
//            {1, 1, 0, 1, 1, 0, 1}, // 2
//            {1, 1, 1, 1, 0, 0, 1}, // 3
//            {0, 1, 1, 0, 0, 1, 1}, // 4
//            {1, 0, 1, 1, 0, 1, 1}, // 5
//            {1, 0, 1, 1, 1, 1, 1}, // 6
//            {1, 1, 1, 0, 0, 0, 0}, // 7
//            {1, 1, 1, 1, 1, 1, 1}, // 8
//            {1, 1, 1, 1, 0, 1, 1}  // 9
//        };
//
//        int segmentLength = 50;
//        int segmentThickness = 10;
//        int segmentGap = 10;
//
//        int[][] segmentCoords = {
//            {x + segmentGap, y, x + segmentLength, y},                             // Top
//            {x + segmentLength + segmentGap, y, x + segmentLength + segmentGap, y + segmentLength}, // Top-right
//            {x + segmentLength + segmentGap, y + segmentLength + segmentGap, x + segmentLength + segmentGap, y + 2 * segmentLength + segmentGap}, // Bottom-right
//            {x + segmentGap, y + 2 * segmentLength + 2 * segmentGap, x + segmentLength, y + 2 * segmentLength + 2 * segmentGap}, // Bottom
//            {x, y + segmentLength + segmentGap, x, y + 2 * segmentLength + segmentGap}, // Bottom-left
//            {x, y, x, y + segmentLength},                                          // Top-left
//            {x + segmentGap, y + segmentLength + segmentGap, x + segmentLength, y + segmentLength + segmentGap}  // Middle
//        };
//
//        for (int i = 0; i < 7; i++) {
//            if (segments[num][i] == 1) {
//                g2.drawLine(segmentCoords[i][0], segmentCoords[i][1], segmentCoords[i][2], segmentCoords[i][3]);
//            }
//        }
//    }
//}




//
//import java.util.ArrayList;
//import java.util.List;
//
//class Cruzamento {
//    private List<Semafaro> semaforos;
//
//    public Cruzamento() {
//        semaforos = new ArrayList<>();
//    }
//
//    public void adicionaSemaforo(Semafaro semaforo) {
//        semaforos.add(semaforo);
//    }
//
//    public void sincroniza() {
//        // lógica de sincronização dos semáforos
//    }
//
//    public int totalDeSemaforos() {
//        return semaforos.size();
//    }
//
//    public List<Semafaro> getSemaforos() {
//        return semaforos;
//    }
//}
