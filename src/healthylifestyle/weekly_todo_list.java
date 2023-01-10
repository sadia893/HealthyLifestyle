package healthylifestyle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class weekly_todo_list extends javax.swing.JFrame {
    
    public weekly_todo_list() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("  HEALTHY LIFESTYLE  ");
        jScrollPane1.setVisible(false);
        hide_button.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbel = new javax.swing.JLabel();
        friday = new javax.swing.JButton();
        saturday1 = new javax.swing.JButton();
        sunday = new javax.swing.JButton();
        monday = new javax.swing.JButton();
        tuesday = new javax.swing.JButton();
        wednesday = new javax.swing.JButton();
        thursday = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        importance_list = new javax.swing.JList<>();
        hide_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 850));
        setResizable(false);
        getContentPane().setLayout(null);

        jlbel.setBackground(new java.awt.Color(153, 153, 255));
        jlbel.setFont(new java.awt.Font("Cambria Math", 0, 36)); // NOI18N
        jlbel.setForeground(new java.awt.Color(255, 0, 0));
        jlbel.setText("                                 Weekly To Do List");
        getContentPane().add(jlbel);
        jlbel.setBounds(20, 20, 640, 44);

        friday.setBackground(new java.awt.Color(153, 153, 255));
        friday.setFont(new java.awt.Font("Cambria Math", 2, 24)); // NOI18N
        friday.setText("Friday");
        friday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fridayActionPerformed(evt);
            }
        });
        getContentPane().add(friday);
        friday.setBounds(460, 490, 300, 37);

        saturday1.setBackground(new java.awt.Color(153, 153, 255));
        saturday1.setFont(new java.awt.Font("Cambria Math", 2, 24)); // NOI18N
        saturday1.setText("Saturday");
        saturday1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saturday1ActionPerformed(evt);
            }
        });
        getContentPane().add(saturday1);
        saturday1.setBounds(460, 190, 300, 37);

        sunday.setBackground(new java.awt.Color(153, 153, 255));
        sunday.setFont(new java.awt.Font("Cambria Math", 2, 24)); // NOI18N
        sunday.setText("Sunday");
        sunday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sundayActionPerformed(evt);
            }
        });
        getContentPane().add(sunday);
        sunday.setBounds(460, 240, 300, 37);

        monday.setBackground(new java.awt.Color(153, 153, 255));
        monday.setFont(new java.awt.Font("Cambria Math", 2, 24)); // NOI18N
        monday.setText("Monday");
        monday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mondayActionPerformed(evt);
            }
        });
        getContentPane().add(monday);
        monday.setBounds(460, 290, 300, 37);

        tuesday.setBackground(new java.awt.Color(153, 153, 255));
        tuesday.setFont(new java.awt.Font("Cambria Math", 2, 24)); // NOI18N
        tuesday.setText("Tuesday");
        tuesday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuesdayActionPerformed(evt);
            }
        });
        getContentPane().add(tuesday);
        tuesday.setBounds(460, 340, 300, 37);

        wednesday.setBackground(new java.awt.Color(153, 153, 255));
        wednesday.setFont(new java.awt.Font("Cambria Math", 2, 24)); // NOI18N
        wednesday.setText("Wednesday");
        wednesday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wednesdayActionPerformed(evt);
            }
        });
        getContentPane().add(wednesday);
        wednesday.setBounds(460, 390, 300, 37);

        thursday.setBackground(new java.awt.Color(153, 153, 255));
        thursday.setFont(new java.awt.Font("Cambria Math", 2, 24)); // NOI18N
        thursday.setText("Thursday");
        thursday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thursdayActionPerformed(evt);
            }
        });
        getContentPane().add(thursday);
        thursday.setBounds(460, 440, 300, 37);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jButton1.setText("< back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 20, 80, 31);

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jButton2.setText("why should you maintain a To Do list?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 710, 230, 30);

        importance_list.setFont(new java.awt.Font("OCR A Extended", 0, 16)); // NOI18N
        importance_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "***Having a written list helps us", "rememberwhen things have to ", "be done so we do not miss ", "anything.", " ", "***A to-do list lets you coordinate", "similar tasks.", " ", "***A to-do list helps us to avoid ", "repetition of labour.For example,", "if we have to deliver a document", "at an office and collect a document ", "from another office which is on the", "same block, both thesetasks can ", "be done together.", " ", "***A to-do list tracks your progress", "Using a to-do list enables you to", "mark off the tasks you have", "completed. At the end of the", "day, when you ", "look at the list, it will give you a ", "sense of accomplishment and ", "satisfaction.It might also have", "the effect ofwaking you up ", "if nothing has been", "marked completed.", " ", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(importance_list);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 390, 580);

        hide_button.setText("hide");
        hide_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hide_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(hide_button);
        hide_button.setBounds(140, 90, 53, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthylifestyle/clock-character-daily-routine-timetable-vector-5086501.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-139, -10, 1790, 940);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saturday1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saturday1ActionPerformed
        new weekly_todo_list().setVisible(false);
        dispose();
        saturday_todo_list show = new saturday_todo_list();
        show.setVisible(true);
    }//GEN-LAST:event_saturday1ActionPerformed

    private void sundayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sundayActionPerformed
        new weekly_todo_list().setVisible(false);
        dispose();        
        sunday_todo_list show = new sunday_todo_list();
        show.setVisible(true);
    }//GEN-LAST:event_sundayActionPerformed

    private void mondayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mondayActionPerformed
        new weekly_todo_list().setVisible(false);
        dispose();
        monday_todo_list show = new monday_todo_list();        
        show.setVisible(true);
    }//GEN-LAST:event_mondayActionPerformed

    private void tuesdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuesdayActionPerformed
        new weekly_todo_list().setVisible(false);
        dispose();        
        tuesday_todo_list show = new tuesday_todo_list();
        show.setVisible(true);
    }//GEN-LAST:event_tuesdayActionPerformed

    private void wednesdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wednesdayActionPerformed
        new weekly_todo_list().setVisible(false);
        dispose();        
        wednesday_todo_list show = new wednesday_todo_list();
        show.setVisible(true);
    }//GEN-LAST:event_wednesdayActionPerformed

    private void thursdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thursdayActionPerformed
        new weekly_todo_list().setVisible(false);
        dispose();        
        thursday_todo_list show = new thursday_todo_list();
        show.setVisible(true);
    }//GEN-LAST:event_thursdayActionPerformed

    private void fridayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fridayActionPerformed
        new weekly_todo_list().setVisible(false);
        dispose();
        friday_todo_list f = new friday_todo_list();
        f.setVisible(true);
    }//GEN-LAST:event_fridayActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        menu m = new menu();
        m.setVisible(true);
        new user_information().setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jScrollPane1.setVisible(true);
        hide_button.setVisible(true);
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void hide_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hide_buttonActionPerformed
        jScrollPane1.setVisible(false);
        hide_button.setVisible(false);
    }//GEN-LAST:event_hide_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(weekly_todo_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(weekly_todo_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(weekly_todo_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(weekly_todo_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new weekly_todo_list().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton friday;
    private javax.swing.JButton hide_button;
    private javax.swing.JList<String> importance_list;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbel;
    private javax.swing.JButton monday;
    private javax.swing.JButton saturday1;
    private javax.swing.JButton sunday;
    private javax.swing.JButton thursday;
    private javax.swing.JButton tuesday;
    private javax.swing.JButton wednesday;
    // End of variables declaration//GEN-END:variables
}
