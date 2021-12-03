package com.example.navigation;

import android.app.Activity;
import android.util.Log;

public class Controller extends Activity {

    Controller() {};
public String  getObject(String id){
    //Log.d("Object ID is :", String.valueOf(id));
    switch(id){
        case "12" : return "12";
        case "13" : return "13";
        case "21" : return "21";
        case "22" : return "22";
        case "23" : return "23";
        case "31" : return "31";
        case "32" : return "32";
        case "33" : return "33";
        case "reset" : return "reset";
        default: return "";
    }

}


}
