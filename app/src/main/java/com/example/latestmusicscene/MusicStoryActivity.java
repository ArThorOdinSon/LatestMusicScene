package com.example.latestmusicscene;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MusicStoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_story);

        // Get the Intent that started this activity and retrieve the data
        Intent intent = getIntent();
        String storyTitle = intent.getStringExtra("STORY_TITLE");
        String storyDetails = intent.getStringExtra("STORY_DETAILS");
        int imageResource = intent.getIntExtra("IMAGE_RESOURCE", R.drawable.calvin); // Provide a default image resource

        // Find the TextViews and ImageView in your layout
        TextView titleTextView = findViewById(R.id.storyTitleTextView);
        TextView detailsTextView = findViewById(R.id.storyDetailsTextView);
        ImageView imageView = findViewById(R.id.imageView); // Make sure you have an ImageView with this ID in your layout

        // Update the UI elements with the received data
        if (storyTitle != null) {
            titleTextView.setText(storyTitle);
        }

        if (storyDetails != null) {
            detailsTextView.setText(storyDetails);
        }

        // Set the image resource to the ImageView
        imageView.setImageResource(imageResource);
    }
}
