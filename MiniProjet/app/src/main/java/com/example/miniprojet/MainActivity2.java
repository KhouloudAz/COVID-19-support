package com.example.miniprojet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    RecyclerView x;
    Button save;
    List<Symptom> SymptomsList;
    Adapter adap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        x=findViewById(R.id.liste);
        save = findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
        SymptomsList = new ArrayList<>();


        // = new ArrayList<>();
        addSymptom();

        LinearLayoutManager LM = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);
        x.setLayoutManager(LM);

        adap = new Adapter(SymptomsList , MainActivity2.this);
        x.setAdapter(adap);


    }

    public void addSymptom(){

        Symptom symptom = new Symptom("Most common symptoms:", "fever");
        SymptomsList.add(symptom);
        symptom = new Symptom("", "dry cough");
        SymptomsList.add(symptom );
        symptom  = new Symptom("", "tiredness");
        SymptomsList.add(symptom );
        symptom  = new Symptom("Less common symptoms:", "aches and pains");
        SymptomsList.add(symptom );
        symptom  = new Symptom("", "sore throat");
        SymptomsList.add(symptom );
        symptom  = new Symptom("", "diarrhoea");
        SymptomsList.add(symptom );
        symptom  = new Symptom("", "conjunctivitis");
        SymptomsList.add(symptom );
        symptom  = new Symptom("", "headache");
        SymptomsList.add(symptom );
        symptom = new Symptom("", "loss of taste or smell");
        SymptomsList.add(symptom );
        symptom  = new Symptom("", "a rash on skin, or discolouration of fingers or toes");
        SymptomsList.add(symptom );
        symptom  = new Symptom("Serious symptoms:", "difficulty breathing or shortness of breath");
        SymptomsList.add(symptom );
        symptom  = new Symptom("", "chest pain or pressure");
        SymptomsList.add(symptom );
        symptom  = new Symptom("", "loss of speech or movement");
        SymptomsList.add(symptom );


    }
}