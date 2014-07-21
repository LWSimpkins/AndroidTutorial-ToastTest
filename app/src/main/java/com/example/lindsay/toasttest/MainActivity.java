package com.example.lindsay.toasttest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/*
 * Toasts are useful for:
 * - Giving the user quick feedback
 * - Does not block the Activity or Fragment
 */

public void showToast(View view){
    Toast toast;
    if(view.getId()==R.id.button1){
        toast = Toast.makeText(this, "Hello from APP", Toast.LENGTH_SHORT);
        toast.show();
        /*
        * Control location of the toast using setGravity(gravity, x, y)
        * Can specify multiple gravities, i.e. Gravity.BOTTOM|Gravity.RIGHT to move toast to bottom right
        */
         toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);
    }
    if(view.getId()==R.id.button2){
        toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM, 0, 0);

        //To use the custom toast_layout XML file
        LayoutInflater inflater = getLayoutInflater();
        //Gets the layout file, and sets the root of the XML file (in this case the LinearLayout)
        //Returns a View object that represents the appearance of the toast
        View appearance = inflater.inflate(R.layout.toast_layout, (ViewGroup)findViewById(R.id.root));
        toast.setView(appearance);
        toast.show();
    }

}
}
