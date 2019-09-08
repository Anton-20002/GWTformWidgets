package logic.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;

public class BasicWidgets implements EntryPoint {
  public void onModuleLoad() {
    // create two Labels
    Label label1 = new Label("This is first GWT Label");
    Label label2 = new Label("This is second GWT Label");

    // use UIObject methods to set label properties.
    label1.setTitle("Title for first Lable");
    label1.addStyleName("gwt-Green-Border");
    label2.setTitle("Title for second Lable");
    label2.addStyleName("gwt-Blue-Border");

    // add labels to the root panel.
    VerticalPanel panel = new VerticalPanel();
    panel.add(label1);
    panel.add(label2);

    // create two HTML widgets
    HTML html1 =
        new HTML("This is first GWT HTML widget using <b> tag of html.");
    HTML html2 =
        new HTML("This is second GWT HTML widget using <i> tag of html.");

    // use UIObject methods to set HTML widget properties.
    html1.addStyleName("gwt-Green-Border");
    html2.addStyleName("gwt-Blue-Border");

    // add widgets to the root panel.
    VerticalPanel panel1 = new VerticalPanel();
    panel1.setSpacing(10);
    panel1.add(html1);
    panel1.add(html2);

// Create a Image widget
    Image image = new Image();

    //set image source
    image.setUrl("http://www.tutorialspoint.com/images/gwt-mini.png");

    // Add image to the root panel.
    VerticalPanel panel2 = new VerticalPanel();
    panel2.add(image);

    // Create a Anchor widget,
    // pass text as TutorialsPoint
    // set asHtml as false,
    // href as www.tutorialspoint.com,
    // target as _blank
    Anchor anchor = new Anchor("TutorialsPoint",
        false,
        "http://www.tutorialspoint.com",
        "_blank");
    // Add anchor to the root panel.
    VerticalPanel panel3 = new VerticalPanel();
    panel3.add(anchor);


    RootPanel.get("gwtContainer").add(panel);
  }
}
