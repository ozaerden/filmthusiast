package com.example.filmonerisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Category action;
    private Category scifi;
    private Category fantastic;
    private Category romantic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataReady();

        Button buttonAction = findViewById(R.id.categoryButton1);
        buttonAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieCategoryActivity.class);
                intent.putExtra("keyCategory", action);
                startActivity(intent);
            }
        });

        Button buttonScifi = findViewById(R.id.categoryButton2);
        buttonScifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieCategoryActivity.class);
                intent.putExtra("keyCategory", scifi);
                startActivity(intent);
            }
        });

        Button buttonFantastic = findViewById(R.id.categoryButton3);
        buttonFantastic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieCategoryActivity.class);
                intent.putExtra("keyCategory", fantastic);
                startActivity(intent);
            }
        });

        Button buttonRomantic = findViewById(R.id.categoryButton4);
        buttonRomantic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieCategoryActivity.class);
                intent.putExtra("keyCategory", romantic);
                startActivity(intent);
            }
        });
    }

    private void getDataReady() {
        action = new Category("action");
        scifi = new Category("scifi");
        fantastic = new Category("fantastic");
        romantic = new Category("romantic");

        getMovie();
    }

    private void getMovie() {
        int count = 0;
        while (count < Data.data.length) {
            String[] line = Data.data[count].split(",");
            Movie movie = new Movie(Integer.parseInt(line[0]), line[1],line[2], line[3], Float.parseFloat(line[4]), line[5], line[6]);
            if(line[5].equals("Action")){
                action.getMovieList().add(movie);
            }else if(line[5].equals("SciFi")){
                scifi.getMovieList().add(movie);
            }else if(line[5].equals("Fantastic")){
                fantastic.getMovieList().add(movie);
            }else if(line[5].equals("Romantic")){
                romantic.getMovieList().add(movie);
            }
            count++;
        }
    }
}