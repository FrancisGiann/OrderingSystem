package com.mycompany.orderingsystem;
import com.formdev.flatlaf.FlatDarculaLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

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
           for (int i = 0; i <=500; i++){
               Thread.sleep(10); 
               LoadingScreen.loading.setValue(i);
               if(i==500){
                   menu m = new menu();
                   splash.dispose();
                   m.setVisible(true);
                   
               }
           }
        }catch(Exception e){
            
        }
        
    }
}
