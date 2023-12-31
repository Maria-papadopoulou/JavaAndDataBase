/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.library;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Μαρία
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
        this.hide_password.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        UserName = new javax.swing.JTextField();
        forgotPassword = new javax.swing.JButton();
        LogIn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Sign_Up = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hide_password = new javax.swing.JLabel();
        show_password = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome! Login to your Account");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 410, 36));

        Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Password.setText("Password");
        Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFocusGained(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 386, -1));

        UserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });
        getContentPane().add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 384, -1));

        forgotPassword.setBackground(new java.awt.Color(255, 255, 255));
        forgotPassword.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        forgotPassword.setForeground(new java.awt.Color(0, 0, 0));
        forgotPassword.setText("Forgot Password?");
        forgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordMouseClicked(evt);
            }
        });
        forgotPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(forgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        LogIn.setBackground(new java.awt.Color(255, 255, 255));
        LogIn.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        LogIn.setForeground(new java.awt.Color(0, 0, 0));
        LogIn.setText("LogIn");
        LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInActionPerformed(evt);
            }
        });
        getContentPane().add(LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 426, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Don't have account?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 388, -1, -1));

        Sign_Up.setBackground(new java.awt.Color(255, 255, 255));
        Sign_Up.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Sign_Up.setForeground(new java.awt.Color(0, 0, 0));
        Sign_Up.setText("Sign Up");
        Sign_Up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sign_UpActionPerformed(evt);
            }
        });
        getContentPane().add(Sign_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 425, -1, 26));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("-");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 6, 33, 34));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 7, 31, 27));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Μαρία\\Documents\\SE-Library\\library\\src\\main\\java\\com\\mycompany\\library\\person.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 141, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Μαρία\\Documents\\SE-Library\\library\\src\\main\\java\\com\\mycompany\\library\\password.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 253, 56, -1));

        hide_password.setIcon(new javax.swing.ImageIcon("C:\\Users\\Μαρία\\Documents\\SE-Library\\library\\src\\main\\java\\com\\mycompany\\library\\pass_hide.png")); // NOI18N
        hide_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide_passwordMousePressed(evt);
            }
        });
        getContentPane().add(hide_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, 50));

        show_password.setIcon(new javax.swing.ImageIcon("C:\\Users\\Μαρία\\Documents\\SE-Library\\library\\src\\main\\java\\com\\mycompany\\library\\show_pass.png")); // NOI18N
        show_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                show_passwordMousePressed(evt);
            }
        });
        getContentPane().add(show_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Μαρία\\Documents\\SE-Library\\library\\src\\main\\java\\com\\mycompany\\library\\library.jpg")); // NOI18N
        icon.setText("jLabel6");
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusGained
        // TODO add your handling code here:
         Password.setText("");
    }//GEN-LAST:event_PasswordFocusGained

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
        UserName.setText("");
    }//GEN-LAST:event_UserNameActionPerformed

    private void Sign_UpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sign_UpActionPerformed

        Signup Signup=new Signup();
        Signup.setVisible(true);
    }//GEN-LAST:event_Sign_UpActionPerformed

    private void LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInActionPerformed

        if(UserName.getText().trim().isEmpty() && Password.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "User Name and Password are empty");
        }
        else if(UserName.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "User Name is empty");
        }
        else if(Password.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Password is empty");
        }
        else
        {
            String user_name=UserName.getText();
            String password=Password.getText();
            Connection myconnection;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url ="jdbc:mysql://localhost/library";
                String user1 = "root";
                String password1 = "";
                myconnection = DriverManager.getConnection(url,user1,password1);
                if (myconnection != null)
                System.out.println("Connected to the database library");
                Statement stm=myconnection.createStatement();
                ResultSet rs = stm.executeQuery("select * from user");
                boolean found=false;
                while(rs.next())
                {
                    String userName=rs.getString(5);
                    String passWord=rs.getString(6);
                   
                    
                    if(user_name.equals(userName) && password.equals(passWord))
                    {
                        found=true;
                         String category=rs.getString(7);
                        if(category.equals("administrator"))
                        {
                   LibraryManagmentSystem_admin LibraryManagmentSystem_admin=new LibraryManagmentSystem_admin();
                          LibraryManagmentSystem_admin.setVisible(true);
                          
                        }
                        if(category.equals("student"))
                        {
                            String user=user_name;
                        new LibraryManagmentSystem_student(user).setVisible(true);
                        
                        } break;
                    }
                   
                }
                if(!found)
                    {
                        JOptionPane.showMessageDialog(null, "User name and password are wrong.");
                    }
                myconnection.close();
            }

            catch(Exception e)
            {
                System.out.println("e");

            }
        }

    }//GEN-LAST:event_LogInActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null, "Do you want close this window?", "Confirmation", JOptionPane.YES_OPTION);
        if(result==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }

    }//GEN-LAST:event_jLabel5MouseClicked

    private void forgotPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPasswordActionPerformed
        

    }//GEN-LAST:event_forgotPasswordActionPerformed

    private void forgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMouseClicked
        // TODO add your handling code here:
        forgotPassword forgotPassword=new forgotPassword();
        forgotPassword.setVisible(true);
        
    }//GEN-LAST:event_forgotPasswordMouseClicked

    private void show_passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_passwordMousePressed
        hide_password.setVisible(true);
        show_password.setVisible(false);
        Password.setEchoChar((char)0);
        
    }//GEN-LAST:event_show_passwordMousePressed

    private void hide_passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_passwordMousePressed
        // TODO add your handling code here:
        show_password.setVisible(true);
        hide_password.setVisible(false);
        Password.setEchoChar('*');
    }//GEN-LAST:event_hide_passwordMousePressed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogIn;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton Sign_Up;
    private javax.swing.JTextField UserName;
    private javax.swing.JButton forgotPassword;
    private javax.swing.JLabel hide_password;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel show_password;
    // End of variables declaration//GEN-END:variables
}
