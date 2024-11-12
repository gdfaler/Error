package com.example.color;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public int n;
    public Button btn;
    View layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        n = 0;
        layout = findViewById(R.id.main);
        btn = findViewById(R.id.button);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n += 1;
                if (n % 2 == 0) {
                    layout.setBackgroundColor(Color.parseColor("#1eff00"));
                } else {
                    layout.setBackgroundColor(Color.parseColor("#ffe400"));
                }
            }
        });
    }
}