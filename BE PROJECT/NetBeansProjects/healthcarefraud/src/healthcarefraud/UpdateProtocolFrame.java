/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CreateUserFrame.java
 *
 * Created on Feb 20, 2018, 11:06:16 AM
 */
package healthcarefraud;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class UpdateProtocolFrame extends javax.swing.JFrame {

    
    /** Creates new form CreateUserFrame */
    public UpdateProtocolFrame() {

        super("UPDATE PROTOCOL FRAME");
        initComponents();
       
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField11 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Diseases:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(41, 40, 55, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Suggesting Medicine:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 90, 131, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Not Suggesting Medicine:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 140, 166, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Number of Recalls:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 190, 131, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Recalls In Between Periods(In Days):");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 230, 225, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Ref Doctor:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 280, 91, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Service Cost:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 340, 91, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Suggesting Procedures:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 390, 146, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Not Suggesting Procedures:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 440, 172, 15);

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(97, 604, 90, 23);

        jButton2.setBackground(new java.awt.Color(102, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(270, 604, 90, 23);

        jButton5.setBackground(new java.awt.Color(102, 153, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(441, 604, 80, 23);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(280, 90, 311, 20);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(280, 140, 311, 20);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(280, 180, 311, 20);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(280, 280, 311, 20);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(280, 330, 311, 20);
        jPanel1.add(jTextField7);
        jTextField7.setBounds(280, 380, 311, 20);
        jPanel1.add(jTextField8);
        jTextField8.setBounds(280, 440, 311, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Suggesting Dietary:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 490, 122, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Not Suggesting Dietary:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(41, 538, 148, 15);
        jPanel1.add(jTextField9);
        jTextField9.setBounds(280, 490, 311, 20);
        jPanel1.add(jTextField10);
        jTextField10.setBounds(280, 540, 311, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Disease", "Fever", "Acne", "Cold", "Anemia", "Dehydration\t", "Swine Flu", "Asthama", "Chickenpox", "Dengue Fever", "Diabeties", "Cardiovascular Diseases", "Hemophilia", "Jaundice", "Kidney Stones", "Malaria", "Measles", "Pneumonia", "Rabies", "Tuberculosis", "Thalassemia", "Typhoid", "Cataract", "Hemorrhoids (Piles)", "Hernia", "Appenicitis", "Artharitis", "Epilepsy", "Tonsillitis", "Conjunctivitis" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(280, 40, 120, 20);
        jPanel1.add(jTextField11);
        jTextField11.setBounds(280, 230, 311, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(390, 20, 620, 650);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthcarefraud/4.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 1410, 780);

        jMenu1.setText("Manage Profile");

        jMenuItem1.setText("Edit ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Manage Protocol");

        jMenuItem2.setText("Add Protocol");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Update Protocol");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("View Protocol");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Logout");

        jMenuItem5.setText("Exit");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

         
         jTextField2.setText("");
         jTextField3.setText("");
         jTextField4.setText("");
         jTextField5.setText("");
         jTextField6.setText("");
         jTextField7.setText("");
         jTextField8.setText("");
         jTextField9.setText("");
         jTextField10.setText("");
         jTextField11.setText("");
         jComboBox2.setSelectedItem("Select Disease");
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        this.dispose();

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

        HealthCouncilOperationFrame hf = new HealthCouncilOperationFrame();
        hf.setVisible(true);
        hf.setSize(d);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

           String dise=(String) jComboBox2.getSelectedItem();
           String sm=jTextField2.getText();
           String nsm=jTextField3.getText();
           String recall=jTextField4.getText();
           String indays=jTextField11.getText();
           String doc=jTextField5.getText();
           String sc=jTextField6.getText();
           String sp=jTextField7.getText();
           String nsp=jTextField8.getText();
           String sd=jTextField9.getText();
           String nsd=jTextField10.getText();


//        if (sm.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Please Enter Suggesting Medicine");
//        } else if (nsm.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Please Enter Not Suggesting Medicine");
//
//        }
//
//        else if (recall.isEmpty())
//
//        {
//            JOptionPane.showMessageDialog(null, "Please Enter Number Of Recalls");
//        }
//           else if (indays.isEmpty())
//
//        {
//            JOptionPane.showMessageDialog(null, "Please Enter Recalls Between Periods");
//        }
//
//           else if (doc.isEmpty())
//
//        {
//            JOptionPane.showMessageDialog(null, "Please Enter Doctor Name");
//        }
//           else if (sc.isEmpty())
//
//        {
//            JOptionPane.showMessageDialog(null, "Please Enter Service Cost");
//        }
//
//           else if (sp.isEmpty())
//
//        {
//            JOptionPane.showMessageDialog(null, "Please Enter Suggesting Procedure");
//        }
//           else if (nsp.isEmpty())
//
//        {
//            JOptionPane.showMessageDialog(null, "Please Enter Not Suggesting Procedure");
//        }
//
//           else if (sd.isEmpty())
//
//        {
//            JOptionPane.showMessageDialog(null, "Please Enter Suggesting Dietary");
//        }
//
//           else if (nsd.isEmpty())
//
//        {
//            JOptionPane.showMessageDialog(null, "Please Enter Not Suggesting Dietary");
//        }

//
////        System.out.println(dis);
////        System.out.println(sm);
////        System.out.println(nsm);
////        System.out.println(recall);
////        System.out.println(indays);
////        System.out.println(refdoc);
////        System.out.println(sc);
////        System.out.println(sp);
////        System.out.println(nsp);
////        System.out.println(sd);
////        System.out.println(nsd);
//
//        else
//        {
        ProtocolDBUpdate pu=new ProtocolDBUpdate();
        if(pu.updateInfo(dise, sm, nsm, recall, indays, doc, sc, sp, nsp, sd, nsd))
             JOptionPane.showMessageDialog(null,"Data Submitted Successfully");
        else
            JOptionPane.showMessageDialog(null,"Oops There is Some Error");
//
//        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:

        String dis=(String) jComboBox2.getSelectedItem();

      
        ProtocolDataExtractor pe=new ProtocolDataExtractor();

        ArrayList disease=pe.getProtocolInfoData(dis);

        String disea=(String) disease.get(0);

        String sm=(String) disease.get(1);
        jTextField2.setText(sm);

        String nsm=(String) disease.get(2);
        jTextField3.setText(nsm);

        String recall=(String) disease.get(3);
        jTextField4.setText(recall);

        String periodday=(String) disease.get(4);
        jTextField11.setText(periodday);

        String doc=(String) disease.get(5);
        jTextField5.setText(doc);

        String sc=(String) disease.get(6);
        jTextField6.setText(sc);

        String sp=(String) disease.get(7);
        jTextField7.setText(sp);

        String nsp=(String) disease.get(8);
        jTextField8.setText(nsp);

        String sd=(String) disease.get(9);
        jTextField9.setText(sd);

        String nsd=(String) disease.get(10);
        jTextField10.setText(nsd);



    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:

        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();

        UserUpdateFrame uf=new UserUpdateFrame();
        uf.setVisible(true);
        uf.setSize(d);
}//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();

        AddProtocolFrame af=new AddProtocolFrame();
        af.setVisible(true);
        af.setSize(d);
}//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:

        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();

        UpdateProtocolFrame uf=new UpdateProtocolFrame();
        uf.setVisible(true);
        uf.setSize(d);
}//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:

        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();

        ViewProtocolFrame vf=new ViewProtocolFrame();
        vf.setVisible(true);
        vf.setSize(d);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
       this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();

        LoginFrame lf=new LoginFrame();
        lf.setVisible(true);
        lf.setSize(d);
}//GEN-LAST:event_jMenuItem5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new UpdateProtocolFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
