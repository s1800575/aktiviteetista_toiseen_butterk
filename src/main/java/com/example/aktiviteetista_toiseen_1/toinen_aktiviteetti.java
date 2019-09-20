package com.example.aktiviteetista_toiseen_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class toinen_aktiviteetti extends AppCompatActivity {

    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toinen_aktiviteetti);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aktiviteettiin1();
            }
        });

    }

        private void aktiviteettiin1(){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }




}
