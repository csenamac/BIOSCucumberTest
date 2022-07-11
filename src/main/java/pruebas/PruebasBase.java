package pruebas;

import org.openqa.selenium.WebDriver;
import pom.PaginaMyStoreInicio;

public class PruebasBase {
    protected WebDriver driver = Hooks.getDriver();
    protected PaginaMyStoreInicio paginaInicio = new PaginaMyStoreInicio();

}
