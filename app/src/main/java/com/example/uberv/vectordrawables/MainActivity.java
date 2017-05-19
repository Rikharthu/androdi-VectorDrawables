package com.example.uberv.vectordrawables;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AnimatedVectorDrawable drawable = (AnimatedVectorDrawable) getDrawable(R.drawable.animatedsun);
        mImageView=((ImageView)findViewById(R.id.imageView));
        mImageView.setImageDrawable(drawable);
        mImageView.postDelayed(new Runnable() {
            @Override
            public void run() {
                drawable.stop();
                drawable.start();
//                mImageView.postDelayed(this,2000);
            }
        },0);
    }
}
