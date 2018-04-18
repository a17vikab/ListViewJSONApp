package com.example.brom.listviewjsonapp;

/**
 * Created by a17vikab on 2018-04-18.
 */

public class Mountain {
    public String name;
    public int height;
    public String location;

    public Mountain(String name, String location, int height){
        this.name = name;
        this.location = location;
        this.height = height;
    }

    public String getName(){
        return name;
    }

    public int getHeight(){
        return height;
    }

    public String getLocation(){
        return location;
    }

    public String toastText(){
        return name + " is a part of the " + location + " mountain range and is " + height + "m high!";
    }

    @Override
    public String toString() {
        return name;
    }
}
