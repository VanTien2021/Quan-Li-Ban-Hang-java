/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.poly.quanli;

import edu.poly.quanli.model.Employee;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Van Tien
 */
public class ManageEmployeesForm extends javax.swing.JFrame {
    private List<Employee> list = new ArrayList<>();
    private DefaultTableModel tblModel = new DefaultTableModel();
    
    public ManageEmployeesForm() {
        initComponents();
        initTable();
        fillTable();
    }
    private void fillTable(){
        tblModel.setRowCount(0);
        
        for(Employee employee : list){
            tblModel.addRow(new String[]{employee.getId(), employee.getTen(),
            employee.getNhom(),""+ employee.getGia(),""+ employee.getSo()});
        }
        tblModel.fireTableDataChanged();
    }
    private void initTable(){
        String[] columns=new String[]{"Mã Hàng", "Tên Hàng", "Nhóm Hàng", 
        "Gía Bán", "Số Lượng"};
        tblModel.setColumnIdentifiers(columns);
        
        list.add(new Employee("E01", "Tủ Lạnh", "Điện Lạnh", 4000000,2));
        list.add(new Employee("E02", "Tivi", "Điện Tử", 2000000,10));
        list.add(new Employee("E03", "Máy Điều Hòa", "Thiết Bị Văn Phòng", 5000000,4));
        list.add(new Employee("E014", "Tivi", "Điện Tử", 1000000,9));
        
        tblBang.setModel(tblModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtEmployeesId = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNhom = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapnhat = new javax.swing.JButton();
        btnThemmoi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBang = new javax.swing.JTable();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Quản Lý Bán Hàng");

        txtEmployeesId.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Mã Hàng:");

        jLabel3.setText("Tên Hàng:");

        jLabel4.setText("Nhóm Hàng:");

        txtNhom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Điện Tử", "Điện Lạnh", "Máy Tính", "Thiết Bị Văn Phòng" }));

        jLabel5.setText("Gía Bán:");

        jLabel6.setText("Số Lượng:");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapnhat.setText("Cập Nhật");
        btnCapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhatActionPerformed(evt);
            }
        });

        btnThemmoi.setText("Thêm Mới");
        btnThemmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemmoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtEmployeesIdLayout = new javax.swing.GroupLayout(txtEmployeesId);
        txtEmployeesId.setLayout(txtEmployeesIdLayout);
        txtEmployeesIdLayout.setHorizontalGroup(
            txtEmployeesIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtEmployeesIdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtEmployeesIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(txtEmployeesIdLayout.createSequentialGroup()
                        .addGroup(txtEmployeesIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(60, 60, 60)
                        .addGroup(txtEmployeesIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtEmployeesIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtId)
                                .addComponent(txtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                            .addComponent(txtSo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(txtEmployeesIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtGia, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNhom, javax.swing.GroupLayout.Alignment.LEADING, 0, 149, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(txtEmployeesIdLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCapnhat)
                .addGap(33, 33, 33)
                .addComponent(btnThemmoi)
                .addGap(62, 62, 62))
        );
        txtEmployeesIdLayout.setVerticalGroup(
            txtEmployeesIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtEmployeesIdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtEmployeesIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txtEmployeesIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txtEmployeesIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNhom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txtEmployeesIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txtEmployeesIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtEmployeesIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapnhat)
                    .addComponent(btnThemmoi)
                    .addComponent(btnXoa)
                    .addComponent(btnThem))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        tblBang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblBang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jSeparator1))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(txtEmployeesId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmployeesId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtId.getText().equals("")){
            sb.append("Mã hàng không được để trống \n");
            txtId.setBackground(Color.red);           
        }else{
            txtId.setBackground(Color.white);
        }
        if (txtTen.getText().equals("")){
            sb.append("Tên hàng không được để trống \n");
            txtTen.setBackground(Color.red);
        }else{
            txtId.setBackground(Color.white);
        }
        if (sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(),"Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        Employee employee = new Employee();
        employee.setId(txtId.getText());
        employee.setTen(txtTen.getText());
        employee.setNhom(txtNhom.getSelectedItem().toString());
        employee.setGia(Integer.parseInt(txtGia.getText()));
        employee.setSo(Integer.parseInt(txtSo.getText()));
        
        list.add(employee);
        fillTable();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        StringBuilder sb = new StringBuilder();
        if (txtId.getText().equals("")){
            sb.append("Mã hàng không được để trống \n");
            txtId.setBackground(Color.red);           
        }else{
            txtId.setBackground(Color.white);
        }
        if (sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(),"Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } 
        int choice = JOptionPane.showConfirmDialog(this,"Bạn có muốn xóa thông tin không?",
                "Hỏi", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.NO_OPTION){
            return;
        }
        for (Employee employee : list){
            if (employee.getId().equals(txtId.getText())){
                list.remove(employee);
                break;
            }
        }
        fillTable();
        btnThemmoiActionPerformed(evt);
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnCapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhatActionPerformed
         StringBuilder sb = new StringBuilder();
        if (txtId.getText().equals("")){
            sb.append("Mã hàng không được để trống \n");
            txtId.setBackground(Color.red);           
        }else{
            txtId.setBackground(Color.white);
        }
        if (txtTen.getText().equals("")){
            sb.append("Tên hàng không được để trống \n");
            txtTen.setBackground(Color.red);
        }else{
            txtId.setBackground(Color.white);
        }
        if (sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(),"Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } 
        int choice = JOptionPane.showConfirmDialog(this,"Bạn có muốn cập nhật thông tin không?",
                "Hỏi", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.NO_OPTION){
            return;
        }
        for (Employee employee : list){
            if (employee.getId().equals(txtId.getText())){
                employee.setTen(txtTen.getText());
                employee.setNhom(txtNhom.getSelectedItem().toString());
                employee.setGia(Integer.parseInt(txtGia.getText()));
                employee.setSo(Integer.parseInt(txtSo.getText()));
                break;
            }
        }
        fillTable();
        btnThemmoiActionPerformed(evt);
    }//GEN-LAST:event_btnCapnhatActionPerformed

    private void btnThemmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemmoiActionPerformed
        txtId.setText("");
        txtTen.setText("");
        txtGia.setText("");
        txtSo.setText("");
    }//GEN-LAST:event_btnThemmoiActionPerformed

    private void tblBangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangMouseClicked
       int selectedRow = tblBang.getSelectedRow();
       if (selectedRow>=0){
           String Id =(String)tblBang.getValueAt(selectedRow, 0);
           
           for (Employee employee : list){
               if (Id.equals(employee.getId())){
                   txtId.setText(Id);
                   txtTen.setText(employee.getTen());
                   txtNhom.setSelectedItem(employee.getNhom());
                   txtGia.setText(""+ employee.getGia());
                   txtSo.setText(""+ employee.getSo());
                   break;
               }
           }
       }
    }//GEN-LAST:event_tblBangMouseClicked

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
            java.util.logging.Logger.getLogger(ManageEmployeesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageEmployeesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageEmployeesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageEmployeesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageEmployeesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapnhat;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemmoi;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tblBang;
    private javax.swing.JPanel txtEmployeesId;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtId;
    private javax.swing.JComboBox<String> txtNhom;
    private javax.swing.JTextField txtSo;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
