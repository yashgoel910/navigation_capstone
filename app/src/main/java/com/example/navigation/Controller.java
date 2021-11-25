package com.example.navigation;

import android.app.Activity;
import android.util.Log;

public class Controller extends Activity {

    Controller() {};
public String  getObject(String id){
    //Log.d("Object ID is :", String.valueOf(id));
    switch(id){
        case "33" : return "33";
        case "23" : return "23";
        default: return "";
    }

}


}
