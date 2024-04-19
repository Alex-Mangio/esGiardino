package com.example;

public class ThreadPersona extends Thread{
    
    private Giardino g;
    private int matricola;

    public ThreadPersona(int matricola, Giardino g){
        this.matricola=matricola;
        this.g=g;
    }
    
    @Override
    public void run(){
        try{
            char ingresso = g.entra();
            if(ingresso == 'A'){
                sleep(3000);
            }else{
                int tempo = (int)Math.random()*4000+1000;
                sleep(tempo);
            }
            g.esci(ingresso);
        }catch(Exception e){
            e.printStackTrace();
        } 
    }
}
