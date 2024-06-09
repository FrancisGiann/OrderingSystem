package com.mycompany.orderingsystem;
import com.formdev.flatlaf.FlatDarculaLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author franc
 */
public class OrderingSystem {

    public static void main(String[] args) {
        try {
            
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(OrderingSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        LoadingScreen splash = new LoadingScreen();
        splash.setVisible(true);
        try{
           for (int i = 0; i <=400; i++){
               Thread.sleep(10); 
               LoadingScreen.loading.setValue(i);
               if(i==400){
                   menu m = new menu();
                   splash.dispose();
                   m.setVisible(true);
                   
               }
           }
        }catch(InterruptedException ie){
            JOptionPane.showMessageDialog(null, "An error occurred: " + ie.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
