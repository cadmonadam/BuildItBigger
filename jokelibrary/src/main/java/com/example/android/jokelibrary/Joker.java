package com.example.android.jokelibrary;

import java.util.Random;

public class Joker {
    String[] jokesArray = new String[]
            {"What's the difference between snowmen and snowladies? Snowballs",
                    "How do you make holy water? You boil the hell out of it.",
                    "I am a nobody, nobody is perfect, therefore I am perfect.",
                    "I wondered why the frisbee was getting bigger, and then it hit me.",
                    "I used to like my neighbors, until they put a password on their Wi-Fi.",
                    "How do you seduce a fat woman? Piece of cake.",
                    "If practice makes perfect, and nobody's perfect, why practice?",
                    "Why did the duck go to rehab? Because he was a quack addict!",
                    "If at first you don't succeed, destroy all evidence that you tried.",
                    "Why did the skeleton go to the party alone? He had no body to go with him!"};
    String randomJoke = jokesArray[new Random().nextInt(jokesArray.length)];

    public String tellJoke() {
        return randomJoke;
    }
}
