package logic.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;

public class Textarea implements EntryPoint {
  public void onModuleLoad() {

    //create textarea elements
    TextArea textArea1 = new TextArea();
    TextArea textArea2 = new TextArea();

    //set width as 10 characters
    textArea1.setCharacterWidth(20);
    textArea2.setCharacterWidth(20);

    //set height as 5 lines
    textArea1.setVisibleLines(5);
    textArea2.setVisibleLines(5);

    //add text to text area
    textArea2.setText(" Hello World! \n Be Happy! \n Stay Cool!");

    //set textbox as readonly
    textArea2.setReadOnly(true);

    // Add text boxes to the root panel.
    VerticalPanel panel = new VerticalPanel();
    panel.setSpacing(10);
    panel.add(textArea1);
    panel.add(textArea2);

    RootPanel.get("gwtContainer").add(panel);
  }
}
