package com.example.luhan.cc1_noite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TesteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste);

        final EditText edtMsg = findViewById(R.id.edt_teste_nome);
        Button btnChange = findViewById(R.id.btn_exibir);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TesteActivity.this, edtMsg.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });

        Button btnSair = findViewById(R.id.btn_sair);
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
