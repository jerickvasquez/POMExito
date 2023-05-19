package com.exito.steps;

import com.exito.pageObjects.PaginaInicioPageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.util.Random;

public class PaginaInicioSteps {

    //PaginaInicioPageObject paginaInicioPageObject = new PaginaInicioPageObject();

    @Page //Se puede usar esta forma de instanciar debido a que esta es una versión superior a 3
    private PaginaInicioPageObject paginaInicioPageObject;

    @Step("Usuario abre la url")
    public void abrirUrl(){
        paginaInicioPageObject.open();
    }

    @Step("El usuario da click en el menu")
    public void clickMenu(){
        paginaInicioPageObject.buttonMenu.click();
    }

    @Step("El usuario da click en la categoria")
    public void clickCategoria(){

        int tamanoArregloArticulos = paginaInicioPageObject.liCategoria.size();

        Random random = new Random();
        int indiceDeLaCategoria = random.nextInt(tamanoArregloArticulos);

        paginaInicioPageObject.liCategoria.get(indiceDeLaCategoria).click();

        //paginaInicioPageObject.inputCategoria.click(); //Estatico
    }

    @Step("El usuario da click en la subcaterogia")
    public void clickSubcategoria(){
        int tamanoArregloArticulos = paginaInicioPageObject.liSubCategoria.size();

        Random random = new Random();
        int indiceDeLaCategoria = random.nextInt(tamanoArregloArticulos);

        paginaInicioPageObject.liSubCategoria.get(indiceDeLaCategoria).click();

        //paginaInicioPageObject.inputSubCategoria.click(); //Estatico
    }
}
