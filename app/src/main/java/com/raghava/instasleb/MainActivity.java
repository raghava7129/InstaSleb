package com.raghava.instasleb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;

import android.util.TypedValue;

public class MainActivity extends AppCompatActivity {
    AppCompatButton yes_btn, no_btn;
    TextView Confirmation_textView;
    LinearLayout linearLayoutBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();


        init_views();


        /* This code is used to adjust the text size of the textViews and buttons according to the screen size !! */
//        float referenceWidth = 15;
//        float adjustTextSize = textUtils.getRelativeTextSize(this, referenceWidth);
//
//        Confirmation_textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, adjustTextSize);
//        yes_btn.setTextSize(TypedValue.COMPLEX_UNIT_PX, adjustTextSize);
//        no_btn.setTextSize(TypedValue.COMPLEX_UNIT_PX, adjustTextSize);

        //                  textUtils.resetDisplayMetrics();


        yes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, homePage.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        no_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                overridePendingTransition(0, 0);
            }
        });
    }


    // This code disables the screen zoom !! { The change in the display size will cause no effect to the app }
    @Override
    protected void attachBaseContext(final Context baseContext) {
        Context newContext;
        DisplayMetrics displayMetrics = baseContext.getResources().getDisplayMetrics();
        Configuration configuration = baseContext.getResources().getConfiguration();

        if (displayMetrics.densityDpi != DisplayMetrics.DENSITY_DEVICE_STABLE) {
            configuration.densityDpi = DisplayMetrics.DENSITY_DEVICE_STABLE;
            newContext = baseContext.createConfigurationContext(configuration);
        } else {
            newContext = baseContext;
        }
        super.attachBaseContext(newContext);
    }

    private void init_views() {
        yes_btn = findViewById(R.id.yes_btn);
        no_btn = findViewById(R.id.no_btn);
        Confirmation_textView = findViewById(R.id.ConfirmationQns);

        linearLayoutBox = findViewById(R.id.boxLinearLayout);

    }
}