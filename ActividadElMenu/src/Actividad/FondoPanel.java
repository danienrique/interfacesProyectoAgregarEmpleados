package Actividad;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FondoPanel extends JPanel {

    private Image imagen;

    public FondoPanel(String rutaImagen) {
        this.imagen = new ImageIcon(rutaImagen).getImage();
    }

    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibujar imagen ajustada al tamaño del panel
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
    }
    
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo Fondo");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FondoPanel fondo = new FondoPanel("gato.jpg");

        ventana.setContentPane(fondo);
        ventana.setSize(600, 400);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
