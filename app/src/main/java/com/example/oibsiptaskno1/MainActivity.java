package com.example.oibsiptaskno1;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;







public class MainActivity extends AppCompatActivity {

    public void OnConverterClick(View view){

        EditText editText = findViewById(R.id.editTextNumber);
        String inputInString = editText.getText().toString();
        Double inputInDouble = Double.parseDouble(inputInString);
        Double outputInFahrenheit = inputInDouble*1000;
        Snackbar.make(view, "Unit in " + inputInDouble + "Kilogram is " + outputInFahrenheit
                + " in Gram " ,Snackbar.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}