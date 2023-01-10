package healthylifestyle;

import java.awt.Color;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class friday_todo_list extends javax.swing.JFrame {

    int n[] = new int[18];
    private static Connection con;
    private static Statement st;
    private static ResultSet rs;
     String username, t1, t2, t3, t4, t5, t6, t7, t8, t9;
String user;
    public friday_todo_list() {
          try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://:3306/healthylifestyle", "root", "");
            st = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);

        }
        initComponents();
        setLocationRelativeTo(null);
        setTitle("  HEALTHY LIFESTYLE  ");

    }

    public friday_todo_list(String s) {

        initComponents();
       user=s;
try{
    String query="Select * FROM todolist";
    rs=st.executeQuery(query);
        
        while(rs.next())
        {
       if(rs.getString("Username").equals(user))
       {
       task1.setText(rs.getString("task1"));
       task2.setText(rs.getString("task2"));
       task3.setText(rs.getString("task3"));
       task4.setText(rs.getString("task4"));
       task5.setText(rs.getString("task5"));
       task6.setText(rs.getString("task6"));
       task7.setText(rs.getString("task7"));
       task8.setText(rs.getString("task8"));
       task9.setText(rs.getString("task9"));
       }
        }
    
    }catch(Exception e)
    {
        System.out.println(e);
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        task9 = new javax.swing.JTextField();
        task1 = new javax.swing.JTextField();
        task2 = new javax.swing.JTextField();
        task3 = new javax.swing.JTextField();
        task4 = new javax.swing.JTextField();
        task5 = new javax.swing.JTextField();
        task6 = new javax.swing.JTextField();
        task7 = new javax.swing.JTextField();
        task8 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        unam = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 850));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        jLabel1.setText("TASKS ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 140, 140, 30);
        getContentPane().add(task9);
        task9.setBounds(50, 660, 290, 50);

        task1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                task1ActionPerformed(evt);
            }
        });
        getContentPane().add(task1);
        task1.setBounds(50, 180, 290, 50);
        getContentPane().add(task2);
        task2.setBounds(50, 240, 290, 50);
        getContentPane().add(task3);
        task3.setBounds(50, 300, 290, 50);
        getContentPane().add(task4);
        task4.setBounds(50, 360, 290, 50);
        getContentPane().add(task5);
        task5.setBounds(50, 420, 290, 50);

        task6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                task6ActionPerformed(evt);
            }
        });
        getContentPane().add(task6);
        task6.setBounds(50, 480, 290, 50);
        getContentPane().add(task7);
        task7.setBounds(50, 540, 290, 50);
        getContentPane().add(task8);
        task8.setBounds(50, 600, 290, 50);

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton10.setText("done");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(440, 190, 70, 30);

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton11.setText("done");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(440, 250, 70, 30);

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton12.setText("done");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(440, 320, 70, 30);

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton13.setText("done");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(440, 380, 70, 30);

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton14.setText("done");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(440, 430, 70, 30);

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton15.setText("done");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(440, 490, 70, 30);

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton16.setText("done");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16);
        jButton16.setBounds(440, 550, 70, 30);

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton17.setText("done");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17);
        jButton17.setBounds(440, 610, 70, 30);

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton18.setText("done");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18);
        jButton18.setBounds(440, 670, 70, 30);

        jButton19.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jButton19.setText("< back");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19);
        jButton19.setBounds(10, 10, 80, 31);

        unam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unamActionPerformed(evt);
            }
        });
        getContentPane().add(unam);
        unam.setBounds(90, 80, 300, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 70, 17);

        jButton21.setText("SAVE");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21);
        jButton21.setBounds(610, 680, 100, 23);

        jButton1.setText("see saved list ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(600, 720, 110, 23);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthylifestyle/164157437-clock-wallpapers.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(-20, -70, 2150, 990);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void task6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_task6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_task6ActionPerformed

    private void task1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_task1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_task1ActionPerformed


    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (n[1] == 1) {
            task1.setBackground(new Color(153, 255, 153));
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (n[2] == 1) {
            task2.setBackground(new Color(153, 255, 153));
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if (n[3] == 1) {
            task3.setBackground(new Color(153, 255, 153));
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if (n[4] == 1) {
            task4.setBackground(new Color(153, 255, 153));
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if (n[5] == 1) {
            task5.setBackground(new Color(153, 255, 153));
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if (n[6] == 1) {
            task6.setBackground(new Color(153, 255, 153));
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if (n[7] == 1) {
            task7.setBackground(new Color(153, 255, 153));
        }

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        if (n[8] == 1) {
            task8.setBackground(new Color(153, 255, 153));
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        if (n[9] == 1) {
            task9.setBackground(new Color(153, 255, 153));
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        new friday_todo_list().setVisible(false);
        dispose();
        weekly_todo_list w = new weekly_todo_list();
        w.setVisible(true);

    }//GEN-LAST:event_jButton19ActionPerformed

    private void unamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unamActionPerformed
      
    }//GEN-LAST:event_unamActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
      username=unam.getText();
      t1=task1.getText();
      t2=task2.getText();
      t3=task3.getText();
      t4=task4.getText();
      t5=task5.getText();
      t6=task6.getText();
      t7=task7.getText();
      t8=task8.getText();
      t9=task9.getText();
       try{
   
   
    String query="Insert INTO todolist VALUES('"+username+"','"+t1+"','"+t2+"','"+t3+"','"+t4+"','"+t5+"','"+t6+"','"+t7+"','"+t8+"','"+t9+"')";
    st.execute(query);
    }catch(Exception ex)
    {
        System.out.println(ex);
    }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        try{
    String query="Select * FROM todolist";
    rs=st.executeQuery(query);
        
        while(rs.next())
        {
       if(rs.getString("Username").equals(user))
       {
       task1.setText(rs.getString("task1"));
       task2.setText(rs.getString("task2"));
       task3.setText(rs.getString("task3"));
       task4.setText(rs.getString("task4"));
       task5.setText(rs.getString("task5"));
       task6.setText(rs.getString("task6"));
       task7.setText(rs.getString("task7"));
       task8.setText(rs.getString("task8"));
       task9.setText(rs.getString("task9"));
       }
        }
    
    }catch(Exception e)
    {
        System.out.println(e);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(friday_todo_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(friday_todo_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(friday_todo_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(friday_todo_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new friday_todo_list().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton21;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JTextField task1;
    public static javax.swing.JTextField task2;
    public static javax.swing.JTextField task3;
    public static javax.swing.JTextField task4;
    public static javax.swing.JTextField task5;
    public static javax.swing.JTextField task6;
    public static javax.swing.JTextField task7;
    public static javax.swing.JTextField task8;
    public static javax.swing.JTextField task9;
    private javax.swing.JTextField unam;
    // End of variables declaration//GEN-END:variables
}
