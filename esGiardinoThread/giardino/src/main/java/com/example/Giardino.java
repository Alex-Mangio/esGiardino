package com.example;

public class Giardino {

    private int ingressoA = 5;
    private int ingressoB = 10;

    public Giardino() {
        this.ingressoA = ingressoA;
        this.ingressoB = ingressoB;
    }

    public synchronized char entra() {
        char ingresso;
        while (ingressoA == 0 && ingressoB == 0) {
            System.out.println("pieno");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            if(ingressoA==0){
                ingressoB--;
                ingresso = 'B';   
                System.out.println("E' entrato nel b");           
            }else{
                ingressoA--;
                ingresso = 'B';
                System.out.println("E' entrato in a");
            }
            return ingresso;
        
    }
    public synchronized void esci(char ingresso){
        if(ingressoA == 'A'){
            ingressoA++;
            System.out.println("E' uscito dalla a");
        }else{
            ingressoB++;
            System.out.println("E' uscito dalla b");
        }
        notifyAll();
    }
    
}
