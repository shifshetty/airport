/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shifu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author harshitha
 */
public class frame7 extends javax.swing.JFrame {
Connection conn=null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form frame7
     */
    public frame7() {
        initComponents();
    }
    public Connection getConnection()
    {
        Connection con = null;
       try
        {
            Class.forName("com.mysql.jdbc.Driver" );
              conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/Airport?autoReconnect=true&useSSL=false", "root", "harshitha123");
             System.out.println("connection is successfully executed "+conn);
             return conn;
             
        }catch (ClassNotFoundException e) {
             System.err.println("ERROR: failed to load mysql JDBC driver.");
         e.printStackTrace();
         return null;
         }catch(SQLException e)
              {
             e.printStackTrace();
             System.out.println("SQLException handled ");return null;
         }
        
    }
public ArrayList<employee> getemployeeList()
    {try{Statement st;
            ResultSet rs;
            String query=null;
            ArrayList<employee> employeelist = new ArrayList<employee>();
            Connection con = getConnection();
            String s=empid.getText();
            if(s.equals("415009"))
            {
            query = "SELECT * FROM employee where eid=415009;";
            }
            else if(s.equals("415011"))
            {
            query = "SELECT * FROM employee where eid=415011;";
            }
            else if(s.equals("415024"))
            {
            query = "SELECT * FROM employee where eid=415024;";
            }
            else if(s.equals("415025"))
            {
            query = "SELECT * FROM employee where eid=415025;";
            }
            else if(s.equals("415036"))
            {
            query = "SELECT * FROM employee where eid=415036;";
            }
            else if(s.equals("415045"))
            {
            query = "SELECT * FROM employee where eid=415045;";
            }
            else if(s.equals("415103"))
            {
            query = "SELECT * FROM employee where eid=415103;";
            }
            else if(s.equals("415200"))
            {
            query = "SELECT * FROM employee where eid=415200;";
            }
            else if(s.equals("415201"))
            {
            query = "SELECT * FROM employee where eid=415201;";
            }
            else if(s.equals("415400"))
            {
            query = "SELECT * FROM employee where eid=415400;";
            }
            else if(s.equals("415415"))
            {
            query = "SELECT * FROM employee where eid=415415;";
            }
            else if(s.equals("415416"))
            {
            query = "SELECT * FROM employee where eid=415416;";
            }
            else if(s.equals("415417"))
            {
            query = "SELECT * FROM employee where eid=415417;";
            }
           // pst=conn.prepareStatement(query);
             //pst.setString(1,field.getText());
             
             //rs=pst.executeQuery();
             /*if(rs.next())
             {
                 
                 frame2 f2=new frame2();
                 f2.setVisible(true);
                 setVisible(false);
                 dispose();
                 
             }
             else
             {
                 JOptionPane.showMessageDialog(null,"invalid");
             }*/
            
            
           
        
            
            st = conn.createStatement();
            rs = st.executeQuery(query);
            employee employee;
            
            while(rs.next())
            {
                employee = new employee(rs.getString("eid"),rs.getString("name"),rs.getString("DOB"),rs.getString("salary"),rs.getString("address"),rs.getString("dept_id"),rs.getString("password"));
                employeelist.add(employee);
            }
            return employeelist; 
            
        } catch (SQLException e) {
                         e.printStackTrace();
             System.out.println("SQLException handled ");return null;
        }
        
         
                
    }
 public void Show_employee_In_JTable()
    {
        ArrayList<employee> list = getemployeeList();
        DefaultTableModel model = (DefaultTableModel)emptable.getModel();
        // clear jtable content
        model.setRowCount(0);
        Object[] row = new Object[7];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).geteid();
            row[1] = list.get(i).getname();
            row[2] = list.get(i).getDOB();
            row[3] = list.get(i).getsalary();
            row[4] = list.get(i).getaddress();
            row[5] = list.get(i).getdept_id();
            row[6] = list.get(i).getpassword();
            
            model.addRow(row);
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
        jLabel1 = new javax.swing.JLabel();
        empid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        emptable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Emp ID");

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        emptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "empid", "name", "DOB", "salary", "address", "dept_id", "password"
            }
        ));
        jScrollPane1.setViewportView(emptable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empid, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(293, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 75, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try
        {
            Class.forName("com.mysql.jdbc.Driver" );
              conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/Airport?autoReconnect=true&useSSL=false", "root", "harshitha123");
             System.out.println("connection is successfully executed "+conn);
             String sql="select * from employee where eid =? and password=?;";
             pst=conn.prepareStatement(sql);
             pst.setString(1,empid.getText());
             pst.setString(2,password.getText());
             rs=pst.executeQuery();
             if(rs.next())
             {
                 JOptionPane.showMessageDialog(null,"welcome user");
                 Show_employee_In_JTable();
                 
             }
             else
             {
                 JOptionPane.showMessageDialog(null,"invalid");
             }
             
             
        }catch (ClassNotFoundException e) {
             System.err.println("ERROR: failed to load mysql JDBC driver.");
         e.printStackTrace();
         
         }
        catch(SQLException e)
              {
             e.printStackTrace();
             System.out.println("SQLException handled ");
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        frame1 f=new frame1();
        f.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(frame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField empid;
    private javax.swing.JTable emptable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
