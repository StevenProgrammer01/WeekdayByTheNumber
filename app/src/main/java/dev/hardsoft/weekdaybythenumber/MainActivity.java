package dev.hardsoft.weekdaybythenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //My Code
        Spinner spinner = (Spinner)findViewById(R.id.spinner1);
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(1,2,3,4,5,6,7)
        );
        ArrayAdapter adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,numbers);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Integer number = (Integer) spinner.getAdapter().getItem(i);
                Toast.makeText(MainActivity.this, "Seleccionaste:"+number,Toast.LENGTH_SHORT).show();
                weekday(number);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    public void spinner(View view){
        Spinner spinner = (Spinner)findViewById(R.id.spinner1);
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(1,2,3,4,5,6,7)
        );
        ArrayAdapter adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,numbers);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Integer number = (Integer) spinner.getAdapter().getItem(i);
                Toast.makeText(MainActivity.this, "Seleccionaste:"+number,Toast.LENGTH_SHORT).show();
                weekday(number);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
    public void weekday(Integer number){
        TextView Weekday = findViewById(R.id.weekday);
        String day = " ";
        switch(number){
            case 1:
                day = "Lunes";
                break;
            case 2:
                day = "Martes";
                break;
            case 3:
                day = "Miercoles";
                break;
            case 4:
                day = "Jueves";
                break;
            case 5:
                day = "Viernes";
                break;
            case 6:
                day = "Sábado";
                break;
            case 7:
                day = "Domingo";
                break;
            default:
                Toast.makeText(MainActivity.this, "Número fuera de rango", Toast.LENGTH_SHORT).show();

        }
        Weekday.setText(day);


    }
}