package com.exito.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.List;

@DefaultUrl("https://www.exito.com/")
public class PaginaInicioPageObject extends PageObject {

    @FindBy(how = How.ID, using = "Trazado_7822")
    public WebElementFacade buttonMenu;


    @FindBy(how = How.XPATH, using = "//li[@class='exito-category-menu-3-x-itemCategory '][position() >= 2]")
    public List<WebElementFacade> liCategoria;

    //@FindBy(how = How.XPATH, using = "//*[@id='undefined-nivel2-Tecnología']") //Estatico
    //public List<WebElementFacade> inputCategoria; //Estatico

    @FindBy(how = How.XPATH, using = "//a[starts-with(@id, 'Categorías-nivel3')]")
    public List<WebElementFacade> liSubCategoria;


    //@FindBy(how = How.ID, using = "Categorías-nivel3-Samsung") //Estatico
    //public WebElementFacade inputSubCategoria; //Estatico


}

