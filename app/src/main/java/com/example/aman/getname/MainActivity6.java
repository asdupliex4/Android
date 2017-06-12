package com.example.aman.getname;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity6 extends AppCompatActivity {
    private EditText text;
    private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        text=(EditText)findViewById(R.id.e6);
        b1=(Button) findViewById(R.id.button6);

        b1.setOnClickListener(new View.OnClickListener(){
                                  @Override
                                  public void onClick(View v){
                                      String url7= text.getText().toString();
                                      Intent i=new Intent(MainActivity6.this,MainActivity2.class);
                                      i.putExtra("URL7",url7);
                                      startActivity(i);
                                  }
                              }


        );
    }
}
