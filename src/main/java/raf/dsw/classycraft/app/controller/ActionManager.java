package raf.dsw.classycraft.app.controller;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ActionManager{
    private ExitAction exitAction;
    private NewProjectAction newProjectAction;

    public ActionManager() {
        initActions();
    }

    private void initActions(){
        exitAction=new ExitAction();
        newProjectAction=new NewProjectAction();
    }
}
