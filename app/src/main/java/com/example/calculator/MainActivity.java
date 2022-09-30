package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button click_button1 = (Button) findViewById(R.id.button1);
        Button click_button2 = (Button) findViewById(R.id.button2);
        Button click_button3 = (Button) findViewById(R.id.button3);
        Button click_button4 = (Button) findViewById(R.id.button4);
        Button click_button5 = (Button) findViewById(R.id.button5);
        Button click_button6 = (Button) findViewById(R.id.button6);
        Button click_button7 = (Button) findViewById(R.id.button7);
        Button click_button8 = (Button) findViewById(R.id.button8);
        Button click_button9 = (Button) findViewById(R.id.button9);
        Button click_button10 = (Button) findViewById(R.id.button10);
        Button click_button11 = (Button) findViewById(R.id.button11);
        Button click_button12 = (Button) findViewById(R.id.button12);
        Button click_button13 = (Button) findViewById(R.id.button13);
        Button click_button14 = (Button) findViewById(R.id.button14);
        Button click_button15 = (Button) findViewById(R.id.button15);
        Button click_button16 = (Button) findViewById(R.id.button16);
        Button click_button17 = (Button) findViewById(R.id.button17);
        Button click_button18 = (Button) findViewById(R.id.button18);
        Button click_button19 = (Button) findViewById(R.id.button19);
        Button click_button20 = (Button) findViewById(R.id.button20);

        EditText edit_text = (EditText) findViewById(R.id.edit_text_number);
        click_button1.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            if (!TextUtils.isEmpty(retrieved_text)) {
                String changed_text = retrieved_text.substring(retrieved_text.length() - 1);
                edit_text.setText(changed_text);
            }
        });
        click_button2.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            if (!TextUtils.isEmpty(retrieved_text)) {
                String changed_text = "";
                edit_text.setText(changed_text);
            }
        });
        click_button3.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            if (!TextUtils.isEmpty(retrieved_text)) {
                String changed_text = retrieved_text.substring(retrieved_text.length() - 1);
                edit_text.setText(changed_text);
            }
        });
        click_button4.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            if (!TextUtils.isEmpty(retrieved_text)) {
                //placeholder
            }
        });
        click_button5.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            String changed_text = retrieved_text.concat("7");
            edit_text.setText(changed_text);
        });
        click_button6.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            String changed_text = retrieved_text.concat("8");
            edit_text.setText(changed_text);
        });
        click_button7.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            String changed_text = retrieved_text.concat("9");
            edit_text.setText(changed_text);
        });
        click_button8.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            if (!TextUtils.isEmpty(retrieved_text)) {
                String changed_text = retrieved_text.concat("/");
                edit_text.setText(changed_text);
            }
        });
        click_button9.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            if (!TextUtils.isEmpty(retrieved_text)) {
                String changed_text = retrieved_text.concat("*");
                edit_text.setText(changed_text);
            }
        });
        click_button10.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            if (!TextUtils.isEmpty(retrieved_text)) {
                String changed_text = retrieved_text.concat("4");
                edit_text.setText(changed_text);
            }
        });
        click_button11.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            String changed_text = retrieved_text.concat("5");
            edit_text.setText(changed_text);
        });
        click_button12.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            String changed_text = retrieved_text.concat("6");
            edit_text.setText(changed_text);
        });
        click_button13.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            if (!TextUtils.isEmpty(retrieved_text)) {
                String changed_text = retrieved_text.concat("-");
                edit_text.setText(changed_text);
            }
        });
        click_button14.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            if (!TextUtils.isEmpty(retrieved_text)) {
                String changed_text = retrieved_text.concat("+");
                edit_text.setText(changed_text);
            }
        });
        click_button15.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            String changed_text = retrieved_text.concat("1");
            edit_text.setText(changed_text);
        });
        click_button16.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            String changed_text = retrieved_text.concat("2");
            edit_text.setText(changed_text);
        });
        click_button17.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            String changed_text = retrieved_text.concat("3");
            edit_text.setText(changed_text);
        });
        click_button18.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            if (!TextUtils.isEmpty(retrieved_text)) {
                String changed_text = retrieved_text.concat(".");
                edit_text.setText(changed_text);
            }
        });
        click_button19.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            if (!TextUtils.isEmpty(retrieved_text)) {
                String changed_text = retrieved_text.concat("=");
                edit_text.setText(changed_text);
            }
        });
        click_button20.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            String changed_text = retrieved_text.concat("0");
            edit_text.setText(changed_text);
        });
    }
}