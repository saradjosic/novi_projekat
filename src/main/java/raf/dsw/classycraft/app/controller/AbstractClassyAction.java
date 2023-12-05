package raf.dsw.classycraft.app.controller;

import javax.swing.*;
import java.net.URL;

public abstract class AbstractClassyAction extends AbstractAction{
    public Icon loadIcon(String ime_slike){
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
/*AbstractAction ima u sebi apstraktnu metodu ActionPerformed i tu je
zapravo ono sto treba da se desi kada neku akciju pokrenemo
i tu metodu uvek moramo da override ujemo u klasi koja nasledjuje AA
jedini tip koji je prihvatljiv da se ubaci kao listener ili akcija na
neko dugme je to AA
u ActionPerformed pisemo sta treba da se desi
putValue je isto odatle metoda
to je za tool i menu, (enum,sta stavljamo)
u AK mogu da imaju polja a interface ne
svaki put kada hocemo da se nesto desi pravimo akciju
iskljucivo za to dugme, i overriduje ujemo AP
zato imamo ActionManager-biblioteka nasih akcija
ima instancu svake akcije
konstruktor AM inicijalizuje svaku akciju
MainFrame i ApplicationFramework su jedina 2 singletona
AF je za model a MF za view
MF ima instancu AM
jer smo npr u tool baru i hocemo exit aciton
i onfa zovemo MainFrame.getInstance().getActionManager().get ta neka akcija

 */