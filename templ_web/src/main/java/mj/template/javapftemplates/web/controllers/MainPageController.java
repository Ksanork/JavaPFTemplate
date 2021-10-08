package mj.template.javapftemplates.web.controllers;


import mj.template.javapftemplates.ejb.facades.RandomFacade;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class MainPageController implements Serializable {

    @Inject
    private RandomFacade randomFacade;

    private boolean showFirstPanel = true;
    private boolean showSecondPanel = true;

    private int intRandom;
    private double doubleRandom;

    public MainPageController() {
    }

    @PostConstruct
    public void init() {
        randForAll();
    }

    public void randForAll() {
        intRandom = randomFacade.randomInt();
        doubleRandom = randomFacade.randomDouble();
    }

    public boolean isShowFirstPanel() {
        return showFirstPanel;
    }

    public void setShowFirstPanel(boolean showFirstPanel) {
        this.showFirstPanel = showFirstPanel;
    }

    public boolean isShowSecondPanel() {
        return showSecondPanel;
    }

    public void setShowSecondPanel(boolean showSecondPanel) {
        this.showSecondPanel = showSecondPanel;
    }

    public int getIntRandom() {
        return intRandom;
    }

    public void setIntRandom(int intRandom) {
        this.intRandom = intRandom;
    }

    public double getDoubleRandom() {
        return doubleRandom;
    }

    public void setDoubleRandom(double doubleRandom) {
        this.doubleRandom = doubleRandom;
    }
}
