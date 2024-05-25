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
        
        menu m = new menu();
        m.setVisible(true);
    }
}
