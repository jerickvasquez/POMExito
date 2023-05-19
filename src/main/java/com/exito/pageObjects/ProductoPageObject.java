package com.exito.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ProductoPageObject extends PageObject {

    //@FindBy(how = How.XPATH, using = "//img[@alt='Televisor SAMSUNG 60 Pulgadas LED Uhd4K Smart TV 60BU8000'][1]") //Estatico
    //public WebElementFacade aProducto; //Estatico

    @FindBy(how = How.XPATH, using = "//img[starts-with(@class, 'vtex-product-summary-2-x-imageNormal vtex-product-summary-2-x-image')]")
    public List<WebElementFacade> aProducto;
}
