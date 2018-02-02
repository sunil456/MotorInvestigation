package com.androidprojects.sunilsharma.motorinvestigation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.toptoche.searchablespinnerlibrary.SearchableSpinner;

public class ReferenceInvestigationActivity extends AppCompatActivity {

    private SearchableSpinner stateSpinner;
    private SearchableSpinner citySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference_investigation);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        /**Initialize View*/
        stateSpinner = (SearchableSpinner) findViewById(R.id.stateSpinner);
        citySpinner = (SearchableSpinner) findViewById(R.id.citySpinner);

        stateSpinner.setTitle("Select State");
        stateSpinner.setPositiveButton("OK");
        citySpinner.setTitle("Select City");
        citySpinner.setPositiveButton("OK");
    }

}
