package fahim.warriors.bsmrstu.nibedita_test;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PrePreg extends AppCompatActivity {

    String[] ppl = {"গর্ভবতী বা প্রসূতির বিপদের ৩টি বিলম্ব", "চারবার গর্ভবতীর স্বাস্থ্য পরীক্ষা","নিরাপদ মাতৃত্ব","প্রসব পরিকল্পনা ও প্রস্তুতি","গর্ভবতী মায়ের পুষ্টি ও যত্ন","গর্ভকালীন ও প্রসবের সময় বিপদ চিহ্ন দেখলে করনীয়"};

    ListView lvProduct;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_preg);
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





        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.row, ppl);

        //ListView listView = (ListView) findViewById(R.id.mobile_list);
        lvProduct = (ListView)findViewById(R.id.lvProduct);
        lvProduct.setAdapter(adapter);

        lvProduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {




               if(position == 0)
               {
                   
               }


            }
        });



    }

}
