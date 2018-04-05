package com.example.snoundla.materialsample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class CollapsingToolbarMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collapsing_toolbar_activity_main);

        setupToolbar();
        setupCollapsingLayout();

    }
    /**Set the collapsing Toolbar Layout*/
    private void setupCollapsingLayout() {
        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("Collapsing Toolbar Layout");
        collapsingToolbar.setExpandedTitleColor(Color.GREEN);
        collapsingToolbar.setCollapsedTitleTextColor(Color.WHITE);
    }

    private void setupToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
