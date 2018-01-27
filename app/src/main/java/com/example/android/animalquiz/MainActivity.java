package com.example.android.animalquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkTotal(View view) {

        EditText nameField = (EditText) findViewById(R.id.name_view);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();

        RadioButton q1Right = findViewById(R.id.q1_right);

        if (q1Right.isChecked()) {
                points += 1;
        }

        CheckBox q2Right = findViewById(R.id.q2_right);

        if (q2Right.isChecked()) {
                points += 1;
        }

        CheckBox q3Right = findViewById(R.id.q3_right);

        if (q3Right.isChecked()) {
                points += 1;
        }

        CheckBox q4Right = findViewById(R.id.q4_right);

        if (q4Right.isChecked()) {
                points += 1;
        }

        CheckBox q5Right = findViewById(R.id.q5_right);

        if (q5Right.isChecked()) {
                points += 1;
        }

        Context context = getApplicationContext();
        CharSequence text = "Hey " + name + "! \nYou got " + points + " points";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
