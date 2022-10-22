package page;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LeftSection {

    public Button addNewProjectButton =new Button(By.cssSelector("button.a8af2163._98cd5c3f._45ffe137.ef4c88db.f9408a0e"),"[Add new project] Button in left Section");
    public TextBox nameProjectTextBox = new TextBox(By.id("edit_project_modal_field_name"),"[name project] TextBox in left Section");

    public Button addButton = new Button(By.cssSelector("button.ist_button.ist_button_red"),"[Add] Button in left Section");


}
