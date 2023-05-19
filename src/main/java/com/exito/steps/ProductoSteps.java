package com.exito.steps;

import com.exito.pageObjects.ProductoPageObject;
import com.exito.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.util.Random;

public class ProductoSteps{

    @Page
    private ProductoPageObject productoPageObject;

    @Step("El usuario selecciona el producto")
    public void seleccionProducto(){
        //productoPageObject.aProducto.click();  //Estatico

        EsperaImplicita.esperaImplicita(7);
        int tamanoArregloArticulos = productoPageObject.aProducto.size();

        Random random = new Random();
        int indiceDeLaCategoria = random.nextInt(tamanoArregloArticulos);

        productoPageObject.aProducto.get(indiceDeLaCategoria).click();
    }
}
