package com.example.rafaj.fragmentapp;

import java.io.Serializable;

/**
 * Created by gerar on 15/4/2018.
 */

public class Planets implements Serializable{
    private String name;
    private int img;

    public Planets(String name, int index){
        this.name = name;

        switch (index){
            case 0:
                img = R.drawable.sun;
                break;
            case 1:
                img = R.drawable.mercury;
                break;
            case 2:
                img = R.drawable.venus;
                break;
            case 3:
                img = R.drawable.earth;
                break;
            case 4:
                img = R.drawable.mars;
                break;
            case 5:
                img = R.drawable.jupiter;
                break;
            case 6:
                img = R.drawable.saturn;
                break;
            case 7:
                img = R.drawable.uranus;
                break;
            case 8:
                img = R.drawable.neptune;
                break;
        }
    }

    public String getName(){
        return name;
    }

    public int getImg(){
        return img;
    }
}
