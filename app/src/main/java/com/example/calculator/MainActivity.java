package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button click_button1 = (Button) findViewById(R.id.button1);
        EditText edit_text = (EditText) findViewById(R.id.edit_text_number);
        click_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String retrieved_text = edit_text.getText().toString();
                if (!TextUtils.isEmpty(retrieved_text)) {
                    //placeholder
                }
            }
        });
    }
}