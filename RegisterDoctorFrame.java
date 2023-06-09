/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.gui;

import java.sql.SQLException;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import sanjeevaniapp.dao.DoctorsDao;
import sanjeevaniapp.dao.EmpDao;
import sanjeevaniapp.dao.UserDao;
import sanjeevaniapp.pojo.DoctorPojo;
import sanjeevaniapp.pojo.UserPojo;
import sanjeevaniapp.utility.PasswordEncryption;

/**
 *
 * @author Khalid
 */
public class RegisterDoctorFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegisterDoctorFrame
     */
    private Map<String,String>unRegDocList;
    private String logId,selEmpid, selEmpname;
    private String pwd1,pwd2;
    private String contactNo,emailId,qualification,specialist; 
    public RegisterDoctorFrame() {
        
        initComponents();
        setLocationRelativeTo(null);
        loadDotorDetails();
        genNewDocId();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField11 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtDocId = new javax.swing.JTextField();
        txtQua = new javax.swing.JTextField();
        txtno = new javax.swing.JTextField();
        txtSpe = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDocName = new javax.swing.JTextField();
        txtLoginId = new javax.swing.JTextField();
        txtpwd1 = new javax.swing.JPasswordField();
        txtpwd2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcEmpId = new javax.swing.JComboBox<>();
        jcGender = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jTextField11.setText("jTextField11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDocId.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(txtDocId, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 130, -1));

        txtQua.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(txtQua, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 130, -1));

        txtno.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(txtno, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 130, -1));

        txtSpe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(txtSpe, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 130, -1));

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 130, -1));

        txtDocName.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(txtDocName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 120, -1));

        txtLoginId.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(txtLoginId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 120, -1));
        jPanel1.add(txtpwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 120, -1));
        jPanel1.add(txtpwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Employee Id");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 80, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Retype Password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 110, 20));

        jcEmpId.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jcEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEmpIdActionPerformed(evt);
            }
        });
        jPanel1.add(jcEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 120, -1));

        jcGender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        jPanel1.add(jcGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 120, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Gender");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 90, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 80, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Login ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 90, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Doctor Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 90, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 290));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Doctor Id");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 70, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Qualifiation");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 70, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Contact No");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 70, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Specialist");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 70, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Email ID");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 70, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 820, 10));

        jTextPane1.setEditable(false);
        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 600, 260));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel2.setText("Add Doctor's Details");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 220, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/images (2).jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 190, 220));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 180, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, 70, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Logout");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 560, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEmpIdActionPerformed
        if(jcEmpId.getSelectedIndex()==-1)
            return;
       selEmpid=jcEmpId.getSelectedItem().toString();
       selEmpname=unRegDocList.get(selEmpid);
        txtDocName.setText(selEmpname);
    }//GEN-LAST:event_jcEmpIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(validateInputs()==false){
            JOptionPane.showMessageDialog(null,"plz input all data");
            return;
        }
        String passwordValid=matchPassword();
        if(passwordValid!=null){
            JOptionPane.showMessageDialog(null,passwordValid);
        }
        if(isContactNoValid()==false){
            JOptionPane.showMessageDialog(null,"Invalid Phone Number");
            return;
            
        }
        try{
            DoctorPojo doc=new DoctorPojo();
            doc.setDoctorId(txtDocId.getText());
            doc.setDoctorName(selEmpname);
            doc.setEmailId(emailId);
            doc.setGender(jcGender.getSelectedItem().toString());
            doc.setContactNo(contactNo);
            doc.setQualification(qualification);
            doc.setSpecialist(specialist);
            UserPojo user=new UserPojo();
            user.setLoginId(logId);
            String encPasword=new String(PasswordEncryption.getEncryptedPassword(pwd1));
            user.setPassword(encPasword);
            user.setUsername(selEmpname);
            user.setUserType("DOCTOR");
            boolean result1=DoctorsDao.addDoctor(doc);
            boolean result2=UserDao.addUser(user);
            if(result1==true && result2==true){
                JOptionPane.showMessageDialog(null,"Doctor Successfully registerd!");
                clearAll();
                return;
                
            }JOptionPane.showMessageDialog(null, "Registration unsuccessful!");
            return;
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in DB0"+ex);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ManageDoctorsFrame q=new ManageDoctorsFrame();
        q.setVisible(true);
        this.dispose();;
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
            java.util.logging.Logger.getLogger(RegisterDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterDoctorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JComboBox<String> jcEmpId;
    private javax.swing.JComboBox<String> jcGender;
    private javax.swing.JTextField txtDocId;
    private javax.swing.JTextField txtDocName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLoginId;
    private javax.swing.JTextField txtQua;
    private javax.swing.JTextField txtSpe;
    private javax.swing.JTextField txtno;
    private javax.swing.JPasswordField txtpwd1;
    private javax.swing.JPasswordField txtpwd2;
    // End of variables declaration//GEN-END:variables

    private void loadDotorDetails() {
        try{
            unRegDocList=EmpDao.getUnRegisterDoctors();
            Set<String> empIdSet=unRegDocList.keySet();
            for(String empid:empIdSet){
                jcEmpId.addItem(empid);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in DB1"+ex);
            ex.printStackTrace();
        }
    }
    private void genNewDocId(){
        try{
            String docId=DoctorsDao.getNewDocId();
            txtDocId.setText(docId);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in DB2"+ex);
            ex.printStackTrace();
        }
    }
    private boolean validateInputs(){
        this.logId=this.txtLoginId.getText().trim();
        
        this.selEmpname=txtDocName.getText().trim();
        char[] p1=this.txtpwd1.getPassword();
        char[] p2=this.txtpwd2.getPassword();
        contactNo=txtno.getText().trim();
        qualification=txtQua.getText().trim();
        emailId=txtEmail.getText().trim();
        specialist=txtSpe.getText().trim();
        if(logId.isEmpty()||p1.length==0||p2.length==0||contactNo.isEmpty()||qualification.isEmpty()||emailId.isEmpty()||specialist.isEmpty()){
            return false;
        }
        pwd1=new String(p1);
        pwd2=new String(p2);
        return true;
    }
    private String matchPassword(){
        pwd1=pwd1.trim();
        pwd2=pwd2.trim();
        if(pwd1.length()<3 || pwd2.length()<3)
            return "Password must be atleast 3 Char ";
        if(pwd1.equals(pwd2)==false)
            return "Password do not Match";
        return null;
    }
    private boolean isContactNoValid(){
        char[]mob=contactNo.toCharArray();
        for(char ch:mob){
            if(Character.isDigit(ch)==false)
                return false;
        }
        if(contactNo.length()==10)
            return true;
        return false;
    }

    private void clearAll() {
        txtLoginId.setText("");
        this.txtno.setText("");
        this.txtDocName.setText("");
        this.txtDocId.setText("");
        this.txtEmail.setText("");
        this.txtpwd1.setText("");
        this.txtpwd2.setText("");
        this.txtQua.setText("");
        this.txtSpe.setText("");
        this.unRegDocList.remove(selEmpid);
        this.jcEmpId.removeItem(selEmpid);
        if(unRegDocList.size()==0){
            JOptionPane.showMessageDialog(null,"All Doctor's Registerd");
            ManageDoctorsFrame q=new ManageDoctorsFrame();
            q.setVisible(true);
            this.dispose();
            
        }
    }
}
