package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String facebook_login ;
    public String twitter_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.click);
        ImageView imageView1 = findViewById(R.id.click1);
      //  ImageView showData = findViewById(R.id.showData);
//        Intent intent=getIntent();
//
//        if(intent.getStringExtra("facebook_login") != null ){
//            facebook_login = intent.getStringExtra("facebook_login");
//            Toast.makeText(getApplicationContext(),"FACBEOOK : "+facebook_login,Toast.LENGTH_LONG).show();
//
//        }
//
//        Toast.makeText(getApplicationContext(),"HELLO WORLD : ",Toast.LENGTH_LONG).show();
//
//
//        if(!intent.getStringExtra("twitter_login").isEmpty() ){
//            facebook_login = intent.getStringExtra("twitter_login");
//            Toast.makeText(getApplicationContext(),"TWITTER : " +twitter_login,Toast.LENGTH_LONG).show();
//        }





        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , facebook1.class);
                startActivity(intent);
            }
        });

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , tweet_login.class);
                startActivity(intent);
            }
        });

//        showData.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //Intent intent = getIntent();
//                Toast.makeText(getApplicationContext(),"FACBEOOK : "+facebook_login,Toast.LENGTH_LONG).show();
//                Toast.makeText(getApplicationContext(),"TWITTER : " +twitter_login,Toast.LENGTH_LONG).show();
//                //Toast toast1 = Toast.makeText(getApplicationContext(),"HELLO WORLD",Toast.LENGTH_LONG);
//
//            }
//        });



    }
}
