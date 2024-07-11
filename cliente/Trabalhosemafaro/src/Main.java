/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elias
 */


import javax.swing.*;

public class Main extends JFrame {

    public Main() {
        // Configurações básicas do JFrame
        setTitle("Aplicação Semáforo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Adiciona um botão simples para teste
        JButton testButton = new JButton("Testar Interface");
        add(testButton);

        // Torna o JFrame visível
        setVisible(true);
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
