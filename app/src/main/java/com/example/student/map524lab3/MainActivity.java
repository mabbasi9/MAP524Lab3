package com.example.student.map524lab3;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.b1);

        final Intent myIntent1 = new Intent(this, fourth_activity.class);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(myIntent1);
            }
        });



        Button b2 = (Button) findViewById(R.id.b2);

        final Intent myIntent2 = new Intent(this, fifth_activity.class);

        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(myIntent2);
            }
        });


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


        if (id == R.id.action_help) {
            startActivity(new Intent(this, second_activity.class));
        }

        if (id == R.id.action_about) {
            startActivity(new Intent(this, third_activity.class));
        }

        return super.onOptionsItemSelected(item);
    }
}
