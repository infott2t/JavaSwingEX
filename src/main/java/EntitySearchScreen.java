import com.formdev.flatlaf.FlatDarculaLaf;
import com.github.lgooddatepicker.components.DateTimePicker;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Fri Mar 22 07:59:46 KST 2024
 */



/**
 * @author ee323
 */
public class EntitySearchScreen extends JFrame {
    public EntitySearchScreen() {
        initComponents();
    }

    private void initComponents() {

        setTitle("Entity Search");
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Hyeonil
        panel1 = new JPanel();
        panel2 = new JPanel();
        comboBox1 = new JComboBox();
        textField1 = new JTextField();
        panel3 = new JPanel();
        panel5 = new JPanel();
        textField2 = new JTextField();
        label1 = new JLabel();
        textField3 = new JTextField();
        checkBox1 = new JCheckBox();
        panel4 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();

        dateTimePicker1 = new DateTimePicker();
        dateTimePicker2 = new DateTimePicker();


        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

        //======== panel1 ========
        {
            panel1.setBorder(new EmptyBorder(10, 10, 10, 10));

            panel1.setLayout(new GridBagLayout());
            ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0};
            ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0, 0};
            ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
            ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

            //======== panel2 ========
            {
                panel2.setBorder(new TitledBorder("Keyword"));
                panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
                panel2.add(comboBox1);

                //---- textField1 ----
                textField1.setMinimumSize(new Dimension(300, 23));
                textField1.setHorizontalAlignment(SwingConstants.LEFT);
                textField1.setPreferredSize(new Dimension(300, 23));
                panel2.add(textField1);
            }
            panel1.add(panel2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //======== panel3 ========
            {
                panel3.setLayout(new GridBagLayout());
                ((GridBagLayout)panel3.getLayout()).columnWidths = new int[] {0, 0, 0};
                ((GridBagLayout)panel3.getLayout()).rowHeights = new int[] {0, 0};
                ((GridBagLayout)panel3.getLayout()).columnWeights = new double[] {1.0, 0.0, 1.0E-4};
                ((GridBagLayout)panel3.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                //======== panel5 ========
                {
                    panel5.setBorder(new TitledBorder("Date"));
                    panel5.setLayout(new FlowLayout(FlowLayout.LEFT));
                    panel5.add(dateTimePicker1);

                    //---- label1 ----
                    label1.setText("~");
                    panel5.add(label1);
                    panel5.add(dateTimePicker2);

                    //---- checkBox1 ----
                    checkBox1.setText("CreateDate");
                    panel5.add(checkBox1);
                }
                panel3.add(panel5, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 5), 0, 0));

                //======== panel4 ========
                {
                    panel4.setLayout(new FlowLayout());

                    //---- button1 ----
                    button1.setText("Search");
                    panel4.add(button1);

                    //---- button2 ----
                    button2.setText("Write");
                    panel4.add(button2);
                }
                panel3.add(panel4, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            panel1.add(panel3, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        setSize(835, 180);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        button1.addActionListener(e -> {
            System.out.println("button1 clicked");
            System.out.println(dateTimePicker1.getDateTimePermissive());
            System.out.println(dateTimePicker2.getDateTimePermissive());
            System.out.println(dateTimePicker1.getDatePicker());
            System.out.println(dateTimePicker2.getDatePicker());
            System.out.println(dateTimePicker1.getTimePicker());
            System.out.println(dateTimePicker2.getTimePicker());


        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Hyeonil
    private JPanel panel1;
    private JPanel panel2;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JPanel panel3;
    private JPanel panel5;
    private JTextField textField2;
    private JLabel label1;
    private JTextField textField3;
    private JCheckBox checkBox1;
    private JPanel panel4;
    private JButton button1;
    private JButton button2;
    private DateTimePicker dateTimePicker1;
    private DateTimePicker dateTimePicker2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        EntitySearchScreen entitySearchScreen = new EntitySearchScreen();
        entitySearchScreen.setVisible(true);
    }
}
