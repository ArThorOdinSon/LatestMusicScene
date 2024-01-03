package com.example.latestmusicscene;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showStory1(View view) {
        // TODO: Implement logic to show the details of the first music story
        Intent intent = new Intent(this, MusicStoryActivity.class);
        intent.putExtra("STORY_TITLE", "DAVID KUSHNER, DAYLIGHT LYRICS");
        intent.putExtra("STORY_DETAILS", "Kushner’s songwriting prowess shines through in the Daylight lyrics. "
                + "The song is a profound exploration of paradoxical desire, as echoed in the lines, "
                + "“You and I drink the poison from the same vine, Oh I love it and I hate it at the same time“. "
                + "This captures the idea of longing for something that is simultaneously harmful, a concept that resonates with many listeners.\n\n"
                + "The song’s narrative is deeply rooted in biblical allusions, inspired by Paul the Apostle’s teachings about overcoming “evil forces”. "
                + "Kushner perceives “darkness” as a ubiquitous concept representing the “worst version of ourselves“, and this forms a core part of the song’s thematic essence.\n\n"
                + "He says:\n\n"
                + "I would want to do things that would lead to darkness, but also want to be in the light. Those are real things. "
                + "We all go through darkness, and we all have brighter moments, too. [This song] speaks from my own life experiences. "
                + "To me, it’s a realization of my own desires and the complexity of those desires. "
                + "The desire for light, but always running towards the darkness instead of light.");
        intent.putExtra("IMAGE_RESOURCE", R.drawable.david);
        startActivity(intent);
    }

    public void showStory2(View view) {
        // TODO: Implement logic to show the details of the second music story
        Intent intent = new Intent(this, MusicStoryActivity.class);
        intent.putExtra("STORY_TITLE", "Exploring the Meaning of 'Outside' by Calvin Harris");
        intent.putExtra("STORY_DETAILS", "“Outside” can be best described as an emotionally charged EDM anthem that skillfully explores "
                + "the intricate dynamics of human relationships. The song opens with a mesmerizing electronic melody that sets the stage for the "
                + "poignant narrative that unfolds. Calvin Harris, known for his ability to infuse deep emotions into his music, weaves a tale "
                + "of heartache and longing, making it an instant favorite among EDM enthusiasts and pop music lovers alike.\n\n"
                + "The lyrics of “Outside” delve into the familiar theme of love and heartbreak. The song revolves around the idea of feeling emotionally "
                + "distant from a loved one, despite physical proximity. It delves into the vulnerability of being in a relationship where one is unable "
                + "to bridge the emotional chasm that has developed, making it a relatable and soul-stirring track for many.");
        intent.putExtra("IMAGE_RESOURCE", R.drawable.calvin);
        startActivity(intent);
    }
}
