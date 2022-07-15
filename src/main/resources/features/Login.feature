Feature: Login en el sistema

  Background:
    Given Accedo a la pagina "http://automationpractice.com/index.php"

  Scenario: Login usuario
    Given Me  logueo con usuario y pass
      | user | pass |
      | probando.ando.csenamac@gmail.com  | probandoando2022  |
    When Doy click en el boton acceder
    Then Valido que el mensaje contenga
      | message              |
      | El usuario no existe |

