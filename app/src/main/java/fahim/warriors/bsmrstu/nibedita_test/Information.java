package fahim.warriors.bsmrstu.nibedita_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        GridView gridView = (GridView) findViewById(R.id.grid_view);

        // Instance of ImageAdapter Class
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

               if(position == 0){

                   Intent i = new Intent(Information.this,PrePreg.class);
                   startActivity(i);

               }

                else if(position == 1)
                {
                    Intent j = new Intent(Information.this,DuringPreg.class);
                    startActivity(j);

                }


               else if(position == 2)
               {
                   Intent j = new Intent(Information.this,AfterPreg.class);
                   startActivity(j);

               }


               else if(position == 3)
               {
                   Intent j = new Intent(Information.this,PostPreg.class);
                   startActivity(j);

               }
            }
        });


    }

}
