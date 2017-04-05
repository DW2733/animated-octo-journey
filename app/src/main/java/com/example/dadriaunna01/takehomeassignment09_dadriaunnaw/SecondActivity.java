package com.example.dadriaunna01.takehomeassignment09_dadriaunnaw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference culture = database.getReference("culture");

    private EditText advisory;
    private EditText tileScore;
    private CheckBox fridayCelebration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        advisory = (EditText) findViewById(R.id.advisory_name);
        tileScore = (EditText) findViewById(R.id.tile_score);
        fridayCelebration = (CheckBox) findViewById(R.id.friday_celebration);


    }

    public void cultureList(View view) {

        String advisoryName = advisory.getText().toString();
        String newTileScore = tileScore.getText().toString();
        int finalTileScore = Integer.parseInt(newTileScore);
        boolean celebration = fridayCelebration.isChecked();

        culture.push().setValue(advisoryName, finalTileScore, celebration);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }
}
