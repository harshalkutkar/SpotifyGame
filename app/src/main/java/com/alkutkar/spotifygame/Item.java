package com.alkutkar.spotifygame;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.net.URL;

/**
 * Created by harshalkutkar on 11/1/14.
 */
public class Item {

    private String text;
    private String  imageURL;



    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    Item (String text, String URL)
    {
        this.text = text;
        this.imageURL = URL;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Bitmap getImage() throws IOException {

        URL myURL = new URL(imageURL);
        Bitmap imageBitmap = BitmapFactory.decodeStream(myURL.openStream());
        return imageBitmap;
    }




}
