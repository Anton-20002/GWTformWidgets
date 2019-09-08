package logic.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;

public class HiddenExample implements EntryPoint {
  public void onModuleLoad() {
    //create textboxes
    final TextBox textBox = new TextBox();
    textBox.setWidth("275");
    Button button1 = new Button("Set Value of Hidden Input");
    Button button2 = new Button("Get Value of Hidden Input");
    final Hidden hidden = new Hidden();

    button1.addClickHandler(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        hidden.setValue(textBox.getValue());
        Window.alert("Value of Hidden Widget Updated!");
      }
    });

    button2.addClickHandler(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        Window.alert("Value of Hidden Widget: " + hidden.getValue());
      }
    });

    // Add widgets to the root panel.
    VerticalPanel panel = new VerticalPanel();
    panel.setSpacing(10);
    panel.add(textBox);
    panel.add(button1);
    panel.add(hidden);
    panel.add(button2);

    RootPanel.get("gwtContainer").add(panel);
  }
}
