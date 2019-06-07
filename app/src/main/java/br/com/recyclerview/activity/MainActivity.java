package br.com.recyclerview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import br.com.recyclerview.R;
import br.com.recyclerview.adapter.Adapter;
import br.com.recyclerview.model.Users;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private List<Users> ListaUsers = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.layout_lista);
        recyclerView=findViewById(R.id.lista_users);
        this.CriarUsers();

        //Configurando o Adapter
        Adapter adapter = new Adapter(ListaUsers);


        //Configurando um recyclerview
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);
    }
    public void CriarUsers(){
        Users users = new Users("email", "nome","1");
        this.ListaUsers.add(users);
        users = new Users("email2", "nome2", "2");
        this.ListaUsers.add(users);

    }
}
