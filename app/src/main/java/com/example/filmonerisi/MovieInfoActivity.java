package com.example.filmonerisi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MovieInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_info);

        final Movie movie = (Movie) getIntent().getSerializableExtra("keyMovie");
        final Category category = (Category) getIntent().getSerializableExtra("keyCategory");

        ImageView imageView = findViewById(R.id.imageView);
        int photoResMain = getResources().getIdentifier(movie.getPhotoName(), "drawable", getPackageName());
        imageView.setBackgroundResource(photoResMain);

        TextView textView = findViewById(R.id.movieInfoTW);
        textView.setText(movie.getInfo());

        ImageButton suggestButton1 = findViewById(R.id.suggestButton1);
        ImageButton suggestButton2 = findViewById(R.id.suggestButton2);
        ImageButton suggestButton3 = findViewById(R.id.suggestButton3);

        int photoRes1 = getResources().getIdentifier(category.getMovieList().get(1).getPhotoName(), "drawable", getPackageName());
        int photoRes2 = getResources().getIdentifier(category.getMovieList().get(2).getPhotoName(), "drawable", getPackageName());
        int photoRes3 = getResources().getIdentifier(category.getMovieList().get(3).getPhotoName(), "drawable", getPackageName());

        suggestButton1.setBackgroundResource(photoRes1);
        suggestButton2.setBackgroundResource(photoRes2);
        suggestButton3.setBackgroundResource(photoRes3);

        suggestButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MovieInfoActivity.this, MovieInfoActivity.class);
                intent.putExtra("keyMovie", category.getMovieList().get(1));
                intent.putExtra("keyCategory", category);
                startActivity(intent);
            }
        });

        suggestButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MovieInfoActivity.this, MovieInfoActivity.class);
                intent.putExtra("keyMovie", category.getMovieList().get(2));
                intent.putExtra("keyCategory", category);
                startActivity(intent);
            }
        });

        suggestButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MovieInfoActivity.this, MovieInfoActivity.class);
                intent.putExtra("keyMovie", category.getMovieList().get(3));
                intent.putExtra("keyCategory", category);
                startActivity(intent);
            }
        });

    }

}
