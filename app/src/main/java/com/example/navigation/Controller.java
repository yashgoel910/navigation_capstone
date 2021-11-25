package com.example.navigation;

import android.app.Activity;
import android.util.Log;

public class Controller extends Activity {

    Controller() {};
public String  getObject(String id){
    //Log.d("Object ID is :", String.valueOf(id));
    switch(id){
        case "33" : return "33";
        case "21" : return "21";
        case "31" : return "31";
        case "32" : return "32";
        default: return "";
    }

}


}
