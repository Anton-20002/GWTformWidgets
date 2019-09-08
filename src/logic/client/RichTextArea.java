package logic.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;

public class RichTextArea implements EntryPoint {
  public void onModuleLoad() {
    //create RichTextArea elements
    RichTextArea richTextArea = new RichTextArea();

    richTextArea.setHeight("200");
    richTextArea.setWidth("200");

    //add text to text area
    richTextArea.setHTML("<b>Hello World!</b> <br/> <br/>" +
        "<i>Be Happy!</i> </br> <br/> <u>Stay Cool!</u>");

    // Add text boxes to the root panel.
    VerticalPanel panel = new VerticalPanel();
    panel.add(richTextArea);

    RootPanel.get("gwtContainer").add(panel);
  }
}
