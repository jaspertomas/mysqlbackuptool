package mysqlbackup;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import utils.fileaccess.FileReader;
import utils.fileaccess.FileWriter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaspertomas
 */
public class FrmMain extends javax.swing.JFrame {
    /*
    //for prod
    String divider="\\";
    String username="root";
    String password="happiness";
    String database="tmcprogram3";
    //*/
    //*
    //for dev
    String divider="/";
    String username="root";
    String password="password";
    String database="clix";
    //String database="tmcprogram3";
    //*/ 
    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
        
        //check if settings file exists
        File settingsfile=new File("."+divider+"mysqlbinpath.txt");
        if(settingsfile.exists())
        {
            String mysqldump=FileReader.read("."+divider+"mysqlbinpath.txt");
            mysqldump=mysqldump.replace("\n", "");
            System.out.println(mysqldump);
            File mysqldumpfile=new File(mysqldump);
            File mysqlfile=new File(mysqldump.replace("dump", ""));

            if(!mysqldumpfile.exists())
            {
                //choose bin file
                chooseBinFile();
            }
            else if(!mysqlfile.exists())
            {
                //choose bin file
                chooseBinFile();
            }
            else
            {
                txtMysqldump.setText(mysqldump);
            }
        }
        else
        {
            //choose bin file
            System.out.println("Settings file not found");
            chooseBinFile();
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

        txtMysqldump = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBackup = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtMysqldump.setEditable(false);
        txtMysqldump.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMysqldumpActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Database Backup Tool");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Path to Mysql binary files:");

