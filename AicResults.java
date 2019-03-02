package com.example.InsuLINK;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AicResults extends AppCompatActivity {

    private EditText aicNum;
    private Button submitgn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aic_results);
    aicNum = findViewById(R.id.aicNum);
    submitgn2 = findViewById(R.id.submitgn2);
    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.submitgn2:
                    aicResult();
                    break;
            }
        }
    };

         submitgn2.setOnClickListener(clickListener);

}



    private void aicResult() {
        String an = aicNum.getText().toString();
        int aN = Integer.parseInt(an);
        if (aN < 5.7) {
            Toast normal = Toast.makeText(getApplicationContext(),
                    "Your A1C results are in the normal range. Keep up the good health!",
                    Toast.LENGTH_LONG);
            normal.show();
        } else if (aN >= 5.7 && aN <= 6.4) {
            Toast pred = Toast.makeText(getApplicationContext(),
                    "Your A1C results are in the prediabetes range range. Visit the Bea bit for advice on management",
                    Toast.LENGTH_LONG);
            pred.show();
        }  else {
            Toast high = Toast.makeText(getApplicationContext(),
                    "Your blood glucose levels are in the diabetes range, Ask the Bea bot for tips and advice on management.",
                    Toast.LENGTH_LONG);
            high.show();
        }
    }


};
