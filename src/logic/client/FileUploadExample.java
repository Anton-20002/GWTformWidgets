package logic.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;

public class FileUploadExample implements EntryPoint {
  public void onModuleLoad() {
    VerticalPanel panel = new VerticalPanel();
    //create a FormPanel
    final FormPanel form = new FormPanel();
    //create a file upload widget
    final FileUpload fileUpload = new FileUpload();
    //create labels
    Label selectLabel = new Label("Select a file:");
    //create upload button
    Button uploadButton = new Button("Upload File");
    //pass action to the form to point to service handling file
    //receiving operation.
    form.setAction("http://www.tutorialspoint.com/gwt/myFormHandler");
    // set form to use the POST method, and multipart MIME encoding.
    form.setEncoding(FormPanel.ENCODING_MULTIPART);
    form.setMethod(FormPanel.METHOD_POST);

    //add a label
    panel.add(selectLabel);
    //add fileUpload widget
    panel.add(fileUpload);
    //add a button to upload the file
    panel.add(uploadButton);
    uploadButton.addClickHandler(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        //get the filename to be uploaded
        String filename = fileUpload.getFilename();
        if (filename.length() == 0) {
          Window.alert("No File Specified!");
        } else {
          //submit the form
          form.submit();
        }
      }
    });

    form.addSubmitCompleteHandler(new FormPanel.SubmitCompleteHandler() {
      @Override
      public void onSubmitComplete(FormPanel.SubmitCompleteEvent event) {
        // When the form submission is successfully completed, this
        //event is fired. Assuming the service returned a response
        //of type text/html, we can get the result text here
        Window.alert(event.getResults());
      }
    });
    panel.setSpacing(10);

    // Add form to the root panel.
    form.add(panel);

    RootPanel.get("gwtContainer").add(form);
  }
}
