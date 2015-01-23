package com.example.vukmir.myapptry_01;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    EditText sampletxt;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        sampletxt = (EditText) findViewById(R.id.txtSample);

        final Button biggerBtn = (Button) findViewById(R.id.btnBigger);
        biggerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                biggerText(sampletxt);
            }
        });



    }
//////////////****************************///////////////////////
    public void biggerText(EditText text){
        text.setTextSize(text.getTextSize() + 2);
    }






}


