package pruebas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.PaginaMyStoreInicio;

public class PruebasBase {
    protected WebDriver driver = new ChromeDriver();
    protected PaginaMyStoreInicio inicio = new PaginaMyStoreInicio();

    public PruebasBase() {
        System.getProperty("webdriver.chrome.driver", "C:\\GitHub\\BIOSCucumberTest");
    }
}
