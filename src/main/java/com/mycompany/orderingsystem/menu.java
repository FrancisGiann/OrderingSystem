package com.mycompany.orderingsystem;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Graphics;

/**
 *
 * @author franc
 */
public class menu extends javax.swing.JFrame {
    private boolean isDarkMode = true;
    private int x = 0;
    private double Total = 0.0;
    public menu() {
        initComponents();
        init();
    }
    public void init(){
        setImage();
    }
    public boolean qtyIsZero(int qty){
        if(qty == 0){
            JOptionPane.showMessageDialog(null, "Quantitiy can't be zero (0)");
            return false;
        }
        return true;
    }
    public void Cafefe(){
        jTA_Receipt.setText("-------------------------GIANNIS CAFE-----------------------\n"+"Item Name:\t\t\t"+"Price: \n\n");
        
    }
    public void Total(){
        jTF_Total.setText("₱"+String.valueOf(Total));
        
    }
    public void setImage() {
        ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("Image/MatchaLatte.jpg"));
        ImageIcon icon2 = new ImageIcon(getClass().getClassLoader().getResource("Image/Capuccino.jpg"));
        ImageIcon icon3 = new ImageIcon(getClass().getClassLoader().getResource("Image/HotChoco.jpg"));
        ImageIcon icon4 = new ImageIcon(getClass().getClassLoader().getResource("Image/Americano.jpg"));
        ImageIcon icon5 = new ImageIcon(getClass().getClassLoader().getResource("Image/CaffeLatte.jpg"));
        ImageIcon icon6 = new ImageIcon(getClass().getClassLoader().getResource("Image/WhiteMocha.jpg"));
        ImageIcon icon7 = new ImageIcon(getClass().getClassLoader().getResource("Image/SpanishLatte.jpg"));
        ImageIcon icon8 = new ImageIcon(getClass().getClassLoader().getResource("Image/Espresso.jpg"));
              
        Image img1 = icon1.getImage().getScaledInstance(196, 137, Image.SCALE_SMOOTH);
        Image img2 = icon2.getImage().getScaledInstance(196, 137, Image.SCALE_SMOOTH);
        Image img3 = icon3.getImage().getScaledInstance(196, 137, Image.SCALE_SMOOTH);
        Image img4 = icon4.getImage().getScaledInstance(196, 137, Image.SCALE_SMOOTH);
        Image img5 = icon5.getImage().getScaledInstance(196, 137, Image.SCALE_SMOOTH);
        Image img6 = icon6.getImage().getScaledInstance(196, 137, Image.SCALE_SMOOTH);
        Image img7 = icon7.getImage().getScaledInstance(196, 137, Image.SCALE_SMOOTH);
        Image img8 = icon8.getImage().getScaledInstance(196, 137, Image.SCALE_SMOOTH);
        
        jL_ItemImage1.setIcon(new ImageIcon(img1));
        jL_ItemImage2.setIcon(new ImageIcon(img2));
        jL_ItemImage3.setIcon(new ImageIcon(img3));
        jL_ItemImage4.setIcon(new ImageIcon(img4));
        jL_ItemImage5.setIcon(new ImageIcon(img5));
        jL_ItemImage7.setIcon(new ImageIcon(img6));
        jL_ItemImage8.setIcon(new ImageIcon(img7));
        jL_ItemImage9.setIcon(new ImageIcon(img8));
        
        ImageIcon icon9 = new ImageIcon(getClass().getClassLoader().getResource("Image/Croissant.jpg"));
        ImageIcon icon10 = new ImageIcon(getClass().getClassLoader().getResource("Image/Cookie.jpg"));
        ImageIcon icon11 = new ImageIcon(getClass().getClassLoader().getResource("Image/CupCake.png"));
        ImageIcon icon12 = new ImageIcon(getClass().getClassLoader().getResource("Image/Donut.jpg"));
        ImageIcon icon13 = new ImageIcon(getClass().getClassLoader().getResource("Image/CinnamonRoll.jpg"));
        ImageIcon icon14 = new ImageIcon(getClass().getClassLoader().getResource("Image/Muffin.png"));
        ImageIcon icon15 = new ImageIcon(getClass().getClassLoader().getResource("Image/Waffle.jpg"));
        ImageIcon icon16 = new ImageIcon(getClass().getClassLoader().getResource("Image/Brownie.jpg"));
           
        Image img9 = icon9.getImage().getScaledInstance(196, 160, Image.SCALE_SMOOTH);
        Image img10 = icon10.getImage().getScaledInstance(196, 160, Image.SCALE_SMOOTH);
        Image img11 = icon11.getImage().getScaledInstance(196, 160, Image.SCALE_SMOOTH);
        Image img12 = icon12.getImage().getScaledInstance(196, 160, Image.SCALE_SMOOTH);
        Image img13 = icon13.getImage().getScaledInstance(196, 160, Image.SCALE_SMOOTH);
        Image img14 = icon14.getImage().getScaledInstance(196, 160, Image.SCALE_SMOOTH);
        Image img15 = icon15.getImage().getScaledInstance(196, 160, Image.SCALE_SMOOTH);
        Image img16 = icon16.getImage().getScaledInstance(196, 160, Image.SCALE_SMOOTH);
        
