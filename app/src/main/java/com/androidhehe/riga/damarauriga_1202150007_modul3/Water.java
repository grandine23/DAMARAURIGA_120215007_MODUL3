package com.androidhehe.riga.damarauriga_1202150007_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;

/**
 * Created by Riga on 25/02/2018.
 */

public class Water {
    private final String title; //inisialisasi variabel title
    private final String info; //inisialisasi variabel info
    private final int imageResource; //inisialisasi variabel gambar

    static final String TITLE_KEY = "Title";
    static final String IMAGE_KEY = "Image Resource";

    Water(String title, String info, int imageResource) {
        //ngambil nilai title, info dan image dari kelas ini
        this.title = title;
        this.info = info;
        this.imageResource = imageResource;
    }


    String getTitle() {
        return title;
    } // set string title dan return

    String getInfo() {
        return info;
    } // set string info dan return


    int getImageResource() { // set int image dan return

        return imageResource;
    }


    static Intent starter(Context context, String title, @DrawableRes int imageResId) {
        Intent detailIntent = new Intent(context, DetailActivity.class); //merujuk ke kelas detail
        detailIntent.putExtra(TITLE_KEY, title);
        detailIntent.putExtra(IMAGE_KEY, imageResId);
        return detailIntent;
    }
}

