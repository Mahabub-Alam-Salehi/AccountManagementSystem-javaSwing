/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

/**
 *
 * @author JABA002
 */

import com.sun.glass.events.KeyEvent;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
public class LoginJFrame extends javax.swing.JFrame {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement statement = null;
    private Database db;
    
    public LoginJFrame() {
        initComponents();
        setTitle("AMS:Login");
        db = new Database();
        conn = db.CreateDBConnection();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        txt_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmd_login = new javax.swing.JButton();
        cmd_signup = new javax.swing.JButton();
        cmd_exit = new javax.swing.JButton();
        lbl_forgot_password = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(543, 362));
        setResizable(false);
        setSize(new java.awt.Dimension(543, 362));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 51, 255))); // NOI18N

        jLabel1.setText("Username:");

        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });

        jLabel2.setText("Password:");

        cmd_login.setText("Login");
        cmd_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_loginActionPerformed(evt);
            }
        });

        cmd_signup.setText("Signup");
        cmd_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_signupActionPerformed(evt);
            }
        });

        cmd_exit.setText("Exit");
        cmd_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_exitActionPerformed(evt);
            }
        });

        lbl_forgot_password.setForeground(new java.awt.Color(0, 102, 255));
        lbl_forgot_password.setText("Forgotten password");
        lbl_forgot_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_forgot_passwordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cmd_signup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmd_login, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmd_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_password)
                    .addComponent(txt_username))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_forgot_password, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_login)
                    .addComponent(cmd_signup)
                    .addComponent(cmd_exit))
                .addGap(18, 18, 18)
                .addComponent(lbl_forgot_password, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(235, 108, 270, 190);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("ACCOUNT MANAGEMENT SYSTEM");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 20, 412, 26);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypkg/jaba.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(23, 108, 194, 176);

        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("Developed By JABA IT LTD");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(210, 310, 150, 20);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void cmd_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_loginActionPerformed
        // TODO add your handling code here:
        
        String user = txt_username.getText();
        String password = txt_password.getText();
        
        if(user.equals("") & password.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter User Name & Password");
        }
        else if(user.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter User Name.");
            txt_username.setText("");
        }
        else if(password.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Password");
            txt_password.setText("");
        }
        else
        {
            String sql = "select * from user where user_name = ? and password = ?";
            
            try
            {
                statement = conn.createStatement();
                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_username.getText());
                pst.setString(2, txt_password.getText());
                rs = pst.executeQuery();
              
                
                
                
                if(rs.next())
                {
                    //JOptionPane.showMessageDialog(null, rs.getString("user_name"));
                      //System.out.println("data is" +rs.getString("user_name"));
                    
                    JOptionPane.showMessageDialog(null, "User Name & Password Correct");
                    txt_username.setText("");
                    txt_password.setText("");
                    
                    // object close
                    pst.close();
                    rs.close();
                    
                   //close Login Frame
                   close();
                   
                   //call main frame
                   MainJFrame mf = new MainJFrame();
                   mf.setVisible(true);
                   
                }
                
                else
                {
                    JOptionPane.showMessageDialog(null, "User Name or Password is not Correct");
                    txt_username.setText("");
                    txt_password.setText("");
                    
                }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
                
            }
        }
        
        
    }//GEN-LAST:event_cmd_loginActionPerformed

    public void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    private void cmd_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_signupActionPerformed
        // TODO add your handling code here:
        //close Login Frame
        close();
        //call Signup Frame
        SignupJFrame sf = new SignupJFrame();
        sf.setVisible(true);
        
    }//GEN-LAST:event_cmd_signupActionPerformed

    private void cmd_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cmd_exitActionPerformed

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
        String user = txt_username.getText();
        String password = txt_password.getText();
        
        if(user.equals("") & password.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter User Name & Password");
        }
        else if(user.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter User Name.");
            txt_username.setText("");
        }
        else if(password.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Password");
            txt_password.setText("");
        }
        else
        {
            String sql = "select * from user where user_name = ? and password = ?";
            
            try
            {
                statement = conn.createStatement();
                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_username.getText());
                pst.setString(2, txt_password.getText());
                rs = pst.executeQuery();
                
                if(rs.next())
                {
                    JOptionPane.showMessageDialog(null, "User Name & Password Correct");
                    txt_username.setText("");
                    txt_password.setText("");
                    
                    // object close
                    pst.close();
                    rs.close();
                    
                   //close Login Frame
                   close();
                   
                   //call main frame
                   MainJFrame mf = new MainJFrame();
                   mf.setVisible(true);
                   
                }
                
                else
                {
                    JOptionPane.showMessageDialog(null, "User Name or Password is not Correct");
                    txt_username.setText("");
                    txt_password.setText("");
                    
                }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
                
            }
        }
        
            
        }
    }//GEN-LAST:event_txt_passwordKeyPressed

    private void lbl_forgot_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_forgot_passwordMouseClicked
        // TODO add your handling code here:
        //call ResetPassword Frame
        ResetPasswordJFrame rf = new ResetPasswordJFrame();
        rf.setVisible(true);
        close();
        
    }//GEN-LAST:event_lbl_forgot_passwordMouseClicked

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
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_exit;
    private javax.swing.JButton cmd_login;
    private javax.swing.JButton cmd_signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_forgot_password;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
