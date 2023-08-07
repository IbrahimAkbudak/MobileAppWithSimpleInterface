package com.example.landmarkbookreal;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.landmarkbookreal.databinding.ActivityDetailBinding;

;

public class DetailActivity extends AppCompatActivity {

    private ActivityDetailBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


       Landmark selectedLandmark = (Landmark) getIntent().getSerializableExtra("landmark");

       // Singleton singleton = Singleton.getInstance();
       // Landmark selectedLandmark = singleton.getSelectedLandmark();


        binding.landmarkNameText.setText(selectedLandmark.name);
        binding.countryNameText.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.image);

    }


}