package com.example.InsuLINK;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class testsLog extends AppCompatActivity {

    private Button aic;
    private Button glooc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tests_log);
        aic = findViewById(R.id.aic);
        glooc = findViewById(R.id.glooc);
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.glooc:
                        goToGlooc();
                        break;
                    case R.id.aic :
                        goToAic();
                        break;

                }
            }
        };

        glooc.setOnClickListener(clickListener);
        aic.setOnClickListener(clickListener);
    }

    private void goToGlooc() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    private void goToAic() {

        Intent intent = new Intent(this, AicResults.class);
        startActivity(intent);

    }
    }
