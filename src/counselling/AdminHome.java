package counselling;

public class AdminHome extends javax.swing.JFrame {
    public AdminHome() {
        initComponents();
         this.setSize(600,600);
        this.setBounds(200,150,510,500);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu6 = new java.awt.PopupMenu();
        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        AddquestBtn = new java.awt.Button();
        AddcollegeNameBtn = new java.awt.Button();
        jButton1 = new javax.swing.JButton();
        button1 = new java.awt.Button();

        popupMenu6.setLabel("Add Questions");
        popupMenu6.getAccessibleContext().setAccessibleParent(AddquestBtn);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(0, 204, 204));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 0, 0));
        label1.setText("Admin Home");

        AddquestBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        AddquestBtn.setForeground(new java.awt.Color(204, 102, 0));
        AddquestBtn.setLabel("Add Questions and Answer");
        AddquestBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddquestBtnMouseClicked(evt);
            }
        });
        AddquestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddquestBtnActionPerformed(evt);
            }
        });

        AddcollegeNameBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        AddcollegeNameBtn.setForeground(new java.awt.Color(204, 102, 0));
        AddcollegeNameBtn.setLabel("Add Course");
        AddcollegeNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddcollegeNameBtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 153));
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        button1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(204, 102, 0));
        button1.setLabel("View Student Details");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddquestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddcollegeNameBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(46, 46, 46)
                .addComponent(AddquestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(AddcollegeNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddquestBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddquestBtnMouseClicked

       
    }//GEN-LAST:event_AddquestBtnMouseClicked

    private void AddcollegeNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddcollegeNameBtnActionPerformed
this.setVisible(false);
new AdminAddCourse().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_AddcollegeNameBtnActionPerformed

    private void AddquestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddquestBtnActionPerformed
    this.setVisible(false);
new AddQuestionAnswers().setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_AddquestBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.setVisible(false);
new AdminLogin().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
   this.setVisible(false);
   new Results().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button AddcollegeNameBtn;
    private java.awt.Button AddquestBtn;
    private java.awt.Button button1;
    private javax.swing.JButton jButton1;
    private java.awt.Label label1;
    private java.awt.Panel panel1;
    private java.awt.PopupMenu popupMenu6;
    // End of variables declaration//GEN-END:variables
}
