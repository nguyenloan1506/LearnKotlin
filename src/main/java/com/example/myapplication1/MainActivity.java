package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // tao frame layout, frame layout duoc lay tu file layout tuong ung, co id tuong ung, frame layout da co san o file thuoc folder layout tuong ung
        // findViewById: cach su dung id de lay view
        // NOTE: ep kieu FrameLayout cho phan tu duoc lay ra
        // NOTE: id khong duoc dat chu hoa, chi duoc dat chu thuong
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frame_Layout);

        // tao TextView ten product, khoi tao bang this
        TextView product = new TextView(this);

        // set gia tri text cho bien product
        product.setText("test");

        // tu framelayout da lay ra add them view vao
        frameLayout.addView(product);
    }
}