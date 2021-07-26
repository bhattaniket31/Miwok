package com.example.miwok;

public class Colors {
    private final String englishColor;
    private final String miwokColor;
    private final int ImageResId;
    public Colors(String englishColor,String miwokColor,int ImageResId){
        this.englishColor=englishColor;
        this.miwokColor=miwokColor;
        this.ImageResId=ImageResId;
    }
    public String getEnglishColor(){
        return englishColor;
    }
    public String getMiwokColor(){
        return miwokColor;
    }
}
