package sk.pgyi.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Okno extends JFrame {

    public Okno() throws HeadlessException {
        super();
        this.setVisible(true);
        this.setSize(300,300);

        // ked sa okno zavrie tak mi to vypne aplikaciu:
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Spustenie MouseListener - Vlastna trieda
        this.addMouseListener(new MousePositionLogger());

        // Alebo takto rovno tu: (je to anonymna trieda - neodporuca sa robit)
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getPoint().toString());
            }
        });
    }
}
