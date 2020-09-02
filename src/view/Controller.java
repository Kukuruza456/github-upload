package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;

public class Controller implements ActionListener {

    Gui view;
    Model model;
    public Controller(Gui view) {
        this.view = view;
        view.listener(this);
        model = new Model();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(view.view.getActionCommand())){
            if (!view.cb1.isSelected() && !view.cb2.isSelected()){
                view.info.setText("Bitte Vordegrund oder Hintergrund auswehlen");
            }else{
                if(view.cb1.isSelected()){
                    if (view.r1.isSelected()){
                        view.getR1().setForeground(new Color(255, 10, 20, 145));
                        view.getR2().setForeground(new Color(255, 10, 20, 145));
                        view.getR3().setForeground(new Color(255, 10, 20, 145));
                        view.getR4().setForeground(new Color(255, 10, 20, 145));
                        view.getR5().setForeground(new Color(255, 10, 20, 145));
                        view.getR6().setForeground(new Color(255, 10, 20, 145));
                    }else if (view.r2.isSelected()){
                        view.getR1().setForeground(new Color(119, 154, 210));
                        view.getR2().setForeground(new Color(119, 154, 210));
                        view.getR3().setForeground(new Color(119, 154, 210));
                        view.getR4().setForeground(new Color(119, 154, 210));
                        view.getR5().setForeground(new Color(119, 154, 210));
                        view.getR6().setForeground(new Color(119, 154, 210));
                    }
                    else if (view.r3.isSelected()){
                        view.getR1().setForeground(new Color(210, 119, 192));
                        view.getR2().setForeground(new Color(210, 119, 192));
                        view.getR3().setForeground(new Color(210, 119, 192));
                        view.getR4().setForeground(new Color(210, 119, 192));
                        view.getR5().setForeground(new Color(210, 119, 192));
                        view.getR6().setForeground(new Color(210, 119, 192));
                    }
                }
                if (view.cb2.isSelected()){
                    if (view.r4.isSelected()) {
                        view.getR1().setBackground(new Color(100, 40, 255, 175));
                        view.getR2().setBackground(new Color(100, 40, 255, 175));
                        view.getR3().setBackground(new Color(100, 40, 255, 175));
                        view.getR4().setBackground(new Color(100, 40, 255, 175));
                        view.getR5().setBackground(new Color(100, 40, 255, 175));
                        view.getR6().setBackground(new Color(100, 40, 255, 175));
                        view.left.setBackground(new Color(100, 40, 255, 175));
                        view.right.setBackground(new Color(100, 40, 255, 175));
                        view.all.setBackground(new Color(100, 40, 255, 175));
                        view.cb1.setBackground(new Color(100, 40, 255, 175));
                        view.cb2.setBackground(new Color(100, 40, 255, 175));
                    }else if(view.r5.isSelected()){
                        view.getR1().setBackground(new Color(15, 255, 14, 175));
                        view.getR2().setBackground(new Color(15, 255, 14, 175));
                        view.getR3().setBackground(new Color(15, 255, 14, 175));
                        view.getR4().setBackground(new Color(15, 255, 14, 175));
                        view.getR5().setBackground(new Color(15, 255, 14, 175));
                        view.getR6().setBackground(new Color(15, 255, 14, 175));
                        view.left.setBackground(new Color(15, 255, 14, 175));
                        view.right.setBackground(new Color(15, 255, 14, 175));
                        view.all.setBackground(new Color(15, 255, 14, 175));
                        view.cb1.setBackground(new Color(15, 255, 14, 175));
                        view.cb2.setBackground(new Color(15, 255, 14, 175));
                    }else if(view.r6.isSelected()){
                        view.getR1().setBackground(new Color(67, 67, 31, 255));
                        view.getR2().setBackground(new Color(67, 67, 31, 255));
                        view.getR3().setBackground(new Color(67, 67, 31, 255));
                        view.getR4().setBackground(new Color(67, 67, 31, 255));
                        view.getR5().setBackground(new Color(67, 67, 31, 255));
                        view.getR6().setBackground(new Color(67, 67, 31, 255));
                        view.left.setBackground(new Color(67, 67, 31, 255));
                        view.right.setBackground(new Color(67, 67, 31, 255));
                        view.all.setBackground(new Color(67, 67, 31, 255));
                        view.cb1.setBackground(new Color(67, 67, 31, 255));
                        view.cb2.setBackground(new Color(67, 67, 31, 255));
                    }
                }
            }
        }else if(e.getActionCommand().equals(view.close.getActionCommand())){
            model.makeTime( null, null);
        }
    }
}
