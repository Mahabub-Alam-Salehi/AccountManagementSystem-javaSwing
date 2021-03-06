package fees_collection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Fees_collection extends javax.swing.JFrame {

    Connection conn = null;
    Connection conn1 = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    PreparedStatement pst2 = null;
    Statement statement = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    ResultSet rs2 = null;
    private Database_local db_local = new Database_local();
    private Database_remote db_remote = new Database_remote();

    Placeholder_fees hint;

    public Fees_collection() {
        initComponents();
        conn = db_local.CreateDBConnection();
        conn1 = db_remote.CreateDBConnection();

        hint = new Placeholder_fees();
        hint_method_date();
        hint_method_voucher_no();
        hint_method_amount();
        //load_remote_data();
    }

    public void hint_method_date() {
        hint.hint_text(txt_fees_search_date, hint.getFees_search_by_date(), 0);
    }

    public void hint_method_voucher_no() {
        hint.hint_text(txt_fees_search_vaoucher_number, hint.getFees_search_by_voucher(), 0);
    }

    public void hint_method_amount() {
        hint.hint_text(txt_fees_search_amount, hint.getFees_search_by_amount(), 0);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        remote_data_view_jtable = new javax.swing.JTable();
        btn_load_remote_data = new javax.swing.JButton();
        btn_save_remote_data = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        local_fees_view_table = new javax.swing.JTable();
        btn_local_view = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_fees_search_date = new javax.swing.JTextField();
        txt_fees_search_vaoucher_number = new javax.swing.JTextField();
        txt_fees_search_amount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Fees Collection");

        remote_data_view_jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Voucher Number", "Amount"
            }
        ));
        jScrollPane1.setViewportView(remote_data_view_jtable);

        btn_load_remote_data.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_load_remote_data.setText("Load Data");
        btn_load_remote_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_load_remote_dataActionPerformed(evt);
            }
        });

        btn_save_remote_data.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_save_remote_data.setText("Save");
        btn_save_remote_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_save_remote_dataActionPerformed(evt);
            }
        });

        local_fees_view_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Voucher Number", "Amount"
            }
        ));
        jScrollPane2.setViewportView(local_fees_view_table);

        btn_local_view.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_local_view.setText("Click Here to view Fees Collection");
        btn_local_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_local_viewActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Account Management System");

        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Develped by Jaba IT Ltd.");

        txt_fees_search_date.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_fees_search_dateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_fees_search_dateFocusLost(evt);
            }
        });
        txt_fees_search_date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_fees_search_dateMouseClicked(evt);
            }
        });
        txt_fees_search_date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_fees_search_dateKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_fees_search_dateKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fees_search_dateKeyTyped(evt);
            }
        });

        txt_fees_search_vaoucher_number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_fees_search_vaoucher_numberFocusLost(evt);
            }
        });
        txt_fees_search_vaoucher_number.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_fees_search_vaoucher_numberMouseClicked(evt);
            }
        });
        txt_fees_search_vaoucher_number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_fees_search_vaoucher_numberKeyReleased(evt);
            }
        });

        txt_fees_search_amount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_fees_search_amountFocusLost(evt);
            }
        });
        txt_fees_search_amount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_fees_search_amountMouseClicked(evt);
            }
        });
        txt_fees_search_amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_fees_search_amountKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(btn_load_remote_data)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_save_remote_data)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txt_fees_search_date, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txt_fees_search_vaoucher_number, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_fees_search_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(270, 270, 270))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(287, 287, 287))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_local_view, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_load_remote_data)
                    .addComponent(btn_save_remote_data))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fees_search_vaoucher_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fees_search_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fees_search_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_local_view)
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addGap(7, 7, 7))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_load_remote_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_load_remote_dataActionPerformed

        load_remote_data();


    }//GEN-LAST:event_btn_load_remote_dataActionPerformed

    public void load_remote_data() {
        try {
            String sql = "SELECT issueDate as 'Date',voucher_no as 'Voucher Number', total_amount as 'Amount'"
                    + "FROM student_payment WHERE accounting_status = false and status = true";

            pst = conn1.prepareStatement(sql);

            rs = pst.executeQuery();

            if (rs.next()) {
                remote_data_view_jtable.setModel(DbUtils.resultSetToTableModel(rs));
            } else {
                JOptionPane.showMessageDialog(null, "Your remote database have no new data!!. ");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }


    private void btn_save_remote_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_save_remote_dataActionPerformed
        // TODO add your handling code here:

        //Remove similar data from table
        //find similar data in remote database
//        try {
//            String sql = "SELECT voucher_no FROM student_payment group by voucher_no having count(*) >= 2";
//            pst = conn1.prepareStatement(sql);
//            rs = pst.executeQuery();
//            while (rs.next()) {
//                JOptionPane.showMessageDialog(null, rs.getString("voucher_no"));
//
//            }
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//
//        }
        //Calculate Total Amount for Individual voucher ID
        float value = 0;
        
        DefaultTableModel model = (DefaultTableModel) remote_data_view_jtable.getModel();
        
        int rows = remote_data_view_jtable.getRowCount();

        if (rows <= 0) {
            JOptionPane.showMessageDialog(null, "There is no availabe data for save!!");

        } else {

            try {

                for (int row = 0; row < rows; row++) {
                    String voucher_id = remote_data_view_jtable.getValueAt(row, 1).toString();

                    String sql2 = "select total_amount from student_payment where voucher_no = ?";
                    // statement = conn1.createStatement();
                    pst1 = conn1.prepareStatement(sql2);
                    pst1.setString(1, voucher_id);
                    rs1 = pst1.executeQuery();

                    while (rs1.next()) {
                        value += rs1.getInt("total_amount");

                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            try {
                //Insert Data to fees collection local database
                String sql = "INSERT INTO  fees_collection(date, voucher_no, amount)"
                        + "VALUES (?,?,?)";
                pst = conn.prepareStatement(sql);

                for (int row = 0; row < rows; row++) {
                    Date date = (Date) remote_data_view_jtable.getValueAt(row, 0);
                    String voucher_id = (String) remote_data_view_jtable.getValueAt(row, 1);
                    // float amount = (float) remote_data_view_jtable.getValueAt(row, 2);
                    float settotal = value;

                    pst.setDate(1, date);
                    pst.setString(2, voucher_id);
                    pst.setFloat(3, settotal);
                    pst.execute();

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
                System.out.println(e);
            }

            JOptionPane.showMessageDialog(null, "Data Save Successfully to your local server!");

            //Update value in Remote server accounting status value
            try {

                // int rows = remote_data_view_jtable.getRowCount();
                for (int row = 0; row < rows; row++) {
                    String id = (String) remote_data_view_jtable.getValueAt(row, 1);

                    String sql1 = "UPDATE student_payment SET accounting_status = true"
                            + " WHERE voucher_no = '" + id + "' ";

                    pst1 = conn1.prepareStatement(sql1);
                    pst1.execute();

                    //pst1.setString(1, voucher_id);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
                System.out.println(e);
            }
            JOptionPane.showMessageDialog(null, "remote data update successfull");
            model.setRowCount(0);

            //...................local data view in Table.................
            view();
        }
    }//GEN-LAST:event_btn_save_remote_dataActionPerformed

    private void btn_local_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_local_viewActionPerformed
        // TODO add your handling code here:

        view();

    }//GEN-LAST:event_btn_local_viewActionPerformed

    private void txt_fees_search_dateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_fees_search_dateFocusGained
        // TODO add your handling code here:


    }//GEN-LAST:event_txt_fees_search_dateFocusGained

    private void txt_fees_search_dateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_fees_search_dateFocusLost
        // TODO add your handling code here:
        hint.hint_text(txt_fees_search_date, hint.getFees_search_by_date(), txt_fees_search_date.getText().trim().length());


    }//GEN-LAST:event_txt_fees_search_dateFocusLost

    private void txt_fees_search_vaoucher_numberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_fees_search_vaoucher_numberFocusLost
        // TODO add your handling code here:

        hint.hint_text(txt_fees_search_vaoucher_number, hint.getFees_search_by_voucher(), txt_fees_search_vaoucher_number.getText().trim().length());
    }//GEN-LAST:event_txt_fees_search_vaoucher_numberFocusLost

    private void txt_fees_search_amountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_fees_search_amountFocusLost
        // TODO add your handling code here:

        hint.hint_text(txt_fees_search_amount, hint.getFees_search_by_amount(), txt_fees_search_amount.getText().trim().length());

    }//GEN-LAST:event_txt_fees_search_amountFocusLost

    private void txt_fees_search_dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_fees_search_dateMouseClicked
        // TODO add your handling code here:

        hint.clcik(txt_fees_search_date, hint.getFees_search_by_date());


    }//GEN-LAST:event_txt_fees_search_dateMouseClicked

    private void txt_fees_search_vaoucher_numberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_fees_search_vaoucher_numberMouseClicked
        // TODO add your handling code here:
        hint.clcik(txt_fees_search_vaoucher_number, hint.getFees_search_by_voucher());

    }//GEN-LAST:event_txt_fees_search_vaoucher_numberMouseClicked

    private void txt_fees_search_amountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_fees_search_amountMouseClicked
        // TODO add your handling code here:
        hint.clcik(txt_fees_search_amount, hint.getFees_search_by_amount());
    }//GEN-LAST:event_txt_fees_search_amountMouseClicked

    private void txt_fees_search_dateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fees_search_dateKeyReleased
        // TODO add your handling code here:
        try {

            String sql = "SELECT date as 'Date', voucher_no as 'Voucher Number', amount as 'Amount'"
                    + "FROM fees_collection WHERE date = ? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_fees_search_date.getText());
            rs = pst.executeQuery();
            local_fees_view_table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_txt_fees_search_dateKeyReleased

    private void txt_fees_search_vaoucher_numberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fees_search_vaoucher_numberKeyReleased
        // TODO add your handling code here:
        try {
            String sql = "SELECT date as 'Date', voucher_no as 'Voucher Number', amount as 'Amount'"
                    + "FROM fees_collection WHERE voucher_no = ? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_fees_search_date.getText());
            rs = pst.executeQuery();
            local_fees_view_table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt_fees_search_vaoucher_numberKeyReleased

    private void txt_fees_search_dateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fees_search_dateKeyPressed

    }//GEN-LAST:event_txt_fees_search_dateKeyPressed

    private void txt_fees_search_dateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fees_search_dateKeyTyped

    }//GEN-LAST:event_txt_fees_search_dateKeyTyped

    private void txt_fees_search_amountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fees_search_amountKeyReleased
        // TODO add your handling code here:

        try {
            String sql = "SELECT date as 'Date', voucher_no as 'Voucher Number', amount as 'Amount'"
                    + "FROM fees_collection WHERE amount = ? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_fees_search_date.getText());
            rs = pst.executeQuery();
            local_fees_view_table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_txt_fees_search_amountKeyReleased

    public void view() {
        try {
            String sql = "SELECT date as 'Date', voucher_no as 'Voucher Number', amount as 'Amount'"
                    + "FROM fees_collection";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            local_fees_view_table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
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
            java.util.logging.Logger.getLogger(Fees_collection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fees_collection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fees_collection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fees_collection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fees_collection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_load_remote_data;
    private javax.swing.JButton btn_local_view;
    private javax.swing.JButton btn_save_remote_data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable local_fees_view_table;
    private javax.swing.JTable remote_data_view_jtable;
    private javax.swing.JTextField txt_fees_search_amount;
    private javax.swing.JTextField txt_fees_search_date;
    private javax.swing.JTextField txt_fees_search_vaoucher_number;
    // End of variables declaration//GEN-END:variables
}
