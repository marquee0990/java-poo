package com.example.bloco;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DataBase extends SQLiteOpenHelper {
    private static final String NOME_DB = "notas.db";
    private static final int VERSAO_DB = 1;
    private static final String TABELA = "notas";
    private static final String COL_ID = "id";
    private static final String COL_TITULO = "titulo";
    private static final String COL_CONTEUDO = "conteudo";
    private static final String COL_DATA = "data";

    public DataBase(Context context){
        super(context, NOME_DB, null, VERSAO_DB);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        String criaTabela = "CREATE TABLE " + TABELA + " (" +
                COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_TITULO + " TEXT, " +
                COL_CONTEUDO + " TEXT, " +
                COL_DATA + " TEXT)";
        db.execSQL(criaTabela);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TABELA);
        onCreate(db);
    }

    public void inserirNota(String titulo, String conteudo, String data){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put(COL_TITULO, titulo);
        valores.put(COL_CONTEUDO, conteudo);
        valores.put(COL_DATA, data);
        db.insert(TABELA, null, valores);
        db.close();
    }

    public void atualizarNota(int id, String titulo, String conteudo){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put(COL_TITULO, titulo);
        valores.put(COL_CONTEUDO, conteudo);
        db.update(TABELA, valores, COL_ID + "=?", new String[]{
                String.valueOf(id)
        });
        db.close();
    }

    public void apagarNota(int id){
        SQLiteDatabase db = getWritableDatabase();
        db.delete(TABELA, COL_ID + "=?", new String[]{
                String.valueOf(id)
        });
        db.close();
    }

    public List<Nota> buscarNotas(){
        List<Nota> lista = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABELA + " ORDER BY " + COL_ID + " DESC", null);

        if(cursor.moveToFirst()){
            do{
                lista.add(new Nota(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3)
                ));
            } while(cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return lista;
    }

}