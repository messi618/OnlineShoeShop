/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nikeshoeshop;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author vivek
 */
public class Add2 extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public Add2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();
        msg2 = new javax.swing.JLabel();
        msg3 = new javax.swing.JLabel();
        msg4 = new javax.swing.JLabel();
        msg5 = new javax.swing.JLabel();
        msg6 = new javax.swing.JLabel();
        p_name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        mrpp = new javax.swing.JTextField();
        discount = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        cart = new javax.swing.JButton();
        AboutUs = new javax.swing.JButton();
        popular = new javax.swing.JButton();
        home = new javax.swing.JButton();
        go1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        size = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        s_cat = new javax.swing.JComboBox();
        cat = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        add1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_idActionPerformed(evt);
            }
        });
        p_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p_idKeyTyped(evt);
            }
        });
        getContentPane().add(p_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 230, 30));

        jLabel5.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Product ID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 90, -1));

        jLabel6.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Category:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 80, -1));

        jLabel7.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sub category:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 100, -1));

        jLabel8.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Product name:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 110, -1));

        msg.setFont(new java.awt.Font("Andalus", 0, 48)); // NOI18N
        msg.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, 750, 70));

        msg2.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        msg2.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(msg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 180, 30));

        msg3.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        msg3.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(msg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 180, 30));

        msg4.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        msg4.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(msg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 230, 180, 30));

        msg5.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        msg5.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(msg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 280, 180, 30));

        msg6.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        msg6.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(msg6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 430, 180, 30));
        getContentPane().add(p_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 230, 30));

        jLabel9.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quantity :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 80, -1));

        mrpp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mrppKeyTyped(evt);
            }
        });
        getContentPane().add(mrpp, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 230, 30));

        discount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                discountKeyTyped(evt);
            }
        });
        getContentPane().add(discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 230, 30));

        price.setEditable(false);
        price.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 230, 30));

        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityKeyTyped(evt);
            }
        });
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 230, 30));

        jLabel10.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Price:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 60, -1));

        jLabel11.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Discount %:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 90, -1));

        jLabel12.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("MRP:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 50, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD TO DATABASE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, 150, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("*admin only");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 690, -1, -1));

        add.setBackground(new java.awt.Color(0, 0, 0));
        add.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add new shoes to database");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 660, 190, 30));

        cart.setBackground(new java.awt.Color(0, 0, 0));
        cart.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        cart.setForeground(new java.awt.Color(255, 255, 255));
        cart.setText("view cart");
        cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartActionPerformed(evt);
            }
        });
        getContentPane().add(cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 70, -1, -1));

        AboutUs.setBackground(new java.awt.Color(0, 0, 0));
        AboutUs.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        AboutUs.setForeground(new java.awt.Color(255, 255, 255));
        AboutUs.setText("About Us");
        AboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutUsActionPerformed(evt);
            }
        });
        getContentPane().add(AboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 70, -1, -1));

        popular.setBackground(new java.awt.Color(0, 0, 0));
        popular.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        popular.setForeground(new java.awt.Color(255, 255, 255));
        popular.setText("popular products");
        popular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popularActionPerformed(evt);
            }
        });
        getContentPane().add(popular, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        home.setBackground(new java.awt.Color(0, 0, 0));
        home.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        go1.setBackground(new java.awt.Color(0, 0, 0));
        go1.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        go1.setForeground(new java.awt.Color(255, 255, 255));
        go1.setText("SEARCH");
        go1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go1ActionPerformed(evt);
            }
        });
        getContentPane().add(go1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 250, 30));

        jLabel14.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Size:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 50, -1));

        size.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sizeKeyTyped(evt);
            }
        });
        getContentPane().add(size, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 230, 30));

        jLabel13.setFont(new java.awt.Font("Andalus", 2, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ENTER DETAILS FOR THE NEW PRODUCT:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 460, 30));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setOpaque(false);
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 270, 50));

        s_cat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Men", "Women", "Kids" }));
        getContentPane().add(s_cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 230, 30));

        cat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Casual", "Running", "Sports" }));
        getContentPane().add(cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 230, 30));

        jButton2.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jButton2.setText("Calculate PRICE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 330, 230, 30));

        add1.setBackground(new java.awt.Color(0, 0, 0));
        add1.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        add1.setForeground(new java.awt.Color(255, 255, 255));
        add1.setText("RESET");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });
        getContentPane().add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, 160, 40));

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nikepics/home/Nike Wallpaper 4.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        add1 a=new add1();
        this.dispose();
        a.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartActionPerformed
        cart a=new cart();
        a.pop();
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_cartActionPerformed

    private void AboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutUsActionPerformed
        AboutUs a=new AboutUs();
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_AboutUsActionPerformed

    private void popularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popularActionPerformed
        popular a=new popular();
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_popularActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        home a= new home();
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void go1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go1ActionPerformed
        searchResult a=new searchResult();
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_go1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    msg.setText(null);
    msg2.setText(null); 
    msg3.setText(null);
    msg4.setText(null);
    msg5.setText(null);
    msg6.setText(null);
        
        
    try{   
    MongoClient mongoClient = new MongoClient( "localhost" , 27017 );          //to connect to mongodb server
    DB db = mongoClient.getDB( "nikeshop" );                                      //connect to database
    System.out.println("Connected to database successfully");
    DBCollection prod=db.getCollection("Product");                            //using a collection via object prod 
    
    
                try{
                        
                    double pid= Double.valueOf((p_id.getText()));
                    BasicDBObject query_pid = new BasicDBObject("p_id",pid);
                    DBCursor pointer=prod.find(query_pid);
                            if(pointer.hasNext())
                            {msg2.setText("product ID already exists");
                             p_id.setText(null);
                            }
                    
                    String c=String.valueOf(cat.getSelectedItem());
                    String sc=String.valueOf(s_cat.getSelectedItem());
                    String pname=String.valueOf(p_name.getText()); 
                    
                    double siz= Double.valueOf((size.getText()));
                            if(siz>15||siz<3)
                            {msg3.setText("size cannot be: "+siz);
                            size.setText(null);
                            }
                    
                    double mrp= Double.valueOf((mrpp.getText()));
                            if(mrp>100000)
                            {msg4.setText("MRP cannot exceed 1 lakh");
                            mrpp.setText(null);
                            }
                    
                    double disc= Double.valueOf((discount.getText()));
                    double pric= Double.valueOf((price.getText()));
                    double quant= Double.valueOf((quantity.getText()));
                            if(quant>100)
                            {msg6.setText("too much quantity");
                            quantity.setText(null);
                            }
                            
                    
                   //if no error add document to database         
                            if((msg.getText()==null)&&(msg2.getText()==null)&&(msg3.getText()==null)&&(msg4.getText()==null)&&(msg5.getText()==null)&&(msg6.getText()==null))
                            {
                                System.out.println("OKKKK");
                        
                                 
                                 BasicDBObject doc = new BasicDBObject("p_id",pid)
                                                .append("category",c)
                                                .append("sub_category",sc)
                                                .append("p_name",pname)
                                                .append("size",siz)
                                                .append("MRP",mrp)
                                                .append("discount",disc)
                                                .append("price",pric)
                                                .append("quantity_left",quant);
                                            prod.insert(doc);
                                JOptionPane.showMessageDialog(null,"NEW PRODUCT INSERTED SUCCESSFULLY");
                            }//if
                        
                    }//inner try(for null text fields)        
                      
                    catch(Exception e)
                    {
                        msg.setText("PLEASE COMPLETE ALL THE DETAILS");
                    }//inner catch
                    
                    
    }//outer try(for mongo db)   
         catch(Exception e)
         {
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	 }//outer catch
                    
                    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            msg5.setText(null);
            try{    
                    double mrp= Double.valueOf((mrpp.getText()));
                    double disc= Double.valueOf((discount.getText()));
                    if(disc>99)
                       {    msg5.setText("discount cannot be"+disc+"%");
                            discount.setText(null);
                        }
                    else{
                            String pricee=String.valueOf(mrp-mrp*(disc/100));
                            price.setText(pricee);
                        }
               }
            catch(Exception e)
            {
                    msg.setText("PLEASE ENTER MRP and DISCOUNT");
            } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void p_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p_idKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE))
        {
          
            Toolkit.getDefaultToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_p_idKeyTyped

    private void mrppKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mrppKeyTyped
       char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE))
        {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_mrppKeyTyped

    private void quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyTyped
          char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE))
        {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_quantityKeyTyped

    private void sizeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sizeKeyTyped
          char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE))
        {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_sizeKeyTyped

    private void discountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discountKeyTyped
          char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE))
        {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_discountKeyTyped

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
                    
                            p_id.setText(null);        
                            p_name.setText(null);                    
                            size.setText(null);
                            mrpp.setText(null);
                            discount.setText(null);
                            price.setText(null);
                            quantity.setText(null);
        
        
        
        
    }//GEN-LAST:event_add1ActionPerformed

    private void p_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_idActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutUs;
    private javax.swing.JButton add;
    private javax.swing.JButton add1;
    private javax.swing.JLabel background;
    private javax.swing.JButton cart;
    private javax.swing.JComboBox cat;
    private javax.swing.JTextField discount;
    private javax.swing.JButton go1;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField mrpp;
    private javax.swing.JLabel msg;
    private javax.swing.JLabel msg2;
    private javax.swing.JLabel msg3;
    private javax.swing.JLabel msg4;
    private javax.swing.JLabel msg5;
    private javax.swing.JLabel msg6;
    private javax.swing.JTextField p_id;
    private javax.swing.JTextField p_name;
    private javax.swing.JButton popular;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JComboBox s_cat;
    private javax.swing.JTextField size;
    // End of variables declaration//GEN-END:variables
}
