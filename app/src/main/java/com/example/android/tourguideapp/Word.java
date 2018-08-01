package com.example.android.tourguideapp;

/**
 * {@link Word} represents a location that the user wants to learn about.
 * It contains a name, a description, and an image for that location.
 */
public class Word {

    /**
     * Constant value that represents no image was provided for this location
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Name for the location
     */
    private String mName;
    /**
     * Description for the location
     */
    private String mDescription;
    /**
     * Image resource ID for the location
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Word object.
     *
     * @param name            is the name of the location in question
     * @param description     is the description of said
     * @param imageResourceId is the drawable resource ID for the image associated with the location
     */
    public Word(String name, String description, int imageResourceId) {
        mName = name;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the location.
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the description of the location.
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Return the image resource ID of the locaiton.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this location.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}