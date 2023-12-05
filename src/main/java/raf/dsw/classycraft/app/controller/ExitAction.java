package raf.dsw.classycraft.app.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class ExitAction extends AbstractClassyAction{
    public ExitAction(){
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
                KeyEvent.VK_4, ActionEvent.ALT_MASK
        ));
        putValue(SMALL_ICON,load("images/img_1.png"));
        putValue(NAME,"Exit");
        putValue(SHORT_DESCRIPTION,"Exit");
    }

    @Override //to je listener
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
