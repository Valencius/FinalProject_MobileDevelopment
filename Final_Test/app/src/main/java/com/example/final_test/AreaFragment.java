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

public class AreaFragment extends Fragment {

    private Button CalculateSquare,CalculateTriangle, CalculateCircle;
    private EditText ETsquare1,ETsquare2,ETtriangle1,ETtriangle2,ETcircle;
    private TextView AnswerSquare,AnswerTriangle,AnswerCircle;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_area, container, false);

        CalculateCircle = v.findViewById(R.id.circle_btn);
        CalculateSquare = v.findViewById(R.id.square_btn);
        CalculateTriangle = v.findViewById(R.id.triangle_btn);
        ETsquare1 = v.findViewById(R.id.etSquare_1);
        ETsquare2 = v.findViewById(R.id.etSquare_2);
        ETtriangle1 = v.findViewById(R.id.etTriangle_1);
        ETtriangle2 = v.findViewById(R.id.etTriangle_2);
        ETcircle = v.findViewById(R.id.etCircle_1);
        AnswerSquare = v.findViewById(R.id.FieldSquare_ans);
        AnswerCircle = v.findViewById(R.id.FieldCircle_ans);
        AnswerTriangle = v.findViewById(R.id.FieldTriangle_ans);

        CalculateSquare.setOnClickListener(view -> {
            String number1 = ETsquare1.getText().toString();
            String number2 = ETsquare2.getText().toString();

            if(number1.isEmpty() || number2.isEmpty()){
                Toast.makeText(getActivity(), "All Field must be filled", Toast.LENGTH_SHORT).show();
            }else if(number1.contains("-") || number2.contains("-")){
                Toast.makeText(getActivity(), "Number must be Positive", Toast.LENGTH_SHORT).show();
            }else{
                Integer no1 = Integer.parseInt(number1);
                Integer no2 = Integer.parseInt(number2);
                Integer total = no1 * no2;
                String totalV = Integer.toString(total);
                AnswerSquare.setText(totalV);
            }
        });

        CalculateTriangle.setOnClickListener(view -> {
            String number1tri = ETtriangle1.getText().toString();
            String number2tri = ETtriangle2.getText().toString();

            if(number1tri.isEmpty() || number2tri.isEmpty()){
                Toast.makeText(getActivity(), "All Field must be filled", Toast.LENGTH_SHORT).show();
            }else if(number1tri.contains("-") || number2tri.contains("-")){
                Toast.makeText(getActivity(), "Number must be Positive", Toast.LENGTH_SHORT).show();
            }else{
                float no1 = Float.parseFloat(number1tri);
                float no2 = Float.parseFloat(number2tri);
                float total = no1 * no2/2;
                String totalV = Float.toString(total);
                AnswerTriangle.setText(totalV);
            }
        });

        CalculateCircle.setOnClickListener(view -> {
            String number1cir = ETcircle.getText().toString();

            if(number1cir.isEmpty()){
                Toast.makeText(getActivity(), "All Field must be filled", Toast.LENGTH_SHORT).show();
            }else if(number1cir.contains("-")){
                Toast.makeText(getActivity(), "Number must be Positive", Toast.LENGTH_SHORT).show();
            }else{
                float no1 = Float.parseFloat(number1cir);
                float total = no1 * 22/7;
                String totalV = Float.toString(total);
                AnswerCircle.setText(totalV);
            }
        });

        return v;
    }
}