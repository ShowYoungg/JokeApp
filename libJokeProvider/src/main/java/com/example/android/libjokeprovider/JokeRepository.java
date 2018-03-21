package com.example.android.libjokeprovider;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * JokeRepository class populates a list of jokes and has a method to return the list to the android app
 */
public class JokeRepository {

    private static List<JokeModel> sJokeList;
    private Random mRandomIndex;

    public JokeRepository() {
        sJokeList = new ArrayList<>();

        sJokeList.add(new JokeModel(1, "Daily Life",
                "My Dad told me to invest my money in bonds. So I bought 100 copies of Goldfinger."));
        sJokeList.add(new JokeModel(2, "Daily Life",
                "Money can't buy you happiness? Well, check this out, I bought myself a Happy Meal."));
        sJokeList.add(new JokeModel(3, "Daily Life",
                "What do Alexander the Great and Winnie the Pooh have in common? Same middle name."));
    }

    public List<JokeModel> getJokesList() {
        return sJokeList;
    }

//    public String getJoke() {
//        return sJokeList.get(mRandomIndex.nextInt(sJokeList.size())).getJoke();
//    }
}
