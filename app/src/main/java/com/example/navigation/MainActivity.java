package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView b11,b12,b13,b21,b22,b23,b31,b32,b33;
    ImageView line11_12, line12_13, line11_21,line12_22,line22_32,line13_23, line23_33, line21_31, line31_32, line32_33;
    ImageView g11,g12,g13,g21,g22,g23,g31,g32,g33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b11 =  (ImageView) findViewById(R.id.b11);
        b12 =  (ImageView) findViewById(R.id.b12);
        b13 =  (ImageView) findViewById(R.id.b13);
        b21 =  (ImageView) findViewById(R.id.b21);
        b22 =  (ImageView) findViewById(R.id.b22);
        b23 =  (ImageView) findViewById(R.id.b23);
        b31 =  (ImageView) findViewById(R.id.b31);
        b32 =  (ImageView) findViewById(R.id.b32);
        b33 =  (ImageView) findViewById(R.id.b33);
        g11 =  (ImageView) findViewById(R.id.g11);
        g12 =  (ImageView) findViewById(R.id.g12);
        g13 =  (ImageView) findViewById(R.id.g13);
        g21 =  (ImageView) findViewById(R.id.g21);
        g22 =  (ImageView) findViewById(R.id.g22);
        g23 =  (ImageView) findViewById(R.id.g23);
        g31 =  (ImageView) findViewById(R.id.g31);
        g32 =  (ImageView) findViewById(R.id.g32);
        g33 =  (ImageView) findViewById(R.id.g33);
        line11_12 =  (ImageView) findViewById(R.id.line11_12);
        line12_13 =  (ImageView) findViewById(R.id.line12_13);
        line11_21 =  (ImageView) findViewById(R.id.line11_21);
        line12_22 =  (ImageView) findViewById(R.id.line12_22);
        line22_32 =  (ImageView) findViewById(R.id.line22_32);
        line13_23 =  (ImageView) findViewById(R.id.line13_23);
        line23_33 =  (ImageView) findViewById(R.id.line23_33);
        line21_31 =  (ImageView) findViewById(R.id.line21_31);
        line31_32 =  (ImageView) findViewById(R.id.line31_32);
        line32_33 =  (ImageView) findViewById(R.id.line32_33);




    }

}