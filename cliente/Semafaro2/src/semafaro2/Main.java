/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semafaro2;

/**
 *
 * @author elias
 */





import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private Semaforo semaforo1;
    private Semaforo semaforo2;
    private Timer timer;
    private int state;
    private int counter;

    public Main() {
        semaforo1 = new Semaforo();
        semaforo2 = new Semaforo();
        setTitle("Semáforo de Elias");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2));
        add(semaforo1);
        add(semaforo2);

        state = 0;
        counter = 0;
        iniciarSemaforos();

        setVisible(true);
    }

    private void iniciarSemaforos() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (state) {
                    case 0: // Semáforo 1 vermelho, Semáforo 2 verde
                        semaforo1.setLuz("vermelho");
                        semaforo1.setTempo(7 - counter);
                        semaforo2.setLuz("verde");
                        semaforo2.setTempo(4 - counter);
                        if (counter == 4) {
                            state = 1;
                            counter = 0;
                        }
                        break;
                    case 1: // Semáforo 2 amarelo
                        semaforo1.setLuz("vermelho");
                        semaforo1.setTempo(3 - counter);
                        semaforo2.setLuz("amarelo");
                        semaforo2.setTempo(3 - counter);
                        if (counter == 3) {
                            state = 2;
                            counter = 0;
                        }
                        break;
                    case 2: // Semáforo 1 verde, Semáforo 2 vermelho
                        semaforo1.setLuz("verde");
                        semaforo1.setTempo(4 - counter);
                        semaforo2.setLuz("vermelho");
                        semaforo2.setTempo(7 - counter);
                        if (counter == 4) {
                            state = 3;
                            counter = 0;
                        }
                        break;
                    case 3: // Semáforo 1 amarelo
                        semaforo1.setLuz("amarelo");
                        semaforo1.setTempo(3 - counter);
                        semaforo2.setLuz("vermelho");
                        semaforo2.setTempo(3 - counter);
                        if (counter == 3) {
                            state = 0;
                            counter = 0;
                        }
                        break;
                }
                counter++;
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        // Cria a interface na thread de eventos do Swing
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}
















//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Main extends JFrame {
//    private Semaforo semaforo1;
//    private Semaforo semaforo2;
//    private Timer timer;
//    private int state;
//    private int counter;
//
//    public Main() {
//        semaforo1 = new Semaforo();
//        semaforo2 = new Semaforo();
//        setTitle("Aplicação Semáforo");
//        setSize(600, 350); // Ajuste o tamanho da janela
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(new GridLayout(1, 2));
//        add(semaforo1);
//        add(semaforo2);
//
//        state = 0;
//        counter = 0;
//        iniciarSemaforos();
//
//        setVisible(true);
//    }
//
//    private void iniciarSemaforos() {
//        timer = new Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                switch (state) {
//                    case 0: // Semáforo 1 vermelho, Semáforo 2 verde
//                        semaforo1.setLuz("vermelho");
//                        semaforo1.setTempo(7 - counter);
//                        semaforo2.setLuz("verde");
//                        semaforo2.setTempo(4 - counter);
//                        if (counter == 4) {
//                            state = 1;
//                            counter = 0;
//                        }
//                        break;
//                    case 1: // Semáforo 2 amarelo
//                        semaforo1.setLuz("vermelho");
//                        semaforo1.setTempo(3 - counter);
//                        semaforo2.setLuz("amarelo");
//                        semaforo2.setTempo(3 - counter);
//                        if (counter == 3) {
//                            state = 2;
//                            counter = 0;
//                        }
//                        break;
//                    case 2: // Semáforo 1 verde, Semáforo 2 vermelho
//                        semaforo1.setLuz("verde");
//                        semaforo1.setTempo(4 - counter);
//                        semaforo2.setLuz("vermelho");
//                        semaforo2.setTempo(7 - counter);
//                        if (counter == 4) {
//                            state = 3;
//                            counter = 0;
//                        }
//                        break;
//                    case 3: // Semáforo 1 amarelo
//                        semaforo1.setLuz("amarelo");
//                        semaforo1.setTempo(3 - counter);
//                        semaforo2.setLuz("vermelho");
//                        semaforo2.setTempo(3 - counter);
//                        if (counter == 3) {
//                            state = 0;
//                            counter = 0;
//                        }
//                        break;
//                }
//                counter++;
//            }
//        });
//        timer.start();
//    }
//
//    public static void main(String[] args) {
//        // Cria a interface na thread de eventos do Swing
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                new Main();
//            }
//        });
//    }
//}
//
//
