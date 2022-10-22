package page;

import control.Button;
import control.ControlSelenium;
import control.Label;
import org.openqa.selenium.By;

public class MainPage {
    public Button loginButton = new Button(By.partialLinkText("Iniciar sesi"),"[login] button in main page");

}
