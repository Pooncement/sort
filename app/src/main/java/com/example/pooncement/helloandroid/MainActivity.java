package com.example.pooncement.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    //step1 : Declaration
    Button mySquareRootButton, plusButton, minusButton;

    EditText inputBox1, inputBox2, inputBox3;
    TextView resultsView;
    int op1;
    int op2;
    double result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //step2 - hookup step
        plusButton = (Button) findViewById(R.id.button);
        minusButton = (Button) findViewById(R.id.button2);
        mySquareRootButton = (Button) findViewById(R.id.button3);

        inputBox1 = (EditText) findViewById(R.id.editText);
        inputBox2 = (EditText) findViewById(R.id.editText2);
        resultsView = (TextView) findViewById(R.id.textView);



        //step 3 : Do something
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1 =  Integer.parseInt(inputBox1.getText().toString());
                op2 =  Integer.parseInt(inputBox2.getText().toString());
                result = op1 + op2;
                resultsView.setText(String.valueOf(result));
            }
        });

        //step 3 : Do something
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1 =  Integer.parseInt(inputBox1.getText().toString());
                op2 =  Integer.parseInt(inputBox2.getText().toString());
                result = op1 - op2;
                resultsView.setText(String.valueOf(result));
            }
        });


        //step 3 : Do something
        mySquareRootButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1 =  Integer.parseInt(inputBox1.getText().toString());
                op2 =  Integer.parseInt(inputBox2.getText().toString());
                result =  Math.sqrt(op1);
                mySquareRootButton.setText("\u221A");
            }
        });

    }
}
