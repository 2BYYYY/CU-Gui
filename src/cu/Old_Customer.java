package cu;
import java.io.FileReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.opencsv.CSVReader;

public class Old_Customer extends javax.swing.JFrame {

    public Old_Customer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("InsuranceID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Car Age");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 50, -1));

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Car Model");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Plate Number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Accident History");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Driving Experience");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 180, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 180, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 140, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 80, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 110, -1));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 110, -1));

        jButton1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jButton1.setText("Submit");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 380, 50));

        jButton2.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 110, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("img\\Group 310.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel3.setText("Legacy Privacy and Protection Act (LCPPA)");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("The Legacy Privacy and Protection Act (LPPA) is designed to safeguard\nthe personal, financial, and policy-related information of our long-standing\ncustomers. This act ensures that their data is handled with the utmost care,\ntransparency, and security, reflecting our ongoing commitment to protect\nand respect the privacy of our legacy customer base.");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        jLabel4.setText("Purpose");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        jLabel5.setText("What we do with your data");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("1. Advanced Data Security Measures\nThe LPPA mandates that the personal data of legacy customers be protected through robust security protocols:\n\nExclusive Security Features: Legacy customers will benefit from additional layers of security, such as multi-factor \nauthentication, to prevent unauthorized access to sensitive data.\nEncryption and Protection: All customer data will be encrypted both during transmission and at rest, ensuring \nprotection against data breaches.\nRegular Security Audits: To ensure data security, periodic audits and updates will be performed, keeping \nsystems resilient to emerging threats.\n\n2. Simplified Data Access and Management\nLegacy customers will have easy access to their data through personalized tools:\n\nEasy Access: Customers can access, review, and update their information at any time through a straightforward \nuser interface or by reaching out to our dedicated support team.\nSimplified Requests: Legacy customers can easily make requests for data changes or deletions, with priority handling\nto ensure quick resolutions.\n\n3. Data Minimization and Retention Policies\nWe respect the privacy of our long-term customers by adhering to strict data minimization principles:\n\nRetention Guidelines: Data will be kept only as long as necessary for policy management and legal compliance.\nOptional Data Deletion: Customers have the option to request deletion of personal data that is no longer necessary or \nrelevant to their insurance policies, with the exception of data that must be retained by law.\n\n4. Transparent Data Use and Sharing\nThe LPPA guarantees that legacy customer data will be used responsibly and transparently:\n\nPurpose-Driven Use: We will only use legacy customer data for essential activities like claims processing, policy renewal, \nand customer support.\nNo Unsolicited Sharing: Legacy customer data will not be shared with any third party for marketing or advertising purposes\nunless explicit consent is provided.\n\n5. Dedicated Privacy Support and Assistance\nLegacy customers will have direct access to a dedicated team for privacy-related concerns:\n\nPriority Support Line: A dedicated hotline will be available to address privacy and data security concerns promptly and professionally.\nClear Communication: Privacy-related communications will be simplified to ensure that legacy customers can understand how their \ndata is used and protected.\n\n6. Expanded Opt-Out Rights\nLegacy customers will have the ability to opt out of certain data collection practices:\n\nOpt-Out from Marketing: Customers can easily opt out of marketing communications and other non-essential data collection practices \nwithout affecting their access to core services.\nControl Over Data Sharing: Legacy customers can control which third parties, if any, may receive their data, ensuring they are only sharing\ninformation with trusted entities.\n\n7. Data Breach Response and Compensation\nIn the rare case of a data breach, the LPPA provides special provisions for legacy customers:\n\nImmediate Notification: Legacy customers will be notified of any data breach affecting their information within 24 hours of discovery.\nPrioritized Resolution: Affected accounts will be prioritized for corrective actions and given immediate access to identity protection services.\nCompensation for Inconvenience: Customers affected by the breach will be compensated for any potential inconvenience or harm caused.\n\n8. Enhanced Privacy Features for Senior Customers\nThe LPPA acknowledges the unique needs of senior customers by offering privacy tools designed with simplicity and ease of use:\n\nSimplified Options: Senior customers will have easy-to-use options to manage their privacy settings, both online and offline.\nOffline Access: For those who prefer non-digital interactions, legacy customers can manage their privacy preferences through phone or mail communications.\n");
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 430, 420));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String insuranceId = jTextField1.getText();  
        String plateNumber = jTextField2.getText();
        String carModel = jTextField3.getText();
        String carAge = jTextField4.getText();
        String accHistory = jTextField5.getText();
        String drivExperince = jTextField6.getText();
