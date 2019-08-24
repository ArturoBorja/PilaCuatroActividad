package com.example.pilacuatroactividad;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tres extends AppCompatActivity {
    Button btn_sig3;
    Button btn_ant3;
    TextView txt_pag3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres);
        btn_sig3=findViewById(R.id.btn_sig3);
        btn_ant3=findViewById(R.id.btn_ant3);
        txt_pag3=findViewById(R.id.txt_pag3);
        btn_sig3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tres.this,Cuatro.class);
                startActivityForResult(intent,3);
            }
        });
        btn_ant3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent();
                intent2.putExtra("respuesta", txt_pag3.getText().toString());
                setResult(RESULT_OK,intent2);
                finish();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==3){
            if(resultCode==RESULT_OK){
                txt_pag3.setText(data.getStringExtra("respuesta"));
            }
        }
    }
}