        jL_DessertImage1.setIcon(new ImageIcon(img9));
        jL_DessertImage2.setIcon(new ImageIcon(img10));
        jL_DessertImage3.setIcon(new ImageIcon(img11));
        jL_DessertImage4.setIcon(new ImageIcon(img12));
        jL_DessertImage5.setIcon(new ImageIcon(img13));
        jL_DessertImage6.setIcon(new ImageIcon(img14));
        jL_DessertImage7.setIcon(new ImageIcon(img15));
        jL_DessertImage8.setIcon(new ImageIcon(img16));
       
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_Receipt = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jB_Purchase = new javax.swing.JButton();
        jB_Receipt = new javax.swing.JButton();
        jB_Exit = new javax.swing.JButton();
        jB_Reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTA_Receipt = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTF_Total = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jL_Header = new javax.swing.JLabel();
        jB_mode1 = new javax.swing.JToggleButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jp_MainMenu = new javax.swing.JPanel();
        jP_Item1 = new javax.swing.JPanel();
        jL_ItemImage1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jL_ItemName1 = new javax.swing.JLabel();
        jL_ItemPrice1 = new javax.swing.JLabel();
        jCB_ItemSize1 = new javax.swing.JComboBox<>();
        jS_ItemQuantity1 = new javax.swing.JSpinner();
        jLabel27 = new javax.swing.JLabel();
        jP_Item2 = new javax.swing.JPanel();
        jL_ItemImage2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jL_ItemName2 = new javax.swing.JLabel();
        jL_ItemPrice2 = new javax.swing.JLabel();
        jCB_ItemSize2 = new javax.swing.JComboBox<>();
        jS_ItemQuantity2 = new javax.swing.JSpinner();
        jP_Item3 = new javax.swing.JPanel();
        jL_ItemImage3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jL_ItemName3 = new javax.swing.JLabel();
        jL_ItemPrice3 = new javax.swing.JLabel();
        jS_ItemQuantity3 = new javax.swing.JSpinner();
        jCB_ItemSize3 = new javax.swing.JComboBox<>();
        jP_Item4 = new javax.swing.JPanel();
        jL_ItemImage4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jL_ItemName4 = new javax.swing.JLabel();
        jL_ItemPrice4 = new javax.swing.JLabel();
        jS_ItemQuantity4 = new javax.swing.JSpinner();
        jCB_ItemSize4 = new javax.swing.JComboBox<>();
        jP_Item7 = new javax.swing.JPanel();
        jL_ItemImage7 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jL_ItemName6 = new javax.swing.JLabel();
        jL_ItemPrice6 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jCB_ItemSize6 = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        jS_ItemQuantity6 = new javax.swing.JSpinner();
        jP_Item8 = new javax.swing.JPanel();
        jL_ItemImage8 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jL_ItemName7 = new javax.swing.JLabel();
        jL_ItemPrice7 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jS_ItemQuantity7 = new javax.swing.JSpinner();
        jCB_ItemSize7 = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        jP_Item9 = new javax.swing.JPanel();
        jL_ItemImage9 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jL_ItemName8 = new javax.swing.JLabel();
        jL_ItemPrice8 = new javax.swing.JLabel();
        jS_ItemQuantity8 = new javax.swing.JSpinner();
        jCB_ItemSize8 = new javax.swing.JComboBox<>();
        jP_Item5 = new javax.swing.JPanel();
        jL_ItemImage5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jL_ItemName5 = new javax.swing.JLabel();
        jL_ItemPrice5 = new javax.swing.JLabel();
        jCB_ItemSize5 = new javax.swing.JComboBox<>();
        jS_ItemQuantity5 = new javax.swing.JSpinner();
        jLabel32 = new javax.swing.JLabel();
        jB_BuyItem1 = new javax.swing.JButton();
        jB_BuyItem2 = new javax.swing.JButton();
        jB_BuyItem3 = new javax.swing.JButton();
        jB_BuyItem4 = new javax.swing.JButton();
        jB_BuyItem5 = new javax.swing.JButton();
        jB_BuyItem6 = new javax.swing.JButton();
        jB_BuyItem7 = new javax.swing.JButton();
        jB_BuyItem8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jP_Item12 = new javax.swing.JPanel();
        jL_DessertImage1 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jL_DessertName1 = new javax.swing.JLabel();
        jL_ItemPrice12 = new javax.swing.JLabel();
        jS_DessertQuantity1 = new javax.swing.JSpinner();
        jLabel41 = new javax.swing.JLabel();
        jB_BuyDessert1 = new javax.swing.JButton();
        jP_Item13 = new javax.swing.JPanel();
        jL_DessertImage5 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jL_DessertName5 = new javax.swing.JLabel();
        jL_ItemPrice13 = new javax.swing.JLabel();
        jS_DessertQuantity5 = new javax.swing.JSpinner();
        jLabel47 = new javax.swing.JLabel();
        jB_BuyDessert5 = new javax.swing.JButton();
        jP_Item14 = new javax.swing.JPanel();
        jL_DessertImage6 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jL_DessertName6 = new javax.swing.JLabel();
        jL_ItemPrice14 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jS_DessertQuantity6 = new javax.swing.JSpinner();
        jB_BuyDessert2 = new javax.swing.JButton();
        jP_Item15 = new javax.swing.JPanel();
        jL_DessertImage2 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jL_DessertName2 = new javax.swing.JLabel();
        jL_ItemPrice15 = new javax.swing.JLabel();
        jS_DessertQuantity2 = new javax.swing.JSpinner();
        jB_BuyDessert6 = new javax.swing.JButton();
        jP_Item16 = new javax.swing.JPanel();
        jL_DessertImage3 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jL_DessertName3 = new javax.swing.JLabel();
        jL_ItemPrice16 = new javax.swing.JLabel();
        jS_DessertQuantity3 = new javax.swing.JSpinner();
        jB_BuyDessert3 = new javax.swing.JButton();
        jP_Item17 = new javax.swing.JPanel();
        jL_DessertImage4 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jL_DessertName4 = new javax.swing.JLabel();
        jL_ItemPrice17 = new javax.swing.JLabel();
        jS_DessertQuantity4 = new javax.swing.JSpinner();
        jB_BuyDessert4 = new javax.swing.JButton();
        jP_Item18 = new javax.swing.JPanel();
        jL_DessertImage8 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jL_DessertName8 = new javax.swing.JLabel();
        jL_ItemPrice18 = new javax.swing.JLabel();
        jS_DessertQuantity8 = new javax.swing.JSpinner();
        jB_BuyDessert8 = new javax.swing.JButton();
        jP_Item19 = new javax.swing.JPanel();
        jL_DessertImage7 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jL_DessertName7 = new javax.swing.JLabel();
        jL_ItemPrice19 = new javax.swing.JLabel();
        jS_DessertQuantity7 = new javax.swing.JSpinner();
        jLabel79 = new javax.swing.JLabel();
        jB_BuyDessert7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jp_Receipt.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jB_Purchase.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        jB_Purchase.setText("Purchase");
        jB_Purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_PurchaseActionPerformed(evt);
            }
        });

        jB_Receipt.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        jB_Receipt.setText("Receipt");
        jB_Receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ReceiptActionPerformed(evt);
            }
        });

        jB_Exit.setBackground(new java.awt.Color(255, 51, 51));
        jB_Exit.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        jB_Exit.setText("Exit");
        jB_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ExitActionPerformed(evt);
            }
        });

        jB_Reset.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        jB_Reset.setText("Reset");
        jB_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ResetActionPerformed(evt);
            }
        });

        jTA_Receipt.setEditable(false);
        jTA_Receipt.setColumns(20);
        jTA_Receipt.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jTA_Receipt.setRows(5);
        jTA_Receipt.setToolTipText("");
        jScrollPane1.setViewportView(jTA_Receipt);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel1.setText("TOTAL:");

        jTF_Total.setEditable(false);
        jTF_Total.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jTF_Total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTF_Total.setText("₱0.0");

        javax.swing.GroupLayout jp_ReceiptLayout = new javax.swing.GroupLayout(jp_Receipt);
        jp_Receipt.setLayout(jp_ReceiptLayout);
        jp_ReceiptLayout.setHorizontalGroup(
            jp_ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jp_ReceiptLayout.createSequentialGroup()
                .addGroup(jp_ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_ReceiptLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jp_ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_ReceiptLayout.createSequentialGroup()
                                .addComponent(jB_Receipt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jB_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_ReceiptLayout.createSequentialGroup()
                                .addComponent(jB_Purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jB_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jp_ReceiptLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addGap(60, 60, 60)
                        .addComponent(jTF_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jp_ReceiptLayout.setVerticalGroup(
            jp_ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_ReceiptLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTF_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jp_ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Receipt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jL_Header.setFont(new java.awt.Font("Maiandra GD", 1, 36)); // NOI18N
        jL_Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_Header.setText("GIANNIS CAFE");

        jB_mode1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/night-mode.png"))); // NOI18N
        jB_mode1.setToolTipText("");
        jB_mode1.setBorderPainted(false);
        jB_mode1.setContentAreaFilled(false);
        jB_mode1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jB_mode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_mode1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jB_mode1)
                .addGap(264, 264, 264)
                .addComponent(jL_Header, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_Header)
                    .addComponent(jB_mode1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jp_MainMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jP_Item1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jP_Item1.setPreferredSize(new java.awt.Dimension(180, 220));

        jL_ItemImage1.setMinimumSize(new java.awt.Dimension(176, 96));
        jL_ItemImage1.setName(""); // NOI18N
        jL_ItemImage1.setOpaque(true);
        jL_ItemImage1.setPreferredSize(new java.awt.Dimension(176, 96));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel4.setText("Price:");

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel8.setText("Size:");

        jL_ItemName1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jL_ItemName1.setText("Matcha Latte");

        jL_ItemPrice1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jL_ItemPrice1.setText("₱110");

        jCB_ItemSize1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));
        jCB_ItemSize1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_ItemSize1ActionPerformed(evt);
            }
        });

        jS_ItemQuantity1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel27.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel27.setText("Quantity");

        javax.swing.GroupLayout jP_Item1Layout = new javax.swing.GroupLayout(jP_Item1);
        jP_Item1.setLayout(jP_Item1Layout);
        jP_Item1Layout.setHorizontalGroup(
            jP_Item1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_Item1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jP_Item1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jS_ItemQuantity1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB_ItemSize1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item1Layout.createSequentialGroup()
                        .addComponent(jL_ItemPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addContainerGap())
            .addComponent(jL_ItemImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
            .addGroup(jP_Item1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jL_ItemName1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP_Item1Layout.setVerticalGroup(
            jP_Item1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item1Layout.createSequentialGroup()
                .addComponent(jL_ItemImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_ItemName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jL_ItemPrice1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jCB_ItemSize1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jS_ItemQuantity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jp_MainMenu.add(jP_Item1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 200, 260));

        jP_Item2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jP_Item2.setPreferredSize(new java.awt.Dimension(180, 220));

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel10.setText("Price:");

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel11.setText("Size:");

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel12.setText("Quantity");

        jL_ItemName2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jL_ItemName2.setText("Capuccino");

        jL_ItemPrice2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jL_ItemPrice2.setText("₱115");

        jCB_ItemSize2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));
        jCB_ItemSize2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_ItemSize2ActionPerformed(evt);
            }
        });

        jS_ItemQuantity2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jP_Item2Layout = new javax.swing.GroupLayout(jP_Item2);
        jP_Item2.setLayout(jP_Item2Layout);
        jP_Item2Layout.setHorizontalGroup(
            jP_Item2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_Item2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jP_Item2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item2Layout.createSequentialGroup()
                        .addComponent(jCB_ItemSize2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item2Layout.createSequentialGroup()
                        .addComponent(jS_ItemQuantity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item2Layout.createSequentialGroup()
                        .addComponent(jL_ItemPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
            .addComponent(jL_ItemImage2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP_Item2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jL_ItemName2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jP_Item2Layout.setVerticalGroup(
            jP_Item2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item2Layout.createSequentialGroup()
                .addComponent(jL_ItemImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_ItemName2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jL_ItemPrice2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jCB_ItemSize2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jS_ItemQuantity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jp_MainMenu.add(jP_Item2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 200, 260));

        jP_Item3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jP_Item3.setPreferredSize(new java.awt.Dimension(180, 220));

        jLabel16.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel16.setText("Price:");

        jLabel17.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel17.setText("Size:");

        jLabel18.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel18.setText("Quantity: ");

        jL_ItemName3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jL_ItemName3.setText("Hot Choco");

        jL_ItemPrice3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jL_ItemPrice3.setText("₱110");

        jS_ItemQuantity3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jCB_ItemSize3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));
        jCB_ItemSize3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_ItemSize3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_Item3Layout = new javax.swing.GroupLayout(jP_Item3);
        jP_Item3.setLayout(jP_Item3Layout);
        jP_Item3Layout.setHorizontalGroup(
            jP_Item3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jL_ItemImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP_Item3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_Item3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jP_Item3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item3Layout.createSequentialGroup()
                        .addComponent(jCB_ItemSize3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item3Layout.createSequentialGroup()
                        .addComponent(jS_ItemQuantity3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item3Layout.createSequentialGroup()
                        .addComponent(jL_ItemPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
            .addGroup(jP_Item3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jL_ItemName3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jP_Item3Layout.setVerticalGroup(
            jP_Item3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item3Layout.createSequentialGroup()
                .addComponent(jL_ItemImage3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_ItemName3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jL_ItemPrice3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jCB_ItemSize3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jS_ItemQuantity3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jp_MainMenu.add(jP_Item3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 200, 260));

        jP_Item4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jP_Item4.setPreferredSize(new java.awt.Dimension(180, 220));

        jLabel22.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel22.setText("Price:");

        jLabel23.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel23.setText("Size:");

        jLabel24.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel24.setText("Quantity:");

        jL_ItemName4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jL_ItemName4.setText("Americano");

        jL_ItemPrice4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jL_ItemPrice4.setText("₱100");

        jS_ItemQuantity4.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jCB_ItemSize4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));
        jCB_ItemSize4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_ItemSize4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_Item4Layout = new javax.swing.GroupLayout(jP_Item4);
        jP_Item4.setLayout(jP_Item4Layout);
        jP_Item4Layout.setHorizontalGroup(
            jP_Item4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jL_ItemImage4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP_Item4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_Item4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jP_Item4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item4Layout.createSequentialGroup()
                        .addComponent(jCB_ItemSize4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item4Layout.createSequentialGroup()
                        .addComponent(jS_ItemQuantity4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item4Layout.createSequentialGroup()
                        .addComponent(jL_ItemPrice4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
            .addGroup(jP_Item4Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jL_ItemName4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jP_Item4Layout.setVerticalGroup(
            jP_Item4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item4Layout.createSequentialGroup()
                .addComponent(jL_ItemImage4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_ItemName4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jL_ItemPrice4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jCB_ItemSize4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jS_ItemQuantity4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jp_MainMenu.add(jP_Item4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 200, 260));

        jP_Item7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jP_Item7.setPreferredSize(new java.awt.Dimension(180, 220));

        jLabel40.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel40.setText("Price:");

        jL_ItemName6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jL_ItemName6.setText("White Mocha");

        jL_ItemPrice6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jL_ItemPrice6.setText("₱120");

        jLabel59.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel59.setText("Size: ");

        jCB_ItemSize6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));
        jCB_ItemSize6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_ItemSize6ActionPerformed(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel60.setText("Quantity: ");

        jS_ItemQuantity6.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jP_Item7Layout = new javax.swing.GroupLayout(jP_Item7);
        jP_Item7.setLayout(jP_Item7Layout);
        jP_Item7Layout.setHorizontalGroup(
            jP_Item7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_Item7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_Item7Layout.createSequentialGroup()
                        .addGroup(jP_Item7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59)
                            .addComponent(jLabel60))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jP_Item7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCB_ItemSize6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jS_ItemQuantity6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jP_Item7Layout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jL_ItemPrice6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
            .addComponent(jL_ItemImage7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP_Item7Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jL_ItemName6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jP_Item7Layout.setVerticalGroup(
            jP_Item7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item7Layout.createSequentialGroup()
                .addComponent(jL_ItemImage7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_ItemName6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jL_ItemPrice6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jCB_ItemSize6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jP_Item7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jS_ItemQuantity6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        jp_MainMenu.add(jP_Item7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 200, 260));

        jP_Item8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jP_Item8.setPreferredSize(new java.awt.Dimension(180, 220));

        jLabel46.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel46.setText("Price:");

        jL_ItemName7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jL_ItemName7.setText("Spanish Latte");

        jL_ItemPrice7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jL_ItemPrice7.setText("₱110");

        jLabel57.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel57.setText("Size: ");

        jS_ItemQuantity7.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jCB_ItemSize7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));
        jCB_ItemSize7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_ItemSize7ActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel58.setText("Quantity: ");

        javax.swing.GroupLayout jP_Item8Layout = new javax.swing.GroupLayout(jP_Item8);
        jP_Item8.setLayout(jP_Item8Layout);
        jP_Item8Layout.setHorizontalGroup(
            jP_Item8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_Item8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jP_Item8Layout.createSequentialGroup()
                        .addGroup(jP_Item8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57)
                            .addComponent(jLabel58))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jP_Item8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCB_ItemSize7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jS_ItemQuantity7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jP_Item8Layout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jL_ItemPrice7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
            .addComponent(jL_ItemImage8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jL_ItemName7)
                .addGap(49, 49, 49))
        );
        jP_Item8Layout.setVerticalGroup(
            jP_Item8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item8Layout.createSequentialGroup()
                .addComponent(jL_ItemImage8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_ItemName7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jL_ItemPrice7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jCB_ItemSize7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jP_Item8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jS_ItemQuantity7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        jp_MainMenu.add(jP_Item8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 200, 260));

        jP_Item9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jP_Item9.setPreferredSize(new java.awt.Dimension(180, 220));

        jLabel52.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel52.setText("Price:");

        jLabel53.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel53.setText("Size: ");

        jLabel54.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel54.setText("Quantity: ");

        jL_ItemName8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jL_ItemName8.setText("Espresso");

        jL_ItemPrice8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jL_ItemPrice8.setText("₱115");

        jS_ItemQuantity8.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jCB_ItemSize8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));
        jCB_ItemSize8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_ItemSize8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_Item9Layout = new javax.swing.GroupLayout(jP_Item9);
        jP_Item9.setLayout(jP_Item9Layout);
        jP_Item9Layout.setHorizontalGroup(
            jP_Item9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jL_ItemImage9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP_Item9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_Item9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jP_Item9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item9Layout.createSequentialGroup()
                        .addComponent(jCB_ItemSize8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item9Layout.createSequentialGroup()
                        .addComponent(jS_ItemQuantity8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item9Layout.createSequentialGroup()
                        .addComponent(jL_ItemPrice8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
            .addGroup(jP_Item9Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jL_ItemName8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jP_Item9Layout.setVerticalGroup(
            jP_Item9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item9Layout.createSequentialGroup()
                .addComponent(jL_ItemImage9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_ItemName8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jL_ItemPrice8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jCB_ItemSize8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jP_Item9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jS_ItemQuantity8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        jp_MainMenu.add(jP_Item9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 200, 260));

        jP_Item5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jP_Item5.setPreferredSize(new java.awt.Dimension(180, 220));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel6.setText("Price:");

        jLabel29.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel29.setText("Size:");

        jL_ItemName5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jL_ItemName5.setText("Caffe Latte");

        jL_ItemPrice5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jL_ItemPrice5.setText("₱110");

        jCB_ItemSize5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));
        jCB_ItemSize5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_ItemSize5ActionPerformed(evt);
            }
        });

        jS_ItemQuantity5.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel32.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel32.setText("Quantity");

        javax.swing.GroupLayout jP_Item5Layout = new javax.swing.GroupLayout(jP_Item5);
        jP_Item5.setLayout(jP_Item5Layout);
        jP_Item5Layout.setHorizontalGroup(
            jP_Item5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_Item5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jP_Item5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item5Layout.createSequentialGroup()
                        .addGroup(jP_Item5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCB_ItemSize5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jS_ItemQuantity5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item5Layout.createSequentialGroup()
                        .addComponent(jL_ItemPrice5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
            .addComponent(jL_ItemImage5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP_Item5Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jL_ItemName5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jP_Item5Layout.setVerticalGroup(
            jP_Item5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item5Layout.createSequentialGroup()
                .addComponent(jL_ItemImage5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_ItemName5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jL_ItemPrice5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jCB_ItemSize5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jS_ItemQuantity5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jp_MainMenu.add(jP_Item5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 200, 260));

        jB_BuyItem1.setBackground(new java.awt.Color(51, 204, 0));
        jB_BuyItem1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jB_BuyItem1.setForeground(new java.awt.Color(51, 51, 51));
        jB_BuyItem1.setText("Buy");
        jB_BuyItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BuyItem1ActionPerformed(evt);
            }
        });
        jp_MainMenu.add(jB_BuyItem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jB_BuyItem2.setBackground(new java.awt.Color(51, 204, 0));
        jB_BuyItem2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jB_BuyItem2.setForeground(new java.awt.Color(51, 51, 51));
        jB_BuyItem2.setText("Buy");
        jB_BuyItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BuyItem2ActionPerformed(evt);
            }
        });
        jp_MainMenu.add(jB_BuyItem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        jB_BuyItem3.setBackground(new java.awt.Color(51, 204, 0));
        jB_BuyItem3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jB_BuyItem3.setForeground(new java.awt.Color(51, 51, 51));
        jB_BuyItem3.setText("Buy");
        jB_BuyItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BuyItem3ActionPerformed(evt);
            }
        });
        jp_MainMenu.add(jB_BuyItem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        jB_BuyItem4.setBackground(new java.awt.Color(51, 204, 0));
        jB_BuyItem4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jB_BuyItem4.setForeground(new java.awt.Color(51, 51, 51));
        jB_BuyItem4.setText("Buy");
        jB_BuyItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BuyItem4ActionPerformed(evt);
            }
        });
        jp_MainMenu.add(jB_BuyItem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, -1, -1));

        jB_BuyItem5.setBackground(new java.awt.Color(51, 204, 0));
        jB_BuyItem5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jB_BuyItem5.setForeground(new java.awt.Color(51, 51, 51));
        jB_BuyItem5.setText("Buy");
        jB_BuyItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BuyItem5ActionPerformed(evt);
            }
        });
        jp_MainMenu.add(jB_BuyItem5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, -1, -1));

        jB_BuyItem6.setBackground(new java.awt.Color(51, 204, 0));
        jB_BuyItem6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jB_BuyItem6.setForeground(new java.awt.Color(51, 51, 51));
        jB_BuyItem6.setText("Buy");
        jB_BuyItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BuyItem6ActionPerformed(evt);
            }
        });
        jp_MainMenu.add(jB_BuyItem6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, -1, -1));

        jB_BuyItem7.setBackground(new java.awt.Color(51, 204, 0));
        jB_BuyItem7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jB_BuyItem7.setForeground(new java.awt.Color(51, 51, 51));
        jB_BuyItem7.setText("Buy");
        jB_BuyItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BuyItem7ActionPerformed(evt);
            }
        });
        jp_MainMenu.add(jB_BuyItem7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 620, -1, -1));

        jB_BuyItem8.setBackground(new java.awt.Color(51, 204, 0));
        jB_BuyItem8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jB_BuyItem8.setForeground(new java.awt.Color(51, 51, 51));
        jB_BuyItem8.setText("Buy");
        jB_BuyItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BuyItem8ActionPerformed(evt);
            }
        });
        jp_MainMenu.add(jB_BuyItem8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 620, -1, -1));

        jTabbedPane1.addTab("Drinks", jp_MainMenu);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jP_Item12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jP_Item12.setPreferredSize(new java.awt.Dimension(180, 220));

        jL_DessertImage1.setMinimumSize(new java.awt.Dimension(176, 96));
        jL_DessertImage1.setName(""); // NOI18N
        jL_DessertImage1.setOpaque(true);
        jL_DessertImage1.setPreferredSize(new java.awt.Dimension(176, 96));

        jLabel37.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel37.setText("Price:");

        jL_DessertName1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jL_DessertName1.setText("Croissant");

        jL_ItemPrice12.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jL_ItemPrice12.setText("₱90");

        jS_DessertQuantity1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel41.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel41.setText("Quantity");

        javax.swing.GroupLayout jP_Item12Layout = new javax.swing.GroupLayout(jP_Item12);
        jP_Item12.setLayout(jP_Item12Layout);
        jP_Item12Layout.setHorizontalGroup(
            jP_Item12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_Item12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_Item12Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jS_DessertQuantity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jP_Item12Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jL_ItemPrice12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addComponent(jL_DessertImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP_Item12Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jL_DessertName1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jP_Item12Layout.setVerticalGroup(
            jP_Item12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item12Layout.createSequentialGroup()
                .addComponent(jL_DessertImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_DessertName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jL_ItemPrice12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jS_DessertQuantity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.add(jP_Item12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 200, 260));

        jB_BuyDessert1.setBackground(new java.awt.Color(51, 204, 0));
        jB_BuyDessert1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jB_BuyDessert1.setForeground(new java.awt.Color(51, 51, 51));
        jB_BuyDessert1.setText("Buy");
        jB_BuyDessert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BuyDessert1ActionPerformed(evt);
            }
        });
        jPanel2.add(jB_BuyDessert1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jP_Item13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jP_Item13.setPreferredSize(new java.awt.Dimension(180, 220));

        jLabel43.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel43.setText("Price:");

        jL_DessertName5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jL_DessertName5.setText("Cinnamon Rolls");

        jL_ItemPrice13.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jL_ItemPrice13.setText("₱85");

        jS_DessertQuantity5.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel47.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel47.setText("Quantity");

        javax.swing.GroupLayout jP_Item13Layout = new javax.swing.GroupLayout(jP_Item13);
        jP_Item13.setLayout(jP_Item13Layout);
        jP_Item13Layout.setHorizontalGroup(
            jP_Item13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jL_DessertImage5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP_Item13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_Item13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_Item13Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jS_DessertQuantity5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jP_Item13Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jL_ItemPrice13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jL_DessertName5)
                .addGap(40, 40, 40))
        );
        jP_Item13Layout.setVerticalGroup(
            jP_Item13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item13Layout.createSequentialGroup()
                .addComponent(jL_DessertImage5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_DessertName5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_ItemPrice13)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jS_DessertQuantity5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.add(jP_Item13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 200, 260));

        jB_BuyDessert5.setBackground(new java.awt.Color(51, 204, 0));
        jB_BuyDessert5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jB_BuyDessert5.setForeground(new java.awt.Color(51, 51, 51));
        jB_BuyDessert5.setText("Buy");
        jB_BuyDessert5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BuyDessert5ActionPerformed(evt);
            }
        });
        jPanel2.add(jB_BuyDessert5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, -1, -1));

        jP_Item14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jP_Item14.setPreferredSize(new java.awt.Dimension(180, 220));

        jLabel49.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel49.setText("Price:");

        jL_DessertName6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jL_DessertName6.setText("Muffin");

        jL_ItemPrice14.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jL_ItemPrice14.setText("₱65");

        jLabel62.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel62.setText("Quantity: ");

        jS_DessertQuantity6.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jP_Item14Layout = new javax.swing.GroupLayout(jP_Item14);
        jP_Item14.setLayout(jP_Item14Layout);
        jP_Item14Layout.setHorizontalGroup(
            jP_Item14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_Item14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jP_Item14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item14Layout.createSequentialGroup()
                        .addComponent(jS_DessertQuantity6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item14Layout.createSequentialGroup()
                        .addComponent(jL_ItemPrice14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
            .addComponent(jL_DessertImage6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP_Item14Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jL_DessertName6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP_Item14Layout.setVerticalGroup(
            jP_Item14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item14Layout.createSequentialGroup()
                .addComponent(jL_DessertImage6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_DessertName6)
                .addGap(10, 10, 10)
                .addGroup(jP_Item14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_ItemPrice14)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jS_DessertQuantity6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        jPanel2.add(jP_Item14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 200, 260));

        jB_BuyDessert2.setBackground(new java.awt.Color(51, 204, 0));
        jB_BuyDessert2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jB_BuyDessert2.setForeground(new java.awt.Color(51, 51, 51));
        jB_BuyDessert2.setText("Buy");
        jB_BuyDessert2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BuyDessert2ActionPerformed(evt);
            }
        });
        jPanel2.add(jB_BuyDessert2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        jP_Item15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jP_Item15.setPreferredSize(new java.awt.Dimension(180, 220));

        jLabel55.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel55.setText("Price:");

        jLabel63.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel63.setText("Quantity");

        jL_DessertName2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jL_DessertName2.setText("Cookie");

        jL_ItemPrice15.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jL_ItemPrice15.setText("₱60");

        jS_DessertQuantity2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jP_Item15Layout = new javax.swing.GroupLayout(jP_Item15);
        jP_Item15.setLayout(jP_Item15Layout);
        jP_Item15Layout.setHorizontalGroup(
            jP_Item15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jL_DessertImage2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP_Item15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_Item15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jP_Item15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jS_DessertQuantity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item15Layout.createSequentialGroup()
                        .addComponent(jL_ItemPrice15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap())
            .addGroup(jP_Item15Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jL_DessertName2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP_Item15Layout.setVerticalGroup(
            jP_Item15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item15Layout.createSequentialGroup()
                .addComponent(jL_DessertImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_DessertName2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jL_ItemPrice15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jS_DessertQuantity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.add(jP_Item15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 200, 260));

        jB_BuyDessert6.setBackground(new java.awt.Color(51, 204, 0));
        jB_BuyDessert6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jB_BuyDessert6.setForeground(new java.awt.Color(51, 51, 51));
        jB_BuyDessert6.setText("Buy");
        jB_BuyDessert6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BuyDessert6ActionPerformed(evt);
            }
        });
        jPanel2.add(jB_BuyDessert6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, -1, -1));

        jP_Item16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jP_Item16.setPreferredSize(new java.awt.Dimension(180, 220));

        jLabel65.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel65.setText("Price:");

        jLabel67.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel67.setText("Quantity: ");

        jL_DessertName3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jL_DessertName3.setText("Cup Cake");

        jL_ItemPrice16.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jL_ItemPrice16.setText("₱75");

        jS_DessertQuantity3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jP_Item16Layout = new javax.swing.GroupLayout(jP_Item16);
        jP_Item16.setLayout(jP_Item16Layout);
        jP_Item16Layout.setHorizontalGroup(
            jP_Item16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jL_DessertImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP_Item16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_Item16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jP_Item16Layout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(jS_DessertQuantity3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(jP_Item16Layout.createSequentialGroup()
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jL_ItemPrice16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
            .addGroup(jP_Item16Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jL_DessertName3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jP_Item16Layout.setVerticalGroup(
            jP_Item16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item16Layout.createSequentialGroup()
                .addComponent(jL_DessertImage3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_DessertName3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(jL_ItemPrice16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(jS_DessertQuantity3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.add(jP_Item16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 200, 260));

        jB_BuyDessert3.setBackground(new java.awt.Color(51, 204, 0));
        jB_BuyDessert3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jB_BuyDessert3.setForeground(new java.awt.Color(51, 51, 51));
        jB_BuyDessert3.setText("Buy");
        jB_BuyDessert3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BuyDessert3ActionPerformed(evt);
            }
        });
        jPanel2.add(jB_BuyDessert3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        jP_Item17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jP_Item17.setPreferredSize(new java.awt.Dimension(180, 220));

        jLabel69.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel69.setText("Price:");

        jLabel71.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel71.setText("Quantity:");

        jL_DessertName4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jL_DessertName4.setText("Donut");

        jL_ItemPrice17.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jL_ItemPrice17.setText("₱70");

        jS_DessertQuantity4.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jP_Item17Layout = new javax.swing.GroupLayout(jP_Item17);
        jP_Item17.setLayout(jP_Item17Layout);
        jP_Item17Layout.setHorizontalGroup(
            jP_Item17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jL_DessertImage4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP_Item17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_Item17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jP_Item17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jS_DessertQuantity4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item17Layout.createSequentialGroup()
                        .addComponent(jL_ItemPrice17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addContainerGap())
            .addGroup(jP_Item17Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jL_DessertName4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP_Item17Layout.setVerticalGroup(
            jP_Item17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item17Layout.createSequentialGroup()
                .addComponent(jL_DessertImage4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_DessertName4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(jL_ItemPrice17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jS_DessertQuantity4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.add(jP_Item17, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 200, 260));

        jB_BuyDessert4.setBackground(new java.awt.Color(51, 204, 0));
        jB_BuyDessert4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jB_BuyDessert4.setForeground(new java.awt.Color(51, 51, 51));
        jB_BuyDessert4.setText("Buy");
        jB_BuyDessert4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BuyDessert4ActionPerformed(evt);
            }
        });
        jPanel2.add(jB_BuyDessert4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, -1, -1));

        jP_Item18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jP_Item18.setPreferredSize(new java.awt.Dimension(180, 220));

        jLabel73.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel73.setText("Price:");

        jLabel75.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel75.setText("Quantity: ");

        jL_DessertName8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jL_DessertName8.setText("Brownie");

        jL_ItemPrice18.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jL_ItemPrice18.setText("₱70");

        jS_DessertQuantity8.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jP_Item18Layout = new javax.swing.GroupLayout(jP_Item18);
        jP_Item18.setLayout(jP_Item18Layout);
        jP_Item18Layout.setHorizontalGroup(
            jP_Item18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jL_DessertImage8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP_Item18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_Item18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_Item18Layout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jS_DessertQuantity8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jP_Item18Layout.createSequentialGroup()
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jL_ItemPrice18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Item18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jL_DessertName8)
                .addGap(67, 67, 67))
        );
        jP_Item18Layout.setVerticalGroup(
            jP_Item18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item18Layout.createSequentialGroup()
                .addComponent(jL_DessertImage8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jL_DessertName8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(jL_ItemPrice18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(jS_DessertQuantity8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        jPanel2.add(jP_Item18, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 200, 260));

        jB_BuyDessert8.setBackground(new java.awt.Color(51, 204, 0));
        jB_BuyDessert8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jB_BuyDessert8.setForeground(new java.awt.Color(51, 51, 51));
        jB_BuyDessert8.setText("Buy");
        jB_BuyDessert8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BuyDessert8ActionPerformed(evt);
            }
        });
        jPanel2.add(jB_BuyDessert8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 620, -1, -1));

        jP_Item19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jP_Item19.setPreferredSize(new java.awt.Dimension(180, 220));

        jLabel77.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel77.setText("Price:");

        jL_DessertName7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jL_DessertName7.setText("Waffle");

        jL_ItemPrice19.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jL_ItemPrice19.setText("₱80");

        jS_DessertQuantity7.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel79.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel79.setText("Quantity: ");

        javax.swing.GroupLayout jP_Item19Layout = new javax.swing.GroupLayout(jP_Item19);
        jP_Item19.setLayout(jP_Item19Layout);
        jP_Item19Layout.setHorizontalGroup(
            jP_Item19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jL_DessertImage7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP_Item19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_Item19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_Item19Layout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jS_DessertQuantity7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jP_Item19Layout.createSequentialGroup()
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jL_ItemPrice19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
            .addGroup(jP_Item19Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jL_DessertName7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jP_Item19Layout.setVerticalGroup(
            jP_Item19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Item19Layout.createSequentialGroup()
                .addComponent(jL_DessertImage7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_DessertName7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(jL_ItemPrice19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_Item19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(jS_DessertQuantity7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        jPanel2.add(jP_Item19, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 200, 260));

        jB_BuyDessert7.setBackground(new java.awt.Color(51, 204, 0));
        jB_BuyDessert7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jB_BuyDessert7.setForeground(new java.awt.Color(51, 51, 51));
        jB_BuyDessert7.setText("Buy");
        jB_BuyDessert7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BuyDessert7ActionPerformed(evt);
            }
        });
        jPanel2.add(jB_BuyDessert7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 620, -1, -1));

        jTabbedPane1.addTab("Desserts", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 924, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jp_Receipt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jp_Receipt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1294, 807));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ResetActionPerformed
        jTA_Receipt.setText("");
        Total = 0.0;
        Total();
        x = 0;
        jB_Purchase.setEnabled(true);
    }//GEN-LAST:event_jB_ResetActionPerformed

    private void jB_PurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_PurchaseActionPerformed
        if (Total == 0.0) {
            JOptionPane.showMessageDialog(null, "You haven't selected any product to purchase");
        } else {
            jTA_Receipt.setText(jTA_Receipt.getText() + "\n-----------------------------------------------------------------\n"
                    + "Total:\t\t\t" + "₱" + Total + "\n--------------------Thanks for Purchasing-------------------\n");
            jB_Purchase.setEnabled(false);
        }


    }//GEN-LAST:event_jB_PurchaseActionPerformed

    private void jB_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jB_ExitActionPerformed

    private void jB_ReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ReceiptActionPerformed
        if (Total != 0){
            if (!jB_Purchase.isEnabled()) {
                try {
                    jTA_Receipt.print();
                } catch (PrinterException ex) {
                    Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Purchase a product first");
            }
        } else {
            JOptionPane.showMessageDialog(null, "You haven't purchase any product");
        }
    }//GEN-LAST:event_jB_ReceiptActionPerformed

    private void jB_BuyItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BuyItem8ActionPerformed
        if(jB_Purchase.isEnabled()){
            int qty = (int) jS_ItemQuantity8.getValue();
            int selectedSize = jCB_ItemSize8.getSelectedIndex();
            int Iprice;
            switch (selectedSize) {
                case 0:
                Iprice = 115;
                break;
                case 1:
                Iprice = 135;
                break;
                case 2:
                Iprice = 155;
                break;
                default:
                return;
            }
            if (qtyIsZero(qty)){
                x++;
                if(x==1){
                    Cafefe();
                }
                int price = qty * Iprice;
                Total += price;
                jTA_Receipt.setText(jTA_Receipt.getText()+ qty + " "+ jL_ItemName8.getText()+" ("+jCB_ItemSize8.getSelectedItem()+")"+"\t\t"+"₱"+price+"\n");
            }
            jS_ItemQuantity8.setValue(0);
            Total();
        }else{
            JOptionPane.showMessageDialog(null, "The purchase process has been completed. Click Reset");
        }

    }//GEN-LAST:event_jB_BuyItem8ActionPerformed

    private void jB_BuyItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BuyItem7ActionPerformed
        if (jB_Purchase.isEnabled()) {
            int qty = (int) jS_ItemQuantity7.getValue();
            int selectedSize = jCB_ItemSize7.getSelectedIndex();
            int Iprice;
            switch (selectedSize) {
                case 0:
                Iprice = 110;
                break;
                case 1:
                Iprice = 130;
                break;
                case 2:
                Iprice = 150;
                break;
                default:
                return;
            }
            if (qtyIsZero(qty)) {
                x++;
                if (x == 1) {
                    Cafefe();
                }
                int price = qty * Iprice;
                Total += price;
                jTA_Receipt.setText(jTA_Receipt.getText() + qty + " " + jL_ItemName7.getText() + " (" + jCB_ItemSize7.getSelectedItem() + ")" + "\t\t" + "₱" + price + "\n");
            }
            jS_ItemQuantity7.setValue(0);
            Total();
        } else {
            JOptionPane.showMessageDialog(null, "The purchase process has been completed. Click Reset");
        }
    }//GEN-LAST:event_jB_BuyItem7ActionPerformed

    private void jB_BuyItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BuyItem6ActionPerformed
        if (jB_Purchase.isEnabled()) {
            int qty = (int) jS_ItemQuantity6.getValue();
            int selectedSize = jCB_ItemSize6.getSelectedIndex();
            int Iprice;
            switch (selectedSize) {
                case 0:
                Iprice = 120;
                break;
                case 1:
                Iprice = 140;
                break;
                case 2:
                Iprice = 160;
                break;
                default:
                return;
            }
            if (qtyIsZero(qty)) {
                x++;
                if (x == 1) {
                    Cafefe();
                }
                int price = qty * Iprice;
                Total += price;
                jTA_Receipt.setText(jTA_Receipt.getText() + qty + " " + jL_ItemName6.getText() + " (" + jCB_ItemSize6.getSelectedItem() + ")" + "\t\t" + "₱" + price + "\n");
            }
            jS_ItemQuantity6.setValue(0);
            Total();
        } else {
            JOptionPane.showMessageDialog(null, "The purchase process has been completed. Click Reset");
        }
    }//GEN-LAST:event_jB_BuyItem6ActionPerformed

    private void jB_BuyItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BuyItem5ActionPerformed
        if (jB_Purchase.isEnabled()) {
            int qty = (int) jS_ItemQuantity5.getValue();
            int selectedSize = jCB_ItemSize5.getSelectedIndex();
            int Iprice;
            switch (selectedSize) {
                case 0:
                Iprice = 110;
                break;
                case 1:
                Iprice = 130;
                break;
                case 2:
                Iprice = 150;
                break;
                default:
                return;
            }
            if (qtyIsZero(qty)) {
                x++;
                if (x == 1) {
                    Cafefe();
                }
                int price = qty * Iprice;
                Total += price;
                jTA_Receipt.setText(jTA_Receipt.getText() + qty + " " + jL_ItemName5.getText() + " (" + jCB_ItemSize5.getSelectedItem() + ")" + "\t\t" + "₱" + price + "\n");
            }
            jS_ItemQuantity5.setValue(0);
            Total();
        } else {
            JOptionPane.showMessageDialog(null, "The purchase process has been completed. Click Reset");
        }

    }//GEN-LAST:event_jB_BuyItem5ActionPerformed

    private void jB_BuyItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BuyItem4ActionPerformed
        if (jB_Purchase.isEnabled()) {
            int qty = (int) jS_ItemQuantity4.getValue();
            int selectedSize = jCB_ItemSize4.getSelectedIndex();
            int Iprice;
            switch (selectedSize) {
                case 0:
                Iprice = 100;
                break;
                case 1:
                Iprice = 120;
                break;
                case 2:
                Iprice = 140;
                break;
                default:
                return;
            }
            if (qtyIsZero(qty)) {
                x++;
                if (x == 1) {
                    Cafefe();
                }
                int price = qty * Iprice;
                Total += price;
                jTA_Receipt.setText(jTA_Receipt.getText() + qty + " " + jL_ItemName4.getText() + " (" + jCB_ItemSize4.getSelectedItem() + ")" + "\t\t" + "₱" + price + "\n");
            }
            jS_ItemQuantity4.setValue(0);
            Total();
        } else {
            JOptionPane.showMessageDialog(null, "The purchase process has been completed. Click Reset");
        }

    }//GEN-LAST:event_jB_BuyItem4ActionPerformed

    private void jB_BuyItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BuyItem3ActionPerformed
        if (jB_Purchase.isEnabled()) {
            int qty = (int) jS_ItemQuantity3.getValue();
            int selectedSize = jCB_ItemSize3.getSelectedIndex();
            int Iprice;
            switch (selectedSize) {
                case 0:
                Iprice = 110;
                break;
                case 1:
                Iprice = 130;
                break;
                case 2:
                Iprice = 150;
                break;
                default:
                return;
            }
            if (qtyIsZero(qty)) {
                x++;
                if (x == 1) {
                    Cafefe();
                }
                int price = qty * Iprice;
                Total += price;
                jTA_Receipt.setText(jTA_Receipt.getText() + qty + " " + jL_ItemName3.getText() + " (" + jCB_ItemSize3.getSelectedItem() + ")" + "\t\t" + "₱" + price + "\n");
            }
            jS_ItemQuantity3.setValue(0);
            Total();
        } else {
            JOptionPane.showMessageDialog(null, "The purchase process has been completed. Click Reset");
        }
    }//GEN-LAST:event_jB_BuyItem3ActionPerformed

    private void jB_BuyItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BuyItem2ActionPerformed
        if (jB_Purchase.isEnabled()) {
            int qty = (int) jS_ItemQuantity2.getValue();
            int selectedSize = jCB_ItemSize2.getSelectedIndex();
            int Iprice;
            switch (selectedSize) {
                case 0:
                Iprice = 115;
                break;
                case 1:
                Iprice = 135;
                break;
                case 2:
                Iprice = 155;
                break;
                default:
                return;
            }
            if (qtyIsZero(qty)) {
                x++;
                if (x == 1) {
                    Cafefe();
                }
                int price = qty * Iprice;
                Total += price;
                jTA_Receipt.setText(jTA_Receipt.getText() + qty + " " + jL_ItemName2.getText() + " (" + jCB_ItemSize2.getSelectedItem() + ")" + "\t\t" + "₱" + price + "\n");
            }
            jS_ItemQuantity2.setValue(0);
            Total();
        } else {
            JOptionPane.showMessageDialog(null, "The purchase process has been completed. Click Reset");
        }
    }//GEN-LAST:event_jB_BuyItem2ActionPerformed

    private void jB_BuyItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BuyItem1ActionPerformed
        if (jB_Purchase.isEnabled()) {
            int qty = (int) jS_ItemQuantity1.getValue();
            int selectedSize = jCB_ItemSize1.getSelectedIndex();
            int Iprice;
            switch (selectedSize) {
                case 0:
                Iprice = 110;
                break;
                case 1:
                Iprice = 130;
                break;
                case 2:
                Iprice = 150;
                break;
                default:
                return;
            }
            if (qtyIsZero(qty)) {
                x++;
                if (x == 1) {
                    Cafefe();
                }
                int price = qty * Iprice;
                Total += price;
                jTA_Receipt.setText(jTA_Receipt.getText() + qty + " " + jL_ItemName1.getText() + " (" + jCB_ItemSize1.getSelectedItem() + ")" + "\t\t" + "₱" + price + "\n");
            }
            jS_ItemQuantity1.setValue(0);
            Total();
        } else {
            JOptionPane.showMessageDialog(null, "The purchase process has been completed. Click Reset");
        }
    }//GEN-LAST:event_jB_BuyItem1ActionPerformed

    private void jCB_ItemSize5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_ItemSize5ActionPerformed
        int selectedIndex = jCB_ItemSize5.getSelectedIndex();
        switch (selectedIndex) {
            case 0:
            jL_ItemPrice5.setText("₱110");
            break;
            case 1:
            jL_ItemPrice5.setText("₱130");
            break;
            case 2:
            jL_ItemPrice5.setText("₱150");
            break;
        }
    }//GEN-LAST:event_jCB_ItemSize5ActionPerformed

    private void jCB_ItemSize8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_ItemSize8ActionPerformed
        int selectedIndex = jCB_ItemSize8.getSelectedIndex();
        switch (selectedIndex) {
            case 0:
            jL_ItemPrice8.setText("₱115");
            break;
            case 1:
            jL_ItemPrice8.setText("₱135");
            break;
            case 2:
            jL_ItemPrice8.setText("₱155");
            break;
        }
    }//GEN-LAST:event_jCB_ItemSize8ActionPerformed

    private void jCB_ItemSize7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_ItemSize7ActionPerformed
        int selectedIndex = jCB_ItemSize7.getSelectedIndex();
        switch (selectedIndex) {
            case 0:
            jL_ItemPrice7.setText("₱110");
            break;
            case 1:
            jL_ItemPrice7.setText("₱130");
            break;
            case 2:
            jL_ItemPrice7.setText("₱150");
            break;
        }
    }//GEN-LAST:event_jCB_ItemSize7ActionPerformed

    private void jCB_ItemSize6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_ItemSize6ActionPerformed
        int selectedIndex = jCB_ItemSize6.getSelectedIndex();
        switch (selectedIndex) {
            case 0:
            jL_ItemPrice6.setText("₱120");
            break;
            case 1:
            jL_ItemPrice6.setText("₱140");
            break;
            case 2:
            jL_ItemPrice6.setText("₱160");
            break;
        }
    }//GEN-LAST:event_jCB_ItemSize6ActionPerformed

    private void jCB_ItemSize4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_ItemSize4ActionPerformed
        int selectedIndex = jCB_ItemSize4.getSelectedIndex();
        switch (selectedIndex) {
            case 0:
            jL_ItemPrice4.setText("₱100");
            break;
            case 1:
            jL_ItemPrice4.setText("₱120");
            break;
            case 2:
            jL_ItemPrice4.setText("₱140");
            break;
        }
    }//GEN-LAST:event_jCB_ItemSize4ActionPerformed

    private void jCB_ItemSize3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_ItemSize3ActionPerformed
        int selectedIndex = jCB_ItemSize3.getSelectedIndex();
        switch (selectedIndex) {
            case 0:
            jL_ItemPrice3.setText("₱110");
            break;
            case 1:
            jL_ItemPrice3.setText("₱130");
            break;
            case 2:
            jL_ItemPrice3.setText("₱150");
            break;
        }
    }//GEN-LAST:event_jCB_ItemSize3ActionPerformed

    private void jCB_ItemSize2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_ItemSize2ActionPerformed
        int selectedIndex = jCB_ItemSize2.getSelectedIndex();
        switch (selectedIndex) {
            case 0:
            jL_ItemPrice2.setText("₱115");
            break;
            case 1:
            jL_ItemPrice2.setText("₱135");
            break;
            case 2:
            jL_ItemPrice2.setText("₱155");
            break;
        }
    }//GEN-LAST:event_jCB_ItemSize2ActionPerformed

    private void jCB_ItemSize1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_ItemSize1ActionPerformed
        int selectedIndex = jCB_ItemSize1.getSelectedIndex();
        switch (selectedIndex) {
            case 0:
            jL_ItemPrice1.setText("₱110");
            break;
            case 1:
            jL_ItemPrice1.setText("₱130");
            break;
            case 2:
            jL_ItemPrice1.setText("₱150");
            break;
        }
    }//GEN-LAST:event_jCB_ItemSize1ActionPerformed

    private void jB_BuyDessert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BuyDessert1ActionPerformed
        if (jB_Purchase.isEnabled()) {
            int qty = (int) jS_DessertQuantity1.getValue();
            int Iprice = 90;
            if (qtyIsZero(qty)) {
                x++;
                if (x == 1) {
                    Cafefe();
                }
                int price = qty * Iprice;
                Total += price;
                jTA_Receipt.setText(jTA_Receipt.getText() + qty + " " + jL_DessertName1.getText() +  "\t\t\t" + "₱" + price + "\n");
            }
            jS_DessertQuantity1.setValue(0);
            Total();
        } else {
            JOptionPane.showMessageDialog(null, "The purchase process has been completed. Click Reset");
        }
    }//GEN-LAST:event_jB_BuyDessert1ActionPerformed

    private void jB_BuyDessert5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BuyDessert5ActionPerformed
        if (jB_Purchase.isEnabled()) {
            int qty = (int) jS_DessertQuantity5.getValue();
            int Iprice = 85;
            if (qtyIsZero(qty)) {
                x++;
                if (x == 1) {
                    Cafefe();
                }
                int price = qty * Iprice;
                Total += price;
                jTA_Receipt.setText(jTA_Receipt.getText() + qty + " " + jL_DessertName5.getText() +  "\t\t\t" + "₱" + price + "\n");
            }
            jS_DessertQuantity5.setValue(0);
            Total();
        } else {
            JOptionPane.showMessageDialog(null, "The purchase process has been completed. Click Reset");
        }
    }//GEN-LAST:event_jB_BuyDessert5ActionPerformed

    private void jB_BuyDessert2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BuyDessert2ActionPerformed
        if (jB_Purchase.isEnabled()) {
            int qty = (int) jS_DessertQuantity2.getValue();
            int Iprice = 60;
            if (qtyIsZero(qty)) {
                x++;
                if (x == 1) {
                    Cafefe();
                }
                int price = qty * Iprice;
                Total += price;
                jTA_Receipt.setText(jTA_Receipt.getText() + qty + " " + jL_DessertName2.getText() +  "\t\t\t" + "₱" + price + "\n");
            }
            jS_DessertQuantity2.setValue(0);
            Total();
        } else {
            JOptionPane.showMessageDialog(null, "The purchase process has been completed. Click Reset");
        }
    }//GEN-LAST:event_jB_BuyDessert2ActionPerformed

    private void jB_BuyDessert6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BuyDessert6ActionPerformed
        if (jB_Purchase.isEnabled()) {
            int qty = (int) jS_DessertQuantity6.getValue();
            int Iprice = 65;
            if (qtyIsZero(qty)) {
                x++;
                if (x == 1) {
                    Cafefe();
                }
                int price = qty * Iprice;
                Total += price;
                jTA_Receipt.setText(jTA_Receipt.getText() + qty + " " + jL_DessertName6.getText() +  "\t\t\t" + "₱" + price + "\n");
            }
            jS_DessertQuantity6.setValue(0);
            Total();
        } else {
            JOptionPane.showMessageDialog(null, "The purchase process has been completed. Click Reset");
        }
    }//GEN-LAST:event_jB_BuyDessert6ActionPerformed

    private void jB_BuyDessert3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BuyDessert3ActionPerformed
        if (jB_Purchase.isEnabled()) {
            int qty = (int) jS_DessertQuantity3.getValue();
            int Iprice = 75;
            if (qtyIsZero(qty)) {
                x++;
                if (x == 1) {
                    Cafefe();
                }
                int price = qty * Iprice;
                Total += price;
                jTA_Receipt.setText(jTA_Receipt.getText() + qty + " " + jL_DessertName3.getText() +  "\t\t\t" + "₱" + price + "\n");
            }
            jS_DessertQuantity3.setValue(0);
            Total();
        } else {
            JOptionPane.showMessageDialog(null, "The purchase process has been completed. Click Reset");
        }
    }//GEN-LAST:event_jB_BuyDessert3ActionPerformed

    private void jB_BuyDessert4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BuyDessert4ActionPerformed
        if (jB_Purchase.isEnabled()) {
            int qty = (int) jS_DessertQuantity4.getValue();
            int Iprice = 70;
            if (qtyIsZero(qty)) {
                x++;
                if (x == 1) {
                    Cafefe();
                }
                int price = qty * Iprice;
                Total += price;
                jTA_Receipt.setText(jTA_Receipt.getText() + qty + " " + jL_DessertName4.getText() +  "\t\t\t" + "₱" + price + "\n");
            }
            jS_DessertQuantity4.setValue(0);
            Total();
        } else {
            JOptionPane.showMessageDialog(null, "The purchase process has been completed. Click Reset");
        }
    }//GEN-LAST:event_jB_BuyDessert4ActionPerformed

    private void jB_BuyDessert8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BuyDessert8ActionPerformed
        if (jB_Purchase.isEnabled()) {
            int qty = (int) jS_DessertQuantity8.getValue();
            int Iprice = 70;
            if (qtyIsZero(qty)) {
                x++;
                if (x == 1) {
                    Cafefe();
                }
                int price = qty * Iprice;
                Total += price;
                jTA_Receipt.setText(jTA_Receipt.getText() + qty + " " + jL_DessertName8.getText() +  "\t\t\t" + "₱" + price + "\n");
            }
            jS_DessertQuantity8.setValue(0);
            Total();
        } else {
            JOptionPane.showMessageDialog(null, "The purchase process has been completed. Click Reset");
        }
    }//GEN-LAST:event_jB_BuyDessert8ActionPerformed

    private void jB_BuyDessert7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BuyDessert7ActionPerformed
        if (jB_Purchase.isEnabled()) {
            int qty = (int) jS_DessertQuantity7.getValue();
            int Iprice = 80;
            if (qtyIsZero(qty)) {
                x++;
                if (x == 1) {
                    Cafefe();
                }
                int price = qty * Iprice;
                Total += price;
                jTA_Receipt.setText(jTA_Receipt.getText() + qty + " " + jL_DessertName7.getText() +  "\t\t\t" + "₱" + price + "\n");
            }
            jS_DessertQuantity7.setValue(0);
            Total();
        } else {
            JOptionPane.showMessageDialog(null, "The purchase process has been completed. Click Reset");
        }
    }//GEN-LAST:event_jB_BuyDessert7ActionPerformed

    private void jB_mode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_mode1ActionPerformed
        SwingUtilities.invokeLater(() -> {
            try {
                if (isDarkMode) {
                    UIManager.setLookAndFeel(new FlatLightLaf());
                } else {
                    UIManager.setLookAndFeel(new FlatDarculaLaf());
                }
                SwingUtilities.updateComponentTreeUI(this);
                isDarkMode = !isDarkMode;
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }//GEN-LAST:event_jB_mode1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_BuyDessert1;
    private javax.swing.JButton jB_BuyDessert2;
    private javax.swing.JButton jB_BuyDessert3;
    private javax.swing.JButton jB_BuyDessert4;
    private javax.swing.JButton jB_BuyDessert5;
    private javax.swing.JButton jB_BuyDessert6;
    private javax.swing.JButton jB_BuyDessert7;
    private javax.swing.JButton jB_BuyDessert8;
    private javax.swing.JButton jB_BuyItem1;
    private javax.swing.JButton jB_BuyItem2;
    private javax.swing.JButton jB_BuyItem3;
    private javax.swing.JButton jB_BuyItem4;
    private javax.swing.JButton jB_BuyItem5;
    private javax.swing.JButton jB_BuyItem6;
    private javax.swing.JButton jB_BuyItem7;
    private javax.swing.JButton jB_BuyItem8;
    private javax.swing.JButton jB_Exit;
    private javax.swing.JButton jB_Purchase;
    private javax.swing.JButton jB_Receipt;
    private javax.swing.JButton jB_Reset;
    private javax.swing.JToggleButton jB_mode1;
    private javax.swing.JComboBox<String> jCB_ItemSize1;
    private javax.swing.JComboBox<String> jCB_ItemSize2;
    private javax.swing.JComboBox<String> jCB_ItemSize3;
    private javax.swing.JComboBox<String> jCB_ItemSize4;
    private javax.swing.JComboBox<String> jCB_ItemSize5;
    private javax.swing.JComboBox<String> jCB_ItemSize6;
    private javax.swing.JComboBox<String> jCB_ItemSize7;
    private javax.swing.JComboBox<String> jCB_ItemSize8;
    private javax.swing.JLabel jL_DessertImage1;
    private javax.swing.JLabel jL_DessertImage2;
    private javax.swing.JLabel jL_DessertImage3;
    private javax.swing.JLabel jL_DessertImage4;
    private javax.swing.JLabel jL_DessertImage5;
    private javax.swing.JLabel jL_DessertImage6;
    private javax.swing.JLabel jL_DessertImage7;
    private javax.swing.JLabel jL_DessertImage8;
    private javax.swing.JLabel jL_DessertName1;
    private javax.swing.JLabel jL_DessertName2;
    private javax.swing.JLabel jL_DessertName3;
    private javax.swing.JLabel jL_DessertName4;
    private javax.swing.JLabel jL_DessertName5;
    private javax.swing.JLabel jL_DessertName6;
    private javax.swing.JLabel jL_DessertName7;
    private javax.swing.JLabel jL_DessertName8;
    private javax.swing.JLabel jL_Header;
    private javax.swing.JLabel jL_ItemImage1;
    private javax.swing.JLabel jL_ItemImage2;
    private javax.swing.JLabel jL_ItemImage3;
    private javax.swing.JLabel jL_ItemImage4;
    private javax.swing.JLabel jL_ItemImage5;
    private javax.swing.JLabel jL_ItemImage7;
    private javax.swing.JLabel jL_ItemImage8;
    private javax.swing.JLabel jL_ItemImage9;
    private javax.swing.JLabel jL_ItemName1;
    private javax.swing.JLabel jL_ItemName2;
    private javax.swing.JLabel jL_ItemName3;
    private javax.swing.JLabel jL_ItemName4;
    private javax.swing.JLabel jL_ItemName5;
    private javax.swing.JLabel jL_ItemName6;
    private javax.swing.JLabel jL_ItemName7;
    private javax.swing.JLabel jL_ItemName8;
    private javax.swing.JLabel jL_ItemPrice1;
    private javax.swing.JLabel jL_ItemPrice12;
    private javax.swing.JLabel jL_ItemPrice13;
    private javax.swing.JLabel jL_ItemPrice14;
    private javax.swing.JLabel jL_ItemPrice15;
    private javax.swing.JLabel jL_ItemPrice16;
    private javax.swing.JLabel jL_ItemPrice17;
    private javax.swing.JLabel jL_ItemPrice18;
    private javax.swing.JLabel jL_ItemPrice19;
    private javax.swing.JLabel jL_ItemPrice2;
    private javax.swing.JLabel jL_ItemPrice3;
    private javax.swing.JLabel jL_ItemPrice4;
    private javax.swing.JLabel jL_ItemPrice5;
    private javax.swing.JLabel jL_ItemPrice6;
    private javax.swing.JLabel jL_ItemPrice7;
    private javax.swing.JLabel jL_ItemPrice8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jP_Item1;
    private javax.swing.JPanel jP_Item12;
    private javax.swing.JPanel jP_Item13;
    private javax.swing.JPanel jP_Item14;
    private javax.swing.JPanel jP_Item15;
    private javax.swing.JPanel jP_Item16;
    private javax.swing.JPanel jP_Item17;
    private javax.swing.JPanel jP_Item18;
    private javax.swing.JPanel jP_Item19;
    private javax.swing.JPanel jP_Item2;
    private javax.swing.JPanel jP_Item3;
    private javax.swing.JPanel jP_Item4;
    private javax.swing.JPanel jP_Item5;
    private javax.swing.JPanel jP_Item7;
    private javax.swing.JPanel jP_Item8;
    private javax.swing.JPanel jP_Item9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jS_DessertQuantity1;
    private javax.swing.JSpinner jS_DessertQuantity2;
    private javax.swing.JSpinner jS_DessertQuantity3;
    private javax.swing.JSpinner jS_DessertQuantity4;
    private javax.swing.JSpinner jS_DessertQuantity5;
    private javax.swing.JSpinner jS_DessertQuantity6;
    private javax.swing.JSpinner jS_DessertQuantity7;
    private javax.swing.JSpinner jS_DessertQuantity8;
    private javax.swing.JSpinner jS_ItemQuantity1;
    private javax.swing.JSpinner jS_ItemQuantity2;
    private javax.swing.JSpinner jS_ItemQuantity3;
    private javax.swing.JSpinner jS_ItemQuantity4;
    private javax.swing.JSpinner jS_ItemQuantity5;
    private javax.swing.JSpinner jS_ItemQuantity6;
    private javax.swing.JSpinner jS_ItemQuantity7;
    private javax.swing.JSpinner jS_ItemQuantity8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTA_Receipt;
    private javax.swing.JTextField jTF_Total;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jp_MainMenu;
    private javax.swing.JPanel jp_Receipt;
    // End of variables declaration//GEN-END:variables

}
