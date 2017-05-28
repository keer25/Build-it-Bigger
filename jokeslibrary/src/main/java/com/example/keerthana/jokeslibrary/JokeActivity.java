package com.example.keerthana.jokeslibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class JokeActivity extends AppCompatActivity {

    public static String INTENT_EXTRA = "intent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        Intent intent = this.getIntent();
        String joke = intent.getStringExtra(INTENT_EXTRA);
        //Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();
        TextView tv = (TextView) findViewById(R.id.joke);
        tv.setText(joke);
    }
}
