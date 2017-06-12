package com.example.aman.getname;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {
    private EditText text;
    private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        text=(EditText)findViewById(R.id.e2);
        b1=(Button) findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener(){
                                  @Override
                                  public void onClick(View v){
                                      String url5= text.getText().toString();
                                      Intent i=new Intent(MainActivity4.this,MainActivity6.class);
                                      i.putExtra("URL51",url5);
                                      startActivity(i);
                                  }
                              }
        );
    }
}
