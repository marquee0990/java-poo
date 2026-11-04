package com.example.bloco;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NotaAdapter extends RecyclerView.Adapter<NotaAdapter.NotaViewHolder>{
    public interface OnNotaClickListener{
        void onNotaClick(Nota nota);
    }
    public interface OnNotaLongClickListener{
        void onNotaLongClick(Nota nota);
    }

    private List<Nota> notas;
    private OnNotaClickListener listener;
    private OnNotaLongClickListener longListener;

    public NotaAdapter(List<Nota> notas, OnNotaClickListener listener, OnNotaLongClickListener longListener){
        this.notas = notas;
        this.listener = listener;
        this.longListener = longListener;
    }

    @NonNull
    @Override
    public NotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_nota, parent, false);
        return new NotaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotaViewHolder holder, int position){
        Nota nota = notas.get(position);
        holder.tvTitulo.setText(nota.getTitulo());
        holder.tvData.setText(nota.getData());
        holder.tvTrecho.setText(nota.getConteudo());
        holder.itemView.setOnClickListener(v -> listener.onNotaClick(nota));
        holder.itemView.setOnLongClickListener(v -> {
            longListener.onNotaLongClick(nota);
            return true;
        });
    }

    @Override
    public int getItemCount(){
        return notas.size();
    }

    public void atualizarLista(List<Nota> novasNotas){
        this.notas = novasNotas;
        notifyDataSetChanged();
    }

    static class NotaViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitulo, tvData, tvTrecho;

        NotaViewHolder(View itemView){
            super(itemView);
            tvTitulo = itemView.findViewById(R.id.tvTituloCard);
            tvData = itemView.findViewById(R.id.tvDataCard);
            tvTrecho = itemView.findViewById(R.id.tvTrechoCard);
        }
    }

}