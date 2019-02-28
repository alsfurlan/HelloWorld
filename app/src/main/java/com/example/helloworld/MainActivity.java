package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button sayHelloButton;
    private TextView helloPhrase;
    private EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayHelloButton = findViewById(R.id.sayHelloButton);
        sayHelloButton.setOnClickListener(sayHello());

        helloPhrase = findViewById(R.id.helloPhrase);
        name = findViewById(R.id.name);
    }

    private View.OnClickListener sayHello() {
        return new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                helloPhrase.setText("Hello world, ".concat(name.getText().toString().concat("!")));
            }
        };
    }
}
