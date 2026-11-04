package com.example.bloco;

public class Nota{
    private int id;
    private String titulo;
    private String conteudo;
    private String data;

    public Nota(int id, String titulo, String conteudo, String data){
        this.id = id;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.data = data;
    }
    public int getId() {
        return id;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getConteudo(){
        return conteudo;
    }
    public String getData(){
        return data;
    }
}