package logic.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;

public class ToggleButtonExample implements EntryPoint {
  public void onModuleLoad() {
    //create toggle buttons
    ToggleButton toggleButton = new ToggleButton("Click Me!");
    ToggleButton toggleButton1 = new ToggleButton("Click Me!");

    //disable a toggle button
    toggleButton1.setEnabled(false);

    //add a clickListener to the toggle button
    toggleButton.addClickHandler(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        Window.alert("Hello World!");
      }
    });

    // Add toggle button to the root panel.
    VerticalPanel panel = new VerticalPanel();
    panel.setSpacing(10);
    panel.add(toggleButton);
    panel.add(toggleButton1);

    RootPanel.get("gwtContainer").add(panel);


  }
}
