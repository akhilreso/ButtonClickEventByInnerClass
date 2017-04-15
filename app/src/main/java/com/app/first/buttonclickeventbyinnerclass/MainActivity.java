package com.app.first.buttonclickeventbyinnerclass;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.app.first.buttonclickeventbyinnerclass.R.*;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button2;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(layout.activity_main);

            button=(Button)findViewById(R.id.button1);

            button2=(Button)findViewById(R.id.button2);

            text=(TextView)findViewById(R.id.text1);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
                  public void onClick(View v) {

                text.setText("you clicked button1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("you clicked button 2");
            }
        });

    }


}
