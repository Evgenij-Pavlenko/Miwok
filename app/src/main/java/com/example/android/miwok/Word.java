package com.example.android.miwok;

import android.content.Context;

/**
 * Created by evgenij on 10.01.18.
 * + * {@link Word} represents a vocabulary word that the user wants to learn.
 * + * It contains a default translation and a Miwok translation and an image for that word.
 * +
 */


public class Word {

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceId = mImageResourceId;
    }

    /**
     * Get the default translation of the word
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word
     */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     +     * Returns whether or not there is an image for this word.
     +     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
