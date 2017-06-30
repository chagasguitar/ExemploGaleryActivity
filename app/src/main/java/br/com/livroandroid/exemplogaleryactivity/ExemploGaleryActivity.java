package br.com.livroandroid.exemplogaleryactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Gallery;

public class ExemploGaleryActivity extends AppCompatActivity{

    private int[] planetas = {R.drawable.planeta_01_mercurio,R.drawable.planeta_02_venus,R.drawable.planeta_03_terra,
            R.drawable.planeta_04_marte,R.drawable.planeta_05_jupiter,R.drawable.planeta_06_saturno
    ,R.drawable.planeta_07_urano,R.drawable.planeta_08_neptuno,R.drawable.planeta_09_plutao};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery_exemplo);
        Gallery g = (Gallery) findViewById(R.id.galery);
        g.setAdapter(new PlanetaAdapter(this,planetas));

    }
}
