package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class ss extends AppCompatActivity {

    public ImageView imageView;
    Bundle picture_string;
    Bitmap picture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss);
       // Intent intent = getIntent();
        //picture = intent.getParcelableExtra("pic");
       // picture = this.getIntent().getParcelableExtra("pic");

        Bitmap bmp;

        byte[] byteArray = getIntent().getByteArrayExtra("pic");
        bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);

        imageView.findViewById(R.id.image);

    }
}