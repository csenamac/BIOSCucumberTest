Feature: Busqueda

  Background:
    Given Accedo a la pag "http://automationpractice.com/index.php"

    Scenario: Buscar un articulo
      Given Selecciono barra de busqueda
      When Escribo nombre del produto "blouse"
    #  Then Valido que aparezca 1 elemento encontrado
      And Valido que aparezca el nombre "BLOUSE" en la pag