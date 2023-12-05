package raf.dsw.classycraft.app;

import raf.dsw.classycraft.app.view.MainFrame;

public class AppCore{
    public static void main(String[] args) {
        MainFrame m=MainFrame.getInstance();
        m.initialise();
    }
}
