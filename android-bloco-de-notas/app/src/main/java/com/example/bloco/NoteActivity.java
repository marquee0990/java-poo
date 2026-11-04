package com.example.bloco;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class NoteActivity extends AppCompatActivity {

    private EditText etTitulo, etConteudo;
    private TextView tvData;
    private DataBase db;

    private int notaId = -1;
    private String dataOriginal = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_note);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.appBar), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Toolbar toolbar = findViewById(R.id.toolbarNote);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(v -> finish());

        etTitulo = findViewById(R.id.etTitulo);
        etConteudo = findViewById(R.id.etConteudo);
        tvData = findViewById(R.id.tvData);
        Button btSalvar = findViewById(R.id.btSalvar);

        db = new DataBase(this);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            notaId = extras.getInt("id", -1);
            dataOriginal = extras.getString("data", "");
            etTitulo.setText(extras.getString("titulo", ""));
            etConteudo.setText(extras.getString("conteudo", ""));
            tvData.setText("Criada em: " + dataOriginal);
            if (getSupportActionBar() != null)
                getSupportActionBar().setTitle("Editar nota");
            }else{
                String dataHoje = new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault()).format(new Date());
                dataOriginal = dataHoje;
                tvData.setText("Criada em: " + dataHoje);
        }
        btSalvar.setOnClickListener(v -> salvarNota());
        toqueFora();
    }

    private void toqueFora() {
        findViewById(R.id.main).setOnClickListener(v ->{
            InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
            if(getCurrentFocus() != null){
                imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                getCurrentFocus().clearFocus();
            }
        });
    }

    private void salvarNota(){

        String titulo = etTitulo.getText().toString().trim();
        String conteudo = etConteudo.getText().toString().trim();

        if(titulo.isEmpty()){
            Toast.makeText(this, "Adicione um Título!", Toast.LENGTH_SHORT).show();
            return;
        }
        if(conteudo.isEmpty()){
            Toast.makeText(this, "Escreva algo na nota!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (notaId == -1){
            db.inserirNota(titulo, conteudo, dataOriginal);
            Toast.makeText(this, "Nota Salva!", Toast.LENGTH_SHORT).show();
        }else{
            db.atualizarNota(notaId, titulo, conteudo);
            Toast.makeText(this, "Nota atualizada!", Toast.LENGTH_SHORT).show();
        }
        finish();
    }
}