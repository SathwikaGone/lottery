package com.example.lottery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
//        Button clear=findViewById(R.id.clear);
//      String name = editText1.getText().toString();
//        String name = editText1.getText().toString();
//        String name = editText1.getText().toString();
//        String name = editText1.getText().toString();
//        String name = editText1.getText().toString();
//        String name = editText1.getText().toString();
        editText1.setText("");
        editText2.setText("");
        editText3.setText("");
        editText4.setText("");
        editText5.setText("");
        editText6.setText("");
        textView.setText("");
    }
    public void Random(View v){
        EditText editText1 = findViewById(R.id.editText1);
        editText1.setText("");
    }
    public void Buy(){
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);
        EditText editText4 = findViewById(R.id.editText4);
        EditText editText5 = findViewById(R.id.editText5);
        EditText editText6 = findViewById(R.id.editText6);
        TextView textView =findViewById(R.id.textView);
        String e1 = editText1.getText().toString();
        String e2 = editText1.getText().toString();
        String e3 = editText1.getText().toString();
        String e4 = editText1.getText().toString();
        String e5 = editText1.getText().toString();
       String e6 = editText1.getText().toString();
        textView.setText(e1+","+e2+","+e3+","+e4+","+e5+", Power:"+e6+".");
    }
}
