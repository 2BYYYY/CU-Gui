package cu;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

public class New_Customer extends javax.swing.JFrame {

    public New_Customer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Accident History");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("First Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Driving Experience");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Age");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Plate Number");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, -1, -1));

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Car Model");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Car Age");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 180, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 180, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 70, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 110, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 160, -1));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 160, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 80, -1));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 100, -1));

        jButton2.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jButton2.setText("Submit");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 380, 50));

        jButton1.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jButton1.setLabel("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 110, 30));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel2.setText("Customer Data Privacy and Security Act (CDPSA)");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("The Customer Data Privacy and Security Act (CDPSA)\nensures that returning customers of COVERAGE UNITED have their personal, financial, and policy-related information\nsafeguarded while maintaining transparency about how data is collected, used, and stored. \nThis act reflects our commitment to respecting and protecting customer privacy.\n\nThe CDPSA represents the company’s dedication to respecting customer privacy.\nIt goes beyond compliance with legal standards by integrating privacy into every aspect of the customer experience.\nIt also assures customers that their data will never be sold or shared with third parties without explicit consent.\n\nReturning customers are especially valued, and the CDPSA aims to provide them with a tailored, secure experience.\nBy safeguarding their data, the act fosters long-term loyalty and ensures peace of mind, making them feel valued \nand secure in continuing their relationship with the company.\n\n\n- COVERAGE UNITED");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        jLabel3.setText("Purpose");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        jLabel4.setText("What we do with your data");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("1. Data Collection Transparency\nWe will collect only the data necessary to provide tailored insurance services and improve customer experience.\n\nData Collected: Name, address, contact details, policy details, claims history, and payment information.\nPurpose: To assess policy renewals, provide personalized recommendations, and expedite claims processing.\n\n2. Informed Consent\nBefore collecting or using additional data, customers will receive clear explanations and must provide consent.\n\n3. Secure Data Storage\nAll customer data will be encrypted and stored in secure systems compliant with national and international cybersecurity standards.\n\nAccess is restricted to authorized personnel only.\nRegular security audits will be conducted to mitigate risks.\n\n4. Data Sharing Restrictions\nWe will never sell or share customer data with third parties without explicit consent, except when required by law or necessary for \npolicy administration (e.g., with approved underwriters or claims processors).\n\n5. Right to Access and Update Data\nReturning customers can access, review, and correct their personal information through secure channels at any time.\n\n6. Automated Decision-Making Transparency\nIf automated systems are used for policy renewals or claims, customers will receive clear explanations of the criteria used and can request\na manual review of decisions.\n\n7. Data Retention Policy\nData will be retained only as long as needed to fulfill the purposes outlined or as required by law. Afterward, it will be securely deleted.\n\n8. Incident Response Plan\nIn the unlikely event of a data breach:\n\nCustomers will be notified within 48 hours.\nAffected accounts will receive free identity protection services for one year.\nSteps to prevent future incidents will be transparently communicated.\n\n9. Opt-Out Options\nCustomers can opt out of:\n\nMarketing communications.\nNon-essential data collection (e.g., surveys).\n\n10. Dedicated Privacy Support\nA dedicated Privacy Officer and team are available to address concerns, answer questions, and assist with any privacy-related requests at\nprivacy@cu.com or by calling 091234567891.");
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
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 430, 420));

        jLabel1.setIcon(new javax.swing.ImageIcon("img\\Group 310.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed



    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed 
            String firstName = jTextField1.getText();
            String lastName = jTextField2.getText();
            String age = jTextField3.getText();
            String drivExperince = jTextField4.getText();
            String plateNumber = jTextField5.getText();
            String carModel = jTextField6.getText();
            String carAge = jTextField7.getText();
            String accHistory = jTextField8.getText();
            if(firstName.isEmpty() || 
                lastName.isEmpty() || 
                age.isEmpty() || 
                drivExperince.isEmpty() || 
                plateNumber.isEmpty() || 
                carModel.isEmpty() || 
                carAge.isEmpty() || 
                accHistory.isEmpty()){
                    JOptionPane.showMessageDialog(this,"Please fill up blank login credentials");
            } else {
                try {
                    String firstName_ = firstName;  
                    String lastName_ = lastName;
                    int age_ = Integer.parseInt(age);
                    int drivExperince_ = Integer.parseInt(drivExperince);
                    String plateNumber_ = plateNumber;
                    String carModel_ = carModel;
                    int carAge_ = Integer.parseInt(carAge);
                    int accHistory_ = Integer.parseInt(accHistory);
                    Gui_Csv Gcsv = new Gui_Csv();
                    Window_New_Customer WNC = new Window_New_Customer();
                    PremiumCalculator pCalc = new PremiumCalculator();
                    Gui_InsuranceChecker fCov = new Gui_InsuranceChecker();
                    Gui_InsuranceChecker pCov = new PartialCoverage_();
                    Gui_InsuranceChecker bCov = new BasicCoverage_();
                    Gui_Customer C = new Gui_Customer(firstName_,lastName_,age_,drivExperince_,plateNumber_,carModel_,carAge_,accHistory_);
                    Gui_Verification verify = new Gui_Verification();
                    if (verify.check_Underage(C.getAge())){
                        JOptionPane.showMessageDialog(this,"Underage to register insurance");
                        System.out.println(C.getAge());
                    } else if(verify.check_Dup_PlateNumber(C.getPlateNumber())){
                        JOptionPane.showMessageDialog(this,"Already registered");
                    } else if(verify.check_NotNeutralNum(C.getAge(),C.getDrivingExperience(),C.getCarAge())){
                        JOptionPane.showMessageDialog(this,"Please input valid credentials");
                    } else {
                        javax.swing.JTextField WNC_JTextField1 = WNC.getJTextField1();
                        javax.swing.JTextField WNC_JTextField2 = WNC.getJTextField2();
                        javax.swing.JTextField WNC_JTextField3 = WNC.getJTextField3();
                        javax.swing.JTextField WNC_JTextField4 = WNC.getJTextField4();
                        javax.swing.JTextField WNC_JTextField5 = WNC.getJTextField5();
                        javax.swing.JTextField WNC_JTextField6 = WNC.getJTextField6();
                        javax.swing.JTextField WNC_JTextField7 = WNC.getJTextField7();
                        Random rd = new Random();
                        int firstSection = C.getName().length();
                        int secondSection = C.getCarAge();
                        int thirdSection = rd.nextInt(1000000);
                        C.setInsuranceID(firstSection + secondSection + thirdSection);
                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextField3.setText("");
                        jTextField4.setText("");
                        jTextField5.setText("");
                        jTextField6.setText("");
                        jTextField7.setText("");
                        jTextField8.setText("");
                        String FullCov = fCov.checkInsurance(C.getCarAge(), C.getAccidentHistory());
                        String PartialCov = pCov.checkInsurance(C.getCarAge(), C.getAccidentHistory());
                        String BasicCov = bCov.checkInsurance(C.getCarAge(), C.getAccidentHistory());
                        String Coverage_ = FullCov + PartialCov + BasicCov;
                        String Premium = Integer.toString(pCalc.calculatePremium(15000, C.getAccidentHistory(), C.getDrivingExperience()));
                        Gcsv.toApproved(
                                    "0",
                                    String.valueOf(C.getInsuranceID()),
                                    C.getPlateNumber(),
                                    C.getName(),
                                    String.valueOf(C.getAge()),
                                    C.getCarModel(),
                                    Coverage_,
                                    Premium);
                        Gcsv.toApproved(
                            "0",
                            String.valueOf(C.getInsuranceID()),
                            C.getName(),
                            String.valueOf(C.getAge()),
                            String.valueOf(C.getDrivingExperience()),
                            C.getCarModel(),
                            String.valueOf(C.getCarAge()),
                            String.valueOf(C.getAccidentHistory()),
                            C.getPlateNumber(),
                            //
                            Coverage_,
                            //
                            Premium);
                        WNC_JTextField1.setText(String.valueOf(C.getInsuranceID()));
                        WNC_JTextField2.setText(C.getPlateNumber());
                        WNC_JTextField3.setText(C.getName());
                        WNC_JTextField4.setText(String.valueOf(C.getAge()));
                        WNC_JTextField5.setText(C.getCarModel());
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
//        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Old_New onFrame = new Old_New();
        onFrame.setVisible(true);
        onFrame.pack();
        onFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     *
     * @param args
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
            java.util.logging.Logger.getLogger(New_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
