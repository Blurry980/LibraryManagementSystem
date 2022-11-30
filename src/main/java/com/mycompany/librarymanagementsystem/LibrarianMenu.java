package com.mycompany.librarymanagementsystem;

import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jmcoa
 */
public class LibrarianMenu extends javax.swing.JFrame {

    /**
     * Creates new form LirbrarianMenu
     */
    public LibrarianMenu() {
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

        loginLabel1 = new javax.swing.JLabel();
        addMemberBtn = new javax.swing.JButton();
        removeBookBtn = new javax.swing.JButton();
        removeMemberBtn = new javax.swing.JButton();
        addBookBtn = new javax.swing.JButton();
        checkoutBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginLabel1.setText("Librarian Menu");

        addMemberBtn.setBackground(new java.awt.Color(51, 153, 255));
        addMemberBtn.setText("Add Member");
        addMemberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemberBtnActionPerformed(evt);
            }
        });

        removeBookBtn.setBackground(new java.awt.Color(0, 204, 153));
        removeBookBtn.setText("Remove Book");
        removeBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBookBtnActionPerformed(evt);
            }
        });

        removeMemberBtn.setBackground(new java.awt.Color(102, 204, 255));
        removeMemberBtn.setText("Remove Member");
        removeMemberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMemberBtnActionPerformed(evt);
            }
        });

        addBookBtn.setBackground(new java.awt.Color(0, 204, 204));
        addBookBtn.setText("Add Book");
        addBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookBtnActionPerformed(evt);
            }
        });

        checkoutBtn1.setBackground(new java.awt.Color(153, 153, 255));
        checkoutBtn1.setText("Checkout Book");
        checkoutBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addMemberBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(addBookBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeMemberBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(removeBookBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(checkoutBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(loginLabel1)
                .addContainerGap(238, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(loginLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMemberBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeMemberBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkoutBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMemberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberBtnActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == addMemberBtn){
            AddMember addMember = new AddMember();
            this.setVisible(false);
            addMember.setVisible(true);
            addMember.setResizable(false);
        }
    }//GEN-LAST:event_addMemberBtnActionPerformed

    private void addBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookBtnActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == addBookBtn){
            AddBook addBook = new AddBook();
            this.setVisible(false);
            addBook.setVisible(true);
            addBook.setResizable(false);
            //addBook.setExtendedState(JFrame.MAXIMIZED_BOTH);

        }
    }//GEN-LAST:event_addBookBtnActionPerformed

    private void removeMemberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMemberBtnActionPerformed
        // TODO add your handling code here: 
         if(evt.getSource() == removeMemberBtn){
            RemoveMember removeMember = new RemoveMember();
            this.setVisible(false);
            removeMember.setVisible(true);
            removeMember.setResizable(false);
            //removeBook.setExtendedState(JFrame.MAXIMIZED_BOTH);

        }
    }//GEN-LAST:event_removeMemberBtnActionPerformed

    private void removeBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBookBtnActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == removeBookBtn){
            RemoveBook removeBook = new RemoveBook();
            this.setVisible(false);
            removeBook.setVisible(true);
            removeBook.setResizable(false);
            //removeBook.setExtendedState(JFrame.MAXIMIZED_BOTH);

        }

    }//GEN-LAST:event_removeBookBtnActionPerformed

    private void checkoutBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutBtn1ActionPerformed
        // TODO add your handling code here:
         if(evt.getSource() == checkoutBtn1){
            CheckoutBook cb  = new CheckoutBook();
            this.setVisible(false);
            cb.setVisible(true);
            cb.setResizable(false);
        }
    }//GEN-LAST:event_checkoutBtn1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold> 

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookBtn;
    private javax.swing.JButton addMemberBtn;
    private javax.swing.JButton checkoutBtn1;
    private javax.swing.JLabel loginLabel1;
    private javax.swing.JButton removeBookBtn;
    private javax.swing.JButton removeMemberBtn;
    // End of variables declaration//GEN-END:variables
}
