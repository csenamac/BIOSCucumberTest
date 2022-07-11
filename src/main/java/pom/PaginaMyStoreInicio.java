package pom;

import org.openqa.selenium.By;

public class PaginaMyStoreInicio {
    private String tituloPagina = "My Store";
    private By localizadorTituloPagina = By.tagName("<title>");

    public String getTituloPagina() {
        return this.tituloPagina;
    }
    public By getLocalizadorTituloPagina() {
        return this.localizadorTituloPagina;
    }
}
