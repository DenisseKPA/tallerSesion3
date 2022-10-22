package page;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginModal {
    public TextBox emailTxtBox = new TextBox(By.id("element-0"),"[email] textbox in login modal");
    public TextBox passwordTxtBox = new TextBox(By.id("element-3"),"[password] textbox in login modal");
    public Button loginButton = new Button(By.cssSelector("button.nFxHGeI.S7Jh9YX.a8af2163._3d1243b2._3991076f.f9408a0e._8c75067a"),"[login] button in login modal");

}
