/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package v1;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Khang
 */
public class UserManagement extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public UserManagement() {
        initComponents();
        SelectUsers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngr_isAdmin = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btn_Logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_UserId = new javax.swing.JTextField();
        tf_Username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_Password = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
        btn_Delete = new javax.swing.JButton();
        btn_Add = new javax.swing.JButton();
        btn_Find = new javax.swing.JButton();
        btn_isAdmin = new javax.swing.JRadioButton();
        btn_isUser = new javax.swing.JRadioButton();
        btn_Update = new javax.swing.JButton();
        btn_QLSP = new javax.swing.JLabel();
        lbTDH = new javax.swing.JLabel();
        lbHD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_Logout.setText("Đăng xuất");
        btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Admin");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 48)); // NOI18N
        jLabel2.setText("Quản lý tài khoản");

        label3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        label3.setText("Mã nhân viên");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel4.setText("Tài khoản");

        tf_UserId.setEditable(false);
        tf_UserId.setText("0");
        tf_UserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_UserIdActionPerformed(evt);
            }
        });

        tf_Username.setEditable(false);
        tf_Username.setText("tên sản phẩm");
        tf_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_UsernameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel6.setText("Mật khẩu");

        tf_Password.setText("0");

        UsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Giá"
            }
        ));
        UsersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UsersTable);

        btn_Delete.setText("Xóa");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        btn_Add.setText("Thêm");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        btn_Find.setText("Tìm");
        btn_Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FindActionPerformed(evt);
            }
        });

        btngr_isAdmin.add(btn_isAdmin);
        btn_isAdmin.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btn_isAdmin.setText("Admin");
        btn_isAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_isAdminActionPerformed(evt);
            }
        });

        btngr_isAdmin.add(btn_isUser);
        btn_isUser.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btn_isUser.setSelected(true);
        btn_isUser.setText("User");

        btn_Update.setText("Cập nhật");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_UserId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_isAdmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_isUser))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_Find, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(212, 212, 212)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_UserId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3)
                            .addComponent(btn_isAdmin)
                            .addComponent(btn_isUser))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tf_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(100, 100, 100)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Find, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(440, 440, 440))))
        );

        btn_QLSP.setForeground(new java.awt.Color(0, 0, 0));
        btn_QLSP.setText("Quản lý sản phẩm");
        btn_QLSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_QLSPMouseClicked(evt);
            }
        });

        lbTDH.setForeground(new java.awt.Color(0, 0, 0));
        lbTDH.setText("Tạo đơn hàng");
        lbTDH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTDHMouseClicked(evt);
            }
        });

        lbHD.setForeground(new java.awt.Color(0, 0, 0));
        lbHD.setText("Hóa đơn");
        lbHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHDMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(btn_QLSP))
                            .addGap(39, 39, 39)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTDH)
                            .addComponent(lbHD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(btn_QLSP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTDH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbHD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogoutActionPerformed
        Login login=new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_LogoutActionPerformed

    private void tf_UserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_UserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_UserIdActionPerformed

    private void btn_FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FindActionPerformed

        PreparedStatement ps;
        ResultSet rs;
        
        int id=Integer.parseInt(tf_UserId.getText());
        String username=tf_Username.getText();
        String query="select * from tbUser where id=? or username=?";
        
        
        try
        {
            
            ps=MyConnection.getConnection().prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2,username);
            rs=ps.executeQuery();
            if(rs.next())
            {
                ps=MyConnection.getConnection().prepareStatement(query);
                ps.setInt(1, id);
                ps.setString(2,username);
                rs=ps.executeQuery();
                UsersTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Không tài khoản");
                MyConnection.getConnection().close();
                SelectUsers();
            }
            
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        } 
    }//GEN-LAST:event_btn_FindActionPerformed

    public void SelectUsers()
    {
        try
        {
            PreparedStatement ps;
            ResultSet rs;
            String query="Select * from tbUser";
            ps=MyConnection.getConnection().prepareStatement(query);
            rs=ps.executeQuery();
            UsersTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        } 
    }
    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        PreparedStatement ps;
        ResultSet rs;
        
        //int id=Integer.parseInt(tf_ProductId.getText());
        String username=tf_Username.getText();
        String password=tf_Password.getText();
        int isAdmin=0;
        if(btngr_isAdmin.getSelection().equals(btn_isAdmin.getModel()))
        {
            isAdmin=1;
        }
        else
        {
            isAdmin=0;
        }
        String query="INSERT INTO tbUser (username, pass, isAdmin) VALUES (?,?,?)";
        String query2="select * from tbUser where username=?";
        try
        {
            ps=MyConnection.getConnection().prepareStatement(query2);
            ps.setString(1,username);
            rs=ps.executeQuery();
            if(!rs.next())
            {
                
                ps=MyConnection.getConnection().prepareStatement(query);
                ps.setString(1,username);
                ps.setString(2,password);
                ps.setInt(3,isAdmin);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Thêm tài khoản thành công");
                MyConnection.getConnection().close();
                SelectUsers();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Sản phẩm đã tồn tại");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }  
    }//GEN-LAST:event_btn_AddActionPerformed

    private void UsersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersTableMouseClicked
        DefaultTableModel model=(DefaultTableModel)UsersTable.getModel();
        int MyIndex=UsersTable.getSelectedRow();
        tf_UserId.setText(model.getValueAt(MyIndex, 0).toString());
        tf_Username.setText(model.getValueAt(MyIndex, 1).toString());
        tf_Password.setText(model.getValueAt(MyIndex, 2).toString());
        if (model.getValueAt(MyIndex, 3).toString().equals("0"))
        {
            btngr_isAdmin.setSelected(btn_isUser.getModel(), true);
        }
        else
        {
            btngr_isAdmin.setSelected(btn_isAdmin.getModel(), true);
        }
    }//GEN-LAST:event_UsersTableMouseClicked

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        PreparedStatement ps;
        ResultSet rs;
        
        int id=Integer.parseInt(tf_UserId.getText());
        String username=tf_Username.getText();
        String query="delete from tbUser where id=? or username=?";
        String query2="select * from tbUser where id=? or username=?";
        
        try
        {
            ps=MyConnection.getConnection().prepareStatement(query2);
            ps.setInt(1,id);
            ps.setString(2,username);
            rs=ps.executeQuery();
            if(rs.next())
            {
                
                ps=MyConnection.getConnection().prepareStatement(query);
                ps.setInt(1,id);
                ps.setString(2,username);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Xóa tài khoản thành công");
                MyConnection.getConnection().close();
                SelectUsers();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Tài khoản không tồn tại");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }  
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_isAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_isAdminActionPerformed
        
    }//GEN-LAST:event_btn_isAdminActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        PreparedStatement ps;
        ResultSet rs;
        
        int id=Integer.parseInt(tf_UserId.getText());
        String username=tf_Username.getText();
        String password=tf_Password.getText();
        int isAdmin=0;
        if(btngr_isAdmin.getSelection().equals(btn_isAdmin.getModel()))
        {
            isAdmin=1;
        }
        else
        {
            isAdmin=0;
        }
        String query="UPDATE tbUser SET pass=?,isAdmin=? where id=? or username=?";
        String query2="select * from tbUser where username=?";
        
        try
        {
            
            ps=MyConnection.getConnection().prepareStatement(query2);
            ps.setString(1,username);
            rs=ps.executeQuery();
            if(rs.next())
            {
                ps=MyConnection.getConnection().prepareStatement(query);
                ps.setString(1,password);
                ps.setInt(2,isAdmin);
                ps.setInt(3, id);
                ps.setString(4,username);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Cập nhật tài khoản thành công");
                MyConnection.getConnection().close();
                SelectUsers();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Tài khoản không tồn tại");
                MyConnection.getConnection().close();
                SelectUsers();
            }
            
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
        
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void tf_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_UsernameActionPerformed

    private void btn_QLSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QLSPMouseClicked
        Products pr=new Products();
        pr.setVisible(true);
        pr.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_QLSPMouseClicked

    private void lbTDHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTDHMouseClicked
        User pr=new User();
        pr.setVisible(true);
        pr.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lbTDHMouseClicked

    private void lbHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHDMouseClicked
        // TODO add your handling code here:
        Bill pr=new Bill();
        pr.setVisible(true);
        pr.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lbHDMouseClicked

    public void getClear()
    {
        tf_Username.setText("");
        tf_UserId.setText("");
        tf_Password.setText("");
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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable UsersTable;
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Find;
    private javax.swing.JButton btn_Logout;
    private javax.swing.JLabel btn_QLSP;
    private javax.swing.JButton btn_Update;
    private javax.swing.JRadioButton btn_isAdmin;
    private javax.swing.JRadioButton btn_isUser;
    private javax.swing.ButtonGroup btngr_isAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel lbHD;
    private javax.swing.JLabel lbTDH;
    private javax.swing.JTextField tf_Password;
    private javax.swing.JTextField tf_UserId;
    private javax.swing.JTextField tf_Username;
    // End of variables declaration//GEN-END:variables
}