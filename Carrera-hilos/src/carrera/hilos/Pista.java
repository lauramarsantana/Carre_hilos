package carrera.hilos;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Laurix
 */
public class Pista extends JFrame{
    
    JLabel auto1, auto2, auto3, pistaFondo, auto1_pos, auto2_pos,auto3_pos;
    JButton botonIniciarCarrera;
    
    public Pista(){
        super("Carrera F1");
        
        auto1 = new JLabel();
        auto2 = new JLabel();
        auto3 = new JLabel();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        Image imagen_auto1 = new ImageIcon("src/img/auto1.png").getImage();
        ImageIcon Icon_auto1 = new ImageIcon(imagen_auto1.getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        auto1 = new JLabel();
        auto1.setIcon(Icon_auto1);
        auto1.setBounds(50,50, 100, 100);
        
        Image imagen_auto2 = new ImageIcon("src/img/auto2.png").getImage();
        ImageIcon Icon_auto2 = new ImageIcon(imagen_auto2.getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        auto2 = new JLabel();
        auto2.setIcon(Icon_auto2);
        auto2.setBounds(50,100, 50, 50);
        
        Image imagen_auto3 = new ImageIcon("src/img/auto3.png").getImage();
        ImageIcon Icon_auto3 = new ImageIcon(imagen_auto3.getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        auto3 = new JLabel();
        auto3.setIcon(Icon_auto3);
        auto3.setBounds(50,150, 50, 50);
        
        auto1_pos = new JLabel();
        auto1_pos.setBounds(50, 50, 350, 50);
        
        auto2_pos = new JLabel();
        auto2_pos.setBounds(50, 100, 350, 50);
        
        auto3_pos = new JLabel();
        auto3_pos.setBounds(50, 150, 350, 50);
        
        botonIniciarCarrera =  new  JButton("Iniciar Carrera");
        botonIniciarCarrera.setBounds(150, 200, 150, 50);
        
        botonIniciarCarrera.addActionListener((ActionEvent e) -> {
            Carro1 tauto1 = new Carro1("Auto1", auto1, auto1_pos);
            Carro1 tauto2 = new Carro1("Auto2", auto2, auto2_pos);
            Carro1 tauto3 = new Carro1("Auto3", auto2, auto2_pos);
        });
        
        
        panel.add(auto1);
        panel.add(auto1_pos);
        panel.add(auto2);
        panel.add(auto2_pos);
        panel.add(auto3);
        panel.add(auto3_pos);
        panel.add(botonIniciarCarrera);
        
        add(panel);
        
        
    }
}
