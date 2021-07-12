package com.georgioskachrimanis.javacourse;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return (25 <= temperature && temperature <= 45);
        }
        return (25 <= temperature && temperature <= 35);
    }
}
