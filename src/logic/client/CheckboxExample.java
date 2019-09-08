package logic.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;

public class CheckboxExample implements EntryPoint {
  public void onModuleLoad() {
    // Make a new check box, and select it by default.
    CheckBox checkBox1 = new CheckBox("Check Me!");
    CheckBox checkBox2 = new CheckBox("Check Me!");

    // set check box as selected
    checkBox1.setValue(true);

    //disable a checkbox
    checkBox2.setEnabled(false);

    checkBox1.addClickHandler(new ClickHandler() {

      @Override
      public void onClick(ClickEvent event) {
        CheckBox checkBox = (CheckBox)event.getSource();
        Window.alert("CheckBox is " +
            (checkBox.getValue() ? "" : "not") + " checked");
      }
    });


    // Add checkboxes to the root panel.
    VerticalPanel panel = new VerticalPanel();
    panel.setSpacing(10);
    panel.add(checkBox1);
    panel.add(checkBox2);

    RootPanel.get("gwtContainer").add(panel);
  }
}
