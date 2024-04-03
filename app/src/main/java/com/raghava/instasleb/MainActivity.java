package com.raghava.instasleb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
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


        float referenceWidth = 15;
        float adjustTextSize = textUtils.getRelativeTextSize(this, referenceWidth);

        Confirmation_textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, adjustTextSize);
        yes_btn.setTextSize(TypedValue.COMPLEX_UNIT_PX, adjustTextSize);
        no_btn.setTextSize(TypedValue.COMPLEX_UNIT_PX, adjustTextSize);



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

    private void init_views() {
        yes_btn = findViewById(R.id.yes_btn);
        no_btn = findViewById(R.id.no_btn);
        Confirmation_textView = findViewById(R.id.ConfirmationQns);

        linearLayoutBox = findViewById(R.id.boxLinearLayout);



    }
}