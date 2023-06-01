import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class GUIForm extends JFrame {

    private JPanel panel1;
    private JTextField textField1;
    private JButton button1;
    private JTextField textField2;
    private JTextField textField3;

    public GUIForm() {
        super("VEGA");
        setBounds(100, 100, 200, 200);

        add(panel1);

        add(textField1, BorderLayout.PAGE_START);

        textField1.setBounds(50, 100, 100, 100);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String list1 = textField1.getText();

                String[] l1 = list1.split(" ");

                MyLinkedList listL1 = new MyLinkedList();

                MyLinkedList listL2 = new MyLinkedList();

                MyLinkedList outList = new MyLinkedList();

                for (String node : l1) {
                    listL1.add(Integer.parseInt(node));
                }


                String list2 = textField2.getText();
                String[] l2 = list2.split(" ");


                for (String node : l2) {
                    listL2.add(Integer.parseInt(node));
                }


                outList = MergeTwoSortedLists.mergeTwoMyLinkedLists(listL1, listL2);


                textField3.setText(outList.toString());


                StringBuilder cringe = new StringBuilder();

                for (int i = 0; i < outList.size; i++) {
                    cringe.append(outList.get(i)).append(" ");
                }

                //textField3.setText(cringe.toString());
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        GUIForm app = new GUIForm();
        app.setVisible(true);
        app.pack();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
