/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinballprueba;

import static java.awt.image.ImageObserver.ABORT;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class main
{
public static void main(String[] args)
{

JFrame frame = new JFrame();
JFrame frame2 = new JFrame();


frame.setSize(800,650);
frame.setResizable(false);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


PinballPrueba panel = new PinballPrueba();
loading load=new loading();
   
frame2.add(load);
frame.add(panel);

frame2.setSize(800,650);
for (int i=0;i<2;i++){
    frame2.setVisible(true);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException ex) {
        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
    }
}
frame2.setVisible(false);
  while(panel.getLives()>0){
      frame.setVisible(true);
 
  }
  if(panel.getLives()==0){
		System.exit(ABORT);
  }
    }
}