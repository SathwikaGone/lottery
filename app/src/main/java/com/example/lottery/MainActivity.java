package com.example.lottery;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Arrays;

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
        editText6.setBackgroundColor(Color.RED);
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
                int r1 = new Random().nextInt(69)+1;
                String s1=String.valueOf(r1);
                editText1.setText(s1);
                editText1.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.button4 :
                int r2 = new Random().nextInt(69)+1;
                String s2=String.valueOf(r2);
                editText2.setText(s2);
                editText2.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.button5 :
                int r3 = new Random().nextInt(69)+1;
                String s3=String.valueOf(r3);
                editText3.setText(s3);
                editText3.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.button9 :
                int r4 = new Random().nextInt(69)+1;
                String s4=String.valueOf(r4);
                editText4.setText(s4);
                editText4.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.button7 :
                int r5 = new Random().nextInt(69)+1;
                String s5=String.valueOf(r5);
                editText5.setText(s5);
                editText5.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.button8 :
                int r = new Random().nextInt(26)+1;
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
         int e1 =Integer.valueOf( editText1.getText().toString());
        int e2 = Integer.parseInt(editText2.getText().toString());
        int e3 = Integer.parseInt(editText3.getText().toString());
        int e4 = Integer.parseInt(editText4.getText().toString());
        int e5 = Integer.parseInt(editText5.getText().toString());
       int e6 = Integer.parseInt(editText6.getText().toString());
       int arr[] = {e1,e2,e3,e4,e5};
        //int[] a1 = new int[5];
        Arrays.sort(arr);
        if((e1<=0 || e1>69) || (e2<=0 || e2>69) || (e3<=0 || e3>69)|| (e4<=0 || e4>69) ||( e5<=0 || e5>69) || (e6<=0 || e6>26)){
            textView.setText("The selected Number is out of range \n 1) power button 1-26 \n 2) Other buttons 1-69");
  }
  else{
            textView.setText("Purchased: "+arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]+", Power:"+e6+".");
        }
    }
}
