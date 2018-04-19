/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import javax.swing.JTextField;

public class Placeholder {

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

    String purchase_search = "Purchase ID / Product code / Product name";

    public String getPurchase_search() {
        return purchase_search;
    }

    public void setPurchase_search(String purchase_search) {
        this.purchase_search = purchase_search;
    }

    String pay_payable_search = "payable ID / product code  / product name";

    public String getPay_payable_search() {
        return pay_payable_search;
    }

    public void setPay_payable_search(String pay_payable_search) {
        this.pay_payable_search = pay_payable_search;
    }

}