        btnBackup.setText("Save database as file");
        btnBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackupActionPerformed(evt);
            }
        });

        btnLoad.setText("Load database from file");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(txtMysqldump, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 345, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(83, 83, 83)
                                .add(jLabel2))))
                    .add(layout.createSequentialGroup()
                        .add(56, 56, 56)
                        .add(jLabel1))
                    .add(layout.createSequentialGroup()
                        .add(85, 85, 85)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(btnBackup, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(btnLoad, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .add(layout.createSequentialGroup()
                        .add(109, 109, 109)
                        .add(btnExit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(42, 42, 42)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(txtMysqldump, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnBackup, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnLoad, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(12, 12, 12)
                .add(btnExit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackupActionPerformed
//        if(txtMysqlBinPath.getText().isEmpty())
//        {
//            JOptionPane.showMessageDialog(this, "Save database backup as ...");
//            return;
//        }
        
        String mysqldebugfilename=txtMysqldump.getText();

        //ask for output file
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        JFileChooser fc = new JFileChooser();
        fc.setSelectedFile(new File("."+divider+"tmcbackup-"+sdf.format(new Date())+".sql"));
        fc.setDialogTitle("Save database backup file as ...");
        // Demonstrate "Open" dialog:
        int rVal = fc.showSaveDialog(this);
        
        String backupfilename="";
        //String backupcontent="";
        
        if (rVal == JFileChooser.APPROVE_OPTION) {
            backupfilename=fc.getCurrentDirectory().toString()+divider+fc.getSelectedFile().getName();
        }
        else if (rVal == JFileChooser.CANCEL_OPTION) {
            //JOptionPane.showMessageDialog(this, "mysqldump not found, exiting");
            return;
        }        
        
        try {        
            String command=mysqldebugfilename+" --user="+username+" --password="+password+" "+database;
            //System.out.println(command);
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec(command);
 
            BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));

            String line=null;

            try {
                PrintWriter out = new PrintWriter(new BufferedWriter(new java.io.FileWriter(backupfilename, true)));
                while((line=input.readLine()) != null) {
                    //System.out.println(line);
//                    backupcontent+=line;
                    out.println(line);
                }
                out.close();

                
            } catch (IOException e) {
                //exception handling left as an exercise for the reader
                e.printStackTrace();
            }        
            
            
            //FileWriter.write(backupfilename, backupcontent);

            int exitVal = pr.waitFor();
            System.out.println("Exited with error code "+exitVal);
        } catch (InterruptedException ex) {
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackupActionPerformed

    private void txtMysqldumpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMysqldumpActionPerformed

    }//GEN-LAST:event_txtMysqldumpActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        String mysqlfilename=getMysqlFile();
        String mysqldumpfilename=txtMysqldump.getText();

        //ask for output file
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        JFileChooser fc = new JFileChooser();
        fc.setSelectedFile(new File("."+divider+"*.sql"));
        fc.setDialogTitle("Load database backup file ...");
        // Demonstrate "Open" dialog:
        int rVal = fc.showOpenDialog(this);
        
        String loadfilename="";
        //String backupcontent="";
        
        if (rVal == JFileChooser.APPROVE_OPTION) {
            loadfilename=fc.getCurrentDirectory().toString()+divider+fc.getSelectedFile().getName();
        }
        else if (rVal == JFileChooser.CANCEL_OPTION) {
            //JOptionPane.showMessageDialog(this, "mysqldump not found, exiting");
            return;
        }        
        
        try {        

            String command;
            Runtime rt;
            Process pr;
            int exitVal;
            
            //--------------------drop and recreate tables via mysqldump---------------------
            // mysqldump -u[USERNAME] -p[PASSWORD] --add-drop-table --no-data [DATABASE] | grep -e '^DROP \| FOREIGN_KEY_CHECKS' | mysql -u[USERNAME] -p[PASSWORD] [DATABASE]
//            command=mysqldumpfilename+" -u"+username+" -p"+password+"  --add-drop-table --no-data "+database+" > temp";
//            System.out.println(command);
//            rt = Runtime.getRuntime();
//            pr = rt.exec(command);
//            exitVal = pr.waitFor();
//            if(exitVal!=0)
//            {
//                JOptionPane.showMessageDialog(this, "1 Exited with error code "+exitVal);
//                System.exit(exitVal);
//            }
//            
//            //+
//            command=mysqlfilename+" -u"+username+" -p"+password+" "+database+" < temp";
//            System.out.println(command);
//            rt = Runtime.getRuntime();
//            pr = rt.exec(command);
//            exitVal = pr.waitFor();
//            if(exitVal!=0)
//            {
//                JOptionPane.showMessageDialog(this, "1.5 Exited with error code "+exitVal);
//                System.exit(exitVal);
//            }
            //-----------------END---drop and recreate tables via mysqldump---------------------

            //--------------------drop database---------------------
            // mysql -uroot -ppassword -e "drop database clix;" 
            command=mysqlfilename+"admin -u"+username+" -p"+password+" -f drop "+database+"";
            System.out.println(command);
            rt = Runtime.getRuntime();
            pr = rt.exec(command);
            exitVal = pr.waitFor();
            if(exitVal!=0)
            {
                JOptionPane.showMessageDialog(this, "1 Exited with error code "+exitVal);
                //System.exit(exitVal);
            }
            
            //--------------------recreate database---------------------
            //mysql -uroot -ppassword -e "create database clix;"
            //command=mysqlfilename+" -u"+username+" -p"+password+" -e \"create database "+database+"\"";
            command=mysqlfilename+"admin -u"+username+" -p"+password+" -f create "+database+"";
            System.out.println(command);
            rt = Runtime.getRuntime();
            pr = rt.exec(command);
            exitVal = pr.waitFor();
            if(exitVal!=0)
            {
                JOptionPane.showMessageDialog(this, "2 Exited with error code "+exitVal);
                System.exit(exitVal);
            }
            
            //--------------------load database from backup file---------------------
            //mysql -uroot -ppassword clix < ~/tmcbackup-2014-02-13.sql 
            command=mysqlfilename+" -u"+username+" -p"+password+" "+database+" < "+loadfilename;

            String[] cmds = {"/bin/sh", "-c", command };
//            Process ps = Runtime.getRuntime().exec(cmds);
 
            //System.out.println(command);
            //System.out.println(command);
            rt = Runtime.getRuntime();
            pr = rt.exec(cmds);
            exitVal = pr.waitFor();
            if(exitVal!=0)
            {
                JOptionPane.showMessageDialog(this, "3 Exited with error code "+exitVal);
                System.exit(exitVal);
            }

//            command=mysqlfilename+" -u"+username+" -p"+password+" "+database;
//            System.out.println(command);
//            //System.out.println(command);
//            rt = Runtime.getRuntime();
//            pr = rt.exec(command);
//            exitVal = pr.waitFor();
 
            System.out.println("Exited with error code "+exitVal);
        } catch (InterruptedException ex) {
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }
    private void chooseBinFile()
    {
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Please locate the file mysqldump in your computer");
        // Demonstrate "Open" dialog:
        int rVal = fc.showOpenDialog(this);
        if (rVal == JFileChooser.APPROVE_OPTION) {
            if(fc.getSelectedFile().getName().contains("mysqldump"))
            {
                txtMysqldump.setText(fc.getCurrentDirectory().toString()+divider+fc.getSelectedFile().getName());
                FileWriter.write("."+divider+"mysqlbinpath.txt", txtMysqldump.getText());
            }
            else
            {
                JOptionPane.showMessageDialog(this, "this is not mysqldump, exiting");
                System.exit(0);
            }
//                System.out.println(c.getSelectedFile().getName());
//                System.out.println(c.getCurrentDirectory().toString());
        }
        else if (rVal == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this, "mysqldump not found, exiting");
            System.exit(0);
        }
    
    }
    private String getMysqlFile()
    {
        return txtMysqldump.getText().replace("dump", "");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackup;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLoad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtMysqldump;
    // End of variables declaration//GEN-END:variables
}