//        int toIntInsuranceId = Integer.parseInt(insuranceId);
        if(insuranceId.isEmpty() || 
                plateNumber.isEmpty() || 
                carModel.isEmpty() || 
                carAge.isEmpty() || 
                accHistory.isEmpty() || 
                drivExperince.isEmpty()){
            JOptionPane.showMessageDialog(this,"Blank login credentials");
        } else {
            try {
                int insuranceId_ = Integer.parseInt(insuranceId);
                String plateNumber_ = plateNumber;
                String carModel_ = carModel;
                int carAge_ = Integer.parseInt(carAge);
                int accHistory_ = Integer.parseInt(accHistory);
                int drivExperince_ = Integer.parseInt(drivExperince);
                Gui_Csv Gcsv = new Gui_Csv();
                Window_New_Customer WNC = new Window_New_Customer();
                PremiumCalculator pCalc = new PremiumCalculator();
                Gui_InsuranceChecker fCov = new Gui_InsuranceChecker();
                Gui_InsuranceChecker pCov = new PartialCoverage_();
                Gui_InsuranceChecker bCov = new BasicCoverage_();
                Gui_Customer Oc = new Gui_Customer(insuranceId_,plateNumber_,carModel_,carAge_,accHistory_,drivExperince_);
                Gui_Verification verify = new Gui_Verification();
                if (verify.checkInsID(String.valueOf(Oc.getInsuranceID())) == false ){
                    JOptionPane.showMessageDialog(this,"Not a registered insurance");
                } else if(verify.check_Dup_PlateNumber(Oc.getPlateNumber())){
                    JOptionPane.showMessageDialog(this,"Already registered");
                } else if(verify.check_NotNeutralNum(Oc.getAge(),Oc.getDrivingExperience(),Oc.getCarAge())){
                    JOptionPane.showMessageDialog(this,"Please input valid credentials");
                } else {
                    javax.swing.JTextField WNC_JTextField1 = WNC.getJTextField1();
                    javax.swing.JTextField WNC_JTextField2 = WNC.getJTextField2();
                    javax.swing.JTextField WNC_JTextField3 = WNC.getJTextField3();
                    javax.swing.JTextField WNC_JTextField4 = WNC.getJTextField4();
                    javax.swing.JTextField WNC_JTextField5 = WNC.getJTextField5();
                    javax.swing.JTextField WNC_JTextField6 = WNC.getJTextField6();
                    javax.swing.JTextField WNC_JTextField7 = WNC.getJTextField7();
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    jTextField5.setText("");
                    jTextField6.setText("");
                    String FullCov = fCov.checkInsurance(Oc.getCarAge(), Oc.getAccidentHistory());
                    String PartialCov = pCov.checkInsurance(Oc.getCarAge(), Oc.getAccidentHistory());
                    String BasicCov = bCov.checkInsurance(Oc.getCarAge(), Oc.getAccidentHistory());
                    String Coverage_ = FullCov + PartialCov + BasicCov;
                    String Premium = Integer.toString(pCalc.calculatePremium(15000, Oc.getAccidentHistory(), Oc.getDrivingExperience()));
                    Gcsv.registerChange(insuranceId,
                                        plateNumber_,
                                        carModel_,
                                        Coverage_,
                                        Premium);
                    Gcsv.registerChange(insuranceId,
                                        plateNumber_,
                                        carModel_,
                                        carAge,
                                        accHistory,
                                        Coverage_,
                                        Premium);
                    String name = "N/A";
                    String age = "N/A";
                    try (CSVReader reader = new CSVReader(new FileReader("csvThings/fullListOfInsurance.csv"))) {
                        List<String[]> rows = reader.readAll();
                        for (String[] row : rows) {
                            if (row[1].equals(insuranceId)) { 
                                name = row[2]; // Name
                                age = row[3];  // Age
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    WNC_JTextField1.setText(insuranceId);
                    WNC_JTextField2.setText(plateNumber_);
                    WNC_JTextField3.setText(name);
                    WNC_JTextField4.setText(age);
                    WNC_JTextField5.setText(carModel);
                    WNC_JTextField6.setText(Coverage_);
                    WNC_JTextField7.setText(Premium);
                    WNC.setVisible(true);
                    WNC.pack();
                    WNC.setLocationRelativeTo(null);
                    this.dispose();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please input the proper credentials.");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Old_New onFrame = new Old_New();
        onFrame.setVisible(true);
        onFrame.pack();
        onFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Old_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Old_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Old_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Old_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Old_Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
