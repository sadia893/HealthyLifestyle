
package healthylifestyle;
import java.awt.BorderLayout;
import java.awt.Frame;

import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JTable;
import java.io.*;
import static java.lang.Double.parseDouble;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Medical_Info extends javax.swing.JFrame {

    
    String Systolic,Diastolic,Respiratory_Rate, Body_Temparature, Blood_Sugar , Himoglobin,Rbc,Wbc,Platelets,Tsh,Hdl,Ldl;
    
    public Connection conn;
    public Statement st;
        private ResultSet rs;
        
        
    public Medical_Info() {
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

        jLabel2 = new javax.swing.JLabel();
        jTextFieldHimoglobin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldRespiratory = new javax.swing.JTextField();
        jTextFieldBodyTemp = new javax.swing.JTextField();
        jTextFieldBloodSugar = new javax.swing.JTextField();
        jTextFieldtsh = new javax.swing.JTextField();
        jTextFieldSystolic = new javax.swing.JTextField();
        jTextFieldDiastolic = new javax.swing.JTextField();
        jTextFieldWbc = new javax.swing.JTextField();
        jTextFieldPlatelets = new javax.swing.JTextField();
        jTextFieldHdl = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        next = new javax.swing.JButton();
        jTextFieldLdl = new javax.swing.JTextField();
        jTextFieldRbc = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 850));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel2.setText("      WBC");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 490, 90, 30);
        getContentPane().add(jTextFieldHimoglobin);
        jTextFieldHimoglobin.setBounds(200, 420, 390, 40);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel1.setText("Patient_Info");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 0, 180, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel5.setText("      Blood Pressure");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 130, 150, 30);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel6.setText("      Respiratory Rate");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 220, 160, 30);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel8.setText("      Blood Sugar");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 360, 120, 30);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel9.setText("      Himoglobin");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 430, 100, 30);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel10.setText("      Blood Cells");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 490, 100, 30);

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel12.setText("      Body Temparature");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 290, 160, 30);

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel13.setText("      TSH");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 570, 160, 30);

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel15.setText("   HDL");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(190, 620, 90, 30);

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel18.setText("      Lipid Profile");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(10, 620, 160, 30);

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel14.setText("      Platelets");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(690, 490, 90, 30);

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel16.setText("      RBC");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(180, 490, 90, 30);

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel17.setText("      Diastolic");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(440, 150, 90, 30);
        getContentPane().add(jTextFieldRespiratory);
        jTextFieldRespiratory.setBounds(210, 220, 390, 40);
        getContentPane().add(jTextFieldBodyTemp);
        jTextFieldBodyTemp.setBounds(210, 290, 390, 40);
        getContentPane().add(jTextFieldBloodSugar);
        jTextFieldBloodSugar.setBounds(210, 360, 390, 40);
        getContentPane().add(jTextFieldtsh);
        jTextFieldtsh.setBounds(200, 560, 390, 40);
        getContentPane().add(jTextFieldSystolic);
        jTextFieldSystolic.setBounds(270, 140, 140, 40);
        getContentPane().add(jTextFieldDiastolic);
        jTextFieldDiastolic.setBounds(570, 150, 140, 40);
        getContentPane().add(jTextFieldWbc);
        jTextFieldWbc.setBounds(530, 490, 140, 40);
        getContentPane().add(jTextFieldPlatelets);
        jTextFieldPlatelets.setBounds(790, 490, 140, 40);
        getContentPane().add(jTextFieldHdl);
        jTextFieldHdl.setBounds(280, 620, 140, 40);

        back.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        back.setText("<back");
        back.setMaximumSize(new java.awt.Dimension(63, 23));
        back.setMinimumSize(new java.awt.Dimension(63, 23));
        back.setPreferredSize(new java.awt.Dimension(63, 23));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(10, 0, 80, 30);

        Save.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        Save.setText("Save");
        Save.setMaximumSize(new java.awt.Dimension(63, 23));
        Save.setMinimumSize(new java.awt.Dimension(63, 23));
        Save.setPreferredSize(new java.awt.Dimension(63, 23));
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save);
        Save.setBounds(770, 700, 80, 30);

        next.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        next.setText("Next");
        next.setMaximumSize(new java.awt.Dimension(63, 23));
        next.setMinimumSize(new java.awt.Dimension(63, 23));
        next.setPreferredSize(new java.awt.Dimension(63, 23));
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next);
        next.setBounds(810, 10, 80, 30);
        getContentPane().add(jTextFieldLdl);
        jTextFieldLdl.setBounds(590, 620, 140, 40);
        getContentPane().add(jTextFieldRbc);
        jTextFieldRbc.setBounds(280, 490, 140, 40);

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel21.setText("   LDL");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(480, 630, 90, 30);

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel22.setText("   Systolic");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(180, 140, 90, 30);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 0, 0);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthylifestyle/AF9E166E-81E0-4520-9A72567DEBE94A19_source.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-870, -160, 2440, 970);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
     
        
           menu m=new menu();
          m.setVisible(true);
          new Medical_Info().setVisible(false);
          dispose();
  
    }//GEN-LAST:event_backActionPerformed
  
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        
        
     
        Systolic=jTextFieldSystolic.getText();
         Diastolic=jTextFieldDiastolic.getText();
         Respiratory_Rate=jTextFieldRespiratory.getText();
          Body_Temparature=jTextFieldBodyTemp.getText();
          Blood_Sugar =jTextFieldBloodSugar.getText();
           Himoglobin=jTextFieldHimoglobin.getText();
            Rbc=jTextFieldRbc.getText();
             Wbc=jTextFieldWbc.getText();
             Platelets=jTextFieldPlatelets.getText();
               Tsh=jTextFieldtsh.getText();
                Hdl=jTextFieldHdl.getText();
                Ldl=jTextFieldLdl.getText();

      
       try{  
         

      String query="INSERT INTO medical_info VALUES('"+Systolic+"','"+ Diastolic+"','"+Respiratory_Rate+"','"+Body_Temparature+"','"+Blood_Sugar+"','"+Himoglobin+"','"+Rbc+"','"+Wbc+"','"+ Platelets+"','"+Tsh+"','"+Hdl+"','"+ Ldl+"')";
           st.execute(query);
       }catch(Exception e)
       {
           System.out.println(e);
       }

    }//GEN-LAST:event_SaveActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
         Medical_Records m=new Medical_Records();
        m.setVisible(true);
          new Medical_Info().setVisible(false);
          dispose();

          
         Frame f = new JFrame();
         Object[] Colums={"No","Essential Equpments","Men","Women","Children"};
         Object[][]Objects=
         {
             {new Integer(0),"Blood Pressure","120/80mmHg","120/80mmHg","102/61" },  
              {new Integer(01),"Respiratory Rate","12~20 perMiniute","12~20 perMiniute","more than 40" },  
               {new Integer(02),"Body Temparature","96.8F","99F","97.5F" },  
                 {new Integer(03),"Body Sugar"," less than 100 mg/dL "," less than 100 mg/dL ","less than 140 mg/dL " }, 
              {new Integer(04),"Hemoglobin","13.5~17.5g/dec","12.0~17.5 g/dec","11~13 g/dec" },  
              {new Integer(05),"Blood Cells(RBC,WBC,Platelets)","4.7~6.1 million,5000~10000 per micro,150000~450000 lac"," 4.2~5.4,4500~11000,150000~450000","4.0~5.5,<1000,>1000"},
                {new Integer(06),"thyroid stimulating hormone"," 0.5~3.0 units per liter","0.5~3.0 units per liter","1.9~9.76 units per liter" },  
               {new Integer(07),"Lipid Profile(HDL,LDL)","35~65 mg/dL,130~159 mg/dL","35~80 mg/dL,100 mg/dl",">35 mg/dL,>130 mg/dL" },  
                   
         };
         JTable t = new JTable(Objects,Colums);
         f.add(t);
         f.add(t.getTableHeader(),BorderLayout.PAGE_START);
         f.setSize(this.getWidth(),this.getHeight());
         f.setVisible(true);
  
    }//GEN-LAST:event_nextActionPerformed

   
    public static void main(String args[]) {
      
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Medical_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medical_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medical_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medical_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medical_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldBloodSugar;
    private javax.swing.JTextField jTextFieldBodyTemp;
    private javax.swing.JTextField jTextFieldDiastolic;
    private javax.swing.JTextField jTextFieldHdl;
    private javax.swing.JTextField jTextFieldHimoglobin;
    private javax.swing.JTextField jTextFieldLdl;
    private javax.swing.JTextField jTextFieldPlatelets;
    private javax.swing.JTextField jTextFieldRbc;
    private javax.swing.JTextField jTextFieldRespiratory;
    private javax.swing.JTextField jTextFieldSystolic;
    private javax.swing.JTextField jTextFieldWbc;
    private javax.swing.JTextField jTextFieldtsh;
    private javax.swing.JButton next;
    // End of variables declaration//GEN-END:variables
}
