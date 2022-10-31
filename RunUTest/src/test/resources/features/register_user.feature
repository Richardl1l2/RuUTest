Feature: RunUTest
  Crear una Automatización que se encargue de ingresar a la página de Utest.com y proceder a dar clic en la opción de registro (JOIN TODAY) y realizar el diligenciamiento del formulario con la finalidad de crear un nuevo usuario.

  Scenario: Ingresar a la paigna Utest para iniciar el registro

    Given Se debe ingresar a la pagina Utest con el link https://utest.com/
    When Hace click sobre el boton Join Today
   And Diligenciar los campos First name:-Last name:-Email address:-Date of birth:-Languages)
   And Diligenciar los campos City:-Zip or Postal Code:-Country:
   And Diligenciar los campos Your Computer:-Version:-Language:
   And Diligenciar los campos Create your uTest password:-Confirm password: y marcar los cheklist
    Then Se debe completar el registro de forma correcta.