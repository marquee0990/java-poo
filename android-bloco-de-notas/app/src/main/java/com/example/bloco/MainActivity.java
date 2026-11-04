package com.example.bloco;

import static android.view.View.GONE;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerNotas;
    private NotaAdapter adapter;
    private DataBase db;
    private TextView tvVazio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.toolbar), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerNotas = findViewById(R.id.recyclerNotas);
        tvVazio = findViewById(R.id.tvVazio);
        FloatingActionButton fabNova = findViewById(R.id.fabNova);

        db = new DataBase(this);

        recyclerNotas.setLayoutManager(new LinearLayoutManager(this));
        adapter = new NotaAdapter(db.buscarNotas(), nota -> {
            Intent intent = new Intent(this, NoteActivity.class);
            intent.putExtra("id", nota.getId());
            intent.putExtra("titulo", nota.getTitulo());
            intent.putExtra("conteudo", nota.getConteudo());
            intent.putExtra("data", nota.getData());
            startActivity(intent);
        },
                nota->{
                    new android.app.AlertDialog.Builder(this)
                            .setTitle("Apagar nota")
                            .setMessage("Deseja apagar \"" + nota.getTitulo() + "\"?")
                            .setPositiveButton("Apagar", (dialog,which) ->{
                                db.apagarNota(nota.getId());
                                List<Nota> notas = db.buscarNotas();
                                adapter.atualizarLista(notas);
                                tvVazio.setVisibility(notas.isEmpty() ? View.VISIBLE: View.GONE);
                                recyclerNotas.setVisibility(notas.isEmpty() ? View.GONE: View.VISIBLE);
                                Toast.makeText(this, "Nota apagada!", Toast.LENGTH_SHORT).show();
                            })
                            .setNegativeButton("Cancelar", null)
                            .show();
                });
        recyclerNotas.setAdapter(adapter);

        fabNova.setOnClickListener(v ->
                startActivity(new Intent(this, NoteActivity.class))
        );

    }
    @Override
    protected void onResume(){
        super.onResume();

        List<Nota> notas = db.buscarNotas();
        adapter.atualizarLista(notas);

        tvVazio.setVisibility(notas.isEmpty() ? View.VISIBLE : GONE);
        recyclerNotas.setVisibility(notas.isEmpty() ? GONE: View.VISIBLE);
    }
}