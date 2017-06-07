package com.nivriti.registrationform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText password,email;
    Button submit;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        password=(EditText)findViewById(R.id.lpassword);
        email=(EditText)findViewById(R.id.lemail);
        submit=(Button)findViewById(R.id.lsubmit);
        text=(TextView)findViewById(R.id.textv) ;

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Login.this,"Login Successfully",Toast.LENGTH_LONG).show();

            }
        });
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Login.this,MainActivity.class);
                startActivity(i2);

            }
        });
    }
}

