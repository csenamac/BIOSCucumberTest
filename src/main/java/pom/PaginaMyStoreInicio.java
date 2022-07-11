package pom;

import org.openqa.selenium.By;

public class PaginaMyStoreInicio {
    private String tituloPagina = "My store";
    private By localizadorTituloPagina = By.id("/html/body/div/div[1]/header/div[3]/div/div/div[1]");

    public String getTituloPagina() {
        return this.tituloPagina;
    }
    public void setTituloPagina(String tituloPagina) {
        this.tituloPagina = tituloPagina;
    }
    public By getLocalizadorTituloPagina() {
        return this.localizadorTituloPagina;
    }
    public void setLocalizadorTituloPagina(By localizadorTituloPagina) {
        this.localizadorTituloPagina = localizadorTituloPagina;
    }
}
