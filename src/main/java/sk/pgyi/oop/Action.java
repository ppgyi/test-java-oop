package sk.pgyi.oop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello");
    }
}
