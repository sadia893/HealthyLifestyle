
package healthylifestyle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.io.*;
import static java.lang.Double.parseDouble;

import java.sql.ResultSet;

public class Medical_Records extends javax.swing.JFrame {

      String oparationdate,oparationreports,pregnancyoutcomes, anycomplications, growthRate , intellectualdevelopment,Smoking,alcoholconsumption,commonfamilydiseases; 
    public Connection conn;
    public Statement st;
        private ResultSet rs;
        
    
    
    
    public Medical_Records() {
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
          setLocationRelativeTo(null);
         setTitle("  HEALTHY LIFESTYLE  ");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldsmoke = new javax.swing.JTextField();
        jTextFieldintelldev = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldopdate = new javax.swing.JTextField();
        jTextFieldpreg = new javax.swing.JTextField();
        jTextFieldfamilydiseases = new javax.swing.JTextField();
        jTextFieldgRate = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldcomp = new javax.swing.JTextField();
        jTextFieldalc = new javax.swing.JTextField();
        jTextFieldopreport3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel18.setText(" common family diseases");

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 850));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel1.setText("          Medical Records");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 30, 263, 50);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel2.setText("operation reports");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(510, 110, 139, 42);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel3.setText("Surgical history");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 120, 121, 42);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel5.setText("Family History");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 400, 121, 42);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel6.setText("operation dates");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 120, 128, 42);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel7.setText("Obstetric history");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 180, 151, 42);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel8.setText("Developmental History ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 260, 169, 42);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel9.setText("Smoking");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(170, 330, 80, 42);
        getContentPane().add(jTextFieldsmoke);
        jTextFieldsmoke.setBounds(340, 330, 164, 31);

        jTextFieldintelldev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldintelldevActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldintelldev);
        jTextFieldintelldev.setBounds(700, 270, 120, 31);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel10.setText("any complications");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(510, 190, 151, 42);

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel11.setText(" pregnancy outcomes");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(180, 190, 151, 42);

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel12.setText("alcohol consumption");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(520, 330, 151, 42);

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel13.setText("Habits");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 330, 121, 42);

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel15.setText("growth Rate");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(180, 260, 121, 42);

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel20.setText("intellectual development");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(510, 270, 179, 42);
        getContentPane().add(jTextFieldopdate);
        jTextFieldopdate.setBounds(340, 120, 146, 31);
        getContentPane().add(jTextFieldpreg);
        jTextFieldpreg.setBounds(340, 200, 146, 31);
        getContentPane().add(jTextFieldfamilydiseases);
        jTextFieldfamilydiseases.setBounds(340, 410, 289, 31);
        getContentPane().add(jTextFieldgRate);
        jTextFieldgRate.setBounds(340, 270, 146, 31);

        Back.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        Back.setText("<Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(40, 50, 115, 42);

        Save.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save);
        Save.setBounds(670, 520, 115, 42);

        Next.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        getContentPane().add(Next);
        Next.setBounds(730, 40, 115, 42);

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel21.setText(" common family diseases");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(160, 400, 196, 42);
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 0, 0);
        getContentPane().add(jTextFieldcomp);
        jTextFieldcomp.setBounds(650, 210, 164, 31);
        getContentPane().add(jTextFieldalc);
        jTextFieldalc.setBounds(670, 340, 164, 31);
        getContentPane().add(jTextFieldopreport3);
        jTextFieldopreport3.setBounds(650, 120, 164, 31);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthylifestyle/nurse-doctor-medicine.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-320, -170, 2133, 1020);

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
   
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
       
     
        oparationdate=jTextFieldopdate.getText();
        
        //oparationdate=parseInt(jTextFieldopdate.getText());

         oparationreports=jTextFieldsmoke.getText();
         pregnancyoutcomes=jTextFieldpreg.getText();
        anycomplications=jTextFieldcomp.getText();
        
      //  gender=(gend.getSelectedItem()).toString();
          growthRate =jTextFieldgRate.getText();
           intellectualdevelopment=jTextFieldintelldev.getText();
           
           Smoking=jTextFieldsmoke.getText();
           
           alcoholconsumption=jTextFieldalc.getText();
          
            commonfamilydiseases=jTextFieldfamilydiseases.getText();

      
       try{  
         

      String query="INSERT INTO record VALUES('"+ oparationdate+"','"+ oparationreports+"','"+pregnancyoutcomes+"','"+ anycomplications+"','"+growthRate+"','"+intellectualdevelopment+"','"+Smoking+"','"+alcoholconsumption+"','"+ commonfamilydiseases+"')";
          

      st.execute(query);
       }catch(Exception e)
       {
           System.out.println(e);
       }
    }//GEN-LAST:event_SaveActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        
          
          Medical_Info m=new Medical_Info();
          m.setVisible(true);
          new Medical_Records().setVisible(false);
          dispose();
          
        
    }//GEN-LAST:event_BackActionPerformed

    private void jTextFieldintelldevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldintelldevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldintelldevActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:
        
          Doctors_Info m=new Doctors_Info();
        m.setVisible(true);
          new  Medical_Records ().setVisible(false);
          dispose();
    }//GEN-LAST:event_NextActionPerformed

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Medical_Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medical_Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medical_Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medical_Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medical_Records().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Next;
    private javax.swing.JButton Save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldalc;
    private javax.swing.JTextField jTextFieldcomp;
    private javax.swing.JTextField jTextFieldfamilydiseases;
    private javax.swing.JTextField jTextFieldgRate;
    private javax.swing.JTextField jTextFieldintelldev;
    private javax.swing.JTextField jTextFieldopdate;
    private javax.swing.JTextField jTextFieldopreport3;
    private javax.swing.JTextField jTextFieldpreg;
    private javax.swing.JTextField jTextFieldsmoke;
    // End of variables declaration//GEN-END:variables
}
