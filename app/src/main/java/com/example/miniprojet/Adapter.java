package com.example.miniprojet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private List<Symptom> stList;
    Context context;


    // CheckBox c;
    //Constructeur
    public Adapter(List<Symptom> x , Context context) {

        this.stList = x;
        this.context = context;
    }
    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_row, parent, false);
        return new Adapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {
        Diagnostic diagnostic = new Diagnostic();
        Symptom s= stList.get(position);
        holder.type.setText(s.getType());
        holder.name.setText(s.getName());
        holder.cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(holder.cb.isChecked()){
                    if(s.getName().equals("fever"));
                    diagnostic.setChamp1("fever");

                    if(s.getName().equals("dry cough"));
                    diagnostic.setChamp2("dry cough");

                    if(s.getName().equals("tiredness"));
                    diagnostic.setChamp3("tiredness");

                    if(s.getName().equals("aches and pains"));
                    diagnostic.setChamp4("aches and pains");

                    if(s.getName().equals("sore throat"));
                    diagnostic.setChamp5("sore throat");

                    if(s.getName().equals("diarrhoea"));
                    diagnostic.setChamp6("diarrhoea");
                    if(s.getName().equals("conjunctivitis"));
                    diagnostic.setChamp7("conjunctivitis");
                    if(s.getName().equals("headache"));
                    diagnostic.setChamp8("headache");
                    if(s.getName().equals("loss of taste or smell"));
                    diagnostic.setChamp9("loss of taste or smell");
                    if(s.getName().equals("a rash on skin, or discoluration of fingers or toes"));
                    diagnostic.setChamp10("a rash on skin, or discoluration of fingers or toes");
                    if(s.getName().equals("difficulty breathing or shortness of breath"));
                    diagnostic.setChamp11("difficulty breathing or shortness of breath");
                    if(s.getName().equals("chest pain or pressure"));
                    diagnostic.setChamp12("chest pain or pressure");
                    if(s.getName().equals("loss of speech or movement"));
                    diagnostic.setChamp13("loss of speech or movement");
                }
                System.out.println(diagnostic.toString());
            }
        });

        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(diagnostic.toString());
            }
        });



    }

    @Override
    public int getItemCount() {
        return stList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView type,name;

        public CheckBox cb;

        public MyViewHolder(View view) {
            super(view);
            type= view.findViewById(R.id.tx1);
            name= view.findViewById(R.id.tx2);

            cb=view.findViewById(R.id.ch1);

        }
    }

}