import com.formdev.flatlaf.FlatDarculaLaf;
import com.github.lgooddatepicker.components.DatePicker;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SwingExample extends javax.swing.JFrame {

    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;

   private DatePicker datePicker1;

   private JLabel jLabel1;
    private DatePicker datePicker2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private JButton jButton1;
    private JComboBox jComboBox1;


    public SwingExample() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new BorderLayout());
        jPanel1.setBorder(new EmptyBorder(10, 10, 10, 10));

        //jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Text Fields"));
        jPanel2.setLayout(new FlowLayout());

        jComboBox1 = new JComboBox();
        jComboBox1.addItem("Item 1");
        jComboBox1.addItem("Item 2");
        jComboBox1.addItem("Item 3");

        jPanel2.add(jComboBox1);

        jTextField1.setText("내용");
        jTextField1.setPreferredSize(new Dimension(150,jTextField1.getPreferredSize().height ));
        jPanel2.add(jTextField1);
        setTitle("Entity");
        datePicker1 = new DatePicker();
        jPanel2.add(datePicker1);
        jLabel1 = new JLabel(" ~ ");
        jPanel2.add(jLabel1);
        datePicker2 = new DatePicker();
        jPanel2.add(datePicker2);

        jButton1 = new JButton("Search");
        jPanel2.add(jButton1);


        jPanel1.add(jPanel2, BorderLayout.NORTH);

        //jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Table"));
        jPanel3.setLayout(new BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}, {null, null, null, null, null},


                },
                new String[]{
                        "Title 1", "Title 2", "Title 3", "Title 4","Title 5"
                }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, BorderLayout.CENTER);

        jPanel1.add(jPanel3, BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        FlatDarculaLaf.setup();
        new SwingExample().setVisible(true);
    }
}
