package com.example.android.miwok;

public class Word {
    private String mMiwokWord;
    private String mEnglishWord;

    public Word(String miwokWord, String englishWord){
        mMiwokWord = miwokWord;
        mEnglishWord = englishWord;
    }

    public String getmMiwokWord() {
        return mMiwokWord;
    }

    public String getmEnglishWord() {
        return mEnglishWord;
    }
}
