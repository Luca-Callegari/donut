import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;


public class Point extends JFrame {

    private JPanel sfondo;
    private JPanel pannello;
    private int w = 1920;
    private int h = 800;

    class punto extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.translate(getWidth() / 2 - 50, getHeight() / 2 - 50);

            for (int a = 1; a < 361; a++) {
                double x = Math.cos(a*Math.PI/180) * 100;
                double y = Math.sin(a*Math.PI/180)*100;
                g2.setColor(Color.WHITE);
                Ellipse2D.Double e = new Ellipse2D.Double(x, y, 100, 100);
                g2.draw(e);
            }

        }
    }

    public Point() {
        finestra();
        pannello();
    }


    public void finestra() {
        super.setTitle("Finestra");
        super.setLocation(0, 0);
        super.setSize(this.w, this.h);
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        super.setVisible(true);
    }

    public void pannello() {
        this.pannello = new punto();
        this.pannello.setLocation(0, 0);
        this.pannello.setSize(this.w, this.h);
        this.pannello.setLayout(null);
        this.pannello.setBackground(Color.BLACK);
        super.setContentPane(this.pannello);
    }

}
