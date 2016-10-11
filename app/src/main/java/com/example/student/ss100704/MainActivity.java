package com.example.student.ss100704;

import android.hardware.camera2.TotalCaptureResult;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Map<String,Object>> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.listView);
        list = new ArrayList<>();
        /*
                final String [] cities = {"台北","台中","高雄","花蓮"};
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                        MainActivity.this,
                        android.R.layout.simple_list_item_1,
                        cities
                );
                lv.setAdapter(adapter);
                */

        Map map1 = new HashMap();
        map1.put("city","台北");
        map1.put("code","01");
        map1.put("image",R.drawable.c1);
        list.add(map1);

        Map map2 = new HashMap();
        map2.put("city","高雄");
        map2.put("code","02");
        map2.put("image",R.drawable.c2);
        list.add(map2);

        Map map3 = new HashMap();
        map3.put("city","花蓮");
        map3.put("code","03");
        map3.put("image",R.drawable.c3);
        list.add(map3);


        SimpleAdapter adapter =  new SimpleAdapter(
                MainActivity.this,
                list,
                //android.R.layout.simple_list_item_2,
                R.layout.myitem,
                new String[] {"city","code","image"},
                //new int[] {android.R.id.text1,android.R.id.text2}
                new int[]{R.id.textView2,R.id.textView,R.id.imageView}
        );
        lv.setAdapter(adapter);






    }
}
