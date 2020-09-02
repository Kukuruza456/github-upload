package view;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {
    JCheckBox cb1 = new JCheckBox("Vordergrung");
    JCheckBox cb2 = new JCheckBox("Hintergrund");
    JRadioButton r1 = new JRadioButton("Rot");
    JRadioButton r2 = new JRadioButton("Aquamarin");
    JRadioButton r3 = new JRadioButton("Pink");
    JRadioButton r4 = new JRadioButton("Aubergine");
    JRadioButton r5 = new JRadioButton("Grasgruen");
    JRadioButton r6 = new JRadioButton("Manhatangrau");

    JButton view = new JButton("Anzeigen");
    JButton close = new JButton("Close");

    JTextField info = new JTextField();

    JPanel left = new JPanel();
    JPanel right = new JPanel();
    JPanel all = new JPanel();
    JPanel forall = new JPanel();
    JPanel third = new JPanel();

    ButtonGroup one = new ButtonGroup();
    ButtonGroup second = new ButtonGroup();

    public Gui(){
        Container cp = getContentPane();

        info.setEditable(false);

        one.add(r1);
        one.add(r2);
        one.add(r3);

        second.add(r4);
        second.add(r5);
        second.add(r6);

        left.add(cb1);
        left.add(r1);
        left.add(r2);
        left.add(r3);

        right.add(cb2);
        right.add(r4);
        right.add(r5);
        right.add(r6);

        all.setLayout(new BorderLayout());

        third.setLayout(new BoxLayout(third, BoxLayout.Y_AXIS));

        third.add(view);
        third.add(close);

        all.add(left, BorderLayout.WEST);
        all.add(right, BorderLayout.CENTER);
        all.add(third, BorderLayout.EAST);

        left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));
        right.setLayout(new BoxLayout(right, BoxLayout.Y_AXIS));

        forall.setLayout(new FlowLayout());

        forall.add(all);

        cp.add(forall);
        cp.add(info, BorderLayout.SOUTH);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
    }

    public void listener(Controller c){
        view.setActionCommand("Anzeigen");
        close.setActionCommand("Close");
        view.addActionListener(c);
        close.addActionListener(c);
    }

    public JCheckBox getCb1() {
        return cb1;
    }

    public JCheckBox getCb2() {
        return cb2;
    }

    public JRadioButton getR1() {
        return r1;
    }

    public JRadioButton getR2() {
        return r2;
    }

    public JRadioButton getR3() {
        return r3;
    }

    public JRadioButton getR4() {
        return r4;
    }

    public JRadioButton getR5() {
        return r5;
    }

    public JRadioButton getR6() {
        return r6;
    }

    public JButton getView() {
        return view;
    }

    public JButton getClose() {
        return close;
    }

    public JTextField getInfo() {
        return info;
    }

    public void setInfo(JTextField info) {
        this.info = info;
    }
}
