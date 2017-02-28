package com.example.loop.photoapp;

import android.graphics.Bitmap;

/**
 * Created by loop on 25/02/17.
 */

public class Photo {

    private Bitmap bitmap = null;
    private String description = null;

    public Photo(Bitmap bitmap, String description) {
        this.bitmap = bitmap;
        this.description = description;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Photo photo = (Photo) o;

        return description != null ? description.equals(photo.description) : photo.description == null;

    }

    @Override
    public int hashCode() {
        return description != null ? description.hashCode() : 0;
    }
}
