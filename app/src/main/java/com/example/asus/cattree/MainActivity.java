package com.example.asus.cattree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private Button webview;
    private Button map;
    private Button photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webview = (Button) findViewById(R.id.webview);
        map = (Button)findViewById(R.id.map);
        photo =(Button) findViewById(R.id.photo);
        webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWebview = new Intent(MainActivity.this,WebViewaCTIVITY.class);
                startActivity(intentWebview);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMap = new Intent(MainActivity.this,MapActivity.class);
                startActivity(intentMap);
            }
        });
        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPhoto = new Intent(MainActivity.this,PhotoActivity.class);
                startActivity(intentPhoto);
            }
        });
    }

}
