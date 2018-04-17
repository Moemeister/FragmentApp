package com.example.rafaj.fragmentapp;

import android.content.res.Resources;

import java.io.Serializable;

/**
 * Created by gerar on 15/4/2018.
 */

public class Games implements Serializable{
    private String name;
    private int img;
    private  String year;
    private String type;
    public Games(Resources res, int index){

        switch (index){
            case 0:
                img = R.drawable.sun;
                name = res.getStringArray(R.array.Game)[0];
                year = res.getStringArray(R.array.year)[2];
                type = res.getStringArray(R.array.type)[0];

                break;
            case 1:
                img = R.drawable.mercury;
                name = res.getStringArray(R.array.Game)[1];
                year = res.getStringArray(R.array.year)[1];
                type = res.getStringArray(R.array.type)[1];

                break;
            case 2:
                img = R.drawable.venus;
                name = res.getStringArray(R.array.Game)[2];
                year = res.getStringArray(R.array.year)[1];
                type = res.getStringArray(R.array.type)[1];
                break;
            case 3:
                img = R.drawable.earth;
                name = res.getStringArray(R.array.Game)[3];
                year = res.getStringArray(R.array.year)[1];
                type = res.getStringArray(R.array.type)[1];
                break;
            case 4:
                img = R.drawable.mars;
                name = res.getStringArray(R.array.Game)[4];
                year = res.getStringArray(R.array.year)[3];
                type = res.getStringArray(R.array.type)[3];
                break;
            case 5:
                img = R.drawable.jupiter;
                name = res.getStringArray(R.array.Game)[5];
                year = res.getStringArray(R.array.year)[4];
                type = res.getStringArray(R.array.type)[2];
                break;
            case 6:
                img = R.drawable.saturn;
                name = res.getStringArray(R.array.Game)[6];
                year = res.getStringArray(R.array.year)[1];
                type = res.getStringArray(R.array.type)[4];
                break;
            case 7:
                img = R.drawable.uranus;
                name = res.getStringArray(R.array.Game)[7];
                year = res.getStringArray(R.array.year)[5];
                type = res.getStringArray(R.array.type)[4];
                break;
            case 8:
                img = R.drawable.neptune;
                name = res.getStringArray(R.array.Game)[8];
                year = res.getStringArray(R.array.year)[0];
                type = res.getStringArray(R.array.type)[0];
                break;
        }
    }

    public String getName(){
        return name;
    }

    public int getImg(){
        return img;
    }

    public String getYear() {
        return year;
    }

    public String getType() {
        return type;
    }
}
