import javax.swing.*;
import java.awt.*;  //action window tookit
import java.awt.event.*;

public class Attendance extends JFrame {
    JTextField name, roll;
    JRadioButton present, absent;
    JComboBox<String> subject;
    JTextArea area;

    Attendance() {
        setTitle("Student Attendance");
        setSize(500, 400);
        setVisible(true);
        setLayout(new GridLayout(7, 2, 5, 5));

        add(new JLabel("Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Roll No:"));
        roll = new JTextField();
        add(roll);

        add(new JLabel("Attendance:"));
        JPanel p = new JPanel();
        present = new JRadioButton("Present", true);
        absent = new JRadioButton("Absent");
        ButtonGroup bg = new ButtonGroup();
        bg.add(present); bg.add(absent);
        p.add(present); p.add(absent);
        add(p);

        add(new JLabel("Subject:"));
        subject = new JComboBox<>(new String[]{
            "Select", "Java", "DS", "OS", "CN", "DBMS"
        });
        add(subject);

        JButton submit = new JButton("Submit");
        JButton clear = new JButton("Clear");
        add(submit); add(clear);

        area = new JTextArea();
        add(new JScrollPane(area));

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (name.getText().isEmpty() || roll.getText().isEmpty()
                        || subject.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(Attendance.this,
                            "Fill all details!");
                    return;
                }

                area.append("Name: " + name.getText()
                        + ", Roll: " + roll.getText()
                        + ", Subject: " + subject.getSelectedItem()
                        + ", Attendance: "
                        + (present.isSelected() ? "Present" : "Absent") + "\n");
            }
        });

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                name.setText("");
                roll.setText("");
                subject.setSelectedIndex(0);
                present.setSelected(true);
                area.setText("");
            }
        });

    }

    public static void main(String[] args) {
        new Attendance();
    }
}