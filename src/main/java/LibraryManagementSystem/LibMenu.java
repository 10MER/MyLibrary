/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LibraryManagementSystem;

/**
 *
 * @author mo3ta
 */
public class LibMenu extends javax.swing.JFrame {

    /**
     * Creates new form LibMenu
     */
    public LibMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ManageBooks = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ManageUsers = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(36, 45, 65));
        jLabel2.setText("Welcome, Librarian12!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 21, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 80));

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageBooks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ManageBooks.setText("Manage Books");
        ManageBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageBooksActionPerformed(evt);
            }
        });
        jPanel2.add(ManageBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 150, 50));

        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, -1, -1));

        ManageUsers.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ManageUsers.setText("Manage Users");
        ManageUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageUsersActionPerformed(evt);
            }
        });
        jPanel2.add(ManageUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 150, 50));

        jLabel3.setFont(new java.awt.Font("Poppins Black", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 204));
        jLabel3.setText("Select an option:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\manageuser (1).png")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\managebooks (1).png")); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 800, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManageUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageUsersActionPerformed
        new ViewMembers().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ManageUsersActionPerformed

    private void ManageBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageBooksActionPerformed
        new AddorRemove().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ManageBooksActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new LibrSignin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(LibMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageBooks;
    private javax.swing.JButton ManageUsers;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
