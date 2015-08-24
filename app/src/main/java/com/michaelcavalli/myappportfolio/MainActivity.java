package com.michaelcavalli.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
     * Method to process the Spotify App button click
     *
     * View points to the view which called this method
     */
    public void spotifyClick(View v){
        displayToast(((Button)v).getText());
    }

    public void scoresClick(View v){
        displayToast(((Button)v).getText());
    }

    public void libraryClick(View v){
        displayToast(((Button)v).getText());
    }

    public void biggerClick(View v){
        displayToast(((Button)v).getText());
    }

    public void readerClick(View v){
        displayToast(((Button)v).getText());
    }

    public void capstoneClick(View v){
        displayToast(((Button)v).getText());
    }

    public void displayToast(CharSequence appName){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch " + appName;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
