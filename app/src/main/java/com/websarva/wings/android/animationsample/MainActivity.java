package com.websarva.wings.android.animationsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnimationSampleFragment f = new AnimationSampleFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame,f).commit();
    }
}
