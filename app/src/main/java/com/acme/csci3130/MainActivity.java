package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Displays text from EditText box in TextView box
    public void showText(View view) {
        TextView textDisplay = (TextView) findViewById(R.id.textDisplay);
        EditText textToShow = (EditText) findViewById(R.id.textToShow);
        textDisplay.setText(textToShow.getText());
    }
}
