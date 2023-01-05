package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        // *** Su dung intent de chuyen qua lai giua 2 man hinh
        // lay button theo id
//        Button testButton = (Button) findViewById(R.id.btnClickMe);
//
//        testButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                // tu man hinh dau tien di toi man hinh thu 2
//                // man hinh dau tien truyen vao this, man hinh thu 2 truyen vao class
//                Intent intent = new Intent(FirstScreen.this, SecondScreen.class);
//
//                startActivity(intent);
//            }
//        });

        // *** khoi chay service
//        Intent serviceIntent = new Intent(this, ServiceExample.class);
//        startService(serviceIntent);

        // Vi du voi intent explicit
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://howktem.com"));
//        startService(intent);

//        Button testBtn = (Button) findViewById(R.id.btnClickMe);
//        testBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://howkteam.com"));
//                startActivity(intent);
//            }
//        });


//        Intent i = new Intent(FirstScreen.this, SecondScreen.class);
//        i.putExtra("Value1", "this value 1 for activity second");
//        i.putExtra("Value2", "this value 2 for activity second");
//
//        int REQUEST_CODE = 9;
//        startActivityForResult(i, REQUEST_CODE); // tra ve du lieu ma activity thu nhat mong muon

        Button testBtn = (Button) findViewById(R.id.btnClickMe);
        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FirstScreen.this, SecondScreen.class);
                i.putExtra("Value1", "this value 1 for activity second");
                i.putExtra("Value2", "this value 2 for activity second");

                int REQUEST_CODE = 9;
                startActivityForResult(i, REQUEST_CODE); // tra ve du lieu ma activity thu nhat mong muon
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK && requestCode == 9) {
            if (data.hasExtra("returnKey1"));

            // viet thong bao
            Toast.makeText(this, data.getExtras().getString("returnKey1"), Toast.LENGTH_SHORT).show();
        }
    }
}