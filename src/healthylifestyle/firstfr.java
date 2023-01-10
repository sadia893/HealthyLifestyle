package healthylifestyle;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class firstfr extends javax.swing.JFrame {

    private Connection con;
    private Statement st;
    private ResultSet rs;
    int loginapproval = 0;

    public firstfr() {
        initComponents();
        //setSize(1300,900);
        setLocationRelativeTo(null);
        setTitle("  HEALTHY LIFESTYLE  ");
        try{
       Class.forName("com.mysql.jdbc.Driver");
       con=DriverManager.getConnection("jdbc:mysql://:3306/healthylifestyle","root","");
       st=con.createStatement();
    }catch(Exception e)
    {
        System.out.println(e);
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        password_tfld = new javax.swing.JTextField();
        username_tfld = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        signup = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(980, 850));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(password_tfld);
        password_tfld.setBounds(150, 300, 260, 40);
        getContentPane().add(username_tfld);
        username_tfld.setBounds(150, 240, 260, 40);

        login.setText("LOG IN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(220, 360, 80, 23);

        signup.setText("SIGN UP");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        getContentPane().add(signup);
        signup.setBounds(300, 440, 80, 23);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 310, 100, 20);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("don't have an account?");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 440, 150, 20);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 250, 100, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthylifestyle/shutterstock_158901398.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -40, 1310, 860);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        user_information uf = new user_information();
        uf.setVisible(true);
        new firstfr().setVisible(false);
        dispose();

    }//GEN-LAST:event_signupActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String username = username_tfld.getText();
        String password = password_tfld.getText();
        if (username.isEmpty() || password.isEmpty())
            JOptionPane.showMessageDialog(null, "please give valid username and password");
        else {
            String query = "Select * FROM userinformation";
            try {
                rs = st.executeQuery(query);
                //     System.out.println("results from the query :");
                while (rs.next()) {
                    String uname = rs.getString("Username");
                    String p = rs.getString("Password");
                    System.out.println(uname + "   " + p);
                    if (username.equals(uname) && password.equals(p)) {
                        loginapproval = 1;
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            if (loginapproval == 1) {
                menu m = new menu();
                m.setVisible(true);
                new firstfr().setVisible(false);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "this account does not exist");
            }

    }//GEN-LAST:event_loginActionPerformed

    }

    
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
            java.util.logging.Logger.getLogger(firstfr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(firstfr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(firstfr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(firstfr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new firstfr().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton login;
    private javax.swing.JTextField password_tfld;
    private javax.swing.JButton signup;
    private javax.swing.JTextField username_tfld;
    // End of variables declaration//GEN-END:variables
}
