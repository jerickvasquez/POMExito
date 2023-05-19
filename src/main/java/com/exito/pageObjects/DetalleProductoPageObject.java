package com.exito.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DetalleProductoPageObject extends PageObject {

    @FindBy(how = How.XPATH, using = "//span[@class='vtex-store-components-3-x-productBrand ']")
    public WebElementFacade labelDetalleProducto;
}
