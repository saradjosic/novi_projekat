package raf.dsw.classycraft.app.view;

import javax.swing.*;
import java.awt.*;
import lombok.Getter;
import lombok.Setter;
public class MainFrame extends JFrame{
    private static MainFrame instance=null;
    private MainFrame() {
        initialise();
    }
    //promena
    public void initialise(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth / 2, screenHeight / 2);
        /*
        Image img = toolkit.getImage("images/img.png");
        setIconImage(img);
        */

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ClassyCraft");



        MenuBar menu=new MenuBar();
        setJMenuBar(menu);

        ToolBar toolbar=new ToolBar();
        add(toolbar, BorderLayout.NORTH);
    }

    public static MainFrame getInstance(){
        if(instance==null){
            instance = new MainFrame();
            instance.initialise();
        }
        return instance;
    }
}

