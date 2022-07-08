Feature: Compras
  Background:
    Given accedo a la pagina http://automationpractice.com
    And Me  logueo con el usuario "probando.ando.csenamac@gmail.com" y el password "probandoando2022"

  Scenario:
    Given Selecciono barra de busqueda
    When Escribo nombre del producto "blouse"
    And Valido que aparezca el nombre "blouse" en la pagina
    And Doy click en el boton "Add to cart"
    And Doy click en el boton "Proceed to checkout"
    And Doy click en el boton "Proceed to checkout"
    And Doy click en el boton "Proceed to checkout"
    And Doy click en el boton "Proceed to checkout"
    And Doy click en el boton "Pay by check"
    And Doy click en el boton "I confirm my order"

  Scenario:
    Given Selecciono barra de busqueda
    When Escribo nombre del producto "blouse"
    And Valido que aparezca el nombre "blouse" en la pagina
    And Doy click en el boton "Add to cart"
    And Doy click en el boton "Proceed to checkout"
    And Doy click en el boton "Proceed to checkout"
    And Doy click en el boton "Proceed to checkout"
    And Doy click en el boton "Proceed to checkout"
    And Doy click en el boton "Pay by wire bank"
    And Doy click en el boton "I confirm my order"

  Scenario:
    Given Selecciono barra de busqueda
    When Escribo nombre del producto "dresses"
    And Valido que aparezca el nombre "dresses" en la pagina
    And Selecciono el primer articulo y doy click en el boton "Add to WishList"
    And Selecciono el segundo articulo y doy click en el boton "Add to WishList"
    And accedo a la pagina de comparacion y verifico que esten en los articulos

  Scenario:
    Given Selecciono barra de busqueda
    When Escribo nombre del producto "dresses"
    And Valido que aparezca el nombre "dresses" en la pagina
    And Selecciono el primer articulo y doy click en el boton "Add to compare"
    And Selecciono el segundo articulo y doy click en el boton "Add to compare"
    And Accedo a la pagina de comparacion y verifico que esten en los articulos

    Scenario:
      Given Accedo a la pagina "Contact us"
      And En el campo "Subject Heading" selecciono la opcion "Customer Service"
      And En el campo "Email address" escribo "probando.ando.csenamac@gmail.com"
      And En el campo "Message" escribo "Ando probando el sistema de mails"
      Then Presiono el boton "Send"
      And Verifico que el mensaje sea enviado