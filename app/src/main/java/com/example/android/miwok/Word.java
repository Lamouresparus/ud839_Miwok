package com.example.android.miwok;

public class Word {
    private String mMiwokWord;
    private String mEnglishWord;
    private int mImageResource = NO_IMAGE;
    private static final int NO_IMAGE = -1;
    private int mAudioFileResource;
    public Word(String miwokWord, String englishWord, int imageResource, int audioFileResource){
        mMiwokWord = miwokWord;
        mEnglishWord = englishWord;
        mImageResource = imageResource;
        mAudioFileResource = audioFileResource;
    }

    public Word(String miwokWord, String englishWord, int audioFileResource){
        mMiwokWord = miwokWord;
        mEnglishWord = englishWord;
        mAudioFileResource = audioFileResource;
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

    public int getmAudioFileResource() {
        return mAudioFileResource;
    }

    public boolean hasImage(){
        return mImageResource != NO_IMAGE;
    }
}
