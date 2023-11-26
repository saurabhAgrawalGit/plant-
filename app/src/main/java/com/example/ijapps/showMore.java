package com.example.ijapps;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class showMore extends AppCompatActivity {

    Button camera, gallery,showMore1;
    ImageView imageView;
    TextView result,soll;
    int imageSize = 256;
    Bitmap image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_more);
     //   camera = findViewById(R.id.button);
      //  gallery = findViewById(R.id.button2);
        //showMore1 = findViewById(R.id.show_btn);

        result = findViewById(R.id.result1);
        soll= findViewById(R.id.sol1);
        imageView = findViewById(R.id.imageView1);
        Bundle extras = getIntent().getExtras();
        String res = getIntent().getStringExtra("res");
        String sol = getIntent().getStringExtra("solution");
        byte[] byteArray = extras.getByteArray("picture");
        result.setText(res);
        soll.setText(sol);

        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        ImageView image = (ImageView) findViewById(R.id.imageView1);

        image.setImageBitmap(bmp);
    }
}