package com.example.mike.wallpapers;

import android.app.Activity;
import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

import static com.example.mike.wallpapers.R.color.colorAccent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3;
    ImageView imageAnim, imageAnim2, imageAnim3, imageAnim4, imageAnim5;
        int toPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toPhone = R.drawable.ic_launcher;



        btn1 = (Button) findViewById(R.id.btn1);

        imageAnim = (ImageView) findViewById(R.id.img1);

        imageAnim2 = (ImageView) findViewById(R.id.img2);
        imageAnim3 = (ImageView) findViewById(R.id.img3);
        imageAnim4 = (ImageView) findViewById(R.id.img4);
        imageAnim5 = (ImageView) findViewById(R.id.img5);

        imageAnim2.setOnClickListener(this);
        imageAnim3.setOnClickListener(this);
        imageAnim4.setOnClickListener(this);
        imageAnim5.setOnClickListener(this);
        btn1.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {




        switch (v.getId())
        {
            case R.id.img2:
                imageAnim.setImageResource(R.drawable.garden1);
                toPhone = R.drawable.garden1;

                    break;
            case R.id.img3:

                imageAnim.setImageResource(R.drawable.garden2);
                toPhone = R.drawable.garden2;

                break;


            case R.id.img4:

                imageAnim.setImageResource(R.drawable.garden4);
                toPhone = R.drawable.garden4;

                break;


            case R.id.img5:

                imageAnim.setImageResource(R.drawable.sports1);
                toPhone = R.drawable.sports1;


                break;
            case R.id.btn1:
                InputStream inputStream = getResources().openRawResource(toPhone);
                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
            try {
                getApplicationContext().setWallpaper(bitmap);
            }catch (IOException e ){
                e.printStackTrace();
            }
                break;
        }

    }
}