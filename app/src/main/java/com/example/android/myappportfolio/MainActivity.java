package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void loadProject(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT);
        switch (view.getId()) {
            case R.id.popular_movies_button:
                toast.setText("Popular Movies is under construction!");
                break;

            case R.id.scores_app_button:
                toast.setText("Scores App is under construction!");
                break;

            case R.id.library_app_button:
                toast.setText("Libary App is under construction!");
                break;

            case R.id.build_it_bigger_button:
                toast.setText("Build It Bigger is under construction!");
                break;

            case R.id.xyz_reader_button:
                toast.setText("XYZ Reader is under construction!");
                break;

            case R.id.capstone_button:
                toast.setText("Soon...");
                break;
        }
        toast.show();
    }
}