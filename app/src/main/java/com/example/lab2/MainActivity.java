package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public  void goToActivity2(String s){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("Message", s);
        startActivity(intent);
    }
    public void clickFunction(View view){

        EditText mytextField = (EditText) findViewById(R.id.mytextField);
//        Toast.makeText(MainActivity.this, mytextField.getText().toString(), Toast.LENGTH_LONG).show();
        String str = mytextField.getText().toString();

        goToActivity2(str);
//        Log.i( "Info",  "BUtton Pressed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
