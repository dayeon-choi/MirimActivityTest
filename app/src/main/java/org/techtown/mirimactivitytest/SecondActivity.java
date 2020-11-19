package org.techtown.mirimactivitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button btnGoBack=findViewById(R.id.btn_goback);
        btnGoBack.setOnClickListener(btnGoBackListener);
    }
    View.OnClickListener btnGoBackListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    };
}