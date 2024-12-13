/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cu;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

/**
 *
 * @author WIndows 11
 */
public class Gui_FullDelete extends javax.swing.JFrame {

    /**
     * Creates new form Gui_FullDelete
     */
    public Gui_FullDelete() {
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

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jButton1.setText("CONFIRM");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 250, 50));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 250, -1));

        jButton2.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 110, 30));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Insurance ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 80, -1));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\WIndows 11\\Documents\\Frame 3143.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        handleIDSearchAndDeletion();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void handleIDSearchAndDeletion() {
        boolean found2 = false; // Flag to track if the ID is found
        List<String[]> filteredRowsFull = new ArrayList<>();
        List<String[]> filteredRowsApproved = new ArrayList<>();
        String searchID = jTextField1.getText().trim(); // Get input from the text field
    
        // Process fullListOfInsurance.csv
        try (CSVReader csvReaderFull = new CSVReader(new FileReader("csvThings/fullListOfInsurance.csv"))) {
            List<String[]> rowsFull = csvReaderFull.readAll();
    
            for (String[] row : rowsFull) {
                if (!row[1].equals(searchID)) {
                    filteredRowsFull.add(row); // Add non-matching rows
                } else {
                    // Add the matching row to recentlyDeleted.csv
                    List<String[]> recentDel = new ArrayList<>();
                    recentDel.add(row);
                    try (CSVWriter writer = new CSVWriter(new FileWriter("csvThings/recentlyDeleted.csv", true))) {
                        writer.writeAll(recentDel);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    found2 = true;
                }
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace(); // Log any errors
        }
    
        // Process approvedInsurance.csv
        try (CSVReader csvReaderApproved = new CSVReader(new FileReader("csvThings/approvedInsurance.csv"))) {
            List<String[]> rowsApproved = csvReaderApproved.readAll();
    
            for (String[] row : rowsApproved) {
                if (!row[1].equals(searchID)) {
                    filteredRowsApproved.add(row); // Add non-matching rows
                } else {
                    found2 = true; // The ID was found in the approved list too
                }
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace(); // Log any errors
        }
    
        // Write updated data back to fullListOfInsurance.csv
        try (CSVWriter writerFull = new CSVWriter(new FileWriter("csvThings/fullListOfInsurance.csv"))) {
            writerFull.writeAll(filteredRowsFull);
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        // Write updated data back to approvedInsurance.csv
        try (CSVWriter writerApproved = new CSVWriter(new FileWriter("csvThings/approvedInsurance.csv"))) {
            writerApproved.writeAll(filteredRowsApproved);
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        // Show message if the ID was not found
        if (!found2) {
            javax.swing.JOptionPane.showMessageDialog(
                null,
                "The ID '" + searchID + "' was not found in the list.",
                "Not Found",
                javax.swing.JOptionPane.WARNING_MESSAGE
            );
        } else {
            javax.swing.JOptionPane.showMessageDialog(
                null,
                "The ID '" + searchID + "' has been deleted and moved to recentlyDeleted.csv.",
                "Deletion Successful",
                javax.swing.JOptionPane.INFORMATION_MESSAGE
            );
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
            java.util.logging.Logger.getLogger(Gui_FullDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_FullDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_FullDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_FullDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_FullDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
