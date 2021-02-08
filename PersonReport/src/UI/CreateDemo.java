/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Main.Demographic;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class CreateDemo extends javax.swing.JPanel {

    /**
     * Creates new form ViewDemo
     */
    Demographic demo;
    public CreateDemo(Demographic demo ) {
        initComponents();
        this.demo=demo;
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblname = new javax.swing.JLabel();
        lbllast = new javax.swing.JLabel();
        lblphn = new javax.swing.JLabel();
        lbldob = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtFname = new javax.swing.JTextField();
        Txtlname = new javax.swing.JTextField();
        TxtDob = new javax.swing.JTextField();
        TxtPhone = new javax.swing.JTextField();
        TxtAge = new javax.swing.JTextField();
        lblheight = new javax.swing.JLabel();
        TxtHeight = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        TxtWeight = new javax.swing.JTextField();
        lblSsn = new javax.swing.JLabel();
        TxtSSN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BtnCreate = new javax.swing.JButton();

        lblname.setText("First Name :");

        lbllast.setText("Last Name :");

        lblphn.setText("Phone Number :");

        lbldob.setText("Date of Birth:");

        jLabel5.setText("Age:");

        TxtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFnameActionPerformed(evt);
            }
        });

        Txtlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtlnameActionPerformed(evt);
            }
        });

        TxtDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDobActionPerformed(evt);
            }
        });

        TxtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPhoneActionPerformed(evt);
            }
        });

        TxtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAgeActionPerformed(evt);
            }
        });

        lblheight.setText("Height:");

        TxtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtHeightActionPerformed(evt);
            }
        });

        lblWeight.setText("Weight:");

        TxtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtWeightActionPerformed(evt);
            }
        });

        lblSsn.setText("Social Security Number:");

        TxtSSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSSNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("CREATE DEMOGRAPHIC INFORMATION");

        BtnCreate.setText("CREATE");
        BtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSsn)
                        .addGap(37, 37, 37)
                        .addComponent(TxtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWeight)
                        .addGap(37, 37, 37)
                        .addComponent(TxtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblheight)
                        .addGap(37, 37, 37)
                        .addComponent(TxtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(lbldob)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblphn)
                                .addComponent(lbllast, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblname, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(BtnCreate)
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname)
                    .addComponent(TxtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllast)
                    .addComponent(Txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblphn)
                    .addComponent(TxtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldob)
                    .addComponent(TxtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblheight)
                    .addComponent(TxtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(TxtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSsn)
                    .addComponent(TxtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnCreate)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFnameActionPerformed

    private void TxtlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtlnameActionPerformed

    private void TxtDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDobActionPerformed

    private void TxtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPhoneActionPerformed

    private void TxtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAgeActionPerformed

    private void TxtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtHeightActionPerformed

    private void TxtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtWeightActionPerformed

    private void TxtSSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSSNActionPerformed

    private void BtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateActionPerformed
        // TODO add your handling code here:
        demo.setFname(TxtFname.getText());
        demo.setLname(Txtlname.getText());
        demo.setDob(TxtDob.getText());
        demo.setAge(TxtAge.getText());  
        demo.setPhnumber(TxtPhone.getText());
        demo.setHeight(TxtHeight.getText());
        demo.setWeight(TxtWeight.getText());
        demo.setSsn(TxtSSN.getText());
        JOptionPane.showMessageDialog(this, "Demographic Information Saved!!");
    }//GEN-LAST:event_BtnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCreate;
    private javax.swing.JTextField TxtAge;
    private javax.swing.JTextField TxtDob;
    private javax.swing.JTextField TxtFname;
    private javax.swing.JTextField TxtHeight;
    private javax.swing.JTextField TxtPhone;
    private javax.swing.JTextField TxtSSN;
    private javax.swing.JTextField TxtWeight;
    private javax.swing.JTextField Txtlname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lbldob;
    private javax.swing.JLabel lblheight;
    private javax.swing.JLabel lbllast;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblphn;
    // End of variables declaration//GEN-END:variables
}
