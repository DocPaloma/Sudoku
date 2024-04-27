package com.example.sudogu.model;

import java.util.Random;

public class Doge {

    Random random = new Random();
    public String frase;

    public String dogeSays(){
        int randomNumber = random.nextInt(4);
        if(randomNumber == 0){
            frase = "Nooo cabro que hiciste? :c";
            return frase;
        }
        if(randomNumber == 2){
            frase = "Tu error me recuerda a los crimenes cometidos en Vietnam";
            return frase;
        }
        if(randomNumber == 3){
            frase = "Waos";
            return frase;
        }
        if(randomNumber == 1){
            frase = "Bruh";
            return frase;
        }
        else {
            frase = "Buen intento bro, intenta mejor a la proxima";
            return frase;
        }
    }
    //public void dogeSay;
}
