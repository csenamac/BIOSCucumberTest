Feature: Login en el sistema

  Background:
    Given Accedo a la pagina "http://automationpractice.com/index.php"

  Scenario: Login usuario
    Given Me  logueo con usuario y pass
      | user | pass |
      | abc  | 123  |
    When Doy click en el boton acceder
    Then Valido que el mensaje contenga
      | message              |
      | El usuario no existe |

  Scenario: Registro usuario en la pagina
    Given Lleno formulario de registro de usuario
      | nombre | apellido | correo           | telefono       | password  | ciudad     | direccion | pais  | codigoPostal |
      | abc    | 123      | pepito@gmail.com | 1111222333 | La Paloma | Keneddy SN | Uruguay   | 27001 | 27000        |
    When Doy click en el boton acceder
    Then Valido que el mensaje contenga
      | message              |
      | El usuario no existe |

    Scenario: Seleccionar lista de productos
      Given Selecciono la barra de busqueda
      When Escribo nombre del producto "dresses"
      And Selecciono todos los productos con Nombre "dresses"
      |dress 1|
      |dress 2|
      |dress 3|
      |dress 4|