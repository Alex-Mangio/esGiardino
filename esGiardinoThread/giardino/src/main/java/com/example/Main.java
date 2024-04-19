package com.example;

public class Main {
    public static void main(String[] args) {
        Giardino giard = new Giardino();

        for(int i=0;i<50;i++){
            ThreadPersona p = new ThreadPersona(i, giard);
            p.start();
        }
    }
}