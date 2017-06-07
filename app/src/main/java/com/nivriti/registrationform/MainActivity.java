package com.nivriti.registrationform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,password,email;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.name);
        password=(EditText)findViewById(R.id.password);
        email=(EditText)findViewById(R.id.email);
        submit=(Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(MainActivity.this,Login.class);
                Toast.makeText(MainActivity.this,"Registration Successfully",Toast.LENGTH_LONG).show();
                startActivity(i2);

            }
        });
    }
}
