package Imagenes;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Marvin Ramirez
 */
public class ImagenL extends javax.swing.JPanel{
    public ImagenL() {
    this.setSize(300, 400); //se selecciona el tamaño del panel
    }

    //Se crea un método cuyo parámetro debe ser un objeto Graphics

    public void paint(Graphics grafico) {

    //Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
    ImageIcon fond = new ImageIcon(getClass().getResource("madera.png")); 
    ImageIcon Img9 = new ImageIcon(getClass().getResource("barra.png"));
    ImageIcon Img10 = new ImageIcon(getClass().getResource("logo.png"));
    ImageIcon Img = new ImageIcon(getClass().getResource("loader.gif"));
    //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
    
    grafico.drawImage(fond.getImage(), 615, 0, 700, 650, null);
    grafico.drawImage(Img9.getImage(), 600, 0, 20, 800, null);
    grafico.drawImage(Img10.getImage(), 550, 0, 300, 230, null);
    grafico.drawImage(Img.getImage(), 200, 200, 300, 230, null);
    
    
    setOpaque(false);
    super.paintComponent(grafico);
    }

}

