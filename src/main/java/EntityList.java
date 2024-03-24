import com.formdev.flatlaf.FlatDarculaLaf;
import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DateTimePicker;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Fri Mar 22 06:28:09 KST 2024
 */



/**
 * @author ee323
 */
public class EntityList extends JFrame {
    public EntityList() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Entity");
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Hyeonil
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel5 = new JPanel();
        comboBox1 = new JComboBox();
        textField3 = new JTextField();
        panel4 = new JPanel();
        textField1 = new JTextField();
        label1 = new JLabel();
        textField2 = new JTextField();
        panel3 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        panel6 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        datePicker1 = new DateTimePicker();
        datePicker2 = new DateTimePicker();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 1.0, 1.0E-4};

        //======== panel1 ========
        {
            panel1.setBorder(new EmptyBorder(10, 10, 0, 10));

            panel1.setLayout(new FlowLayout());

            //======== panel2 ========
            {
                panel2.setLayout(new GridBagLayout());
                ((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {0, 0, 0, 0};
                ((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {0, 0};
                ((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {0.0, 1.0, 0.0, 1.0E-4};
                ((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                //======== panel5 ========
                {
                    panel5.setBorder(new TitledBorder("Keyword"));
                    panel5.setLayout(new GridBagLayout());
                    ((GridBagLayout)panel5.getLayout()).columnWidths = new int[] {0, 0, 0};
                    ((GridBagLayout)panel5.getLayout()).rowHeights = new int[] {0, 0};
                    ((GridBagLayout)panel5.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                    ((GridBagLayout)panel5.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};
                    panel5.add(comboBox1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 5), 0, 0));

                    //---- textField3 ----
                    textField3.setPreferredSize(new Dimension(140, 23));
                    panel5.add(textField3, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                panel2.add(panel5, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //======== panel4 ========
                {
                    panel4.setBorder(new TitledBorder("Date"));
                    panel4.setLayout(new GridBagLayout());
                    ((GridBagLayout)panel4.getLayout()).columnWidths = new int[] {0, 0, 0, 0};
                    ((GridBagLayout)panel4.getLayout()).rowHeights = new int[] {0, 0};
                    ((GridBagLayout)panel4.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
                    ((GridBagLayout)panel4.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};
                    datePicker1.setSize(new Dimension(70,23));
                    panel4.add(datePicker1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 5), 0, 0));

                    //---- label1 ----
                    label1.setText("~");
                    panel4.add(label1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 5), 0, 0));
                    panel4.add(datePicker2, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                    panel4.add(new JCheckBox("Create Date"), new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                panel2.add(panel4, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //======== panel3 ========
                {
                    panel3.setLayout(new GridBagLayout());
                    ((GridBagLayout)panel3.getLayout()).columnWidths = new int[] {0, 0, 0};
                    ((GridBagLayout)panel3.getLayout()).rowHeights = new int[] {0, 0};
                    ((GridBagLayout)panel3.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                    ((GridBagLayout)panel3.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

                    //---- button1 ----
                    button1.setText("Search");
                    button1.setMargin(new Insets(2, 10, 2, 10));
                    panel3.add(button1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 5), 0, 0));

                    //---- button2 ----
                    button2.setText("Write");
                    button2.setMargin(new Insets(2, 12, 2, 12));
                    panel3.add(button2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                panel2.add(panel3, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            panel1.add(panel2);
        }
        contentPane.add(panel1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //======== panel6 ========
        {
            panel6.setPreferredSize(new Dimension(780, 260));
            panel6.setLayout(new FlowLayout());

            //======== scrollPane1 ========
            {
                scrollPane1.setPreferredSize(new Dimension(780, 250));
                scrollPane1.setViewportView(table1);
            }
            panel6.add(scrollPane1);
        }
        contentPane.add(panel6, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        setSize(805, 375);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Hyeonil
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel5;
    private JComboBox comboBox1;
    private JTextField textField3;
    private JPanel panel4;
    private JTextField textField1;
    private JLabel label1;
    private JTextField textField2;
    private JPanel panel3;
    private JButton button1;
    private JButton button2;
    private JPanel panel6;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private JCheckBox checkBox1;

    private DateTimePicker datePicker1;
    private DateTimePicker datePicker2;

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        EntityList entityList = new EntityList();
        entityList.setVisible(true);
    }
}
