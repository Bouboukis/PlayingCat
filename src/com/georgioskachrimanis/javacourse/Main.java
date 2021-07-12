package com.georgioskachrimanis.javacourse;

public class Main {

    public static void main(String[] args) {
        System.out.println( PlayingCat.isCatPlaying(true, 55));
        System.out.println( PlayingCat.isCatPlaying(true, 45));
        System.out.println( PlayingCat.isCatPlaying(true, 25));
        System.out.println( PlayingCat.isCatPlaying(true, 10));
        System.out.println( PlayingCat.isCatPlaying(false, 55));
        System.out.println( PlayingCat.isCatPlaying(false, 35));
        System.out.println( PlayingCat.isCatPlaying(false, 25));
        System.out.println( PlayingCat.isCatPlaying(false, 10));
    }
}
