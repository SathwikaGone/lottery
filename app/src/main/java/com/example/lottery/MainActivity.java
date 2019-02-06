package com.example.lottery;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clear(View v){
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);
        EditText editText4 = findViewById(R.id.editText4);
        EditText editText5 = findViewById(R.id.editText5);
        EditText editText6 = findViewById(R.id.editText6);
        TextView textView =findViewById(R.id.textView);
        editText1.setBackgroundColor(Color.WHITE);
        editText2.setBackgroundColor(Color.WHITE);
        editText3.setBackgroundColor(Color.WHITE);
        editText4.setBackgroundColor(Color.WHITE);
        editText5.setBackgroundColor(Color.WHITE);
        editText6.setBackgroundColor(Color.WHITE);
        editText1.setText("");
        editText2.setText("");
        editText3.setText("");
        editText4.setText("");
        editText5.setText("");
        editText6.setText("");
        textView.setText("");
    }
    public void random(View v){
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);
        EditText editText4 = findViewById(R.id.editText4);
        EditText editText5 = findViewById(R.id.editText5);
        EditText editText6 = findViewById(R.id.editText6);

        switch(v.getId()){
            case R.id.button3 :
                int r1 = new Random().nextInt(69);
                String s1=String.valueOf(r1);
                editText1.setText(s1);
                editText1.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.button4 :
                int r2 = new Random().nextInt(69);
                String s2=String.valueOf(r2);
                editText2.setText(s2);
                editText2.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.button5 :
                int r3 = new Random().nextInt(69);
                String s3=String.valueOf(r3);
                editText3.setText(s3);
                editText3.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.button9 :
                int r4 = new Random().nextInt(69);
                String s4=String.valueOf(r4);
                editText4.setText(s4);
                editText4.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.button7 :
                int r5 = new Random().nextInt(69);
                String s5=String.valueOf(r5);
                editText5.setText(s5);
                editText5.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.button8 :
                int r = new Random().nextInt(26);
                String s=String.valueOf(r);
                editText6.setText(s);
                break;
        }
    }

    public void Buy(View v){
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);
        EditText editText4 = findViewById(R.id.editText4);
        EditText editText5 = findViewById(R.id.editText5);
        EditText editText6 = findViewById(R.id.editText6);
        TextView textView =findViewById(R.id.textView);
        String e1 = editText1.getText().toString();
        String e2 = editText2.getText().toString();
        String e3 = editText3.getText().toString();
        String e4 = editText4.getText().toString();
        String e5 = editText5.getText().toString();
       String e6 = editText6.getText().toString();
        textView.setText("Purchased: "+e1+","+e2+","+e3+","+e4+","+e5+", Power:"+e6+".");
    }
}
