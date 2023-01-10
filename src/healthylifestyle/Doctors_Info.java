
package healthylifestyle;

/**
 *
 * @author Lenovo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.io.*;
import static java.lang.Double.parseDouble;

import java.sql.ResultSet;

public class Doctors_Info extends javax.swing.JFrame {

    /** Creates new form Doctors_Info */
    
      String Name,designation,phone, hospitalName, address,hospitalPhone; 
    public Connection conn;
    public Statement st;
        private ResultSet rs;
    public Doctors_Info() {
      setLocationRelativeTo(null);
        setTitle("  HEALTHY LIFESTYLE  ");
              try{
       Class.forName("com.mysql.jdbc.Driver");
       conn=DriverManager.getConnection("jdbc:mysql://:3306/healthylifestyle","root","");
       st=conn.createStatement();
    }catch(Exception e)
    {
        System.out.println(e);
        
    }

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFielddes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldph = new javax.swing.JTextField();
        jTextFieldHn = new javax.swing.JTextField();
        jTextFieldaddcontact = new javax.swing.JTextField();
        jTextFieldname5 = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldadd1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 850));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 19)); // NOI18N
        jLabel1.setText("             Doctor's Info");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 50, 300, 40);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jButton1.setText("<back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 50, 73, 30);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel2.setText("Contact");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 550, 70, 30);

        jTextFielddes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFielddes);
        jTextFielddes.setBounds(200, 220, 330, 50);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel3.setText("Phone no");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 300, 70, 30);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel4.setText("Hospital's Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 380, 140, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel5.setText("Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 150, 70, 30);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel6.setText("designation");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 230, 100, 30);

        jTextFieldph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldphActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldph);
        jTextFieldph.setBounds(200, 290, 330, 50);

        jTextFieldHn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHnActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldHn);
        jTextFieldHn.setBounds(200, 370, 330, 50);

        jTextFieldaddcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldaddcontactActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldaddcontact);
        jTextFieldaddcontact.setBounds(200, 540, 330, 50);

        jTextFieldname5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldname5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldname5);
        jTextFieldname5.setBounds(200, 140, 330, 50);

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save);
        save.setBounds(630, 620, 100, 40);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 460, 70, 30);

        jTextFieldadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldadd1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldadd1);
        jTextFieldadd1.setBounds(200, 450, 330, 50);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(-80, -20, 0, 830);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthylifestyle/nurse-doctor-medicine.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-113, -90, 2360, 1000);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFielddesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielddesActionPerformed

    private void jTextFieldphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldphActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldphActionPerformed

    private void jTextFieldHnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHnActionPerformed

    private void jTextFieldaddcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldaddcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldaddcontactActionPerformed

    private void jTextFieldname5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldname5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldname5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
          Medical_Records m=new Medical_Records();
        m.setVisible(true);
          new Doctors_Info().setVisible(false);
          dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldadd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldadd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldadd1ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        
          Name=jTextFieldname5.getText();
        
        designation=jTextFielddes.getText();
         phone=jTextFieldph.getText();
        address=jTextFielddes.getText();
         hospitalName=jTextFieldHn.getText();
     
          hospitalPhone=jTextFieldaddcontact.getText();
         
          
       try{  
         

      String query="INSERT INTO doctor_info VALUES('"+ Name+"','"+ designation+"','"+phone+"','"+ address+"','"+hospitalName+"','"+hospitalPhone+"')";
          

      st.execute(query);
       }catch(Exception e)
       {
           System.out.println(e);
       }
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(Doctors_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctors_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctors_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctors_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctors_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldHn;
    private javax.swing.JTextField jTextFieldadd1;
    private javax.swing.JTextField jTextFieldaddcontact;
    private javax.swing.JTextField jTextFielddes;
    private javax.swing.JTextField jTextFieldname5;
    private javax.swing.JTextField jTextFieldph;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables

}
