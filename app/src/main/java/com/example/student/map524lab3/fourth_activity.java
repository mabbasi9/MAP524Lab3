package com.example.student.map524lab3;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;


public class fourth_activity extends ActionBarActivity {



    String[] names;
    String[] values;

    AutoCompleteTextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_activity);
        values = getResources().getStringArray(R.array.description);
        names = getResources().getStringArray(R.array.names);

        tv = (AutoCompleteTextView) findViewById(R.id.auto_names);
        //create an object of array
        ArrayAdapter<String> adaptor = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,names);

        //the number of character needed to automatically shows the name
        tv.setThreshold(3);

        // connect the adaptor to autocomplete textview
        tv.setAdapter(adaptor);


        //to put the text in textview
       final TextView text = (TextView) findViewById(R.id.textView2);
        /*
       ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, values);
       listView.setAdapter(adapter2);
       */

       tv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                String selection = (String) parent.getItemAtPosition(position);

               // text.setText(selection);
                for(int i=0; i<26; i++)
                {   Log.i("mahboubeh", "names[i] is "+names[i]);
                    if(selection.equals(names[i]))
                    {
                        text.setText(values[i]);
                        break;
                    }

                }

            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fourth_activity, menu);
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
