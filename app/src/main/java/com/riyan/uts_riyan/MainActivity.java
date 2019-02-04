package com.riyan.uts_riyan;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button biodata = (Button) findViewById(R.id.btBiodata);

        biodata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View parentView = findViewById(R.id.main_layout_id);
                String pesan = "Muhamad Riyan Afriyanto";

                final Snackbar snackbar = Snackbar
                        .make(parentView, pesan, Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });
    }


    public boolean onCreateOptionMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_action_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
