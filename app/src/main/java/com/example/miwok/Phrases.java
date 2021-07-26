package com.example.miwok;

public class Phrases {
    String englishPhraseName;
    String miwokPhraseName;
    public Phrases(String englishPhraseName,String miwokPhraseName){
            this.englishPhraseName=englishPhraseName;
            this.miwokPhraseName=miwokPhraseName;
    }

    public String getEnglishPhraseName() {
        return englishPhraseName;
    }

    public String getMiwokPhraseName() {
        return miwokPhraseName;
    }
}
