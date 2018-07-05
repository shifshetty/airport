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
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author harshitha
 */
public class frame3 extends javax.swing.JFrame {
Connection conn=null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form frame3
     */
    public frame3() {
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
public ArrayList<eachflight> geteachflightList()
    {try{Statement st;
            ResultSet rs;String query=null;
            ArrayList<eachflight> eachflightlist = new ArrayList<eachflight>();
            Connection con = getConnection();
            String s= fno.getText();
            if(s.equals("AA997")){
                
            query = "SELECT flight_num,DOD,DOA,act_TOD,act_TOA,destination,status FROM flight_schedule where flight_num='AA997';";
            }
            else if(s.equals("BB001")){
                
            query = "SELECT flight_num,DOD,DOA,act_TOD,act_TOA,destination,status FROM flight_schedule where flight_num='BB001';";
            }
            else if(s.equals("BL600")){
                
            query = "SELECT flight_num,DOD,DOA,act_TOD,act_TOA,destination,status FROM flight_schedule where flight_num='BL600';";
            }
            else if(s.equals("DL090")){
                
            query = "SELECT flight_num,DOD,DOA,act_TOD,act_TOA,destination,status FROM flight_schedule where flight_num='DL090';";
            }
            else if(s.equals("FL110")){
                
            query = "SELECT flight_num,DOD,DOA,act_TOD,act_TOA,destination,status FROM flight_schedule where flight_num='FL110';";
            }
            else if(s.equals("LN045")){
                
            query = "SELECT flight_num,DOD,DOA,act_TOD,act_TOA,destination,status FROM flight_schedule where flight_num='LN045';";
            }
          //pst=conn.prepareStatement(query);
            // pst.setString(1,flightno.getText());
             
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
            eachflight eachflight;
            
            while(rs.next())
            {
                eachflight = new eachflight(rs.getString("flight_num"),rs.getString("DOD"),rs.getString("DOA"),rs.getString("act_TOD"),rs.getString("act_TOA"),rs.getString("destination"),rs.getString("status"));
                eachflightlist.add(eachflight);
            }
            return eachflightlist; 
            
        } catch (SQLException e) {
                         e.printStackTrace();
             System.out.println("SQLException handled ");return null;
        }
        
         
                
    }
 public void Show_eachflight_In_JTable()
    {
        ArrayList<eachflight> list = geteachflightList();
        DefaultTableModel model = (DefaultTableModel)eachflight.getModel();
        // clear jtable content
        model.setRowCount(0);
        Object[] row = new Object[7];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getflight_num();
            row[1] = list.get(i).getDOD();
            row[2] = list.get(i).getDOA();
            row[3] = list.get(i).getact_TOD();
            row[4] = list.get(i).getact_TOA();
            row[5] = list.get(i).getdestination();
            row[6] = list.get(i).getstatus();
            
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
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eachflight = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1083, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );

        jButton2.setText("Home Page");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("flightno");

        fno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnoActionPerformed(evt);
            }
        });

        jButton1.setText("get details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/harshitha/Downloads/flight.jpeg")); // NOI18N

        eachflight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "flightno", "dept date", "arr date", "tod", "toa", "destination", "status"
            }
        ));
        jScrollPane1.setViewportView(eachflight);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel1)
                        .addGap(75, 75, 75)
                        .addComponent(fno, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel2))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(fno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton3)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Show_eachflight_In_JTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        frame1 f1=new frame1();
        f1.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        frame2 f2=new frame2();
        f2.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable eachflight;
    private javax.swing.JTextField fno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
