package com.example.final_test;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class VolumeFragment extends Fragment {

    private Button CalculateCube,CalculatePyra, CalculateTube;
    private EditText ETcube1,ETcube2,ETpyra1,ETpyra2,ETtube1,ETcube3,ETpyra3,ETtube2;
    private TextView AnswerCube,AnswerPyra,AnswerTube;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_volume, container, false);


        CalculateCube = v.findViewById(R.id.cube_btn);
        CalculatePyra = v.findViewById(R.id.pyra_btn);
        CalculateTube = v.findViewById(R.id.tube_btn);
        ETcube1 = v.findViewById(R.id.etCube_1);
        ETcube2 = v.findViewById(R.id.etCube_2);
        ETcube3 = v.findViewById(R.id.etCube_3);
        ETpyra1 = v.findViewById(R.id.etPyra_1);
        ETpyra2 = v.findViewById(R.id.etPyra_2);
        ETpyra3 = v.findViewById(R.id.etPyra_3);
        ETtube1 = v.findViewById(R.id.etTube_1);
        ETtube2 = v.findViewById(R.id.etTube_2);
        AnswerCube = v.findViewById(R.id.FieldCube_ans);
        AnswerPyra = v.findViewById(R.id.FieldPyra_ans);
        AnswerTube = v.findViewById(R.id.FieldTube_ans);

        CalculateCube.setOnClickListener(view -> {
            String number1 = ETcube1.getText().toString();
            String number2 = ETcube2.getText().toString();
            String number3 = ETcube3.getText().toString();

            if(number1.isEmpty() || number2.isEmpty() || number3.isEmpty()){
                Toast.makeText(getActivity(), "All Field must be filled", Toast.LENGTH_SHORT).show();
            }else if(number1.contains("-") || number2.contains("-") || number3.contains("-")){
                Toast.makeText(getActivity(), "Number must be Positive", Toast.LENGTH_SHORT).show();
            }else{
                Integer no1 = Integer.parseInt(number1);
                Integer no2 = Integer.parseInt(number2);
                Integer no3 = Integer.parseInt(number3);
                Integer total = no1 * no2 * no3;
                String totalV = Integer.toString(total);
                AnswerCube.setText(totalV);
            }
        });

        CalculatePyra.setOnClickListener(view -> {
            String number1pyra = ETpyra1.getText().toString();
            String number2pyra = ETpyra2.getText().toString();
            String number3pyra = ETpyra3.getText().toString();

            if(number1pyra.isEmpty() || number2pyra.isEmpty() || number3pyra.isEmpty()){
                Toast.makeText(getActivity(), "All Field must be filled", Toast.LENGTH_SHORT).show();
            }else if(number1pyra.contains("-") || number2pyra.contains("-") || number3pyra.contains("-")){
                Toast.makeText(getActivity(), "Number must be Positive", Toast.LENGTH_SHORT).show();
            }else{
                float no1 = Float.parseFloat(number1pyra);
                float no2 = Float.parseFloat(number2pyra);
                float no3 = Float.parseFloat(number3pyra);
                float total = no1 * no2 * no3 *1/3;
                String totalV = Float.toString(total);
                AnswerPyra.setText(totalV);
            }
        });

        CalculateTube.setOnClickListener(view -> {
            String number1tube = ETtube1.getText().toString();
            String number2tube = ETtube1.getText().toString();

            if(number1tube.isEmpty() || number2tube.isEmpty()){
                Toast.makeText(getActivity(), "All Field must be filled", Toast.LENGTH_SHORT).show();
            }else if(number1tube.contains("-") || number2tube.contains("-")){
                Toast.makeText(getActivity(), "Number must be Positive", Toast.LENGTH_SHORT).show();
            }else{
                float no1 = Float.parseFloat(number1tube);
                float no2 = Float.parseFloat(number2tube);
                float total = no1 * no2 *  22/7;
                String totalV = Float.toString(total);
                AnswerTube.setText(totalV);
            }
        });

        return v;
    }
}