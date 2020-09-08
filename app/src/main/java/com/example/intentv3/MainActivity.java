package com.example.intentv3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button profile;
    Button facebook;
    Button Instagram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        profile = (Button) findViewById(R.id.btn_profile);
        profile.setOnClickListener(this);
        Instagram = (Button) findViewById(R.id.btn_ig);
        Instagram.setOnClickListener(this);
        facebook = (Button) findViewById(R.id.btn_facebook);
        facebook.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_profile:
                Intent profil = new Intent(MainActivity.this,IntentActivity.class);
                startActivity(profil);
                break;
            case R.id.btn_facebook:
                Intent fb= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100008452596216"));
                startActivity(fb);
                break;
            case R.id.btn_ig:
                Intent ig = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/mfikrmdn/"));
                startActivity(ig);
                break;
            default:
                break;
        }
    }
}