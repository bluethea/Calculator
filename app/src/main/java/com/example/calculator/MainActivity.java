package com.example.calculator;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button click_back_btn = findViewById(R.id.back_btn);
        Button click_clear_btn = findViewById(R.id.clear_btn);
        Button click_plus_minus_btn = findViewById(R.id.plus_minus_btn);
        Button click_sq_root_btn = findViewById(R.id.sq_root_btn);
        Button click_seven_btn = findViewById(R.id.seven_btn);
        Button click_eight_btn = findViewById(R.id.eight_btn);
        Button click_nine_btn = findViewById(R.id.nine_btn);
        Button click_divide_btn = findViewById(R.id.divide_btn);
        Button click_multiply_btn = findViewById(R.id.multiply_btn);
        Button click_four_btn = findViewById(R.id.four_btn);
        Button click_five_btn = findViewById(R.id.five_btn);
        Button click_six_btn = findViewById(R.id.six_btn);
        Button click_minus_btn = findViewById(R.id.minus_btn);
        Button click_plus_btn = findViewById(R.id.plus_btn);
        Button click_one_btn = findViewById(R.id.one_btn);
        Button click_two_btn = findViewById(R.id.two_btn);
        Button click_three_btn = findViewById(R.id.three_btn);
        Button click_point_btn = findViewById(R.id.point_btn);
        Button click_equal_btn = findViewById(R.id.equal_btn);
        Button click_zero_btn = findViewById(R.id.zero_btn);

        EditText edit_text = findViewById(R.id.edit_text_number);
        click_back_btn.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            if (!TextUtils.isEmpty(retrieved_text)) {
                String changed_text = retrieved_text.substring(0, retrieved_text.length() - 1);
                edit_text.setText(changed_text);
            }
        });
        click_clear_btn.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            if (!TextUtils.isEmpty(retrieved_text)) {
                String changed_text = "";
                edit_text.setText(changed_text);
            }
        });
        click_plus_minus_btn.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            if (!TextUtils.isEmpty(retrieved_text)) {
                String temporary_text = retrieved_text.replaceAll("[0-9]+$","");
                String changed_text;
                if (temporary_text.endsWith("-")) {
                    changed_text = temporary_text.substring(0, retrieved_text.length() - 1).concat("+").concat(retrieved_text.substring(retrieved_text.replaceAll("[0-9]+$","").length()));
                }
                else {
                    changed_text = temporary_text.substring(0, retrieved_text.length() - 1).concat("-").concat(retrieved_text.substring(retrieved_text.replaceAll("[0-9]+$","").length()));
                }
                edit_text.setText(changed_text);
            }
        });
        click_sq_root_btn.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            if (!TextUtils.isEmpty(retrieved_text)) {
                String changed_text = retrieved_text.concat("√");
                edit_text.setText(changed_text);
            }
        });
        click_seven_btn.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            String changed_text = retrieved_text.concat("7");
            edit_text.setText(changed_text);
        });
        click_eight_btn.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            String changed_text = retrieved_text.concat("8");
            edit_text.setText(changed_text);
        });
        click_nine_btn.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            String changed_text = retrieved_text.concat("9");
            edit_text.setText(changed_text);
        });
        click_divide_btn.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            if (!TextUtils.isEmpty(retrieved_text) && !retrieved_text.endsWith("/")) {
                String changed_text;
                if (retrieved_text.endsWith("*") || retrieved_text.endsWith("-") || retrieved_text.endsWith("+")) {
                    changed_text = retrieved_text.substring(0, retrieved_text.length() - 1).concat("/");
                }
                else {
                    changed_text = retrieved_text.concat("/");
                }
                edit_text.setText(changed_text);
            }
        });
        click_multiply_btn.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            if (!TextUtils.isEmpty(retrieved_text) && !retrieved_text.endsWith("*")) {
                String changed_text;
                if (retrieved_text.endsWith("/") || retrieved_text.endsWith("-") || retrieved_text.endsWith("+")) {
                    changed_text = retrieved_text.substring(0, retrieved_text.length() - 1).concat("*");
                } else {
                    changed_text = retrieved_text.concat("*");
                }
                edit_text.setText(changed_text);
                }
            });
        click_four_btn.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            if (!TextUtils.isEmpty(retrieved_text)) {
                String changed_text = retrieved_text.concat("4");
                edit_text.setText(changed_text);
            }
        });
        click_five_btn.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            String changed_text = retrieved_text.concat("5");
            edit_text.setText(changed_text);
        });
        click_six_btn.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            String changed_text = retrieved_text.concat("6");
            edit_text.setText(changed_text);
        });
        click_minus_btn.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            if (!TextUtils.isEmpty(retrieved_text) && !retrieved_text.endsWith("-")) {
                String changed_text;
                if (retrieved_text.endsWith("/") || retrieved_text.endsWith("*") || retrieved_text.endsWith("+")) {
                    changed_text = retrieved_text.substring(0, retrieved_text.length() - 1).concat("-");
                } else {
                    changed_text = retrieved_text.concat("-");
                }
                edit_text.setText(changed_text);
            }
        });
        click_plus_btn.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            if (!TextUtils.isEmpty(retrieved_text) && !retrieved_text.endsWith("+")) {
                String changed_text;
                if (retrieved_text.endsWith("/") || retrieved_text.endsWith("-") || retrieved_text.endsWith("*")) {
                    changed_text = retrieved_text.substring(0, retrieved_text.length() - 1).concat("+");
                } else {
                    changed_text = retrieved_text.concat("+");
                }
                edit_text.setText(changed_text);
            }
        });
        click_one_btn.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            String changed_text = retrieved_text.concat("1");
            edit_text.setText(changed_text);
        });
        click_two_btn.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            String changed_text = retrieved_text.concat("2");
            edit_text.setText(changed_text);
        });
        click_three_btn.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            String changed_text = retrieved_text.concat("3");
            edit_text.setText(changed_text);
        });
        click_point_btn.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            if (!TextUtils.isEmpty(retrieved_text)) {
                String changed_text = retrieved_text.concat(".");
                edit_text.setText(changed_text);
            }
        });
        click_equal_btn.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            Expression exp = new Expression(retrieved_text);
            String changed_text = String.valueOf(exp.calculate());
            edit_text.setText(changed_text);
        });
        click_zero_btn.setOnClickListener(v -> {
            String retrieved_text = edit_text.getText().toString();
            String changed_text = retrieved_text.concat("0");
            edit_text.setText(changed_text);
        });
    }
}