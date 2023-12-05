package raf.dsw.classycraft.app.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class AboutUsAction extends AbstractClassyAction{
    public AboutUsAction() {
        putValue(NAME,"About us");
        putValue(SHORT_DESCRIPTION,"About us");
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
                KeyEvent.VK_S,KeyEvent.ALT_MASK
        ));
        putValue(SMALL_ICON,"images/img_3.png");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
