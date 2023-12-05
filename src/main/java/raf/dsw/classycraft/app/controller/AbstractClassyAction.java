package raf.dsw.classycraft.app.controller;

import javax.swing.*;
import java.net.URL;

public abstract class AbstractClassyAction extends AbstractAction{
    public Icon load(String ime_slike){
        URL imageURL=getClass().getResource(ime_slike);
        Icon icon=null;
        if(imageURL!=null){
            icon=new ImageIcon(imageURL);
        } else
        {
            System.err.println("Slika nono"+ime_slike);
        }
        return icon;
    }
}
