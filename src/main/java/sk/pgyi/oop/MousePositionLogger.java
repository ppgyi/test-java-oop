package sk.pgyi.oop;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MousePositionLogger extends MouseAdapter {

    // Mozeme pouzit implements MouseListener (pocuva na kliky) - ale ten
    // pouziva mnozstvo metod ktore musime implementovat aj ked ich nevyuzijeme.
    // Preto existuju aj adaptery (ako napr. MouseAdapter) a tam staci override
    // metodu ktoru potrebujeme / chceme! MouseAdapter omplementuje aj
    // MouseListrener aj MouseWheelListener aj MouseMotionListener.

    // Toto mi vypise poziciu ked kliknem mysou:
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getPoint().toString());
    }
}
