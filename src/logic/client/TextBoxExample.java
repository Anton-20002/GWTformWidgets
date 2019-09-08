package logic.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.StyleInjector;
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.datepicker.client.DateBox;

import java.util.Date;

public class TextBoxExample implements EntryPoint {
  public void onModuleLoad() {
    TextBox textBox1 = new TextBox();
    TextBox textBox2 = new TextBox();
    TextBox textBox3 = new TextBox();

    textBox1.addBlurHandler(new BlurHandler() {
      @Override
      public void onBlur(BlurEvent event) {
        String text = textBox1.getText();
        if (text.startsWith(",") || text.startsWith(".")){
          textBox1.setText("0"+text);
        }
      }
    });

    //add text to text box
    textBox2.setText("Hello World!");

    //set textbox as readonly
    textBox2.setReadOnly(true);

    DateBox dateBox = new DateBox();
    dateBox.setValue(new Date());
    String format = DateTimeFormat.getFormat("dd.MM.yyyy").format(dateBox.getValue());
    textBox3.setText(format);


    // Add text boxes to the root panel.
    VerticalPanel panel = new VerticalPanel();
    panel.setSpacing(10);
    panel.setBorderWidth(1);
    StyleInjector.inject(".statusPanelStyle { " + "background: #E0ECF8;" + "border-style: double" + "border-radius: 0.5px;" + "opacity: 0.8}");
    panel.setStyleName("statusPanelStyle");

    panel.add(textBox1);
    panel.add(textBox2);
    panel.add(textBox3);

    RootPanel.get("gwtContainer").add(panel);
    RootPanel.get().add(dateBox);
  }



  }
