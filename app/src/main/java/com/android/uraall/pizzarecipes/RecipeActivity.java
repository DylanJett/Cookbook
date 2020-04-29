package com.android.uraall.pizzarecipes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        getSupportActionBar().hide();

        TextView title = findViewById(R.id.titleTextView);
        TextView recipe = findViewById(R.id.recipeTextView);
        Button button = findViewById(R.id.button1);

        Intent intent = getIntent();
        if (intent != null) {
            title.setText(intent.getStringExtra("title"));
            recipe.setText(intent.getStringExtra("recipe"));
        }

        if (title.getText().toString().equals(About.ABOUT_TITLE)){
            button.setVisibility(View.GONE);
        }



    }


    public void Send(View view) {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        TextView recipe = findViewById(R.id.recipeTextView);
        String shareBody = recipe.getText().toString();
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Кому");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Поделиться с помощью"));
    }


}
