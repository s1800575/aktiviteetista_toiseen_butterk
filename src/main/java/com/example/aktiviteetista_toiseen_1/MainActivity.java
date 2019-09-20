package com.example.aktiviteetista_toiseen_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.button1)
    Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


    //  Ylhäällä tehty @BindView.... korvaa tämän:
    //  textView = (TextView) findViewById(R.id.textView);
    //  button1 = (Button) findViewById(R.id.button1);



        button1.setOnClickListener(new View.OnClickListener() {
            @OnClick
            public void onClick(View view) {
                aktiviteettiin2();
            }
        });
    }
    private void aktiviteettiin2(){
        Intent intent = new Intent(this, toinen_aktiviteetti.class);
        startActivity(intent);

    }
}
