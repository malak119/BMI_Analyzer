package com.malakibQq.myapplication;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import java.util.Calendar;

public class CompleteInfo extends AppCompatActivity {
    Button save;
    EditText editDate;
    Button plus1;
    Button minus1;
    Button plus2;
    Button minus2;
    EditText number;
    EditText number2;
    int count=0;
    int old=0;
    int current=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_info);

        editDate=findViewById(R.id.editTextDate);
        plus1=findViewById(R.id.plus1);
        minus1=findViewById(R.id.minus1);
        plus2=findViewById(R.id.plus2);
        minus2=findViewById(R.id.minus2);
        number=findViewById(R.id.weight);
        number2=findViewById(R.id.length);

        Calendar calendar= Calendar.getInstance();

        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        //To set the date

        editDate.setOnClickListener(v -> {
            DatePickerDialog datePickerDialog = new DatePickerDialog(CompleteInfo.this, (view, year1, month1, day1) -> {
               month1 = month1 +1;
                String date = day1 +"/"+ month1 +"/"+ year1;
                editDate.setText(date); },year,month,day);
            datePickerDialog.show(); });


        plus1.setOnClickListener(view -> {
            count = count+1;
            old=Integer.parseInt(number.getText().toString());
            current=old+count;
            number.setText(""+current);
            current=0;
            old=0;
            count=0;

        });
        minus1.setOnClickListener(view -> {
            count=count-1;
            old=Integer.parseInt(number.getText().toString());
            current=old+count;
            number.setText(""+current);
            current=0;
            old=0;
            count=0;

        });

        plus2.setOnClickListener(view -> {
            count=count+1;
            old=Integer.parseInt(number2.getText().toString());
            current=old+count;
            number2.setText(""+current);
            current=0;
            old=0;
            count=0;

        });
        minus2.setOnClickListener(view -> {
            count=count-1;
            old=Integer.parseInt(number2.getText().toString());
            current=old+count;
            number2.setText(""+current);
            current=0;
            old=0;
            count=0;

        });


        save = findViewById(R.id.saveButton);
        save.setOnClickListener(v -> {
            Intent intent= new Intent(CompleteInfo.this,HomeActivity.class);
            startActivity(intent); });
    }
}