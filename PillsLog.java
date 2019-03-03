package com.example.InsuLINK;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PillsLog extends AppCompatActivity {

    private EditText pillName;
    private Button submitgn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pills_log);
        pillName = findViewById(R.id.pillName);
        submitgn3 = findViewById(R.id.submitgn3);
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.submitgn3:
                        String str = pillName.getText().toString();
                        break;
                }
            }
        };

        submitgn3.setOnClickListener(clickListener);
    }


};
