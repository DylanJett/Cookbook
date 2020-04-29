package com.android.uraall.pizzarecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RecipeItem> recipeItems = new ArrayList<>();

        recipeItems.add(new RecipeItem(R.drawable.soup,
                Soup.SOUP_TITLE, Soup.SOUP_DESCRIPTION,
                Soup.SOUP_RECIPE));
        recipeItems.add(new RecipeItem(R.drawable.fish,
                Seafood.SEAFOOD_TITLE, Seafood.SEAFOOD_DESCRIPTION,
                Seafood.SEAFOOD_RECIPE));
        recipeItems.add(new RecipeItem(R.drawable.chicken,
                Chicken.CHICKEN_TITLE, Chicken.CHICKEN_DESCRIPTION,
                Chicken.CHICKEN_RECIPE));
        recipeItems.add(new RecipeItem(R.drawable.beef,
                Beef.BEEF_TITLE, Beef.BEEF_DESCRIPTION,
                Beef.BEEF_RECIPE));
        recipeItems.add(new RecipeItem(R.drawable.eggs,
                Eggs.EGGS_TITLE, Eggs.EGGS_DESCRIPTION,
                Eggs.EGGS_RECIPE));
        recipeItems.add(new RecipeItem(R.drawable.dessert,
                Dessert.DESSERT_TITLE, Dessert.DESSERT_DESCRIPTION,
                Dessert.DESSERT_RECIPE));
        recipeItems.add(new RecipeItem(R.drawable.question,
                About.ABOUT_TITLE, About.ABOUT_DESCRIPTION,
                About.ABOUT_RECIPE));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new RecipeAdapter(recipeItems, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}
