package com.example.student.map524lab3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

//import static com.example.student.map524lab3.R.id.auto_web;


public class fifth_activity extends ActionBarActivity {

    String[] webs;
    String[] links;

    //AutoCompleteTextView temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_activity);

        webs = getResources().getStringArray(R.array.website);
        links = getResources().getStringArray(R.array.link);

        ListView listViewHandle = (ListView) findViewById( R.id .listView )  ;

        final ArrayList<String> itemList = new ArrayList<String>();

        for(int i=0; i<12 ; i++)
        {
            itemList.add(webs[i]);
        }

        ArrayAdapter<String> listAdaptor = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, itemList);

        listViewHandle.setAdapter(listAdaptor);




        listViewHandle.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(links[position]));
                startActivity(browserIntent);


                //startActivity(new Intent(this,fifth_activity.class ));
            }
        });

       // listAdaptor.notifyDataSetChanged();






        //temp = (AutoCompleteTextView) findViewById(R.id.auto_web);
        //create an object of array
       // ArrayAdapter<String> adaptor1 = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,webs);

        //the number of character needed to automatically shows the name
        //tv.setThreshold(3);

        // connect the adaptor to autocomplete textview
        //temp.setAdapter(adaptor1);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fifth_activity, menu);
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
