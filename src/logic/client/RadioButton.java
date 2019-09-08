package logic.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;

public class RadioButton implements EntryPoint {
  public void onModuleLoad() {
    // Create some radio buttons, all in one group 'radioGroup'.
    RadioButton radioButton1 = new RadioButton("radioGroup", "First");
    RadioButton radioButton2 = new RadioButton("radioGroup", "Second");
    RadioButton radioButton3 = new RadioButton("radioGroup", "Third");

    // Check 'First' by default.
    radioButton1.setValue(true);

    //disable 'Second' radio button
    radioButton2.setEnabled(false);

    // Add toggle button to the root panel.
    VerticalPanel panel = new VerticalPanel();
    panel.setSpacing(10);
    panel.add(radioButton1);
    panel.add(radioButton2);
    panel.add(radioButton3);

    RootPanel.get("gwtContainer").add(panel);


  }
}
