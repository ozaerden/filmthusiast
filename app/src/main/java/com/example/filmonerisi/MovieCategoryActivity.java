package com.example.filmonerisi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;


public class MovieCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_category);

        final Category category = (Category) getIntent().getSerializableExtra("keyCategory");

        int photoRes1 = getResources().getIdentifier(category.getMovieList().get(0).getPhotoName(), "drawable", getPackageName());
        int photoRes2 = getResources().getIdentifier(category.getMovieList().get(1).getPhotoName(), "drawable", getPackageName());
        int photoRes3 = getResources().getIdentifier(category.getMovieList().get(2).getPhotoName(), "drawable", getPackageName());
        int photoRes4 = getResources().getIdentifier(category.getMovieList().get(3).getPhotoName(), "drawable", getPackageName());

        ImageButton imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);

        imageButton1.setBackgroundResource(photoRes1);
        imageButton2.setBackgroundResource(photoRes2);
        imageButton3.setBackgroundResource(photoRes3);
        imageButton4.setBackgroundResource(photoRes4);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MovieCategoryActivity.this, MovieInfoActivity.class);
                intent.putExtra("keyMovie", category.getMovieList().get(0));
                intent.putExtra("keyCategory", category);
                startActivity(intent);
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MovieCategoryActivity.this, MovieInfoActivity.class);
                intent.putExtra("keyMovie", category.getMovieList().get(1));
                intent.putExtra("keyCategory", category);
                startActivity(intent);
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MovieCategoryActivity.this, MovieInfoActivity.class);
                intent.putExtra("keyMovie", category.getMovieList().get(2));
                intent.putExtra("keyCategory", category);
                startActivity(intent);
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MovieCategoryActivity.this, MovieInfoActivity.class);
                intent.putExtra("keyMovie", category.getMovieList().get(3));
                intent.putExtra("keyCategory", category);
                startActivity(intent);
            }
        });


    }

}
