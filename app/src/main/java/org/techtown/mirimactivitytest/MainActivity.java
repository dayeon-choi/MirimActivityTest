package org.techtown.mirimactivitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnNew=findViewById(R.id.btn_new_activity);
        rg=findViewById(R.id.radioGroup);
        btnNew.setOnClickListener(btnNewListener);
    }
    View.OnClickListener btnNewListener=new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent=null;
            switch (rg.getCheckedRadioButtonId()){
                case R.id.radio_second:
                    intent = new Intent(getApplicationContext(),SecondActivity.class);
                    break;
                case R.id.radio_third:
                    intent = new Intent(getApplicationContext(),ThirdActivity.class);
                    break;
            }
            startActivity(intent);
        }
    };

}