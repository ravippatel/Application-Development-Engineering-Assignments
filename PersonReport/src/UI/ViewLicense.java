/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Main.License;
import java.awt.Image;

import javax.swing.ImageIcon;


/**
 *
 * @author Dell
 */
public class ViewLicense extends javax.swing.JPanel {

    /**
     * Creates new form ViewLicense
     */
    License lic;
    public ViewLicense(License lic) {
        this.lic=lic;
        initComponents();
        displayLicense();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtExpiry = new javax.swing.JTextField();
        lblBankname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbldob = new javax.swing.JLabel();
        TxtLnumber = new javax.swing.JTextField();
        lbllast = new javax.swing.JLabel();
        TxtIssue = new javax.swing.JTextField();
        TxtBlood = new javax.swing.JTextField();
        lblphn = new javax.swing.JLabel();
        jlabel2 = new javax.swing.JLabel();

        TxtExpiry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtExpiryActionPerformed(evt);
            }
        });

        lblBankname.setText("License Number:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("VIEW");

        lbldob.setText("Blood Type:");

        TxtLnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtLnumberActionPerformed(evt);
            }
        });

        lbllast.setText("Issue Date:");

        TxtIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIssueActionPerformed(evt);
            }
        });

        TxtBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBloodActionPerformed(evt);
            }
        });

        lblphn.setText("Expiry Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBankname)
                            .addComponent(lbllast)
                            .addComponent(lblphn)
                            .addComponent(lbldob))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtLnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtBlood, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBankname)
                    .addComponent(TxtLnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtIssue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbllast))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblphn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBlood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldob))
                .addGap(18, 18, 18)
                .addComponent(jlabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtExpiryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtExpiryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtExpiryActionPerformed

    private void TxtLnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLnumberActionPerformed

    private void TxtIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIssueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIssueActionPerformed

    private void TxtBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBloodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBloodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtBlood;
    private javax.swing.JTextField TxtExpiry;
    private javax.swing.JTextField TxtIssue;
    private javax.swing.JTextField TxtLnumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel lblBankname;
    private javax.swing.JLabel lbldob;
    private javax.swing.JLabel lbllast;
    private javax.swing.JLabel lblphn;
    // End of variables declaration//GEN-END:variables

    private void displayLicense() {
        TxtBlood.setText(lic.getBloodtype());
        TxtExpiry.setText(lic.getDateexpiration());
        TxtIssue.setText(lic.getDateissued());
        TxtLnumber.setText(lic.getLicensenumber());
       String a=lic.getPicture();
        ImageIcon imIco = new ImageIcon(a);
 
            //make image fit on jlabel.
 
            Image imFit = imIco.getImage();
 
            Image imgFit = imFit.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
 
            jlabel2.setIcon(new ImageIcon(imgFit));
    }
}