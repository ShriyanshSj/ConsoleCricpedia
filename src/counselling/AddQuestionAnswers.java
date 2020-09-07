package counselling;

import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

public class AddQuestionAnswers extends javax.swing.JFrame {
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    Statement st;
    String qry;
    public AddQuestionAnswers() {
        initComponents();
         this.setSize(600,600);
        this.setBounds(200,150,510,500);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        QuestionLbl = new javax.swing.JLabel();
        AnswerLbl = new javax.swing.JLabel();
        QuestionTxt = new javax.swing.JTextField();
        AnswerTxt = new javax.swing.JTextField();
        SubmitBtn = new javax.swing.JButton();
        StreamLbl = new javax.swing.JLabel();
        StreamCmb = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        QnoCmb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Add Questions And Answers");

        QuestionLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        QuestionLbl.setForeground(new java.awt.Color(0, 0, 102));
        QuestionLbl.setText("Question:");

        AnswerLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AnswerLbl.setForeground(new java.awt.Color(0, 51, 102));
        AnswerLbl.setText("Answer");

        QuestionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionTxtActionPerformed(evt);
            }
        });

        SubmitBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SubmitBtn.setForeground(new java.awt.Color(102, 255, 0));
        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        StreamLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        StreamLbl.setForeground(new java.awt.Color(0, 0, 102));
        StreamLbl.setText("Stream:");

        StreamCmb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        StreamCmb.setForeground(new java.awt.Color(0, 153, 153));
        StreamCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PCM", "PCB", "COMMERCE", "ARTS" }));
        StreamCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StreamCmbActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 255, 51));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        QnoCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.", "2.", "3.", "4.", "5." }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Qno.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(SubmitBtn)
                        .addGap(36, 36, 36)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(StreamLbl)
                                .addGap(36, 36, 36))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StreamCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QnoCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QuestionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AnswerLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AnswerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QuestionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StreamLbl)
                    .addComponent(StreamCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QnoCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuestionLbl)
                    .addComponent(QuestionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnswerLbl)
                    .addComponent(AnswerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitBtn)
                    .addComponent(jButton2))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuestionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuestionTxtActionPerformed

    private void StreamCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StreamCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StreamCmbActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
 try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/counselling", "root", "root");
        } catch (SQLException ex) {
            Logger.getLogger(AdminHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(con!=null)
 
        
        {
            if(StreamCmb.getSelectedItem().equals("PCM")) 
        
            qry="insert into pcmquest values(?,?,?,?)";
            try {
                pst=con.prepareStatement(qry);
            } catch (SQLException ex) {
                Logger.getLogger(AdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                pst.setString(1,(String) StreamCmb.getSelectedItem());
                pst.setString(2,(String) QnoCmb.getSelectedItem());
                pst.setString(3,(String) QuestionTxt.getText().trim());
                pst.setString(4,(String) AnswerTxt.getText().trim());
               int count=pst.executeUpdate();
               if(count>0)
               {
                   JOptionPane.showMessageDialog(this, "Data Inserted Successfully");
                   this.StreamCmb.setSelectedItem("");
                   this.QnoCmb.setSelectedItem("");
                   this.QuestionTxt.setText("");
                   this.AnswerTxt.setText("");
                   
               }
               con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
              if(StreamCmb.getSelectedItem().equals("PCB")) 
        
            qry="insert into pcbquest values(?,?,?,?)";
            try {
                pst=con.prepareStatement(qry);
            } catch (SQLException ex) {
                Logger.getLogger(AdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                pst.setString(1,(String) StreamCmb.getSelectedItem());
                pst.setString(2,(String) QnoCmb.getSelectedItem());
                pst.setString(3,(String) QuestionTxt.getText().trim());
                pst.setString(4,(String) AnswerTxt.getText().trim());
               int count=pst.executeUpdate();
               if(count>0)
               {
                   JOptionPane.showMessageDialog(this, "Data Inserted Successfully");
                   this.StreamCmb.setSelectedItem("");
                   this.QnoCmb.setSelectedItem("");
                   this.QuestionTxt.setText("");
                   this.AnswerTxt.setText("");
                   
               }
               con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        if(StreamCmb.getSelectedItem().equals("COMMERCE")) 
        
            qry="insert into comquest values(?,?,?,?)";
            try {
                pst=con.prepareStatement(qry);
            } catch (SQLException ex) {
                Logger.getLogger(AdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                pst.setString(1,(String) StreamCmb.getSelectedItem());
                pst.setString(2,(String) QnoCmb.getSelectedItem());
                pst.setString(3,(String) QuestionTxt.getText().trim());
                pst.setString(4,(String) AnswerTxt.getText().trim());
               int count=pst.executeUpdate();
               if(count>0)
               {
                   JOptionPane.showMessageDialog(this, "Data Inserted Successfully");
                   this.StreamCmb.setSelectedItem("");
                   this.QnoCmb.setSelectedItem("");
                   this.QuestionTxt.setText("");
                   this.AnswerTxt.setText("");
                   
               }
               con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
           if(StreamCmb.getSelectedItem().equals("ARTS")) 
        
            qry="insert into artsquest values(?,?,?,?)";
            try {
                pst=con.prepareStatement(qry);
            } catch (SQLException ex) {
                Logger.getLogger(AdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                pst.setString(1,(String) StreamCmb.getSelectedItem());
                pst.setString(2,(String) QnoCmb.getSelectedItem());
                pst.setString(3,(String) QuestionTxt.getText().trim());
                pst.setString(4,(String) AnswerTxt.getText().trim());
               int count=pst.executeUpdate();
               if(count>0)
               {
                   JOptionPane.showMessageDialog(this, "Data Inserted Successfully");
                   this.StreamCmb.setSelectedItem("");
                   this.QnoCmb.setSelectedItem("");
                   this.QuestionTxt.setText("");
                   this.AnswerTxt.setText("");
                   
               }
               con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AdminHome.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(false);
new AdminHome().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

 
  public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddQuestionAnswers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnswerLbl;
    private javax.swing.JTextField AnswerTxt;
    private javax.swing.JComboBox<String> QnoCmb;
    private javax.swing.JLabel QuestionLbl;
    private javax.swing.JTextField QuestionTxt;
    private javax.swing.JComboBox<String> StreamCmb;
    private javax.swing.JLabel StreamLbl;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
