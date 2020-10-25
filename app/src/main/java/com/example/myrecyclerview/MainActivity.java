package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Persona> personas;
    private RatingBar rating;

    private  void initializarDatos(){
        personas = new ArrayList<>();

        personas.add(new Persona("Picante a la Tacneña","Segundo","El Picante a la Tacneña es una especie de guiso que se originó en el siglo XX, época en la que Tacna formaba parte del territorio chileno y su pueblo estaba sufriendo problemas económicos.",R.drawable.plato1));
        personas.add(new Persona("Patasca  al tacneña","Segundo","Contundente sopa de carne de res, contiene trigo, mote, papa amarilla, y ajos. La máscara de la cabeza carne de res, cordero.",R.drawable.plato2));
        personas.add(new Persona("Pepian de conejo","Caldo","  Guiso de carne con una. Por lo general se utiliza carne de ave, aunque a veces se acompaña con carne de cerdo, res o conejo.",R.drawable.plato3));
        personas.add(new Persona("Patasca a la Tacneña","Caldo","Contundente sopa de carne de res, contiene trigo, mote, papa amarilla, y ajos. La máscara de la cabeza carne de res, cordero. ",R.drawable.plato4));
        personas.add(new Persona("Pastel de choclo ","Postre","Dulce o salado de maíz fresco y molido, contiene pasas, cocido en horno.",R.drawable.plato5));
        personas.add(new Persona("Humitas","Postre","Maíz tierno molido, dulces o saladas, horneadas en pancas de choclo.",R.drawable.plato6));
        personas.add(new Persona("Arroz con pato","Segundo","El Arroz con Pato se inspira de las paellas españolas ",R.drawable.plato7));

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



       RecyclerView recyclerView=(RecyclerView)findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(linearLayoutManager);

       /* rating =(RatingBar)findViewById(R.id.ratingBar3);
        rating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(MainActivity.this,"Usted Califico la pelicula con "+rating,Toast.LENGTH_LONG);
            }
        });*/


        initializarDatos();
        RVAdapter rvAdapter = new RVAdapter(personas,getApplicationContext());
        recyclerView.setAdapter(rvAdapter);

    }



}