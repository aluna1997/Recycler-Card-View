package com.example.android.kawaiicards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.kawaiicards.Adapters.AnimeAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Declaramos instancias globales
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager LManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializar Animes
        List items = new ArrayList();
        items.add(new Anime(R.drawable.spider, "Spider-Man", 230));
        items.add(new Anime(R.drawable.pool, "Dead Pool", 456));
        items.add(new Anime(R.drawable.hulk, "Hulk", 342));
        items.add(new Anime(R.drawable.ant, "Ant-Man", 645));

        // Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

// Usar un administrador para LinearLayout
        LManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(LManager);

// Crear un nuevo adaptador
        adapter = new AnimeAdapter(items);
        recycler.setAdapter(adapter);
    }
}
