package raf.dsw.classycraft.app.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class NewProjectAction extends AbstractClassyAction{
    public NewProjectAction() {
        putValue(SMALL_ICON,loadIcon("images/img_2.png"));
        putValue(SHORT_DESCRIPTION,"New project");
        putValue(NAME,"New project");
        putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.ALT_MASK));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
