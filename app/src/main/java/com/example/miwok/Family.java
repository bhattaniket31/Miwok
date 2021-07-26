package com.example.miwok;

public class Family {
    private String EnglishName;
    private String MiwokName;
    private int ImageResId;
    public Family(String EnglishName,String MiwokNmae){
        this.EnglishName=EnglishName;
        this.MiwokName=MiwokNmae;
    }
    public String getEnglishName(){
        return EnglishName;
    }
    public String getMiwokName(){
        return MiwokName;
    }
}
