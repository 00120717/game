/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinballprueba;

import Imagenes.ImagenL;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Oscar Lovato
 */
public class loading extends JPanel{
    public void paintComponent(Graphics g){
		super.paintComponent(g);
                try{
                //Dibujar imagenes
		ImagenL img= new ImagenL();
                img.paint(g);
                
                }catch(Exception e) {
                    e.printStackTrace();
                }  
    }
}
