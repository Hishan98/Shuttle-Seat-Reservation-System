/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication_final;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Hishan Kavishka
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        //this.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
        setBackground(new Color(0, 0, 0, 0));
        dis.setBackground(new Color(0, 51, 255, 255));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new Login.RoundedPanel(80, Color.white);
        username = new javax.swing.JTextField();
        lbl_createaccount = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Sign_in = new Login.RoundedPanel(50, Color.blue);
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        left_blue_panel = new Login.RoundedPanel(80, Color.blue);
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dis = new javax.swing.JTextArea();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1123, 2147483647));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1123, 643));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 20)); // NOI18N
        username.setForeground(new java.awt.Color(153, 153, 153));
        username.setText("Enter Username");
        username.setBorder(null);
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 390, 40));

        lbl_createaccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_createaccount.setForeground(new java.awt.Color(102, 102, 102));
        lbl_createaccount.setText("Create New Account");
        lbl_createaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_createaccountMouseClicked(evt);
            }
        });
        jPanel2.add(lbl_createaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 480, 130, 30));

        jSeparator1.setForeground(new java.awt.Color(51, 204, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 10));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 43, 8));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 390, 40));

        Sign_in.setBackground(new java.awt.Color(41, 53, 65));
        Sign_in.setOpaque(false);
        Sign_in.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Sign_inMousePressed(evt);
            }
        });
        Sign_in.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SIGN IN");
        Sign_in.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, 20));

        jPanel2.add(Sign_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, 380, 60));

        password.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(153, 153, 153));
        password.setText("Enter Password ..");
        password.setBorder(null);
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 390, 40));

        left_blue_panel.setBackground(new java.awt.Color(0, 51, 255));
        left_blue_panel.setOpaque(false);
        left_blue_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Read More");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        left_blue_panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 140, 50));

        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 255));

        dis.setBackground(new java.awt.Color(0, 51, 255));
        dis.setColumns(20);
        dis.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        dis.setForeground(new java.awt.Color(255, 255, 255));
        dis.setRows(5);
        dis.setText("SHUTTLE is a shared-ride service for people who, \nbecause of their disability, are unable to ride a \nregular Pierce Transit bus. SHUTTLE provides \ndoor- to-door service, or in some instances, \ntransportation to transit centers. ");
        dis.setFocusable(false);
        jScrollPane1.setViewportView(dis);

        left_blue_panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 480, 220));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        left_blue_panel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 150, 100, 5));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 38)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DJ Shuttel Service");
        left_blue_panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 300, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaApplication_final/Icons/Hexagon-black-12.png"))); // NOI18N
        jLabel5.setFocusable(false);
        left_blue_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 487, -1, 190));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaApplication_final/Icons/Hexagon-black-12.png"))); // NOI18N
        left_blue_panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 487, -1, 190));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaApplication_final/Icons/Hexagon-black-12.png"))); // NOI18N
        left_blue_panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 487, -1, 190));

        jPanel2.add(left_blue_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 610));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaApplication_final/Icons/icons8-close-window-48.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 50, 40));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 390, 50));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 38)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Signin");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 110, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1127, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_createaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_createaccountMouseClicked

        Create_Account acc = new Create_Account();
        acc.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_lbl_createaccountMouseClicked

    private void Sign_inMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sign_inMousePressed

        if (username.getText().trim().isEmpty() || password.getText().trim().isEmpty()) {

            if (username.getText().trim().isEmpty() && password.getText().trim().isEmpty()) {
                username.setText("Username is Emphty");
                username.setForeground(Color.red);
                password.setText("Password is Emphty");
                password.setForeground(Color.red);
            } else {
                if (username.getText().trim().isEmpty()) {
                    username.setText("Username is Emphty");
                    username.setForeground(Color.red);
                } else {
                    password.setText("Password is Emphty");
                    password.setForeground(Color.red);
                }
            }
        } else {
            Connection con = null;
            SQlConnection a = new SQlConnection();
            try {
                con = a.connect();
                String sql = "Select * from login where firstname=? and password=?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, username.getText());
                pst.setString(2, password.getText());
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    String status = rs.getString("user_status");

                    //set Current usert
                    int sno = rs.getInt("sno");
                    String user = rs.getString("firstname");

                    String query = "UPDATE `current_user` SET `sno`=?,`username`=? WHERE `uno`='1'";
                    PreparedStatement pstquery = con.prepareStatement(query);

                    pstquery.setInt(1, sno);
                    pstquery.setString(2, user);
                    pstquery.executeUpdate();

                    if ("admin".equals(status)) {

                        Report rep = new Report();
                        rep.setVisible(true);
                        setVisible(false);
                    } else {
                        Report repo = new Report();
                        repo.setVisible(true);
                        setVisible(false);

//                        repo.basepanel_settings.setVisible(false);
//                        basepanel_Account.setVisible(false);
//                        basepanel_reser.setVisible(false);
//                        basepanel_home.setVisible(true);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Username and Password NOT Matched please try again");
                    username.setText("");
                    password.setText("");
                }
                con.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Database Connection Error");
            }
        }
    }//GEN-LAST:event_Sign_inMousePressed

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked

        username.setText("");
    }//GEN-LAST:event_usernameMouseClicked

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseReleased

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        password.setText("");
    }//GEN-LAST:event_passwordMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Sign_in;
    private javax.swing.JTextArea dis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbl_createaccount;
    private javax.swing.JPanel left_blue_panel;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    class RoundedPanel extends JPanel {

        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;

        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//            
        }
    }

}