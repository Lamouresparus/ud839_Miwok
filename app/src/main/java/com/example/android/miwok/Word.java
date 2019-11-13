package com.example.android.miwok;

public class Word {
    private String mMiwokWord;
    private String mEnglishWord;
    private int mImageResource;

    public Word(String miwokWord, String englishWord, int imageResource){
        mMiwokWord = miwokWord;
        mEnglishWord = englishWord;
        mImageResource = imageResource;
    }

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

    public int getmImageResource() {
        return mImageResource;
    }
}
