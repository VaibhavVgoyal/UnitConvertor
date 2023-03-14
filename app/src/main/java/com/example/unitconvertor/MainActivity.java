package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt, txt2;
    Button btn;
    EditText edt;
    Double kilos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        edt = findViewById(R.id.editText);
        txt = findViewById(R.id.textView);
        txt2 = findViewById(R.id.textView2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kilos = Double.parseDouble(edt.getText().toString());
                txt.setText( ""+converter(kilos) );
            }
        });
    }
    public Double converter( Double kilos){
        Double ans = 1000*kilos;
        return ans;
    }

}