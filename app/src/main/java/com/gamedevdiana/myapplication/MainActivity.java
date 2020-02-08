package com.gamedevdiana.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mcolorInput;
    private TextView mColorOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mColorInput = findViewById(R.id.colorInput);
        myColorOutput = findViewById(R.id.colorOutput);
    }

    public void updateColorText(View view) {
        String color = mcolorInput.getText().toString().toLowerCase();
        //Add a message for the String
        String message = "";

        switch (color) {
            case blue:
            message = "You like BLUE";
            mColorOutput.setText(message);
            mColorOutput.setTextColor(Color.BLUE);
            break;
            case green:
                message = "You like GREEN";
                mColorOutput.setText(message);
                mColorOutput.setTextColor(Color.GREEN);
                break;
            case yellow:
                message = "You like YELLOW";
                mColorOutput.setText(message);
                mColorOutput.setTextColor(Color.YELLOW);
                break;
            case black:
                message = "You like BLACK";
                mColorOutput.setText(message);
                mColorOutput.setTextColor(Color.BLACK);
                break;
            default:
                message = " You like COLORS";
                mColorOutput.setText(message);
                mColorOutput.setTextColor(Color.rbg(200,105, 210));
                break;
        }
    }
}
