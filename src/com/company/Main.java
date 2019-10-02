package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Aiyma";
        int var = 30;
        int temperature = 28;

        if ((var >= 20) && (var <= 45) && (temperature < 30) && (temperature > (-20)))
        {
            System.out.println("Можно идти гулять");
        }

        if ((var < 20) && (temperature > 0) && (temperature < 28)) {
            System.out.println("Можно идти гулять");
        }

        if ((var > 45) && (temperature > (-10)) && (temperature < 25)) {
            System.out.println("Можно гулять");
        }
    }

}

