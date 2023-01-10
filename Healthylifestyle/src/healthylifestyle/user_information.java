
package healthylifestyle;

import java.io.*;
public class user_information extends javax.swing.JFrame {
    String name,age,gender,feet_h,inches_h,weight;
    
    public user_information() {
        initComponents();
          setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        gender_label = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        age_label = new javax.swing.JLabel();
        height_label = new javax.swing.JLabel();
        weight_label = new javax.swing.JLabel();
        name_tfld = new javax.swing.JTextField();
        age_tfld = new javax.swing.JTextField();
        female_option = new javax.swing.JRadioButton();
        male_option = new javax.swing.JRadioButton();
        weight_tfld = new javax.swing.JTextField();
        kg_label = new javax.swing.JLabel();
        inches_tfld = new javax.swing.JTextField();
        inches_label = new javax.swing.JLabel();
        feet_tfld = new javax.swing.JTextField();
        feet_label = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 850));
        setResizable(false);
        getContentPane().setLayout(null);

        gender_label.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        gender_label.setText("Gender :");
        getContentPane().add(gender_label);
        gender_label.setBounds(62, 255, 106, 47);

        name_label.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        name_label.setText("Name :");
        getContentPane().add(name_label);
        name_label.setBounds(63, 141, 106, 47);

        age_label.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        age_label.setText("Age    :");
        getContentPane().add(age_label);
        age_label.setBounds(62, 190, 106, 47);

        height_label.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        height_label.setText("Height :");
        getContentPane().add(height_label);
        height_label.setBounds(62, 308, 106, 47);

        weight_label.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        weight_label.setText("Weight :");
        getContentPane().add(weight_label);
        weight_label.setBounds(62, 366, 106, 47);
        getContentPane().add(name_tfld);
        name_tfld.setBounds(197, 150, 295, 34);
        getContentPane().add(age_tfld);
        age_tfld.setBounds(197, 202, 78, 34);

        female_option.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        female_option.setText("Female");
        female_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                female_optionActionPerformed(evt);
            }
        });
        getContentPane().add(female_option);
        female_option.setBounds(197, 264, 99, 35);

        male_option.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        male_option.setText("Male");
        male_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                male_optionActionPerformed(evt);
            }
        });
        getContentPane().add(male_option);
        male_option.setBounds(314, 264, 99, 35);
        getContentPane().add(weight_tfld);
        weight_tfld.setBounds(190, 380, 70, 30);

        kg_label.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        kg_label.setText("kG");
        getContentPane().add(kg_label);
        kg_label.setBounds(279, 379, 22, 26);
        getContentPane().add(inches_tfld);
        inches_tfld.setBounds(320, 320, 50, 40);

        inches_label.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        inches_label.setText("inches");
        getContentPane().add(inches_label);
        inches_label.setBounds(370, 330, 60, 26);
        getContentPane().add(feet_tfld);
        feet_tfld.setBounds(190, 320, 50, 40);

        feet_label.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        feet_label.setText("feet");
        getContentPane().add(feet_label);
        feet_label.setBounds(240, 330, 50, 26);

        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(400, 760, 73, 23);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jButton1.setText("< back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 20, 80, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\AA2.1sd project\\background.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -19, 1150, 860);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        name=name_tfld.getText();
        age=age_tfld.getText();
        feet_h=feet_tfld.getText();
        inches_h=inches_tfld.getText();
        weight=weight_tfld.getText();
       try{ FileWriter info=new FileWriter("user_information.txt");
       info.write(name+"\r\n");
       info.write(age+"\r\n");
       info.write(gender+"\r\n");
       info.write(feet_h+"\r\n");
       info.write(inches_h+"\r\n");
       info.write(weight+"\r\n");
       info.close();
       }catch(Exception e)
       {
           System.out.println(e);
       }
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(feet_h+" feet "+inches_h+" inches");
//        System.out.println(weight +" kg");
    }//GEN-LAST:event_submitActionPerformed

    private void female_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_female_optionActionPerformed
        // TODO add your handling code here:
        gender="female";
    }//GEN-LAST:event_female_optionActionPerformed

    private void male_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_male_optionActionPerformed
        // TODO add your handling code here:
         gender="male";
    }//GEN-LAST:event_male_optionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        menu m=new menu();
        m.setVisible(true);
          new user_information().setVisible(false);
          dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

  
    public static void main(String args[]) {
      
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(user_information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age_label;
    private javax.swing.JTextField age_tfld;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel feet_label;
    private javax.swing.JTextField feet_tfld;
    private javax.swing.JRadioButton female_option;
    private javax.swing.JLabel gender_label;
    private javax.swing.JLabel height_label;
    private javax.swing.JLabel inches_label;
    private javax.swing.JTextField inches_tfld;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kg_label;
    private javax.swing.JRadioButton male_option;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField name_tfld;
    private javax.swing.JButton submit;
    private javax.swing.JLabel weight_label;
    private javax.swing.JTextField weight_tfld;
    // End of variables declaration//GEN-END:variables
}
