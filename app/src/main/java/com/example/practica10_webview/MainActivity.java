package com.example.practica10_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_web);
    }

    //Metodo Boton IR
    public void Navegar(View view){
        Intent navegar = new Intent(this, SegundoActivity.class);
        navegar.putExtra("sitioWeb", et1.getText().toString());
        startActivity(navegar);
    }
}
