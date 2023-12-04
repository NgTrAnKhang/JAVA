/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package v1;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Khang
 */
public class User extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public User() {
        initComponents();
        SelectUsers();
        lbUser.setText(Login.userloged);
        if (Login.userloged.matches("admin"))
        {
            lbQLSP.setVisible(true);
            lbQLTK.setVisible(true);
        }
        else
        {
            lbQLSP.setVisible(false);
            lbQLTK.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Logout = new javax.swing.JButton();
        lbUser = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductsTable = new javax.swing.JTable();
        btn_Add = new javax.swing.JButton();
        btn_Find = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        tf_ProductName = new javax.swing.JTextField();
        tf_Quantity = new javax.swing.JTextField();
        tf_Price = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        CartTable = new javax.swing.JTable();
        btn_Update = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_CreateBill = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        lbHD = new javax.swing.JLabel();
        lbQLSP = new javax.swing.JLabel();
        lbQLTK = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_Logout.setText("Đăng xuất");
        btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogoutActionPerformed(evt);
            }
        });

        lbUser.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        lbUser.setForeground(new java.awt.Color(0, 0, 0));
        lbUser.setText("User");

        ProductsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ProductsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductsTable);

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

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel2.setText("Tên sản phẩm");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel3.setText("Mã sản phẩm");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel4.setText("Số lượng");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel5.setText("Giá");

        tf_id.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

        tf_ProductName.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

        tf_Quantity.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        tf_Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_QuantityActionPerformed(evt);
            }
        });

        tf_Price.setEditable(false);
        tf_Price.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        tf_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_PriceActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 48)); // NOI18N
        jLabel8.setText("Tạo đơn hàng");

        CartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Giá", "Tổng"
            }
        ));
        CartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CartTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(CartTable);

        btn_Update.setText("Sửa");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        btn_Delete.setText("Xóa");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        btn_CreateBill.setText("Tạo hóa đơn");
        btn_CreateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreateBillActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel6.setText("Tổng:");

        lbTotal.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        lbTotal.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_id, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(tf_ProductName)
                            .addComponent(tf_Quantity)
                            .addComponent(tf_Price))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Find, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_CreateBill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTotal)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tf_ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(tf_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(tf_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_Find, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_CreateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbTotal))
                .addGap(12, 12, 12))
        );

        lbHD.setForeground(new java.awt.Color(0, 0, 0));
        lbHD.setText("Hóa đơn");
        lbHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHDMouseClicked(evt);
            }
        });

        lbQLSP.setForeground(new java.awt.Color(0, 0, 0));
        lbQLSP.setText("Quản lý sản phẩm");
        lbQLSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbQLSPMouseClicked(evt);
            }
        });

        lbQLTK.setForeground(new java.awt.Color(0, 0, 0));
        lbQLTK.setText("Quản lý tài khoản");
        lbQLTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbQLTKMouseClicked(evt);
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
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbUser)
                            .addGap(27, 27, 27))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbHD)
                    .addComponent(lbQLSP)
                    .addComponent(lbQLTK))
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbUser)
                .addGap(51, 51, 51)
                .addComponent(lbHD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbQLSP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbQLTK)
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

    private void btn_FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FindActionPerformed
        
        PreparedStatement ps;
        ResultSet rs;
        
        boolean isInput1Integer = isInteger(tf_id.getText());
        int id=0;
        if (isInput1Integer)
        {
            id=Integer.parseInt(tf_id.getText());
        }
        String PrName=tf_ProductName.getText();
        String query="select * from tbProducts where id=? or ProductName=?";
        if (PrName==""&&!isInput1Integer)
        {
            SelectUsers();
        }
        else
        {
            try
            {

                ps=MyConnection.getConnection().prepareStatement(query);
                ps.setInt(1, id);
                ps.setString(2,PrName);
                rs=ps.executeQuery();
                if(rs.next())
                {
                    ps=MyConnection.getConnection().prepareStatement(query);
                    ps.setInt(1, id);
                    ps.setString(2,PrName);
                    rs=ps.executeQuery();
                    ProductsTable.setModel(DbUtils.resultSetToTableModel(rs));
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Không có sản phẩm");
                    MyConnection.getConnection().close();
                    SelectUsers();
                }

            }
            catch(SQLException e)
            {
                System.out.println(e.toString());
            }
        }
        
    }//GEN-LAST:event_btn_FindActionPerformed

    public void SelectUsers()
    {
        try
        {
            PreparedStatement ps;
            ResultSet rs;
            String query="Select * from tbProducts";
            String query2="select ProductName,Quantity,Price,Total from tbCart where username=?";
            String query3="select sum(Total) from tbCart where username=?";
            String username=Login.userloged;
            ps=MyConnection.getConnection().prepareStatement(query);
            rs=ps.executeQuery();
            ProductsTable.setModel(DbUtils.resultSetToTableModel(rs));
            ps=MyConnection.getConnection().prepareStatement(query2);
            ps.setString(1,username);
            rs=ps.executeQuery();
            CartTable.setModel(DbUtils.resultSetToTableModel(rs));
            ps=MyConnection.getConnection().prepareStatement(query3);
            ps.setString(1,username);
            rs=ps.executeQuery();
            if (rs.next())
            {
                lbTotal.setText(String.valueOf(rs.getInt("sum(Total)"))+"VNĐ");
            }
            
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        } 
    }
    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed

        DefaultTableModel model=(DefaultTableModel)ProductsTable.getModel();
        int MyIndex=ProductsTable.getSelectedRow();
        //tf_Quantity.setText(model.getValueAt(MyIndex, 2).toString());
        int stock=Integer.parseInt(model.getValueAt(MyIndex, 2).toString());
        boolean isInput1Integer = isInteger(tf_Quantity.getText());
        int buy=0;
        if(isInput1Integer)
        {
            buy=Integer.parseInt(tf_Quantity.getText());
            if (tf_Quantity.getText().isEmpty() ||tf_Quantity.getText().equals("0")||buy<=0)
            {
                JOptionPane.showMessageDialog(null,"Số lượng sản phẩm phải lớn hơn 0");
            }else
            {
                if(buy>stock||stock==0)
                {
                    JOptionPane.showMessageDialog(null,"Số lượng sản phẩm còn lại không đủ");
                }
                else
                {
                    PreparedStatement ps;
                    ResultSet rs;

                    String username=Login.userloged;
                    String Pr=tf_ProductName.getText();
                    int Quantity=buy;
                    int Price=Integer.parseInt(tf_Price.getText());
                    String query="INSERT INTO tbCart (username,ProductName, Quantity, Price,Total) VALUES (?,?,?,?,?)";
                    String query2="select Quantity from tbProducts where ProductName=?";
                    String query3="select * from tbCart where username=? and ProductName=?";
                    String query4="UPDATE tbCart SET Quantity=?,Price=?,Total=? where ProductName=? and username=?";
                    try
                    {
                        ps=MyConnection.getConnection().prepareStatement(query3);
                        ps.setString(1,username);
                        ps.setString(2,Pr);
                        rs=ps.executeQuery();
                        if (rs.next())
                        {
                            JOptionPane.showMessageDialog(null,"Sản phẩm đã có trong hóa đơn");
                            getClear();
                        }
                        else
                        {
                            if(buy<=stock)
                            {
                                ps=MyConnection.getConnection().prepareStatement(query);
                                ps.setString(1,username);
                                ps.setString(2,Pr);
                                ps.setInt(3,Quantity);
                                ps.setInt(4, Price);
                                ps.setInt(5,Price*Quantity);
                                ps.executeUpdate();
                                JOptionPane.showMessageDialog(null,"Thêm sản phẩm thành công");
                                MyConnection.getConnection().close();
                                getClear();
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"Số lượng sản phẩm không đủ");
                                getClear();
                            }
                        }                    
                        SelectUsers();
                    }
                    catch(SQLException e)
                    {
                        System.out.println(e.toString());
                    }  
                }
            }
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Số lượng phải là số nguyên");
        }
        
    }//GEN-LAST:event_btn_AddActionPerformed

    private void ProductsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsTableMouseClicked
        DefaultTableModel model=(DefaultTableModel)ProductsTable.getModel();
        int MyIndex=ProductsTable.getSelectedRow();
        tf_id.setText(model.getValueAt(MyIndex, 0).toString());
        tf_ProductName.setText(model.getValueAt(MyIndex, 1).toString());
        tf_Quantity.setText(model.getValueAt(MyIndex, 2).toString());
        tf_Price.setText(model.getValueAt(MyIndex, 3).toString());
    }//GEN-LAST:event_ProductsTableMouseClicked
    
    
    private void tf_QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_QuantityActionPerformed

        
    }//GEN-LAST:event_tf_QuantityActionPerformed

    private void tf_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_PriceActionPerformed

    }//GEN-LAST:event_tf_PriceActionPerformed

    public static int price;
    public static int stock;
    public static String proc;
    public static int temp;
    private void CartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)CartTable.getModel();
        int MyIndex=CartTable.getSelectedRow();
        DefaultTableModel proctable=(DefaultTableModel)ProductsTable.getModel();
        tf_ProductName.setText(model.getValueAt(MyIndex, 0).toString());
        tf_Quantity.setText(model.getValueAt(MyIndex, 1).toString());
        tf_Price.setText(model.getValueAt(MyIndex, 2).toString());
        proc=model.getValueAt(MyIndex, 0).toString();
        price=Integer.parseInt(model.getValueAt(MyIndex, 2).toString());
        PreparedStatement ps;
        ResultSet rs;
        String query="select Quantity from tbProducts where ProductName=?";
        try
        {
            ps=MyConnection.getConnection().prepareStatement(query);
            ps.setString(1,proc);
            rs=ps.executeQuery();
            if (rs.next())
            {
                stock=rs.getInt("Quantity");
            }
            
        }
         catch(SQLException e)
            {
                System.out.println(e.toString());
            } 
    }//GEN-LAST:event_CartTableMouseClicked

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        PreparedStatement ps;
        ResultSet rs;
        
        boolean isInput1Integer = isInteger(tf_Quantity.getText());
        if (isInput1Integer)
        {
            int Quantity=Integer.parseInt(tf_Quantity.getText());
            int Price=Integer.parseInt(tf_Price.getText());
            String query="UPDATE tbCart SET Quantity=?,Price=?,Total=? where ProductName=? and username=?";
            String query2="select * from tbProducts where Productname=?";
            try
            {
                ps=MyConnection.getConnection().prepareStatement(query2);
                ps.setString(1,proc);
                rs=ps.executeQuery();
                if(rs.next())
                {

                    if (tf_Quantity.getText().isEmpty() ||tf_Quantity.getText().equals("0")||Quantity<=0)
                    {
                        JOptionPane.showMessageDialog(null,"Số lượng sản phẩm phải lớn hơn 0");
                    }
                    else
                    {
                        if(Quantity>stock)
                        {
                            JOptionPane.showMessageDialog(null,"Số lượng sản phẩm còn lại không đủ");
                        }
                            else
                        {
                            String username=Login.userloged;
                            ps=MyConnection.getConnection().prepareStatement(query);
                            ps.setInt(1,Quantity);
                            ps.setInt(2,price);
                            ps.setInt(3,price*Quantity);
                            ps.setString(4,proc);
                            ps.setString(5,username);
                            ps.executeUpdate();
                            JOptionPane.showMessageDialog(null,"Cập nhật sản phẩm thành công");
                            MyConnection.getConnection().close();
                            getClear();
                            SelectUsers();
                        }
                    }


                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Không có sản phẩm");
                    getClear();
                    MyConnection.getConnection().close();
                    SelectUsers();
                }
            }
            catch(SQLException e)
            {
                System.out.println(e.toString());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Số lượng phải là số nguyên");
        }
          
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
       PreparedStatement ps;
        ResultSet rs;
        
        String query="delete from tbCart where ProductName=? and username=?";
        String query2="select * from tbCart where ProductName=? and username=?";
        try
        {
            ps=MyConnection.getConnection().prepareStatement(query2);
            ps.setString(1,proc);
            ps.setString(2,Login.userloged);
            rs=ps.executeQuery();
            if(rs.next())
            {
                
                ps=MyConnection.getConnection().prepareStatement(query);
                ps.setString(1,proc);
                ps.setString(2,Login.userloged);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Xóa sản phẩm thành công");
                MyConnection.getConnection().close();
                getClear();
                SelectUsers();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Sản phẩm không tồn tại");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }  
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_CreateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreateBillActionPerformed
        PreparedStatement ps;
        ResultSet rs;
        
        //int id=Integer.parseInt(tf_id.getText());
        //String PrName=tf_ProductName.getText();
        String username=Login.userloged;
        String query="insert into tbBill(username,bill_date) values (?,CURRENT_DATE())";
        String query2="select max(bill_id) from tbBill";
        String query3="insert into tbBill_Detail (bill_id,product_name,quantity,price,total) select ?,ProductName,Quantity,Price,Total from tbCart";
        String query4="delete from tbCart where username=?";
        String query5="update tbProducts set Quantity=Quantity-? where ProductName=?";
        String query6="select ProductName,Quantity from tbCart where username=?";
        try
        {
            
            ps=MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, username);
            ps.executeUpdate();
            ps=MyConnection.getConnection().prepareStatement(query2);
            rs=ps.executeQuery();
            if(rs.next())
            {
                temp=rs.getInt("max(bill_id)"); 
            }
            ps=MyConnection.getConnection().prepareStatement(query3);
            ps.setInt(1, temp);
            ps.executeUpdate();
            ps=MyConnection.getConnection().prepareStatement(query6);
            ps.setString(1, username);
            rs=ps.executeQuery();
            while (rs.next())
            {
                String name=rs.getString("ProductName");
                int quan=rs.getInt(("Quantity"));
                ps=MyConnection.getConnection().prepareStatement(query5);
                ps.setInt(1, quan);
                ps.setString(2,name);
                ps.executeUpdate();
            }
            ps=MyConnection.getConnection().prepareStatement(query4);
            ps.setString(1, username);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Tạo hóa đơn thành công");
            SelectUsers();
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btn_CreateBillActionPerformed

    private void lbQLSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbQLSPMouseClicked
        Products pr=new Products();
        pr.setVisible(true);
        pr.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lbQLSPMouseClicked

    private void lbQLTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbQLTKMouseClicked
        UserManagement pr=new UserManagement();
        pr.setVisible(true);
        pr.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lbQLTKMouseClicked

    private void lbHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHDMouseClicked
        Bill pr=new Bill();
        pr.setVisible(true);
        pr.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lbHDMouseClicked

    public void getClear()
    {
        tf_ProductName.setText("");
        tf_id.setText("");
        tf_Quantity.setText("");
        tf_Price.setText("");
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
                new User().setVisible(true);
//                lbUser.setText(userloged);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CartTable;
    private javax.swing.JTable ProductsTable;
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_CreateBill;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Find;
    private javax.swing.JButton btn_Logout;
    private javax.swing.JButton btn_Update;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbHD;
    private javax.swing.JLabel lbQLSP;
    private javax.swing.JLabel lbQLTK;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbUser;
    private javax.swing.JTextField tf_Price;
    private javax.swing.JTextField tf_ProductName;
    private javax.swing.JTextField tf_Quantity;
    private javax.swing.JTextField tf_id;
    // End of variables declaration//GEN-END:variables
}
