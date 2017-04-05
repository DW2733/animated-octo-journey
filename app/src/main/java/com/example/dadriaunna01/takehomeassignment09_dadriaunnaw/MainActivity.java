package com.example.dadriaunna01.takehomeassignment09_dadriaunnaw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

import static android.transition.Fade.IN;

public class MainActivity extends AppCompatActivity {

    String displayCelebrationList;
    private TextView updateView;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference cultureRef = database.getReference("culutre");
    private ArrayList<Cohort> cohortList = new ArrayList<>();

    ChildEventListener() {
        @Override
        public void onChildAdded (DataSnapshot dataSnapshot, String s){
            cohortList.add(dataSnapshot.getValue(Cohort.class));
            displayNew();
        }

        @Override
        public void onChildChanged (DataSnapshot dataSnapshot, String s){
            Toast.makeText(MainActivity.this, dataSnapshot.getValue(Cohort.class) + "has changed", Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onChildRemoved (DataSnapshot dataSnapshot){
            Toast.makeText(MainActivity.this, dataSnapshot.getValue(Cohort.class) + "is removed", Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onChildMoved (DataSnapshot dataSnapshot, String s){

        }

        @Override
        public void onCancelled (DatabaseError databaseError){

        }
    }

    cultureRef.addChildEventListener(new

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updateView = (TextView) findViewById(R.id.update_view);
        displayCelebrationList = updateView.getText().toString();
    }

    )
}

    private void displayNew() {
        String text = "";
        for (Cohort a : cohortList)
            text += a + "\n";
        updateView.setText(text);
    }

    public void add(View view) {

        Intent addCohort = new Intent(this, Cohort.class);
        startActivity(addCohort);
    }
}
