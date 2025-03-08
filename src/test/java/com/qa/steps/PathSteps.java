package com.qa.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PathSteps {

    WebDriver driver = new ChromeDriver();

    @Given("Ingresar a mi sitio web")
    public void ingresarAmiSitioWeb() {
        driver.get("http://localhost:8088/");
    }

    @When("Dar clic en el boton Linkedin")
    public void darClicEnElBotonLinkedin() {
        WebElement buttonLinkedin = driver.findElement(By.id("button_linkedin"));
        buttonLinkedin.click();
    }


    @And("Dar clic en el boton Github")
    public void darClicEnLaPrimerPublicacion() {
        WebElement buttonGithub = driver.findElement(By.xpath("//*[@id=\"button_github\"]"));
        buttonGithub.click();
    }


}
