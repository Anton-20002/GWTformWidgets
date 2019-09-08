package logic.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;

public class PushbuttonExample implements EntryPoint {
  public void onModuleLoad() {
    //create a push button
    PushButton pushButton = new PushButton("Click Me!");

    //create a push button
    PushButton pushButton1 = new PushButton("Click Me!");

    //disable a push button
    pushButton1.setEnabled(false);

    //add a clickListener to the push button
    pushButton.addClickHandler(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        Window.alert("Hello World!");
      }
    });

    // Add push buttons to the root panel.
    VerticalPanel panel = new VerticalPanel();
    panel.setSpacing(10);
    panel.add(pushButton);
    panel.add(pushButton1);
    RootPanel.get("gwtContainer").add(panel);
  }
}
