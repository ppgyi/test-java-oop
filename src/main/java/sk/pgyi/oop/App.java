package sk.pgyi.oop;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args){
        // oknove aplikacie
        // obyc okno:
        var okno = new JFrame();
        // nastavenie viditelnosti, je to treba
        okno.setVisible(true);
        // nastavenie velkosti
        okno.setSize(300,300);

        // Vytvorime panel, do ktoreho mozeme dat label aby to bolo usporiadane
        var panel = new JPanel();
        okno.add(panel);
        panel.setBackground(Color.CYAN);

        // Layout (cez google vyhladat ake existuju)
        // Mozeme dat aj jeden layout do druheho
        var panelLayout = new GridLayout(4,4);
        panel.setLayout(panelLayout);

        // Komponenty su vsetko, a potom su kontajnery, co su specialne
        // komponenty, ktore mozu obsahovat ine komponenty!
        var label = new JLabel("Hello world");
        panel.add(label);

        for (int i = 0; i < 15; i++){
            panel.add(new JLabel(""+i));
        }

        // === Pridat CANVAS ===
//        okno.add(new MyCanvas());

        // === TLACIDLA ===
//        var button = new JButton("CLICK");
//        okno.add(button);

        // reakcia na udalost
//        button.addActionListener(new Action());
    }
}
