 package com.example.InsuLINK;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

     private EditText glucNum;
     private Button submitgn;



     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         glucNum = findViewById(R.id.aicNum);
         submitgn = findViewById(R.id.submitgn);
         View.OnClickListener clickListener = new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 switch (view.getId()) {
                     case R.id.submitgn:
                         glucResult();
                         break;
                 }
             }
         };

         submitgn.setOnClickListener(clickListener);

     }



         private void glucResult() {
             String gn = glucNum.getText().toString();
             int gN = Integer.parseInt(gn);
             if (gN < 70) {
                 Toast low = Toast.makeText(getApplicationContext(),
                         "Your blood glucose levels are lower than normal",
                         Toast.LENGTH_LONG);
                 low.show();
             } else if (gN >= 70 && gN <= 100) {
                 Toast normal = Toast.makeText(getApplicationContext(),
                         "Your blood glucose levels are in the normal range. Keep up the good health!",
                         Toast.LENGTH_LONG);
                 normal.show();
             } else if (gN > 100 && gN < 126) {
                 Toast smallhigh = Toast.makeText(getApplicationContext(),
                         "Your blood glucose levels are slighter higher than normal. Ask the Bea bot for tips and advice.",
                         Toast.LENGTH_LONG);
                 smallhigh.show();
             } else {
                 Toast high = Toast.makeText(getApplicationContext(),
                         "Your blood glucose levels are very high, Ask the Bea bot for tips and advice.",
                         Toast.LENGTH_LONG);
                 high.show();
             }
         }


     };

