package com.example.aman.getname;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    TextView text3;
    TextView t4;
    TextView t5;
    TextView t6;
    TextView t7;

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text3=(TextView)findViewById(R.id.textView);
        t4=(TextView)findViewById(R.id.textView6);
        t5=(TextView)findViewById(R.id.textView9);
        t6=(TextView)findViewById(R.id.textView15);
        t7=(TextView)findViewById(R.id.textView20);
        button1=(Button)findViewById(R.id.b2);

        Intent i=getIntent();
        String first= i.getStringExtra("URL2");
        String second= i.getStringExtra("URL3");
        text3.setText(first + "" + second);

        Intent a=getIntent();
        String third= a.getStringExtra("URL4");
        t4.setText(third);

        Intent b=getIntent();
        String fourth= b.getStringExtra("URL51");
        t5.setText(fourth);

        Intent c=getIntent();
        String fifth= c.getStringExtra("URL6");
        t6.setText(fifth);

        Intent d=getIntent();
        String sixth= d.getStringExtra("URL7");
        t7.setText(sixth);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity2.this,MainActivity1.class);
                startActivity(i);
            }
        }
        ); /*:????*/

    }
}


