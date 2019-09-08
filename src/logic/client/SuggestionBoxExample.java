package logic.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;

public class SuggestionBoxExample implements EntryPoint {
  public void onModuleLoad() {

    MultiWordSuggestOracle oracle = new MultiWordSuggestOracle();
    oracle.add("A");
    oracle.add("AB");
    oracle.add("ABC");
    oracle.add("ABCD");
    oracle.add("B");
    oracle.add("BC");
    oracle.add("BCD");
    oracle.add("BCDE");
    oracle.add("C");
    oracle.add("CD");
    oracle.add("CDE");
    oracle.add("CDEF");
    oracle.add("D");
    oracle.add("DE");
    oracle.add("DEF");
    oracle.add("DEFG");

    //create the suggestion box and pass it the data created above
    SuggestBox suggestionBox = new SuggestBox(oracle);

    //set width to 200px.
    suggestionBox.setWidth("200");

    // Add suggestionbox to the root panel.
    VerticalPanel panel = new VerticalPanel();
    panel.add(suggestionBox);

    RootPanel.get("gwtContainer").add(panel);
  }
}
