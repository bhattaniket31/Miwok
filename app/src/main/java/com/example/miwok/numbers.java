package com.example.miwok;

public class numbers {
    private final String EnlishName;
    private final String MiwokName;
    private int ImageResId;
    public numbers(String enlishName, String miwokName){
        EnlishName=enlishName;
        MiwokName=miwokName;
    }

    public String getEnlishName() {
        return EnlishName;
    }

    public String getMiwokName() {
        return MiwokName;
    }
}
