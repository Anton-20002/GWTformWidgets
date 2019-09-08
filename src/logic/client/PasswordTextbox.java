package logic.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;

public class PasswordTextbox implements EntryPoint {
  public void onModuleLoad() {

    //create password textboxes
    PasswordTextBox passwordTextBox1 = new PasswordTextBox();
    PasswordTextBox passwordTextBox2 = new PasswordTextBox();

    //add text to text box
    passwordTextBox2.setText("hell@W@rld");

    //set textbox as readonly
    passwordTextBox2.setReadOnly(true);

    // Add text boxes to the root panel.
    VerticalPanel panel = new VerticalPanel();
    panel.setSpacing(10);
    panel.add(passwordTextBox1);
    panel.add(passwordTextBox2);

    RootPanel.get("gwtContainer").add(panel);


  }
}
