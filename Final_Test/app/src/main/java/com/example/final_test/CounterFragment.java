package com.example.final_test;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class CounterFragment extends Fragment {

    private Button minusButton, resetButton, plusButton;
    private TextView counterView;
    SharedPreferences sharedPreferences;
    private Integer number;

    private static final String SHARED_PREF_NAME = "mypref";





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_counter, container, false);
        sharedPreferences = getActivity().getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        number = sharedPreferences.getInt("num",0);
        editor.putInt("num",number);




        counterView = v.findViewById(R.id.counter_text);
        minusButton = v.findViewById(R.id.minus_button);
        resetButton = v.findViewById(R.id.reset_button);
        plusButton = v.findViewById(R.id.plus_button);

        counterView.setText(number.toString());

//        Log.d("LOG",String.valueOf(counterView));

        minusButton.setOnClickListener(view -> {
            number -= 1;
            counterView.setText(number.toString());
            editor.putInt("num", number) ;
            editor.apply();
        });

        resetButton.setOnClickListener(view -> {

           number = 0;
           counterView.setText(number.toString());
            editor.putInt("num",number);
            editor.apply();
        });

        plusButton.setOnClickListener(view-> {
            number++;
            counterView.setText(number.toString());
            editor.putInt("num",number);
            editor.apply();
        });

        return v;

    }

}