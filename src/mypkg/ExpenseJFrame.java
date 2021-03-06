/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author JABA002
 */
public class ExpenseJFrame extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    ResultSet rs = null;
    private Database db = new Database();

    public ExpenseJFrame() {
        conn = db.CreateDBConnection();
        initComponents();
        setTitle("AMS:Expense");
        Expense_type_FillCombo();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        expense_table_view = new javax.swing.JTable();
        btn_view = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        txt_search_expense = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_expense_amount = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txt_expense_note = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_clear = new javax.swing.JButton();
        combo_expense_type = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txt_DateChooser_expense = new com.toedter.calendar.JDateChooser();
        jlabel = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Expense Entry");

        expense_table_view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Expense Type", "Amount", "Note"
            }
        ));
        expense_table_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expense_table_viewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(expense_table_view);

        btn_view.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_view.setText("View");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        txt_search_expense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search_expenseActionPerformed(evt);
            }
        });
        txt_search_expense.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search_expenseKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Search");

        jLabel5.setText("Note:");

        jLabel3.setText("Expense Type:");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        jLabel4.setText("Amount:");

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        combo_expense_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_expense_typeMouseClicked(evt);
            }
        });
        combo_expense_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_expense_typeActionPerformed(evt);
            }
        });

        jLabel1.setText("Date:");

        txt_DateChooser_expense.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(combo_expense_type, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addComponent(txt_expense_amount)
                            .addComponent(txt_expense_note)
                            .addComponent(txt_DateChooser_expense, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_save)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DateChooser_expense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_expense_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_expense_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txt_expense_note, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save)
                    .addComponent(btn_clear))
                .addContainerGap())
        );

        jlabel.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_view)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_delete)
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jlabel)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_search_expense, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txt_search_expense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_view)
                            .addComponent(btn_update)
                            .addComponent(btn_delete)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlabel)
                            .addComponent(lbl_id))))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        Expense_typeJFrame etjf = new Expense_typeJFrame();
        etjf.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void Expense_type_FillCombo() {
        combo_expense_type.removeAllItems();
        combo_expense_type.addItem("Select");
        
        try {
            String sql = "Select expense_type_name from expense_type";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            //customer_name_combo.removeAllItems();

            while (rs.next()) {
                String ex_name = rs.getString("expense_type_name");
                combo_expense_type.addItem(ex_name);

            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }


    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:

        String e_date = txt_DateChooser_expense.getDateFormatString();
        String e_amount = txt_expense_amount.getText();

        if (e_date.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter date first.");
        } else if (e_amount.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter expense amount.");
        } else {
            try {

                // Insert credit 
                String sql = "INSERT INTO expense(expense_date,expense_type,amount,credit,note) "
                        + "VALUES(?,?,?,?,?)";
                pst = conn.prepareStatement(sql);

                pst.setString(1, ((JTextField) txt_DateChooser_expense.getDateEditor().getUiComponent()).getText());
                pst.setString(2, combo_expense_type.getSelectedItem().toString());
                pst.setString(3, txt_expense_amount.getText());
                pst.setString(4, txt_expense_amount.getText());
                pst.setString(5, txt_expense_note.getText());

                pst.execute();

                // Insert credit 
                String sql1 = "INSERT INTO expense(expense_date,expense_type,amount,debit,note) "
                        + "VALUES(?,?,?,?,?)";
                pst1 = conn.prepareStatement(sql1);

                pst1.setString(1, ((JTextField) txt_DateChooser_expense.getDateEditor().getUiComponent()).getText());
                pst1.setString(2, combo_expense_type.getSelectedItem().toString());
                pst1.setString(3, txt_expense_amount.getText());
                pst1.setString(4, txt_expense_amount.getText());
                pst1.setString(5, txt_expense_note.getText());
                pst1.execute();

                JOptionPane.showMessageDialog(null, "Save!");

                //close frame
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            clear();
            view();

        }

    }//GEN-LAST:event_btn_saveActionPerformed

    private void clear() {
        txt_expense_amount.setText("");
        txt_expense_note.setText("");

    }

    private void view() {
        try {
            String sql = "SELECT expense_id as 'Expense ID', expense_type as 'Expense Type', amount as 'Amount', note as 'Note' FROM expense where credit IS NOT NULL";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            expense_table_view.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }


    private void combo_expense_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_expense_typeActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_combo_expense_typeActionPerformed

    private void combo_expense_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_expense_typeMouseClicked
        // TODO add your handling code here:
        Expense_type_FillCombo();

    }//GEN-LAST:event_combo_expense_typeMouseClicked

    private void expense_table_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expense_table_viewMouseClicked
        // TODO add your handling code here:

        try {
            int row = expense_table_view.getSelectedRow();
            String table_click = (expense_table_view.getModel().getValueAt(row, 0).toString());
            // JOptionPane.showMessageDialog(null, table_click);

            String sql = "SELECT * FROM  expense WHERE expense_id = '" + table_click + "' ";

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                String add1 = rs.getString("expense_date");
                txt_DateChooser_expense.setDateFormatString(add1);

                String add2 = rs.getString("expense_type");
                combo_expense_type.addItem(add2);

                String add3 = rs.getString("amount");
                txt_expense_amount.setText(add3);

                String add4 = rs.getString("note");
                txt_expense_note.setText(add4);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_expense_table_viewMouseClicked

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        // TODO add your handling code here:
        view();
    }//GEN-LAST:event_btn_viewActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:

        String expense_date = txt_DateChooser_expense.getDateFormatString();
        String expense_type = combo_expense_type.getSelectedItem().toString();
        String expense_amount = txt_expense_amount.getText();
        String expense_note = txt_expense_note.getText();
        // String expense_id = lbl_id.getText();

        int row = expense_table_view.getSelectedRow();
        String table_click = (expense_table_view.getModel().getValueAt(row, 0).toString());
        //JOptionPane.showMessageDialog(null, table_click);
        int parse_tableclick = Integer.parseInt(table_click);
        int id = parse_tableclick + 1;
        String id1 = String.valueOf(id);

        try {

            //Update data to credit site
            String sql = "UPDATE expense SET expense_date = '" + expense_date + "',"
                    + " expense_type = '" + expense_type + "',"
                    + " amount = '" + expense_amount + "', "
                    + " credit = '" + expense_amount + "', "
                    + " note = '" + expense_note + "' "
                    + " WHERE  expense_id = '" + table_click + "' ";
            pst = conn.prepareStatement(sql);
            pst.execute();

            // Update data to debit site
            String sql1 = "UPDATE expense SET expense_date = '" + expense_date + "',"
                    + " expense_type = '" + expense_type + "',"
                    + " amount = '" + expense_amount + "', "
                    + " debit = '" + expense_amount + "', "
                    + " note = '" + expense_note + "'"
                    + " WHERE  expense_id = '" + id1 + "' ";
            pst1 = conn.prepareStatement(sql1);
            pst1.execute();

            JOptionPane.showMessageDialog(null, "Updated");

            clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        view();


    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:

        int p = JOptionPane.showConfirmDialog(null, "Do you really want to delete!!", "Delete", JOptionPane.YES_NO_OPTION);
        int row = expense_table_view.getSelectedRow();
        String table_click = (expense_table_view.getModel().getValueAt(row, 0).toString());
        //JOptionPane.showMessageDialog(null, table_click);
        int parse = Integer.parseInt(table_click);
        int id = parse + 1;
        String parse_id = String.valueOf(id);
        //JOptionPane.showMessageDialog(null, parse_id);

        if (p == 0) {
            try {
                // Delete data to debit site 
                String sql = "DELETE FROM expense WHERE expense_id = ?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, table_click);
                pst.execute();

                // Delete data to credit site 
                String sql1 = "DELETE FROM expense WHERE expense_id = ?";
                pst1 = conn.prepareStatement(sql1);
                pst1.setString(1, parse_id);
                pst1.execute();

                JOptionPane.showMessageDialog(null, "Deleted");
                clear();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            view();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void txt_search_expenseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search_expenseKeyReleased
        // TODO add your handling code here:

        try {
            String sql = "SELECT expense_id as 'Expense ID',"
                    + " expense_type as 'Expense Type', "
                    + "expense_date as 'Date',"
                    + "amount as 'Amount' FROM expense WHERE expense_id = ? or expense_type = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_search_expense.getText());
            pst.setString(2, txt_search_expense.getText());
            rs = pst.executeQuery();

            expense_table_view.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_txt_search_expenseKeyReleased

    private void txt_search_expenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search_expenseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search_expenseActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        
        txt_expense_amount.setText("");
        txt_expense_note.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

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
            java.util.logging.Logger.getLogger(ExpenseJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExpenseJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExpenseJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExpenseJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExpenseJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_view;
    private javax.swing.JComboBox<String> combo_expense_type;
    private javax.swing.JTable expense_table_view;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel lbl_id;
    private com.toedter.calendar.JDateChooser txt_DateChooser_expense;
    private javax.swing.JTextField txt_expense_amount;
    private javax.swing.JTextField txt_expense_note;
    private javax.swing.JTextField txt_search_expense;
    // End of variables declaration//GEN-END:variables
}
