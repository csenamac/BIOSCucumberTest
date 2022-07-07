Feature: Compras
  Background:
    Given accedo a la pagina {string}

    Scenario:
      Given Selecciono barra de busqueda
      When Escribo nombre del produto "blouse"
      And Valido que aparezca el nombre "blouse" en la pagina
      And Doy click en el boton "Add to cart"
      And Doy click en el boton "Proceed to checkout"

