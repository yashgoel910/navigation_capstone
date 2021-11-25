package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView b11,b12,b13,b21,b22,b23,b31,b32,b33;
    ImageView line11_12, line12_13, line11_21,line12_22,line22_32,line13_23, line23_33, line21_31, line31_32, line32_33;
    ImageView g11,g12,g13,g21,g22,g23,g31,g32,g33;
    Controller controller;
    String response = "";
    String flag = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controller = new Controller();
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
        disableLights();
        disablePaths();

    }

    public void objectClicked(View view) {
        if(flag == "0"){
        switch (view.getId()){
            case R.id.b11: response = controller.getObject("11"); break;
            case R.id.b12: response = controller.getObject("12"); break;
            case R.id.b13: response = controller.getObject("13"); break;
            case R.id.b21: response = controller.getObject("21"); break;
            case R.id.b22: response = controller.getObject("22"); break;
            case R.id.b23: response = controller.getObject("23"); break;
            case R.id.b31: response = controller.getObject("31"); break;
            case R.id.b32: response = controller.getObject("32"); break;
            case R.id.b33: response = controller.getObject("33"); break;

            default: Toast.makeText(this, "This action is not handled",
                    Toast.LENGTH_SHORT).show();
            }
        }
        else if(flag == "1"){
            if(view.getId() == R.id.b21){
               // Log.d("Came here","1");
                response = controller.getObject("21");
            }
        }
        displayRoute(response);
    }
    public void disableLights(){
        g11.setVisibility(View.INVISIBLE);
        g12.setVisibility(View.INVISIBLE);
        g13.setVisibility(View.INVISIBLE);
        g21.setVisibility(View.INVISIBLE);
        g22.setVisibility(View.INVISIBLE);
        g23.setVisibility(View.INVISIBLE);
        g31.setVisibility(View.INVISIBLE);
        g32.setVisibility(View.INVISIBLE);
        g33.setVisibility(View.INVISIBLE);
    }
    public void disablePaths(){
        line11_12.setVisibility(View.INVISIBLE);
        line12_13.setVisibility(View.INVISIBLE);
        line11_21.setVisibility(View.INVISIBLE);
        line12_22.setVisibility(View.INVISIBLE);
        line13_23.setVisibility(View.INVISIBLE);
        line21_31.setVisibility(View.INVISIBLE);
        line22_32.setVisibility(View.INVISIBLE);
        line23_33.setVisibility(View.INVISIBLE);
        line31_32.setVisibility(View.INVISIBLE);
        line32_33.setVisibility(View.INVISIBLE);
    }

    public void displayRoute(String id){
        switch(id){
            case "33": {
                flag = "1";
                disableLights();
                g11.setVisibility(View.VISIBLE);
                line11_21.setVisibility(View.VISIBLE);
                line21_31.setVisibility(View.VISIBLE);
                line31_32.setVisibility(View.VISIBLE);
                line32_33.setVisibility(View.VISIBLE);
            } break;
            case "21": {
                if(flag == "1"){
                    g11.setVisibility(View.INVISIBLE);
                    g21.setVisibility(View.VISIBLE);
                    line11_21.setVisibility(View.INVISIBLE);
                }
                else if(flag == "0"){Toast.makeText(this,"Route not available yet "+ id,Toast.LENGTH_SHORT).show();}
            }break;
            default: Toast.makeText(this,"Route not available yet "+ id,Toast.LENGTH_SHORT).show();

        }

    }

}