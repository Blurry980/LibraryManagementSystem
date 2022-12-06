/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jmcoa
 */
public class RemoveBook extends javax.swing.JFrame {

    /**
     * Creates new form RemoveBook
     */
    public RemoveBook() {
        initComponents();
        jTable1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        titleTF = new javax.swing.JTextField();
        removeBookBtn = new javax.swing.JButton();
        menuBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        viewBooksBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Enter ID of Book to Remove: ");

        jLabel1.setText("Book ID: ");

        titleTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTFActionPerformed(evt);
            }
        });

        removeBookBtn.setText("Remove Book");
        removeBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBookBtnActionPerformed(evt);
            }
        });

        menuBtn.setText("To Menu");
        menuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        viewBooksBtn.setText("View Books");
        viewBooksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBooksBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel1)
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(viewBooksBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removeBookBtn)
                            .addComponent(titleTF, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(menuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(titleTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeBookBtn)
                            .addComponent(viewBooksBtn))
                        .addGap(18, 18, 18)
                        .addComponent(menuBtn)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTFActionPerformed

    private void removeBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBookBtnActionPerformed
        // TODO add your handling code here:

        try {
            if (evt.getSource() == removeBookBtn) {
                //System.out.println("in try block");
                conn con = new conn();
                //System.out.println("connection made");
                String query = "delete from books where id = ?";
                //System.out.println("test3");
                PreparedStatement ps = con.c.prepareStatement(query);
                // ps.setString(1, null);

                ps.setString(1, titleTF.getText());

                //System.out.println("test2");
                int i = ps.executeUpdate();
                System.out.println(i);
                //System.out.println(result);
                if (i != 1) {
                    JOptionPane.showMessageDialog(null, "Failed to remove book! Please enter valid book id");

                } else {

                    JOptionPane.showMessageDialog(null, "Book successfully removed!");
                    titleTF.setText("");

                    ps.close();
                }
            }

            // con.c.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_removeBookBtnActionPerformed

    private void menuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtnActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == menuBtn) {
            this.setVisible(false);
            new LibrarianMenu().setVisible(true);
        }
    }//GEN-LAST:event_menuBtnActionPerformed

    private void viewBooksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBooksBtnActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == viewBooksBtn) {
            jTable1.setVisible(true);
            try {
                conn con = new conn();
                String query = "select * from books";
                PreparedStatement ps = con.c.prepareStatement(query);
                ResultSet rs = ps.executeQuery(query);
                DefaultTableModel model = new DefaultTableModel(new String[]{"id", "title", "author", "isbn"}, 0);
                while (rs.next()) {
                    String d = rs.getString("id");
                    String e = rs.getString("title");
                    String f = rs.getString("author");
                    String g = rs.getString("isbn");
                    model.addRow(new Object[]{d, e, f, g});
                }
                jTable1.setModel(model);

                while (rs.next()) {
                    System.out.println(rs.toString());
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_viewBooksBtnActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton menuBtn;
    private javax.swing.JButton removeBookBtn;
    private javax.swing.JTextField titleTF;
    private javax.swing.JButton viewBooksBtn;
    // End of variables declaration//GEN-END:variables
}
