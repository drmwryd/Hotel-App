package com.darma202102319.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{
    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 =  (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://ik.imagekit.io/ev2sgtdljw/b43463f4.webp?updatedAt=1685989708752.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}