package com.exito.stepDefinitions;

import com.exito.steps.DetalleProductoSteps;
import com.exito.steps.PaginaInicioSteps;
import com.exito.steps.ProductoSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class BusquedaProductoStepDefinitions {

    @Steps
    PaginaInicioSteps paginaInicioSteps;

    @Steps
    ProductoSteps productoSteps;

    @Steps
    DetalleProductoSteps detalleProductoSteps;

    @Dado("que el usuario abra el navegador")
    public void queElUsuarioAbraElNavegador() {
        paginaInicioSteps.abrirUrl();
    }

    @Cuando("el usuario  da click en el menu")
    public void elUsuarioDaClickEnElMenu() {
        paginaInicioSteps.clickMenu();
    }

    @Cuando("da click en la categoria Tecnologia")
    public void daClickEnLaCategoriaTecnologia() {
        paginaInicioSteps.clickCategoria();
    }

    @Cuando("da click en la subcategoria")
    public void daClickEnLaSubcategoria() {
        paginaInicioSteps.clickSubcategoria();
    }

    @Cuando("da click en el producto que el usuario desee")
    public void daClickEnElProductoQueElUsuarioDesee() {
        productoSteps.seleccionProducto();
    }

    @Entonces("el usuario puede hacer la validación del producto por medio del titulo")
    public void elUsuarioPuedeHacerLaValidaciónDelProductoPorMedioDelTitulo() {
        detalleProductoSteps.verificarProducto();
    }

}
