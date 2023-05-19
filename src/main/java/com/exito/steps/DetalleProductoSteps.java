package com.exito.steps;

import com.exito.pageObjects.DetalleProductoPageObject;
import com.exito.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;
import org.junit.Assert;


public class DetalleProductoSteps {

    @Steps
    private DetalleProductoPageObject detalleProductoPageObject;

    @Step("El usuario verifica el producto")
    public void verificarProducto(){

        EsperaImplicita.esperaImplicita(7);

        Assert.assertThat(
            "La respuesta es : ",
                detalleProductoPageObject.labelDetalleProducto.isDisplayed(),
                Matchers.is(true)
        );

    }
}
