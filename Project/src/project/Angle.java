/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class Angle extends javax.swing.JFrame {

    /**
     * Creates new form Angle
     */
    public Angle() {
        initComponents();
    }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        W = new javax.swing.JLabel();
        L = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        N = new javax.swing.JLabel();
        H = new javax.swing.JLabel();
        R = new javax.swing.JLabel();
        JW = new javax.swing.JTextField();
        JL = new javax.swing.JTextField();
        JD = new javax.swing.JTextField();
        JN = new javax.swing.JTextField();
        JH = new javax.swing.JTextField();
        JR = new javax.swing.JTextField();
        SUM = new javax.swing.JLabel();
        SU = new javax.swing.JTextField();
        OK = new javax.swing.JButton();
        Restart = new javax.swing.JButton();
        Combo = new javax.swing.JComboBox<>();
        O = new javax.swing.JLabel();
        JO = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setBackground(new java.awt.Color(102, 0, 102));
        jLabel1.setFont(new java.awt.Font("Angsana New", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setText("โปรแกรมคำนวนพื้นที่");

        W.setFont(new java.awt.Font("Angsana New", 3, 24)); // NOI18N
        W.setForeground(new java.awt.Color(153, 153, 0));
        W.setText("ความกว้าง");

        L.setFont(new java.awt.Font("Angsana New", 3, 24)); // NOI18N
        L.setForeground(new java.awt.Color(255, 102, 102));
        L.setText("ความยาว");

        D.setFont(new java.awt.Font("Angsana New", 3, 24)); // NOI18N
        D.setForeground(new java.awt.Color(153, 51, 255));
        D.setText("ด้าน");

        N.setFont(new java.awt.Font("Angsana New", 3, 24)); // NOI18N
        N.setForeground(new java.awt.Color(0, 153, 204));
        N.setText("ฐาน");

        H.setFont(new java.awt.Font("Angsana New", 3, 24)); // NOI18N
        H.setForeground(new java.awt.Color(255, 102, 0));
        H.setText("ความสูง");

        R.setFont(new java.awt.Font("Angsana New", 3, 24)); // NOI18N
        R.setForeground(new java.awt.Color(204, 0, 204));
        R.setText("รัศมี");

        JW.setFont(new java.awt.Font("Angsana New", 3, 24)); // NOI18N
        JW.setForeground(new java.awt.Color(102, 0, 102));

        JL.setFont(new java.awt.Font("Angsana New", 3, 24)); // NOI18N
        JL.setForeground(new java.awt.Color(102, 0, 102));

        JD.setFont(new java.awt.Font("Angsana New", 3, 24)); // NOI18N
        JD.setForeground(new java.awt.Color(102, 0, 102));

        JN.setFont(new java.awt.Font("Angsana New", 3, 24)); // NOI18N
        JN.setForeground(new java.awt.Color(102, 0, 102));

        JH.setFont(new java.awt.Font("Angsana New", 3, 24)); // NOI18N
        JH.setForeground(new java.awt.Color(102, 0, 102));

        JR.setFont(new java.awt.Font("Angsana New", 3, 24)); // NOI18N
        JR.setForeground(new java.awt.Color(102, 0, 102));

        SUM.setFont(new java.awt.Font("Angsana New", 3, 24)); // NOI18N
        SUM.setForeground(new java.awt.Color(255, 0, 0));
        SUM.setText("แสดงผล");

        SU.setFont(new java.awt.Font("Angsana New", 3, 24)); // NOI18N
        SU.setForeground(new java.awt.Color(102, 0, 102));

        OK.setFont(new java.awt.Font("Angsana New", 3, 24)); // NOI18N
        OK.setForeground(new java.awt.Color(255, 0, 0));
        OK.setText("ตกลง");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        Restart.setFont(new java.awt.Font("Angsana New", 3, 24)); // NOI18N
        Restart.setForeground(new java.awt.Color(255, 0, 0));
        Restart.setText("เริ่มใหม่");
        Restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartActionPerformed(evt);
            }
        });

        Combo.setFont(new java.awt.Font("Angsana New", 3, 24)); // NOI18N
        Combo.setForeground(new java.awt.Color(255, 102, 51));
        Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "กรุณาเลือก", "สี่เหลี่ยมผืนผ้า", "สี่เหลี่ยมจัตุรัส", "สามเหลี่ยม", "วงกลม", "สี่เหลี่ยมขนมเปียกปูน", "สี่เหลี่ยมด้านขนาน", "ปริซึม", "ทรงกลม" }));
        Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboActionPerformed(evt);
            }
        });

        O.setFont(new java.awt.Font("Angsana New", 3, 24)); // NOI18N
        O.setForeground(new java.awt.Color(0, 153, 102));
        O.setText("พื้นที่ผิวข้าง");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(288, 288, 288))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(W, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JL, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JW, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SUM, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(O)
                            .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(38, Short.MAX_VALUE)
                        .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JH, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JR, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JN, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JD, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(250, 250, 250))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SU, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Restart)))
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(W)
                        .addGap(15, 15, 15)
                        .addComponent(L))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(JW, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JL, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SUM)
                        .addGap(18, 18, 18)
                        .addComponent(SU, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JD, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JH, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Restart, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JO, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        // TODO add your handling code here:
    try
    {
       java.text.DecimalFormat dfm = new java.text.DecimalFormat("0.00");
       String C = String.valueOf(Combo.getSelectedItem());  
       
        switch (C)
        {
            case "สี่เหลี่ยมผืนผ้า":
            {
                double W1 = Double.parseDouble(JW.getText());
                double L1 = Double.parseDouble(JL.getText());
                double Sm = (W1*L1);
                Sm = new Double(dfm.format(Sm)).doubleValue();
                SU.setText(String.valueOf(Sm));
                break;
            }
            case "สี่เหลี่ยมจัตุรัส":
            {
                double D1 = Double.parseDouble(JD.getText());
                double Sm = (D1*D1);
                Sm = new Double(dfm.format(Sm)).doubleValue();
                SU.setText(String.valueOf(Sm));
                break;
            }
            case "สามเหลี่ยม":
            {
                double N1 = Double.parseDouble(JN.getText());
                double H1 = Double.parseDouble(JH.getText());
                double Sm = 0.5*(N1*H1);
                Sm = new Double(dfm.format(Sm)).doubleValue();
                SU.setText(String.valueOf(Sm));
                break;
            }
            case "วงกลม":
            {
                double R1 = Double.parseDouble(JR.getText());
                double P = Math.PI;
                double Sm = P*(Math.pow(R1,2));
                Sm = new Double(dfm.format(Sm)).doubleValue();
                SU.setText(String.valueOf(Sm));
                break;
            }
             case "สี่เหลี่ยมขนมเปียกปูน":
            {
                double N1 = Double.parseDouble(JN.getText());
                double H1 = Double.parseDouble(JH.getText());
                double Sm = (N1*H1);
                Sm = new Double(dfm.format(Sm)).doubleValue();
                SU.setText(String.valueOf(Sm));
                break;
            }
             case "สี่เหลี่ยมด้านขนาน":
            {
                double N1 = Double.parseDouble(JN.getText());
                double H1 = Double.parseDouble(JH.getText());
                double Sm = (N1*H1);
                Sm = new Double(dfm.format(Sm)).doubleValue();
                SU.setText(String.valueOf(Sm));
                break;
            }
            case "ปริซึม":
            {
                double O1 = Double.parseDouble(JO.getText());
                double N1 = Double.parseDouble(JN.getText());
                double Sm = O1+(N1*2);
                Sm = new Double(dfm.format(Sm)).doubleValue();
                SU.setText(String.valueOf(Sm));
                break;
            }    
            case "ทรงกลม":
            {
                double R1 = Double.parseDouble(JR.getText());
                double P = Math.PI;
                double Sm = 4/3*P*R1*3;
                Sm = new Double(dfm.format(Sm)).doubleValue();
                SU.setText(String.valueOf(Sm));
                break;
            }    
        }
       
    }
    catch (Exception e)
    {
       JOptionPane.showMessageDialog(null,"Error","ใส่ข้อมูลใหม่",JOptionPane.ERROR_MESSAGE);
    } 
    
        
    }//GEN-LAST:event_OKActionPerformed

    private void RestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartActionPerformed
        // TODO add your handling code here:
        JW.setText(" ");
        JL.setText(" ");
        JD.setText(" "); 
        JN.setText(" ");
        JH.setText(" ");
        JR.setText(" ");
        SU.setText(" ");
        JO.setText(" ");
        
    }//GEN-LAST:event_RestartActionPerformed

    private void ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboActionPerformed
        // TODO add your handling code here:
        String C = String.valueOf(Combo.getSelectedItem());
        switch (C)
           {
               case "สี่เหลี่ยมผืนผ้า":
               JW.setEditable(true);
               JW.setEnabled(true);
               
               JL.setEditable(true);
               JL.setEnabled(true);
               
               JD.setEditable(false);
               JD.setEnabled(false);
               
               JN.setEditable(false);
               JN.setEnabled(false);
               
               JH.setEditable(false);
               JH.setEnabled(false);
               
               JR.setEditable(false);
               JR.setEnabled(false);
               
               JO.setEditable(false);
               JO.setEnabled(false);
               
               JW.setText(" ");
               JL.setText(" ");
               JD.setText(" "); 
               JN.setText(" ");
               JH.setText(" ");
               JR.setText(" ");
               SU.setText(" ");
               JO.setText(" ");
               
               break;
               
               
               case "สี่เหลี่ยมจัตุรัส":
               JW.setEditable(false);
               JW.setEnabled(false);
               
               JL.setEditable(false);
               JL.setEnabled(false);
               
               JD.setEditable(true);
               JD.setEnabled(true);
               
               JN.setEditable(false);
               JN.setEnabled(false);
               
               JH.setEditable(false);
               JH.setEnabled(false);
               
               JR.setEditable(false);
               JR.setEnabled(false);
               
               JO.setEditable(false);
               JO.setEnabled(false);
               
               JW.setText(" ");
               JL.setText(" ");
               JD.setText(" "); 
               JN.setText(" ");
               JH.setText(" ");
               JR.setText(" ");
               SU.setText(" ");
               JO.setText(" ");
               
               break;
               
               
               case "สามเหลี่ยม":
               JW.setEditable(false);
               JW.setEnabled(false);
               
               JL.setEditable(false);
               JL.setEnabled(false);
               
               JD.setEditable(false);
               JD.setEnabled(false);
               
               JN.setEditable(true);
               JN.setEnabled(true);
               
               JH.setEditable(true);
               JH.setEnabled(true);
               
               JR.setEditable(false);
               JR.setEnabled(false);
               
               JO.setEditable(false);
               JO.setEnabled(false);
               
               JW.setText(" ");
               JL.setText(" ");
               JD.setText(" "); 
               JN.setText(" ");
               JH.setText(" ");
               JR.setText(" ");
               SU.setText(" ");
               JO.setText(" ");
               
               break;
               
               
               case "วงกลม":
               JW.setEditable(false);
               JW.setEnabled(false);
               
               JL.setEditable(false);
               JL.setEnabled(false);
               
               JD.setEditable(false);
               JD.setEnabled(false);
               
               JN.setEditable(false);
               JN.setEnabled(false);
               
               JH.setEditable(false);
               JH.setEnabled(false);
               
               JR.setEditable(true);
               JR.setEnabled(true);
               
               JO.setEditable(false);
               JO.setEnabled(false);
               
               JW.setText(" ");
               JL.setText(" ");
               JD.setText(" "); 
               JN.setText(" ");
               JH.setText(" ");
               JR.setText(" ");
               SU.setText(" ");
               JO.setText(" ");
               
               break;
               
               
               case "สี่เหลี่ยมขนมเปียกปูน":
               JW.setEditable(false);
               JW.setEnabled(false);
               
               JL.setEditable(false);
               JL.setEnabled(false);
               
               JD.setEditable(false);
               JD.setEnabled(false);
               
               JN.setEditable(true);
               JN.setEnabled(true);
               
               JH.setEditable(true);
               JH.setEnabled(true);
               
               JR.setEditable(false);
               JR.setEnabled(false);
               
               JO.setEditable(false);
               JO.setEnabled(false);
               
               JW.setText(" ");
               JL.setText(" ");
               JD.setText(" "); 
               JN.setText(" ");
               JH.setText(" ");
               JR.setText(" ");
               SU.setText(" ");
               JO.setText(" ");
               
               break;
               
               
               case "สี่เหลี่ยมด้านขนาน":
               JW.setEditable(false);
               JW.setEnabled(false);
               
               JL.setEditable(false);
               JL.setEnabled(false);
               
               JD.setEditable(false);
               JD.setEnabled(false);
               
               JN.setEditable(true);
               JN.setEnabled(true);
               
               JH.setEditable(true);
               JH.setEnabled(true);
               
               JR.setEditable(false);
               JR.setEnabled(false);
               
               JO.setEditable(false);
               JO.setEnabled(false);
               
               JW.setText(" ");
               JL.setText(" ");
               JD.setText(" "); 
               JN.setText(" ");
               JH.setText(" ");
               JR.setText(" ");
               SU.setText(" ");
               JO.setText(" ");
               
               break;
               
               
               case "ปริซึม":
               JW.setEditable(false);
               JW.setEnabled(false);
               
               JL.setEditable(false);
               JL.setEnabled(false);
               
               JD.setEditable(false);
               JD.setEnabled(false);
               
               JN.setEditable(true);
               JN.setEnabled(true);
               
               JH.setEditable(false);
               JH.setEnabled(false);
               
               JR.setEditable(false);
               JR.setEnabled(false);
                             
               JO.setEditable(true);
               JO.setEnabled(true);
               
                             
               JW.setText(" ");
               JL.setText(" ");
               JD.setText(" "); 
               JN.setText(" ");
               JH.setText(" ");
               JR.setText(" ");
               SU.setText(" ");
               JO.setText(" ");
               
               break;
               
               
                case "ทรงกลม":
               JW.setEditable(false);
               JW.setEnabled(false);
               
               JL.setEditable(false);
               JL.setEnabled(false);
               
               JD.setEditable(false);
               JD.setEnabled(false);
               
               JN.setEditable(false);
               JN.setEnabled(false);
               
               JH.setEditable(false);
               JH.setEnabled(false);
               
               JR.setEditable(true);
               JR.setEnabled(true);
                             
               JO.setEditable(false);
               JO.setEnabled(false);
               
               
               
                             
               JW.setText(" ");
               JL.setText(" ");
               JD.setText(" "); 
               JN.setText(" ");
               JH.setText(" ");
               JR.setText(" ");
               SU.setText(" ");
               JO.setText(" ");
               break;
              
               
               
               
           }
    }//GEN-LAST:event_ComboActionPerformed

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
            java.util.logging.Logger.getLogger(Angle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Angle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Angle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Angle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Angle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo;
    private javax.swing.JLabel D;
    private javax.swing.JLabel H;
    private javax.swing.JTextField JD;
    private javax.swing.JTextField JH;
    private javax.swing.JTextField JL;
    private javax.swing.JTextField JN;
    private javax.swing.JTextField JO;
    private javax.swing.JTextField JR;
    private javax.swing.JTextField JW;
    private javax.swing.JLabel L;
    private javax.swing.JLabel N;
    private javax.swing.JLabel O;
    private javax.swing.JButton OK;
    private javax.swing.JLabel R;
    private javax.swing.JButton Restart;
    private javax.swing.JTextField SU;
    private javax.swing.JLabel SUM;
    private javax.swing.JLabel W;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
