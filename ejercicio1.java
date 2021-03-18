
import java.awt.*;
import java.awt.event.*;

public class ejercicio1 extends Frame {
    // constructor para ventana
    private static final long serialVersionUID = 1L;

    public ejercicio1() {
        this.setSize(300, 300);
        this.setVisible(true);

    }

    // clase main principal
    public static void main(String[] args) {

        ejercicio1 ventana = new ejercicio1();
        ventana.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);

            }
        });

    }
}
