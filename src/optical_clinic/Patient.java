
package optical_clinic;
import database_connector.DBKonek;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
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
        populateHomeTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
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
        searchField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(35, 57, 93));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1268, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(151, 213, 224));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 40)); // NOI18N
        jLabel6.setText("Patient Registration");

        jButton16.setBackground(new java.awt.Color(151, 213, 224));
        jButton16.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/house.png"))); // NOI18N
        jButton16.setBorder(null);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton16)
                .addGap(295, 295, 295)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(386, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1220, -1));

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

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-submit-new.png"))); // NOI18N
        jButton1.setText("Submit");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 100, 40));

        PN.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        PN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PNActionPerformed(evt);
            }
        });
        jPanel3.add(PN, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 330, 31));

        PC.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        PC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        PA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAActionPerformed(evt);
            }
        });
        jPanel3.add(PA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 330, 31));

        PI.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        PI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Short-Term Health Insurance", "Medicare", "Medicaid", "TRICARE", "VA Health Benefits", "Dental Insurance", "Vision Insurance", "Critical Illness Insurance", "Hospital Indemnity Insurance", "Accident Insurance", "Long-Term Care Insurance", "International Health Insurance", "Student Health Insurance", "Travel Health Insurance", "COBRA", "Others" }));
        PI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PIActionPerformed(evt);
            }
        });
        jPanel3.add(PI, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 330, 31));

        PMH.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        PMH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Eye Conditions", "Eye Surgeries and Procedures", "Eye Injuries", "Family Eye Health History", "Other Relevant Health Conditions", "Symptoms or Current Concerns", "Others" }));
        PMH.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PMHActionPerformed(evt);
            }
        });
        jPanel3.add(PMH, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 330, 31));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-clear-new.png"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 60, 30));

        jLabel9.setFont(new java.awt.Font("Lucida Bright", 1, 20)); // NOI18N
        jLabel9.setText("Gender");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 31));

        PG.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        PG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Male", "Female", "Prefer not to say" }));
        PG.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PGActionPerformed(evt);
            }
        });
        jPanel3.add(PG, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 330, 33));

        PAG.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        PAG.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 90, 30));

        jButton5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-remove-new.png"))); // NOI18N
        jButton5.setText("Remove");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 90, 40));

        jButton6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-update-new.png"))); // NOI18N
        jButton6.setText("Update");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 90, 40));

        searchField.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        searchField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        jPanel3.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 270, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 559, 460));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, 435));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setOpaque(false);
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton8.setText("PAYMENT");
        jButton8.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 200, 70));

        jButton10.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton10.setText("APPOINTMENT");
        jButton10.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 70));

        jButton11.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton11.setText("EXAMINATION");
        jButton11.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 80));

        jButton13.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton13.setText("PRODUCTS");
        jButton13.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, 80));

        jButton14.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton14.setText("REPORTS");
        jButton14.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 80));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 200, 480));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Name", "Age", "Gender", "Contact", "Address", "Insurance", "Medical History"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel5);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 440, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1253, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        Reports RP = new Reports();
        RP.setVisible(true);
        RP.pack();
        RP.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        Examination EX = new Examination();
        EX.setVisible(true);
        EX.pack();
        EX.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        Appointment AT = new Appointment();
        AT.setVisible(true);
        AT.pack();
        AT.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Payments PY = new Payments();
        PY.setVisible(true);
        PY.pack();
        PY.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // Example search by patient name or ID
            String searchInput = searchField.getText().trim(); // Get input from a search text field
        if (searchInput.isEmpty()) {
            JOptionPane.showMessageDialog(null, "SEARCH FIELD CANNOT BE EMPTY!");
        } else {
            try {
                // Use a PreparedStatement for dynamic queries
                String query = "SELECT * FROM `patients` WHERE `patientName` LIKE ? OR `patientID` = ?";
                PreparedStatement preparedStatement = kon.prepareStatement(query);
                preparedStatement.setString(1, "%" + searchInput + "%"); // Allow partial matches for name
                try {
                    preparedStatement.setInt(2, Integer.parseInt(searchInput)); // Check if input is numeric (for patient ID)
                } catch (NumberFormatException e) {
                    preparedStatement.setInt(2, -1); // Set an invalid ID for non-numeric input
                }

                // Execute the query
                ResultSet rs = preparedStatement.executeQuery();

                // Process and display results
                StringBuilder results = new StringBuilder();
                while (rs.next()) {
                    results.append("Patient ID: ").append(rs.getInt("patientID")).append("\n");
                    results.append("Name: ").append(rs.getString("patientName")).append("\n");
                    results.append("Age: ").append(rs.getString("patientAge")).append("\n");
                    results.append("Gender: ").append(rs.getString("gender")).append("\n");
                    results.append("Contact: ").append(rs.getString("contactNumber")).append("\n");
                    results.append("Address: ").append(rs.getString("address")).append("\n");
                    results.append("Insurance: ").append(rs.getString("insurance")).append("\n");
                    results.append("Medical History: ").append(rs.getString("medicalHistory")).append("\n\n");
                }

                // Show results or inform the user if no records are found
                if (results.length() > 0) {
                    JOptionPane.showMessageDialog(null, "Search Results:\n\n" + results.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "No records found for: " + searchInput);
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Failed to execute search: " + e.getMessage());
            }
        }
        searchField.setText("");

    }//GEN-LAST:event_jButton3ActionPerformed

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

    private void PAGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PAGActionPerformed

    private void PGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PGActionPerformed

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

    private void PIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PIActionPerformed
        // TODO add your handling code here:
        String insurance = PI.getSelectedItem().toString();
        if (insurance.equals("Others")) {
            String otherInsurance = JOptionPane.showInputDialog(null, "Please specify the insurance:");
            if (otherInsurance == null || otherInsurance.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "You must specify the insurance type!");
                return; 
            }

            insurance = otherInsurance.trim(); 
            
            int selectedIndex = PI.getSelectedIndex(); 
            PI.insertItemAt(insurance, selectedIndex); 
            PI.removeItemAt(selectedIndex + 1); 
            PI.setSelectedItem(insurance);
        }
    }//GEN-LAST:event_PIActionPerformed

    private void PAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PAActionPerformed

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

    private void PCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PCActionPerformed

    private void PNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PNActionPerformed

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
            try {
                Statement state = kon.createStatement();

                // Check if the patient already exists
                String checkQuery = "SELECT * FROM patients WHERE patientName = '"+name+"'";
                ResultSet resultSet = state.executeQuery(checkQuery);

                if (resultSet.next()) {
                    // Patient exists, ask if user wants to update
                    int response = JOptionPane.showConfirmDialog(null, "Patient already exists. Do you want to update their details?", "Duplicate Found", JOptionPane.YES_NO_OPTION);

                    if (response == JOptionPane.YES_OPTION) {
                        // Update existing patient details
                        String updateQuery = "UPDATE patients SET patientName = '"+name+"', patientAge = '"+age+"', gender = '"+gender+"', address = '"+address+"', insurance = '"+insurance+"', medicalHistory = '"+medicalhistory+"' WHERE contactNumber = '"+contactnumber+"'";
                        state.execute(updateQuery);
                        JOptionPane.showMessageDialog(rootPane, "Patient record updated.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No changes were made.");
                    }                   
                    PN.setText("");
                    PAG.setText("");
                    PG.setSelectedItem("None");
                    PC.setText("");
                    PA.setText("");
                    PI.setSelectedItem("None");
                    PMH.setSelectedItem("None");
                } else {
                    // Insert new patient record
                    String insertQuery = "INSERT INTO patients (patientID, patientName, patientAge, gender, contactNumber, address, insurance, medicalHistory) VALUES (NULL, '"+name+"', '"+age+"', '"+gender+"', '"+contactnumber+"', '"+address+"', '"+insurance+"', '"+medicalhistory+"')";
                    state.execute(insertQuery);
                    JOptionPane.showMessageDialog(rootPane, "New patient record added.");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Operation failed: " + e.getMessage());
            }
        }
        populateHomeTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        Product PR = new Product();
        PR.setVisible(true);
        PR.pack();
        PR.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        HomePage HP = new HomePage();
        HP.setVisible(true);
        HP.pack();
        HP.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void PMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PMHActionPerformed
        // TODO add your handling code here:
        String medicalhistory = PMH.getSelectedItem().toString();
        if (medicalhistory.equals("Others")) {
            String otherMedical = JOptionPane.showInputDialog(null, "Please specify the medical history:");
            if (otherMedical == null || otherMedical.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "You must specify your medical history!");
                return; 
            }

            medicalhistory = otherMedical.trim(); 

            int selectedIndex = PMH.getSelectedIndex(); 
            PMH.insertItemAt(medicalhistory, selectedIndex); 
            PMH.removeItemAt(selectedIndex + 1); 
            PMH.setSelectedItem(medicalhistory); 
        }
    }//GEN-LAST:event_PMHActionPerformed
    private void populateHomeTable() {
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

            int rowCount = 0;  // To count the rows added

            while (rs.next()) {
                // Handling possible null values
                String patientName = rs.getString("patientName");
                if (patientName == null) {
                    patientName = "N/A";  // Default value if null
                }

                String patientAge = rs.getString("patientAge");
                if (patientAge == null) {
                    patientAge = "Unknown";  // Default value if null
                }

                String gender = rs.getString("gender");
                if (gender == null) {
                    gender = "Not Specified";  // Default value if null
                }

                String contactNumber = rs.getString("contactNumber");
                if (contactNumber == null) {
                    contactNumber = "N/A";  // Default value if null
                }

                String address = rs.getString("address");
                if (address == null) {
                    address = "Not Available";  // Default value if null
                }

                String insurance = rs.getString("insurance");
                if (insurance == null) {
                    insurance = "Not Provided";  // Default value if null
                }

                String medicalHistory = rs.getString("medicalHistory");
                if (medicalHistory == null) {
                    medicalHistory = "No Data";  // Default value if null
                }

                // Add row to the table model
                model.addRow(new Object[]{
                    rs.getInt("patientID"),
                    patientName,
                    patientAge,
                    gender,
                    contactNumber,
                    address,
                    insurance,
                    medicalHistory
                });
                rowCount++;
            }

            // Add a row at the bottom to show the total row count
            model.addRow(new Object[]{
                "Total Rows:",
                rowCount, "", "", "", "", "", ""
            });

            // Set model to the table
            jTable1.setModel(model);

            // Customize column widths
            TableColumnModel columnModel = jTable1.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(80);  // Patient ID
            columnModel.getColumn(1).setPreferredWidth(200); // Name
            columnModel.getColumn(2).setPreferredWidth(50);  // Age
            columnModel.getColumn(3).setPreferredWidth(70);  // Gender
            columnModel.getColumn(4).setPreferredWidth(180); // Contact
            columnModel.getColumn(5).setPreferredWidth(300); // Address
            columnModel.getColumn(6).setPreferredWidth(250); // Insurance
            columnModel.getColumn(7).setPreferredWidth(250); // Medical History

            // Refresh table display
            jTable1.revalidate();
            jTable1.repaint();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Error loading data: " + e.getMessage());
        }
    }

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
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
