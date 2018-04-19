/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fees_collection;

import mypkg.*;
import javax.swing.JTextField;

public class Placeholder_fees {

    String colour1 = "#808080";
    String colour2 = "#000000";

    public void hint_text(JTextField field, String hint_text, int i) {
        if (i == 0) {
            field.setText(hint_text);
            field.setForeground(java.awt.Color.decode(colour1));
        }

    }

    public void clcik(JTextField field, String hint_text) {
        if (field.getText().equals(hint_text)) {
            field.setText(" ");
            field.setForeground(java.awt.Color.decode(colour2));

        }
    }

    String fees_search_by_date = "Search by Date";
    String fees_search_by_voucher = "Search by Voucher number";
    String fees_search_by_amount = "Search by amount";

    public String getFees_search_by_date() {
        return fees_search_by_date;
    }

    public void setFees_search_by_date(String fees_search_by_date) {
        this.fees_search_by_date = fees_search_by_date;
    }

    public String getFees_search_by_voucher() {
        return fees_search_by_voucher;
    }

    public void setFees_search_by_voucher(String fees_search_by_voucher) {
        this.fees_search_by_voucher = fees_search_by_voucher;
    }

    public String getFees_search_by_amount() {
        return fees_search_by_amount;
    }

    public void setFees_search_by_amount(String fees_search_by_amount) {
        this.fees_search_by_amount = fees_search_by_amount;
    }

    
    
    

}
