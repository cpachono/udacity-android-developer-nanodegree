package com.cpachono.appportfoliocpachono;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * This method is called when the app1 button is clicked.
     */
    public void clickApp1(View view) {

        Context context = getApplicationContext();
        CharSequence text = getString(R.string.toast_spotify_streamer);
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * This method is called when the app2 button is clicked.
     */
    public void clickApp2(View view) {

        Context context = getApplicationContext();
        CharSequence text = getString(R.string.toast_football_scores);
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * This method is called when the app3 button is clicked.
     */
    public void clickApp3(View view) {

        Context context = getApplicationContext();
        CharSequence text = getString(R.string.toast_library);
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * This method is called when the app4 button is clicked.
     */
    public void clickApp4(View view) {

        Context context = getApplicationContext();
        CharSequence text = getString(R.string.toast_build_it_bigger);
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * This method is called when the app5 button is clicked.
     */
    public void clickApp5(View view) {

        Context context = getApplicationContext();
        CharSequence text = getString(R.string.toast_xyz_reader);
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * This method is called when the app6 button is clicked.
     */
    public void clickApp6(View view) {

        Context context = getApplicationContext();
        CharSequence text = getString(R.string.toast_capstone);
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
