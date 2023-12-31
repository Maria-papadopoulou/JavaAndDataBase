/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.library;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Μαρία
 */
public class LibraryManagmentSystem_student extends javax.swing.JFrame {
public static String username;
LibraryManagmentSystem_student(String username)
{
    this();
    this.username=username;
    usernamel.setText("Welcome "+username+"!");   
}
    /**
     * Creates new form LibraryManagmentSystem_student
     */
    public LibraryManagmentSystem_student() {
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
        jLabel1 = new javax.swing.JLabel();
        view_books = new javax.swing.JButton();
        log_out = new javax.swing.JButton();
        search_book = new javax.swing.JButton();
        borrowing_book = new javax.swing.JButton();
        return_book = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        usernamel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to the university's library!");

        view_books.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        view_books.setForeground(new java.awt.Color(0, 0, 0));
        view_books.setIcon(new javax.swing.ImageIcon("C:\\Users\\Μαρία\\Documents\\SE-Library\\library\\src\\main\\java\\com\\mycompany\\library\\books_database.png")); // NOI18N
        view_books.setText("View Books");
        view_books.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        view_books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_booksMouseClicked(evt);
            }
        });
        view_books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_booksActionPerformed(evt);
            }
        });

        log_out.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        log_out.setForeground(new java.awt.Color(0, 0, 0));
        log_out.setIcon(new javax.swing.ImageIcon("C:\\Users\\Μαρία\\Documents\\SE-Library\\library\\src\\main\\java\\com\\mycompany\\library\\log_out.png")); // NOI18N
        log_out.setText("Log out");
        log_out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                log_outMouseClicked(evt);
            }
        });
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });

        search_book.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        search_book.setForeground(new java.awt.Color(0, 0, 0));
        search_book.setIcon(new javax.swing.ImageIcon("C:\\Users\\Μαρία\\Documents\\SE-Library\\library\\src\\main\\java\\com\\mycompany\\library\\search.png")); // NOI18N
        search_book.setText("Search Book");
        search_book.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        search_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_bookMouseClicked(evt);
            }
        });
        search_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_bookActionPerformed(evt);
            }
        });

        borrowing_book.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        borrowing_book.setForeground(new java.awt.Color(0, 0, 0));
        borrowing_book.setIcon(new javax.swing.ImageIcon("C:\\Users\\Μαρία\\Documents\\SE-Library\\library\\src\\main\\java\\com\\mycompany\\library\\books_database.png")); // NOI18N
        borrowing_book.setText("Borrowing Books");
        borrowing_book.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        borrowing_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrowing_bookMouseClicked(evt);
            }
        });
        borrowing_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowing_bookActionPerformed(evt);
            }
        });

        return_book.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        return_book.setForeground(new java.awt.Color(0, 0, 0));
        return_book.setIcon(new javax.swing.ImageIcon("C:\\Users\\Μαρία\\Documents\\SE-Library\\library\\src\\main\\java\\com\\mycompany\\library\\return_book.png")); // NOI18N
        return_book.setText("Return Book");
        return_book.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        return_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                return_bookMouseClicked(evt);
            }
        });
        return_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_bookActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("-");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Μαρία\\Documents\\SE-Library\\library\\src\\main\\java\\com\\mycompany\\library\\Statsbiblioteket_læsesalen-2.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        usernamel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        usernamel.setForeground(new java.awt.Color(102, 0, 51));
        usernamel.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(borrowing_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(log_out, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(return_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addComponent(search_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(view_books, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(usernamel, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(usernamel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(view_books)
                        .addGap(58, 58, 58)
                        .addComponent(search_book, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(borrowing_book)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(return_book, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null, "Do you want close this window?", "Confirmation", JOptionPane.YES_OPTION);
        if(result==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }

    }//GEN-LAST:event_jLabel2MouseClicked

    private void view_booksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_booksMouseClicked
        // TODO add your handling code here:
        String user=username;
       new view_books(user).setVisible(true);
    }//GEN-LAST:event_view_booksMouseClicked

    private void view_booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_booksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_view_booksActionPerformed

    private void log_outMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_log_outMouseClicked

    }//GEN-LAST:event_log_outMouseClicked

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame,"Υou want to logout "+username+"?", "EXIT", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_log_outActionPerformed

    private void search_bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_bookMouseClicked
        
    }//GEN-LAST:event_search_bookMouseClicked

    private void search_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_bookActionPerformed
        // TODO add your handling code here:
        String user=username;
            new search_book(user).setVisible(true);
    }//GEN-LAST:event_search_bookActionPerformed

    private void borrowing_bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowing_bookMouseClicked
        // TODO add your handling code here:
            String user=username;
            new borrowing_book(user).setVisible(true);
    }//GEN-LAST:event_borrowing_bookMouseClicked

    private void borrowing_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowing_bookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_borrowing_bookActionPerformed

    private void return_bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return_bookMouseClicked
        // TODO add your handling code here:
        String user=username;
       new return_book(user).setVisible(true);
    }//GEN-LAST:event_return_bookMouseClicked

    private void return_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_bookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_return_bookActionPerformed

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
            java.util.logging.Logger.getLogger(LibraryManagmentSystem_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibraryManagmentSystem_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibraryManagmentSystem_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibraryManagmentSystem_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibraryManagmentSystem_student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrowing_book;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton log_out;
    private javax.swing.JButton return_book;
    private javax.swing.JButton search_book;
    private javax.swing.JLabel usernamel;
    private javax.swing.JButton view_books;
    // End of variables declaration//GEN-END:variables
}
