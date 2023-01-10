package healthylifestyle;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.io.*;
import static java.lang.Double.parseDouble;

public class user_information extends javax.swing.JFrame {

    String name, gender, uname, password;
    double age, height, weight, feet, inch;
    private Connection con;
    private Statement st;
    private ResultSet rs;

    public user_information() {
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
        weight_tfld = new javax.swing.JTextField();
        kg_label = new javax.swing.JLabel();
        feet_tfld = new javax.swing.JTextField();
        feet_label = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        username_tfld = new javax.swing.JTextField();
        passw = new javax.swing.JLabel();
        passw_tfld = new javax.swing.JTextField();
        gend = new javax.swing.JComboBox<>();
        inch_tfld = new javax.swing.JTextField();
        inch_label = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 850));
        setResizable(false);
        getContentPane().setLayout(null);

        gender_label.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        gender_label.setText("Gender :");
        getContentPane().add(gender_label);
        gender_label.setBounds(70, 200, 106, 47);

        name_label.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        name_label.setText("Name :");
        getContentPane().add(name_label);
        name_label.setBounds(70, 80, 106, 47);

        age_label.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        age_label.setText("Age    :");
        getContentPane().add(age_label);
        age_label.setBounds(70, 140, 106, 47);

        height_label.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        height_label.setText("Height :");
        getContentPane().add(height_label);
        height_label.setBounds(70, 250, 106, 47);

        weight_label.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        weight_label.setText("Weight :");
        getContentPane().add(weight_label);
        weight_label.setBounds(60, 320, 106, 47);
        getContentPane().add(name_tfld);
        name_tfld.setBounds(210, 90, 295, 40);
        getContentPane().add(age_tfld);
        age_tfld.setBounds(210, 140, 80, 40);
        getContentPane().add(weight_tfld);
        weight_tfld.setBounds(210, 330, 90, 40);

        kg_label.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        kg_label.setForeground(new java.awt.Color(255, 255, 255));
        kg_label.setText("kG");
        getContentPane().add(kg_label);
        kg_label.setBounds(320, 340, 22, 26);
        getContentPane().add(feet_tfld);
        feet_tfld.setBounds(210, 260, 60, 40);

        feet_label.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        feet_label.setForeground(new java.awt.Color(255, 255, 255));
        feet_label.setText("feet");
        getContentPane().add(feet_label);
        feet_label.setBounds(280, 270, 50, 26);

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

        username.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        username.setText("Username :");
        getContentPane().add(username);
        username.setBounds(60, 580, 140, 47);
        getContentPane().add(username_tfld);
        username_tfld.setBounds(200, 590, 295, 40);

        passw.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        passw.setText("Password :");
        getContentPane().add(passw);
        passw.setBounds(60, 650, 140, 47);
        getContentPane().add(passw_tfld);
        passw_tfld.setBounds(200, 650, 295, 40);

        gend.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gend.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male", " " }));
        gend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(gend);
        gend.setBounds(210, 210, 90, 30);
        getContentPane().add(inch_tfld);
        inch_tfld.setBounds(350, 260, 60, 40);

        inch_label.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        inch_label.setForeground(new java.awt.Color(255, 255, 255));
        inch_label.setText("inch");
        getContentPane().add(inch_label);
        inch_label.setBounds(420, 270, 50, 26);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthylifestyle/cbea2afacef63884c737f395c167a803.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(-10, -19, 1150, 860);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        name = name_tfld.getText();
        age = parseDouble(age_tfld.getText());
        feet = parseDouble(feet_tfld.getText());
        inch = parseDouble(inch_tfld.getText());
        height = feet + (inch / 10);
        weight = parseDouble(weight_tfld.getText());
        gender = (gend.getSelectedItem()).toString();
        uname = username_tfld.getText();
        password = passw_tfld.getText();
        new newSubmit11(weight, feet, inch).setVisible(true);
        new friday_todo_list(uname);
        try {
            String query = "Insert INTO userinformation VALUES('" + name + "','" + age + "','" + gender + "','" + height + "','" + weight + "','" + uname + "','" + password + "')";
            st.execute(query);
        } catch (Exception e) {
            System.out.println(e);
        }
  
    }//GEN-LAST:event_submitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        firstfr m = new firstfr();
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
    private javax.swing.JLabel bg;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel feet_label;
    private javax.swing.JTextField feet_tfld;
    private javax.swing.JComboBox<String> gend;
    private javax.swing.JLabel gender_label;
    private javax.swing.JLabel height_label;
    private javax.swing.JLabel inch_label;
    private javax.swing.JTextField inch_tfld;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel kg_label;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField name_tfld;
    private javax.swing.JLabel passw;
    private javax.swing.JTextField passw_tfld;
    private javax.swing.JButton submit;
    private javax.swing.JLabel username;
    private javax.swing.JTextField username_tfld;
    private javax.swing.JLabel weight_label;
    private javax.swing.JTextField weight_tfld;
    // End of variables declaration//GEN-END:variables
}
