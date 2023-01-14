import javax.swing.*;
import java.awt.*;

public class Main extends JComponent {
    static int winW = 800;
    static int winH = 600;
    static int texW = 50;
    static int texH = 50;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Текстуры");
        frame.setLocation(284,134);
        frame.setSize(winW, winH);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        Main main = new Main();
        frame.add(main);
        frame.setVisible(true);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Image texture = new ImageIcon("src/текстура.jpg").getImage();
        int a = winW/texW;
        int b = winH/texH;
        
        for (int i = 0; i < a; i++)
            for (int j = 0; j <b; j++)
                g2d.drawImage(texture, i*texW, j*texH, null);
    }



}
