/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthylifestyle;


import java.awt.Color;
import java.io.*;
import java.lang.*;
import java.io.Reader;
import java.lang.String;
public class newSubmit11 extends javax.swing.JFrame {

    /**
     * Creates new form newSubmit
     */
    
          
       double weight,feet_h,inches_h;
      double feet,inche,weightF,bmi,finalheight;
      String ans;
    private Object weight_tfld;
    public newSubmit11() {
        initComponents();
        setLocationRelativeTo(null);
         setTitle("  HEALTHY LIFESTYLE  ");
    }
  //  String weight,feet_h,inches_h;
    public newSubmit11(double val1,double val2,double val3)
    {
        initComponents();
        
       jTextField1.setText(val1+" ");
       jTextField2.setText(val2+" ");
       jTextField3.setText(val3+" ");
        setLocationRelativeTo(null);
       setTitle("  HEALTHY LIFESTYLE  ");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthylifestyle/background.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(980, 850));
        jLabel5.setMinimumSize(new java.awt.Dimension(980, 850));
        jLabel5.setPreferredSize(new java.awt.Dimension(980, 850));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 850));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText(" weight");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 70, 117, 44);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText(" feet");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 140, 90, 44);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText(" inch ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 210, 87, 44);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(350, 140, 210, 50);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(350, 210, 210, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("click to see bmi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 280, 210, 63);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(350, 290, 210, 50);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(350, 70, 210, 50);

        back.setText("<back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(30, 30, 63, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(630, 290, 280, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 420, 680, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Suggestion:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(220, 360, 160, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(220, 460, 670, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(220, 510, 670, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(220, 550, 680, 40);

        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(130, 800, 490, 40);

        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(130, 840, 540, 40);

        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(130, 900, 590, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(220, 590, 650, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(220, 640, 680, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(220, 680, 710, 50);

        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(-60, 0, 40, 1220);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthylifestyle/_cafcda04-1329-11e9-910e-2eacbc0579ab.jpg"))); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(-232, -116, 2590, 1050);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed

      // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:  double weightF=Double.parseDouble(weight.getText());
         
        
        
        try
        {
            int c;
            FileReader info=new FileReader("user_information.txt");
            while((c=info.read())!=-1)
            {
                System.out.println((char)c);
            }
            info.close();
        }catch(Exception e)
        {
            System.out.println(e);
            
        }
        double weightF=Double.parseDouble(jTextField1.getText());
        double feet=Double.parseDouble(jTextField2.getText());
        double inche=Double.parseDouble(jTextField3.getText());
        double finalheight=(feet*0.3048)+(inche*0.0254);
        double bmi=weightF/(finalheight*finalheight);
        ans=String.format("%.00f", bmi);
        jTextField4.setText(ans);
        
        if(bmi<=18.5)
        {
            jTextField4.setOpaque(true);
            jTextField4.setBackground(Color.blue);
            jLabel4.setForeground(Color.blue);
            jLabel4.setText("UnderWeight");
            String s="Eat less caloric food\t\t\t\t"+"\n"+"\n\n "+"\t\nDo 30 minute workout\n\n\n\n"+"\n" +"\n\n   "  + "Take 15 mintues deep meditation\n\n\n\n" +"\n" +"\n\n  Sleep early\n\n\n\n"+"\n"+"\n\n  You should perform sport activities\n\n\n"+"\n"+"\n\n\n  To avoid osteoprosis take more vitamin D and calcium "+"\n"+"  Take proper rest";
            
            jLabel6.setForeground(Color.blue);
            jLabel6.setText("1.Eat less caloric food"); 
            jLabel8.setForeground(Color.blue);
            jLabel8.setText("2.Do 30 minute workout"); 
            jLabel9.setForeground(Color.blue);
            jLabel9.setText("3.Take 15 mintues deep meditation"); 
            jLabel10.setForeground(Color.blue);
            jLabel10.setText("4.Sleep early"); 
            jLabel14.setForeground(Color.blue);
            jLabel14.setText("5.You should perform sport activities"); 
            jLabel15.setForeground(Color.blue);
            jLabel15.setText("6.To avoid osteoprosis take more vitamin D and calcium "); 
            jLabel16.setForeground(Color.blue);
            jLabel16.setText("7.Take proper rest"); 
            
        }
        else if(bmi<=24.5)
        {
            jTextField4.setOpaque(true);
            jTextField4.setBackground(Color.green);
            jLabel4.setForeground(Color.green);
            jLabel4.setText("Normal Weight");
            String s="Have low fat,low sugar food\n\n\n\n"+"\n"+"\n\n  Do 1 or 2 hours aerobic activity\n\n\n\n"+"\n"+"\n\n  Take 20 mintues deep meditation\n\n\n\n"+"\n"+"\n\n\n  Sleep atleast 8 hours\n\n\n"+"\n"+"\n\n\n   Seat less and move more\n\n\n"+"\n"+"\n\n\n  Limit alcohole intake\n\n\n"+"\n"+"\n\n\n  Join gym or bicycling\n\n\n";
           
         
             jLabel6.setForeground(Color.green);
            jLabel6.setText("1.Have low fat,low sugar food"); 
            jLabel8.setForeground(Color.green);
            jLabel8.setText("2.Do 1 or 2 hours aerobic activity"); 
            jLabel9.setForeground(Color.green);
            jLabel9.setText("3. Take 20 mintues deep meditation"); 
            jLabel10.setForeground(Color.green);
            jLabel10.setText("4.Sleep atleast 8 hours"); 
            jLabel14.setForeground(Color.green);
            jLabel14.setText("5.Seat less and move more"); 
            jLabel15.setForeground(Color.green);
            jLabel15.setText("6. Limit alcohole intake"); 
            jLabel16.setForeground(Color.green);
            jLabel16.setText("7.Join gym or bicycling");   
            
        }
        else if(bmi<=29.5)
        {
            jTextField4.setOpaque(true);
            jTextField4.setBackground(Color.orange);
            jLabel4.setForeground(Color.orange);
            jLabel4.setText("Over Weight");
            String s="Avoid fiber rich,low fat food\n\n\n\n"+"  Stay physically active with regular exercise\n\n\n\n"+"  Take all meditation directed by your doctor\n\n\n\n"+"  Get sleep that your body needs\n\n\n\n"+"  Walk 30 minutes daily\n\n\n"+"  Be determine to have a healthy life\n\n\n "+"  Don't be depress about your size\n\n\n";
            jLabel6.setForeground(Color.orange);
            jLabel6.setText("1.Avoid fiber rich,low fat food"); 
            jLabel8.setForeground(Color.orange);
            jLabel8.setText("2.Stay physically active with regular exercise"); 
            jLabel9.setForeground(Color.orange);
            jLabel9.setText("3. Take all meditation directed by your doctor"); 
            jLabel10.setForeground(Color.orange);
            jLabel10.setText("4.Get sleep that your body needs"); 
            jLabel14.setForeground(Color.orange);
            jLabel14.setText("5. Walk 30 minutes daily"); 
            jLabel15.setForeground(Color.orange);
            jLabel15.setText("6.Be determine to have a healthy life"); 
            jLabel16.setForeground(Color.orange);
            jLabel16.setText("7. Don't be depress about your size"); 
            
            
        }
        else if(bmi>=30)
        {
             jTextField4.setOpaque(true);
            jTextField4.setBackground(Color.red);
            jLabel4.setForeground(Color.red);
            jLabel4.setText("Obese");
            String s="Drink water specially before meal\n\n\n\n"+"\n\n\n  Eat eggs for breakfast\n\n\n\n"+"\n\n  Try Intermittent Fasting\n\n\n\n"+"\n\n\n  Take a Gulcomannan Supplement\n\n\n\n"+"\n\n\n  Eat less refined carbs\n\n\n"+"\n\n\n  Take probiotic supplement\n\n\n "+"\n\n\n  Do aerobic exercise\n\n\n";
            jLabel6.setForeground(Color.red);
            jLabel6.setText("1.Drink water specially before meal"); 
            jLabel8.setForeground(Color.red);
            jLabel8.setText("2.Eat eggs for breakfast"); 
            jLabel9.setForeground(Color.red);
            jLabel9.setText("3.Try Intermittent Fasting"); 
            jLabel10.setForeground(Color.red);
            jLabel10.setText("4.Take a Gulcomannan Supplement"); 
            jLabel14.setForeground(Color.red);
            jLabel14.setText("5.Eat less refined carbs"); 
            jLabel15.setForeground(Color.red);
            jLabel15.setText("6.Take probiotic supplement"); 
            jLabel16.setForeground(Color.red);
            jLabel16.setText("7.Do aerobic exercise"); 
            
        }
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        menu m=new menu();
        m.setVisible(true);  
        new newSubmit11().setVisible(false);
          dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(newSubmit11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newSubmit11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newSubmit11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newSubmit11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newSubmit11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


