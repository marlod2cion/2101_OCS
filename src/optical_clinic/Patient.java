
package optical_clinic;
import javax.swing.JOptionPane;

public class Patient extends javax.swing.JFrame {

    
    public Patient() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PM = new javax.swing.JComboBox<>();
        PD = new javax.swing.JComboBox<>();
        PY = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        PC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PI = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        PMH = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 550));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel2.setText("Name");

        PN.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel3.setText("DateofBirth");

        PM.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        PM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        PM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PMActionPerformed(evt);
            }
        });

        PD.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        PD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DD", "1  ", "2  ", "3  ", "4  ", "5  ", "6  ", "7  ", "8  ", "9  ", "10  ", "11  ", "12  ", "13  ", "14  ", "15  ", "16  ", "17  ", "18  ", "19  ", "20  ", "21  ", "22  ", "23  ", "24  ", "25  ", "26  ", "27  ", "28  ", "29  ", "30  ", "31" }));

        PY.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        PY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YY", "2024  ", "2023  ", "2022  ", "2021  ", "2020  ", "2019  ", "2018  ", "2017  ", "2016  ", "2015  ", "2014  ", "2013  ", "2012  ", "2011  ", "2010  ", "2009  ", "2008  ", "2007  ", "2006  ", "2005  ", "2004  ", "2003  ", "2002  ", "2001  ", "2000  ", "1999  ", "1998  ", "1997  ", "1996  ", "1995  ", "1994  ", "1993  ", "1992  ", "1991  ", "1990  ", "1989  ", "1988  ", "1987  ", "1986  ", "1985  ", "1984  ", "1983  ", "1982  ", "1981  ", "1980  ", "1979  ", "1978  ", "1977  ", "1976  ", "1975  ", "1974  ", "1973  ", "1972  ", "1971  ", "1970  ", "1969  ", "1968  ", "1967  ", "1966  ", "1965  ", "1964  ", "1963  ", "1962  ", "1961  ", "1960  ", "1959  ", "1958  ", "1957  ", "1956  ", "1955  ", "1954  ", "1953  ", "1952  ", "1951  ", "1950  ", "1949  ", "1948  ", "1947  ", "1946  ", "1945  ", "1944  ", "1943  ", "1942  ", "1941  ", "1940  ", "1939  ", "1938  ", "1937  ", "1936  ", "1935  ", "1934  ", "1933  ", "1932  ", "1931  ", "1930  ", "1929  ", "1928  ", "1927  ", "1926  ", "1925  ", "1924  ", "1923  ", "1922  ", "1921  ", "1920  ", "1919  ", "1918  ", "1917  ", "1916  ", "1915  ", "1914  ", "1913  ", "1912  ", "1911  ", "1910  ", "1909  ", "1908  ", "1907  ", "1906  ", "1905  ", "1904  ", "1903  ", "1902  ", "1901  ", "1900", " " }));

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel4.setText("ContactNumber");

        PC.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
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

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel5.setText("Address");

        PA.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel6.setText("PhoneNumber");

        PP.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        PP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PPKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel7.setText("Insurance");

        PI.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        PI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Short-Term Health Insurance", "Medicare", "Medicaid", "TRICARE", "VA Health Benefits", "Dental Insurance", "Vision Insurance", "Critical Illness Insurance", "Hospital Indemnity Insurance", "Accident Insurance", "Long-Term Care Insurance", "International Health Insurance", "Student Health Insurance", "Travel Health Insurance", "COBRA" }));

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel8.setText("MedicalHistory");

        PMH.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        PMH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Eye Conditions", "Eye Surgeries and Procedures", "Eye Injuries", "Family Eye Health History", "Other Relevant Health Conditions", "Symptoms or Current Concerns" }));

        jButton1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PA, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PC, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(159, 159, 159)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(PN)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(PM, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(PD, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(PY, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PP)
                                .addComponent(PI, 0, 311, Short.MAX_VALUE)
                                .addComponent(PMH, 0, 1, Short.MAX_VALUE)))))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(PM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PY, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PI, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PMH, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PMActionPerformed

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

    private void PPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PPKeyTyped
        // TODO add your handling code here:
        char a = evt.getKeyChar();
        if (Character.isLetter(a)) {
            PP.setEditable(false);
        }
        else{
            PP.setEditable(true);
        }
    }//GEN-LAST:event_PPKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = PN.getText().toString();
        String month = PM.getSelectedItem().toString();
        String day = PD.getSelectedItem().toString();
        String year = PY.getSelectedItem().toString();
        String contactnumber = PC.getText().toString();
        String address = PA.getText().toString();
        String phonenumber = PP.getText().toString();
        String insurance = PI.getSelectedItem().toString();
        String medicalhistory = PMH.getSelectedItem().toString();

        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "NAME IS REQUIRED!!!");
        }
        else if(month.equals("MM")){
            JOptionPane.showMessageDialog(null, "MONTH IS REQUIRED!!!");
        }
        else if(day.equals("DD")){
            JOptionPane.showMessageDialog(null, "DAY IS REQUIRED!!!");
        }
        else if(year.equals("YY")){
            JOptionPane.showMessageDialog(null, "YEAR IS REQUIRED!!!");
        }
        else if(contactnumber.equals("")){
            JOptionPane.showMessageDialog(null, "CONTACT NUMBER IS REQUIRED!!!");
        }
        else if(address.equals("")){
            JOptionPane.showMessageDialog(null, "ADDRESS IS REQUIRED!!!");
        }
        else if(phonenumber.equals("")){
            JOptionPane.showMessageDialog(null, "PHONE NUMBER IS REQUIRED!!!");
        }
        else if(insurance.equals("None")){
            JOptionPane.showMessageDialog(null, "INSURANCE IS REQUIRED!!!");
        }
        else if(medicalhistory.equals("None")){
            JOptionPane.showMessageDialog(null, "MEDICAL HISTORY IS REQUIRED!!!");
        }
        else{
            JOptionPane.showMessageDialog(null,"SUBMITED, PROCEED IN THE APPOINTMENT!!!");
            Appointment AT = new Appointment();
            AT.setVisible(true);
            AT.pack();
            AT.setLocationRelativeTo(null);
            dispose();
            

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        PN.setText("");
        PM.setSelectedItem("MM");
        PD.setSelectedItem("DD");
        PY.setSelectedItem("YY");
        PC.setText("");
        PA.setText("");
        PP.setText("");
        PI.setSelectedItem("None");
        PMH.setSelectedItem("None");

    }//GEN-LAST:event_jButton2ActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PA;
    private javax.swing.JTextField PC;
    private javax.swing.JComboBox<String> PD;
    private javax.swing.JComboBox<String> PI;
    private javax.swing.JComboBox<String> PM;
    private javax.swing.JComboBox<String> PMH;
    private javax.swing.JTextField PN;
    private javax.swing.JTextField PP;
    private javax.swing.JComboBox<String> PY;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
