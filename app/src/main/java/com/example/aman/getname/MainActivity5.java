package com.example.aman.getname;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity5 extends AppCompatActivity {
    private EditText text;
    private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=(EditText)findViewById(R.id.e4);
        b1=(Button) findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener(){
                                  @Override
                                  public void onClick(View v){
                                      String url6= text.getText().toString();
                                      Intent i=new Intent(MainActivity5.this,MainActivity6.class);
                                      i.putExtra("URL6",url6);
                                      startActivity(i);
                                  }
                              }


        );
    }
}
