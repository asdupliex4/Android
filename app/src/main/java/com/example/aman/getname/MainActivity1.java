package com.example.aman.getname;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {

    private EditText text;
    private EditText text1;
    private Button button;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        text=(EditText)findViewById(R.id.et1);
        text1=(EditText)findViewById(R.id.et2);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= text.getText().toString();
                String url1= text1.getText().toString();
                Intent i= new Intent(MainActivity1.this,MainActivity3.class);
                i.putExtra("URL2",url);
                i.putExtra("URL3",url1);
                startActivity(i);
            }
        }
        );

    }
}
