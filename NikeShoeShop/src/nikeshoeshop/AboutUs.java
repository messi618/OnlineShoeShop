/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nikeshoeshop;

/**
 *
 * @author vivek
 */
public class AboutUs extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public AboutUs() {
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

        popupMenu1 = new java.awt.PopupMenu();
        L1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        cart = new javax.swing.JButton();
        AboutUs = new javax.swing.JButton();
        popular = new javax.swing.JButton();
        home = new javax.swing.JButton();
        go1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        background = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");
        popupMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupMenu1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        L1.setFont(new java.awt.Font("Andalus", 0, 24)); // NOI18N
        L1.setForeground(new java.awt.Color(255, 255, 255));
        L1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L1.setText("ABOUT US");
        L1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 130, 50));

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DEVELOPERS:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        jLabel2.setFont(new java.awt.Font("Andalus", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MAHENDRA PAL SINGH                                                                 mahi.sirvi@gmail.com ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        jLabel3.setFont(new java.awt.Font("Andalus", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MARMIN KAMDAK                                                               marminkamdak@gmail.com");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, -1, -1));

        jLabel4.setFont(new java.awt.Font("Andalus", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VIVEK KUMAR                                                                          vk1.vivek.007@gmail.com");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        jLabel5.setText("--------------------------------------");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("*admin only");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 690, -1, -1));

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

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setOpaque(false);
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 270, 50));

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nikepics/home/Nike Wallpaper 2.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void popupMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popupMenu1ActionPerformed

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
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutUs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutUs;
    private javax.swing.JLabel L1;
    private javax.swing.JButton add;
    private javax.swing.JLabel background;
    private javax.swing.JButton cart;
    private javax.swing.JButton go1;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton popular;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
