package com.example.task_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView fullName;
    EditText myText,myText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myText = findViewById(R.id.fNameId);
        myText2 = findViewById(R.id.lNameId);
        fullName = findViewById(R.id.fullNameId);
    }
    public void toastFunction (View view){
        String name = myText.getText().toString();
        String name2 = myText2.getText().toString();
        fullName.setText(name+" "+name2);


    }
}