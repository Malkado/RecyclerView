package br.com.recyclerview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.recyclerview.R;
import br.com.recyclerview.model.Users;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private  List<Users> ListaUsers ;
    public Adapter(List<Users> list) {
        this.ListaUsers=list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemLista= LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.adapter_lista,viewGroup,false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Users users =ListaUsers.get(i);
        myViewHolder.id.setText(users.getId());
        myViewHolder.nome.setText(users.getNome());
        myViewHolder.email.setText(users.getEmail());

    }

    @Override
    public int getItemCount() {
        return ListaUsers.size();
    }

    //nome,id,email,login
    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView nome;
        TextView id;
        TextView email;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.nome);
            id = itemView.findViewById(R.id.identificador);
            email = itemView.findViewById(R.id.email);
        }
    }
}
