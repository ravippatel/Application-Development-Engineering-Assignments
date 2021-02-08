/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Main.MedicalRecord;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class CreateMedical extends javax.swing.JPanel {

    /**
     * Creates new form CreateMedical
     */
    MedicalRecord medic;
    public CreateMedical(MedicalRecord medic) {
        this.medic=medic;
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

        TxtAllergy2 = new javax.swing.JTextField();
        BtnCreate = new javax.swing.JButton();
        lblBankname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbldob = new javax.swing.JLabel();
        TxtRecord = new javax.swing.JTextField();
        lbllast = new javax.swing.JLabel();
        TxtAllergy1 = new javax.swing.JTextField();
        TxtAllergy3 = new javax.swing.JTextField();
        lblphn = new javax.swing.JLabel();

        TxtAllergy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAllergy2ActionPerformed(evt);
            }
        });

        BtnCreate.setText("CREATE");
        BtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateActionPerformed(evt);
            }
        });

        lblBankname.setText("Medical Record Number:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("CREATE MEDICAL INFORMATION");

        lbldob.setText("Alergy 3:");

        TxtRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRecordActionPerformed(evt);
            }
        });

        lbllast.setText("Alergy 1:");

        TxtAllergy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAllergy1ActionPerformed(evt);
            }
        });

        TxtAllergy3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAllergy3ActionPerformed(evt);
            }
        });

        lblphn.setText("Alergy 2:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(BtnCreate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbldob)
                                    .addComponent(lbllast)
                                    .addComponent(lblBankname)
                                    .addComponent(lblphn))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtAllergy3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtAllergy2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtAllergy1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBankname)
                    .addComponent(TxtRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllast)
                    .addComponent(TxtAllergy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblphn)
                    .addComponent(TxtAllergy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldob)
                    .addComponent(TxtAllergy3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnCreate)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtAllergy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAllergy2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAllergy2ActionPerformed

    private void BtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateActionPerformed
        // TODO add your handling code here:
        medic.setAlergy1(TxtAllergy1.getText());
        medic.setAlergy2(TxtAllergy2.getText());
        medic.setAlergy3(TxtAllergy3.getText());
        medic.setRecordnumber(TxtRecord.getText());
        JOptionPane.showMessageDialog(this,"Medical Record Added!!");
    }//GEN-LAST:event_BtnCreateActionPerformed

    private void TxtRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRecordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRecordActionPerformed

    private void TxtAllergy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAllergy1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAllergy1ActionPerformed

    private void TxtAllergy3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAllergy3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAllergy3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCreate;
    private javax.swing.JTextField TxtAllergy1;
    private javax.swing.JTextField TxtAllergy2;
    private javax.swing.JTextField TxtAllergy3;
    private javax.swing.JTextField TxtRecord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBankname;
    private javax.swing.JLabel lbldob;
    private javax.swing.JLabel lbllast;
    private javax.swing.JLabel lblphn;
    // End of variables declaration//GEN-END:variables
}