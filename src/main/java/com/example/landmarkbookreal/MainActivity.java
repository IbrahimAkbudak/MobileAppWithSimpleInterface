package com.example.landmarkbookreal;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.landmarkbookreal.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //static Landmark selectedLandmark;
    private  ActivityMainBinding binding;
    ArrayList<Landmark> landmarkArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        //Data

        landmarkArrayList = new ArrayList<>();

        Landmark genc1 = new Landmark("genc1","Italy", R.drawable.genc1);
        Landmark genc2 = new Landmark("genc2","France",R.drawable.genc2);
        Landmark genc3 = new Landmark("genc3","Italy",R.drawable.genc3);
        Landmark genc4 = new Landmark("genc4","UK",R.drawable.genc4);

        landmarkArrayList.add(genc1);
        landmarkArrayList.add(genc2);
        landmarkArrayList.add(genc3);
        landmarkArrayList.add(genc4);

        //RecyclerView

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);



        /*
        //Not Efficient
        Bitmap pisa = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.pisa);
        Bitmap eiffel = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.eiffel);
        Bitmap colesseo = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.colesseo);
        Bitmap londonBridge = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.londonbridge);

         */


        /*
        //ListView

        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,landmarkArrayList.stream().map(landmark-> landmark.name).collect(Collectors.toList()));

        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //System.out.println(landmarkNames.get(i));
                //System.out.println(countryNames.get(i));

                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("landmark", landmarkArrayList.get(i));
                startActivity(intent);

            }
        });

         */

    }
}