
package optical_clinic;
import database_connector.DBKonek;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Patient extends javax.swing.JFrame {

    
    private Connection kon;
    public Patient() {
        initComponents();
        DBKonek db = new DBKonek();
        kon = db.getConnection();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        PN = new javax.swing.JTextField();
        PC = new javax.swing.JTextField();
        PA = new javax.swing.JTextField();
        PI = new javax.swing.JComboBox<>();
        PMH = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        PG = new javax.swing.JComboBox<>();
        PAG = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        searchInput = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(35, 57, 93));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(151, 213, 224));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 40)); // NOI18N
        jLabel6.setText("Patient Registration");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(572, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 9, 1220, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 20)); // NOI18N
        jLabel2.setText("Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 31));

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 20)); // NOI18N
        jLabel3.setText("Age");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 31));

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 20)); // NOI18N
        jLabel4.setText("Contact Number");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 206, 31));

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 20)); // NOI18N
        jLabel5.setText("Address");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 1, 20)); // NOI18N
        jLabel7.setText("Insurance");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 31));

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 1, 20)); // NOI18N
        jLabel8.setText("Medical History");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 37));

        jButton1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 117, 42));

        PN.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        PN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        PN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PNActionPerformed(evt);
            }
        });
        jPanel3.add(PN, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 330, 31));

        PC.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        PC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        PC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCActionPerformed(evt);
            }
        });
        PC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PCKeyTyped(evt);
            }
        });
        jPanel3.add(PC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 330, 31));

        PA.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        PA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        PA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAActionPerformed(evt);
            }
        });
        jPanel3.add(PA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 330, 31));

        PI.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        PI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Short-Term Health Insurance", "Medicare", "Medicaid", "TRICARE", "VA Health Benefits", "Dental Insurance", "Vision Insurance", "Critical Illness Insurance", "Hospital Indemnity Insurance", "Accident Insurance", "Long-Term Care Insurance", "International Health Insurance", "Student Health Insurance", "Travel Health Insurance", "COBRA", "Others" }));
        PI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        PI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PIActionPerformed(evt);
            }
        });
        jPanel3.add(PI, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 330, 31));

        PMH.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        PMH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Eye Conditions", "Eye Surgeries and Procedures", "Eye Injuries", "Family Eye Health History", "Other Relevant Health Conditions", "Symptoms or Current Concerns" }));
        PMH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPanel3.add(PMH, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 330, 31));

        jButton2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton2.setText("Clear");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 117, 42));

        jLabel9.setFont(new java.awt.Font("Lucida Bright", 1, 20)); // NOI18N
        jLabel9.setText("Gender");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 31));

        PG.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        PG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None ", "Male", "Female", " ", " " }));
        PG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        PG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PGActionPerformed(evt);
            }
        });
        jPanel3.add(PG, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 330, 33));

        PAG.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        PAG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        PAG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAGActionPerformed(evt);
            }
        });
        PAG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PAGKeyTyped(evt);
            }
        });
        jPanel3.add(PAG, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 330, 31));

        jButton3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton3.setText("Search");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 90, 30));

        jButton5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton5.setText("Remove");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, 40));

        jButton6.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton6.setText("Update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, 40));

        jButton4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton4.setText("View");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 117, 42));

        searchInput.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jPanel3.add(searchInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 220, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 76, 559, 490));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, 435));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3)));
        jScrollPane1.setFont(new java.awt.Font("Lucida Sans", 0, 8)); // NOI18N

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jTable1.setFont(new java.awt.Font("Lucida Sans", 1, 9)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Gender", "ContactNumber", "Address", "Insurance", "MedicalHistory"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 430, 490));

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton8.setText("PAYMENT");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.white));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 200, 70));

        jButton9.setBackground(new java.awt.Color(209, 234, 240));
        jButton9.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jButton9.setText("PATIENT REGISTRATAION");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.white));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 220, 60));

        jButton10.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton10.setText("APPOINTMENT");
        jButton10.setBorder(null);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 60));

        jButton11.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton11.setText("EXAMINATION");
        jButton11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.white));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 60));

        jButton12.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton12.setText("PRESCRIPTION");
        jButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.white));
        jPanel9.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 60));

        jButton13.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton13.setText("SOLUTION");
        jButton13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.white));
        jPanel9.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 60));

        jButton14.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton14.setText("FRAME");
        jButton14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.white));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 60));

        jButton15.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton15.setText("LENS");
        jButton15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.white));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 60));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 200, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PCActionPerformed

    private void PCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PCKeyTyped
        // TODO add your handling code here:
        char a = evt.getKeyChar();
        if (Character.isLetter(a)) {
            PC.setEditable(false);
        }
        else{
            PC.setEditable(true);
        }
    }//GEN-LAST:event_PCKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = PN.getText().toString();
        String age = PAG.getText().toString();
        String gender = PG.getSelectedItem().toString();
        String contactnumber = PC.getText().toString();
        String address = PA.getText().toString();
        String insurance = PI.getSelectedItem().toString();
        String medicalhistory = PMH.getSelectedItem().toString();

        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "NAME IS REQUIRED!!!");
        }
        else if(age.equals("")){
            JOptionPane.showMessageDialog(null, "AGE IS REQUIRED!!!");
        }
        else if(gender.equals("None")){
            JOptionPane.showMessageDialog(null, "GENDER IS REQUIRED!!!");
        }
        else if(contactnumber.equals("")){
            JOptionPane.showMessageDialog(null, "CONTACT NUMBER IS REQUIRED!!!");
        }
        else if(address.equals("")){
            JOptionPane.showMessageDialog(null, "ADDRESS IS REQUIRED!!!");
        }
        else if(insurance.equals("")){
            JOptionPane.showMessageDialog(null, "INSURANCE IS REQUIRED!!!");
        }
        else if(medicalhistory.equals("")){
            JOptionPane.showMessageDialog(null, "MEDICAL HISTORY IS REQUIRED!!!");
        }
        else{
            try{
                Statement state = kon.createStatement();
                String query = "INSERT INTO `patients` (`patientID`, `patientName`, `patientAge`, `gender`, `contactNumber`, `address`, `insurance`, `medicalHistory`) VALUES (NULL, '"+name+"', '"+age+"', '"+gender+"', '"+contactnumber+"', '"+address+"', '"+insurance+"', '"+medicalhistory+"')";
                state.execute(query);
                JOptionPane.showMessageDialog(rootPane, "String query = \"INSERT INTO `patients` (`patientID`, `patientName`, `patientAge`, `gender`, `contactNumber`, `address`, `insurance`, `medicalHistory`) VALUES (NULL, '\"+name+\"', '\"+age+\"', '\"+gender+\"', '\"+contactnumber+\"', '\"+address+\"', '\"+insurance+\"', '\"+medicalhistory+\"')\"");
                JOptionPane.showMessageDialog(rootPane, "Record Added");
                 
       
            } 
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Failed to add record: " + e.getMessage());
            }
        }
        populateHomeTable();
        PN.setText("");
        PAG.setText("");
        PG.setSelectedItem("None");
        PC.setText("");
        PA.setText("");
        PI.setSelectedItem("None");
        PMH.setSelectedItem("None");    

    }//GEN-LAST:event_jButton1ActionPerformed
    public void populateHomeTable() {
        try {
            String query = "SELECT * FROM `patients`";
            Statement state = kon.createStatement();
            ResultSet rs = state.executeQuery(query);

            // Create table model
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Patient ID");
            model.addColumn("Name");
            model.addColumn("Age");
            model.addColumn("Gender");
            model.addColumn("Contact");
            model.addColumn("Address");
            model.addColumn("Insurance");
            model.addColumn("Medical History");

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("patientID"),
                    rs.getString("patientName"),
                    rs.getString("patientAge"),
                    rs.getString("gender"),
                    rs.getString("contactNumber"),
                    rs.getString("address"),
                    rs.getString("insurance"),
                    rs.getString("medicalHistory")
                });
            }
            jTable1.setModel(model);

            // Set column widths
            jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Disable auto-resize
            TableColumnModel columnModel = jTable1.getColumnModel();

            columnModel.getColumn(0).setPreferredWidth(80);  // Patient ID
            columnModel.getColumn(1).setPreferredWidth(150); // Name
            columnModel.getColumn(2).setPreferredWidth(50);  // Age
            columnModel.getColumn(3).setPreferredWidth(70);  // Gender
            columnModel.getColumn(4).setPreferredWidth(120); // Contact
            columnModel.getColumn(5).setPreferredWidth(200); // Address
            columnModel.getColumn(6).setPreferredWidth(150); // Insurance
            columnModel.getColumn(7).setPreferredWidth(180); // Medical History
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Error loading data: " + e.getMessage());
        }
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        PN.setText("");
        PAG.setText("");
        PG.setSelectedItem("None");
        PC.setText("");
        PA.setText("");
        PI.setSelectedItem("None");
        PMH.setSelectedItem("None");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void PGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PGActionPerformed

    private void PAGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PAGActionPerformed

    private void PAGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PAGKeyTyped
        // TODO add your handling code here:
        char a = evt.getKeyChar();
        if (Character.isLetter(a)) {
            PAG.setEditable(false);
        }
        else{
            PAG.setEditable(true);
        }
        
    }//GEN-LAST:event_PAGKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String patientName = PN.getText().toString(); // Assuming PID is a JTextField for inputting the Patient ID to delete.

        if (patientName.equals("")) {
            JOptionPane.showMessageDialog(null, "PATIENT NAME IS REQUIRED TO DELETE A RECORD!!!");
        }
        else {
            // Confirm deletion
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove this appointment?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    Statement state = kon.createStatement();
                    String query = "DELETE FROM `patients` WHERE `patientName` = '" + patientName + "'";
                    int rowsAffected = state.executeUpdate(query);

                    if (rowsAffected > 0) {

                        JOptionPane.showMessageDialog(rootPane, "Record Deleted Successfully");
                    } 
                    else {
                        JOptionPane.showMessageDialog(rootPane, "No Record Found with Patient Name: " + patientName);
                    }
                } 
                catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Failed to delete record: " + e.getMessage());
                }
            }
        }
        populateHomeTable();
        PN.setText("");
        PAG.setText("");
        PG.setSelectedItem("None");
        PC.setText("");
        PA.setText("");
        PI.setSelectedItem("None");
        PMH.setSelectedItem("None");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
       populateHomeTable();
        // Ask for Patient ID
        String patientID = JOptionPane.showInputDialog("Enter Patient ID to update:");

        // Check if Patient ID is provided
        if (patientID == null || patientID.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "PATIENT ID IS REQUIRED!!!");
            return;
        }

        try {
            // Prompt the user to select the field they want to update
            String[] options = {"Name", "Age", "Gender", "Contact Number", "Address", "Insurance", "Medical History"};
            String choice = (String) JOptionPane.showInputDialog(
                null,
                "What would you like to update?",
                "Update Options",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
            );

            if (choice == null) {
                JOptionPane.showMessageDialog(null, "No update option selected.");
                return;
            }

            String query = "";
            Statement state = kon.createStatement();

            // Prompt the user to fill out the field they selected for update
            switch (choice) {
                case "Name":
                    String name = JOptionPane.showInputDialog("Enter new Name:");
                    if (name == null || name.trim().equals("")) {
                        JOptionPane.showMessageDialog(null, "Name is required!");
                        return;
                    }
                    query = "UPDATE `patients` SET `patientName` = '" + name + "' WHERE `patientID` = '" + patientID + "'";
                    break;

                case "Age":
                    String age = JOptionPane.showInputDialog("Enter new Age:");
                    if (age == null || age.trim().equals("")) {
                        JOptionPane.showMessageDialog(null, "Age is required!");
                        return;
                    }
                    query = "UPDATE `patients` SET `patientAge` = '" + age + "' WHERE `patientID` = '" + patientID + "'";
                    break;

                case "Gender":
                    String gender = JOptionPane.showInputDialog("Enter new Gender:");
                    if (gender == null || gender.trim().equals("")) {
                        JOptionPane.showMessageDialog(null, "Gender is required!");
                        return;
                    }
                    query = "UPDATE `patients` SET `gender` = '" + gender + "' WHERE `patientID` = '" + patientID + "'";
                    break;

                case "Contact Number":
                    String contactNumber = JOptionPane.showInputDialog("Enter new Contact Number:");
                    if (contactNumber == null || contactNumber.trim().equals("")) {
                        JOptionPane.showMessageDialog(null, "Contact Number is required!");
                        return;
                    }
                    query = "UPDATE `patients` SET `contactNumber` = '" + contactNumber + "' WHERE `patientID` = '" + patientID + "'";
                    break;

                case "Address":
                    String address = JOptionPane.showInputDialog("Enter new Address:");
                    if (address == null || address.trim().equals("")) {
                        JOptionPane.showMessageDialog(null, "Address is required!");
                        return;
                    }
                    query = "UPDATE `patients` SET `address` = '" + address + "' WHERE `patientID` = '" + patientID + "'";
                    break;

                case "Insurance":
                    String insurance = JOptionPane.showInputDialog("Enter new Insurance:");
                    if (insurance == null || insurance.trim().equals("")) {
                        JOptionPane.showMessageDialog(null, "Insurance is required!");
                        return;
                    }
                    query = "UPDATE `patients` SET `insurance` = '" + insurance + "' WHERE `patientID` = '" + patientID + "'";
                    break;

                case "Medical History":
                    String medicalHistory = JOptionPane.showInputDialog("Enter new Medical History:");
                    if (medicalHistory == null || medicalHistory.trim().equals("")) {
                        JOptionPane.showMessageDialog(null, "Medical History is required!");
                        return;
                    }
                    query = "UPDATE `patients` SET `medicalHistory` = '" + medicalHistory + "' WHERE `patientID` = '" + patientID + "'";
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid selection.");
                    return;
            }

            // Execute the query
            int rowsAffected = state.executeUpdate(query);

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(rootPane, choice + " Updated Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "No record found with the given Patient ID");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed to update record: " + e.getMessage());
        }

        // Refresh table and reset fields
        populateHomeTable();
        PN.setText("");
        PAG.setText("");
        PG.setSelectedItem("None");
        PC.setText("");
        PA.setText("");
        PI.setSelectedItem("None");
        PMH.setSelectedItem("None");                 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void PNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PNActionPerformed

    private void PIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PIActionPerformed

    private void PAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PAActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        Appointment AT = new Appointment();
        AT.setVisible(true);
        AT.pack();
        AT.setLocationRelativeTo(null);
        dispose(); 
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        populateHomeTable();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PA;
    private javax.swing.JTextField PAG;
    private javax.swing.JTextField PC;
    private javax.swing.JComboBox<String> PG;
    private javax.swing.JComboBox<String> PI;
    private javax.swing.JComboBox<String> PMH;
    private javax.swing.JTextField PN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField searchInput;
    // End of variables declaration//GEN-END:variables
}
