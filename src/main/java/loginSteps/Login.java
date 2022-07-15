package loginSteps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pruebas.Hooks;

public class Login {
    WebDriver driver = Hooks.getDriver();
    @Given("Me  logueo con usuario y pass")
    public void meLogueoConUsuarioYPass(UserDataTable userData) {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        driver.findElement(By.xpath("")).sendKeys(userData.getUser());
        driver.findElement(By.xpath("")).sendKeys(userData.getPass());
    }



//    @Given("Lleno formulario de registro de usuario")
//    public void llenoFormularioDeRegistroDeUsuario(UserDataTable userData) {
//        driver.findElement(By.xpath("")).click();
//        driver.findElement(By.xpath("")).sendKeys(userData.getNombre());
//        driver.findElement(By.xpath("")).sendKeys(userData.getApellido());
//        driver.findElement(By.xpath("")).sendKeys(userData.getCorreo());
//        driver.findElement(By.xpath("")).sendKeys(userData.getCiudad());
//        driver.findElement(By.xpath("")).sendKeys(userData.getPais());
//        driver.findElement(By.xpath("")).sendKeys(userData.getPass());
//        driver.findElement(By.xpath("")).sendKeys(userData.getTelefono().toString());
//        driver.findElement(By.xpath("")).sendKeys(userData.getCodigoPostal().toString());
//        driver.findElement(By.xpath("")).click();
//    }
}
