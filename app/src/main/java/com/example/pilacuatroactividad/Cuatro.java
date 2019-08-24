package com.example.pilacuatroactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Cuatro extends AppCompatActivity {
    Button btn_ant4;
    EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuatro);
        btn_ant4=findViewById(R.id.btn_ant4);
        edittext=findViewById(R.id.editText);
        btn_ant4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent();
                intent2.putExtra("respuesta", edittext.getText().toString());
                setResult(RESULT_OK,intent2);
                finish();
            }
        });
    }
}
