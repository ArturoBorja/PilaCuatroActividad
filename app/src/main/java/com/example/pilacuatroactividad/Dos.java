package com.example.pilacuatroactividad;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dos extends AppCompatActivity {
    Button btn_sig2;
    Button btn_ant2;
    TextView txt_pag2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);
        btn_sig2=findViewById(R.id.btn_sig2);
        btn_ant2=findViewById(R.id.btn_ant2);
        txt_pag2=findViewById(R.id.txt_pag2);
        btn_sig2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent (Dos.this,Tres.class);
                startActivityForResult(intent,2);
            }
        });
        btn_ant2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent();
                intent2.putExtra("respuesta", txt_pag2.getText().toString());
                setResult(RESULT_OK,intent2);
                finish();
            }
        });
    }
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==2){
            if(resultCode==RESULT_OK){
                txt_pag2.setText(data.getStringExtra("respuesta"));
            }
        }
    }
}
