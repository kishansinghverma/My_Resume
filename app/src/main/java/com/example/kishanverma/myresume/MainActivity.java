package com.example.kishanverma.myresume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        Toast.makeText(this, "OnCreate Triggered...", Toast.LENGTH_LONG).show();

        Button btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),((EditText)findViewById(R.id.editText)).getText().toString(), Toast.LENGTH_LONG).show();
            }
        });*/
    }
}
