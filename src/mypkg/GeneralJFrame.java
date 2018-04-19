/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author JABA002
 */
public class GeneralJFrame extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    Statement stmt = null;
    private Database db = new Database();
    public GeneralJFrame() {
        initComponents();
        setTitle("AMS:General");
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

        jLabel1 = new javax.swing.JLabel();
        cmd_view = new javax.swing.JButton();
        cmd_update = new javax.swing.JButton();
        cmd_delete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cmd_clear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_type_combo = new javax.swing.JComboBox<>();
        cmd_save = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_amount = new javax.swing.JTextField();
        txt_description = new javax.swing.JTextField();
        txt_date_chooser = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        general_table_view = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txt_search_general = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("General Entry");

        cmd_view.setText("View");
        cmd_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_viewActionPerformed(evt);
            }
        });

        cmd_update.setText("Update");
        cmd_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_updateActionPerformed(evt);
            }
        });

        cmd_delete.setText("Delete");
        cmd_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_deleteActionPerformed(evt);
            }
        });

        cmd_clear.setText("Clear");
        cmd_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_clearActionPerformed(evt);
            }
        });

        jLabel3.setText("Amount:");

        jLabel4.setText("Type:");

        txt_type_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "General" }));

        cmd_save.setText("Save");
        cmd_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_saveActionPerformed(evt);
            }
        });

        jLabel5.setText("Description:");

        jLabel2.setText("Date:");

        txt_date_chooser.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmd_clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmd_save)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_type_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_description, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_date_chooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_type_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txt_description)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_save)
                    .addComponent(cmd_clear))
                .addContainerGap())
        );

        general_table_view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "General ID", "Date", "Amount"
            }
        ));
        general_table_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                general_table_viewMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(general_table_view);

        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("Search:");

        txt_search_general.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search_generalKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(285, 285, 285))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmd_view, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(cmd_update)
                        .addGap(52, 52, 52)
                        .addComponent(cmd_delete)
                        .addGap(155, 155, 155))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_search_general, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_search_general, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 117, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_delete)
                    .addComponent(cmd_update)
                    .addComponent(cmd_view))
                .addGap(57, 57, 57))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_saveActionPerformed
        // TODO add your handling code here:
        String general_date = txt_date_chooser.getDateFormatString();
        String amount = txt_amount.getText();
        String desc = txt_description.getText();
        
        if(general_date.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Date can not be Empty");
        }
        else if(desc.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please Enter Value First!!");
        }
        else if(amount.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Amount can not be Empty");   
        }
        
        else
        {
            try
            {
                
                //Insert statement for Debit
                String sql = "INSERT INTO general( date, type, description, amount, debit) VALUES (?,?,?,?,?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1, ((JTextField)txt_date_chooser.getDateEditor().getUiComponent()).getText());
                pst.setString(2, txt_type_combo.getSelectedItem().toString());
                pst.setString(3, txt_description.getText());
                pst.setString(4, txt_amount.getText());
                pst.setString(5, txt_amount.getText());
                
                pst.execute();
                pst.close();
                
                //Insert statement for Credit
                String sql1 = "INSERT INTO general( date, type, description, amount, credit) VALUES (?,?,?,?,?)";
                pst1 = conn.prepareStatement(sql1);
                
                pst1.setString(1, ((JTextField)txt_date_chooser.getDateEditor().getUiComponent()).getText());
                pst1.setString(2, txt_type_combo.getSelectedItem().toString());
                pst1.setString(3, txt_description.getText());
                pst1.setString(4, txt_amount.getText());
                pst1.setString(5, txt_amount.getText());
                pst1.execute();
                
                JOptionPane.showMessageDialog(null, "Save");
                clear();
                pst1.close();
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            update_table();
        }
        
    }//GEN-LAST:event_cmd_saveActionPerformed

    private void cmd_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_updateActionPerformed
        // TODO add your handling code here:
        String general_date = txt_date_chooser.getDateFormatString();
        String amount = txt_amount.getText();
        String description = txt_description.getText();
        int row = general_table_view.getSelectedRow();
        String table_click = (general_table_view.getModel().getValueAt(row,0).toString());
        //JOptionPane.showMessageDialog(null, table_click);
        int parse= Integer.parseInt(table_click);
        int id = parse +1;
        String parse_id = String.valueOf(id);
        //JOptionPane.showMessageDialog(null, parse_id);
        
        try
        {
            // Update data to debit site
            String sql = "UPDATE general SET date = '" + general_date + "',"
                    + " description = '" + description + "',"
                    + " amount = '" + amount + "', "
                    + "debit = '" + amount + "'"
                    + " WHERE  general_id = '" + table_click + "' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
            
            //Update data to credit site
            String sql1 = "UPDATE general SET date = '" + general_date + "',"
                    + " description = '" + description + "',"
                    + " amount = '" + amount + "', "
                    + "credit = '" + amount + "'"
                    + " WHERE  general_id = '" + parse_id + "' ";
            pst1 = conn.prepareStatement(sql1);
            pst1.execute();

            JOptionPane.showMessageDialog(null, "Updated");
            clear();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
          update_table();
    }//GEN-LAST:event_cmd_updateActionPerformed

    private void cmd_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_clearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_cmd_clearActionPerformed

    private void cmd_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_viewActionPerformed
        // TODO add your handling code here:
        update_table();
    }//GEN-LAST:event_cmd_viewActionPerformed

    private void general_table_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_general_table_viewMouseClicked
        // TODO add your handling code here:
        try
        {
            int row = general_table_view.getSelectedRow();
            String table_click = (general_table_view.getModel().getValueAt(row,0).toString());
            String sql = "SELECT * FROM  general WHERE general_id = '"+table_click+"' ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next())
            {
                String add1 = rs.getString("date");
                txt_date_chooser.setDateFormatString(add1);
                
                String add2 = rs.getString("type");
                txt_type_combo.setToolTipText(add2);
                
                String add3 = rs.getString("amount");
                txt_amount.setText(add3);
                
                String add4 = rs.getString("description");
                txt_description.setText(add4);
                  
            }
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_general_table_viewMouseClicked

    private void cmd_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_deleteActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Do you really want to delete!!", "Delete", JOptionPane.YES_NO_OPTION);
        int row = general_table_view.getSelectedRow();
        String table_click = (general_table_view.getModel().getValueAt(row,0).toString());
        //JOptionPane.showMessageDialog(null, table_click);
        int parse= Integer.parseInt(table_click);
        int id = parse +1;
        String parse_id = String.valueOf(id);
        //JOptionPane.showMessageDialog(null, parse_id);
        
        if(p == 0){
        try
        {
           // Delete data to debit site 
           String sql = "DELETE FROM general WHERE general_id = ?"; 
           pst = conn.prepareStatement(sql);
           pst.setString(1,table_click);
           pst.execute();
           
           // Delete data to credit site 
           String sql1 = "DELETE FROM general WHERE general_id = ?"; 
           pst1 = conn.prepareStatement(sql1);
           pst1.setString(1,parse_id);
           pst1.execute();
           
           JOptionPane.showMessageDialog(null, "Deleted");
           clear();
           
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        update_table();
        }
    }//GEN-LAST:event_cmd_deleteActionPerformed

    private void txt_search_generalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search_generalKeyReleased
        // TODO add your handling code here:
        try {
            String sql = "SELECT general_id as 'General ID',"
                    + " date as 'Date', "
                    + "amount as 'Amount' FROM general WHERE general_id = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_search_general.getText());
             pst.setString(2, txt_search_general.getText());
            rs = pst.executeQuery();

            general_table_view.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_txt_search_generalKeyReleased

     public void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    } 
     
    private void update_table(){
        try{
        String  sql = "SELECT general_id as 'General ID', date as 'Date',"
                + " amount as 'Amount' FROM general WHERE debit IS NOT NULL";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        general_table_view.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    private void clear()
    {
        //txt_date_chooser.setDateFormatString("");
        txt_amount.setText("");
        txt_description.setText("");
        
    }
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
            java.util.logging.Logger.getLogger(GeneralJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneralJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneralJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneralJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneralJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_clear;
    private javax.swing.JButton cmd_delete;
    private javax.swing.JButton cmd_save;
    private javax.swing.JButton cmd_update;
    private javax.swing.JButton cmd_view;
    private javax.swing.JTable general_table_view;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_amount;
    private com.toedter.calendar.JDateChooser txt_date_chooser;
    private javax.swing.JTextField txt_description;
    private javax.swing.JTextField txt_search_general;
    private javax.swing.JComboBox<String> txt_type_combo;
    // End of variables declaration//GEN-END:variables
}
