package question1;

import pack1.Var;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class continuebutton1 extends JButton {
    public continuebutton1() {

        super("Continue");
        this.setVisible(false);
        this.setBounds(Var.x5, Var.y3, Var.width3, Var.height3);
        this.setForeground( Color.white);
        this.setBackground( Color.black);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.jl2.setVisible(false);
                Var.jb3.setVisible(false);
                Var.jl3.setVisible(true);
                Var.jb4.setVisible(true);
                Var.jb5.setVisible(true);
            }
        });
    }


}

