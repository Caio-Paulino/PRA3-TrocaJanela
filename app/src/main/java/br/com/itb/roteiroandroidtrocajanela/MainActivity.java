package br.com.itb.roteiroandroidtrocajanela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.botao1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Efetuar troca de janela
                Intent it = new Intent(MainActivity.this, Janela2Activity.class);
                // Acionar intent
                startActivity(it);
            }
        });
    }
}