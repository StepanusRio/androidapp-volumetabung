package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
//    Deklarasi Variabel
    Button btnProcess;
    EditText etxtDiameter,etxtLuas,etxtTinggi,etxtVolume;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //    Mengambil Id Dalam Activity
        btnProcess = (Button) findViewById(R.id.btnProses);
        etxtDiameter= (EditText) findViewById(R.id.txtDiameter);
        etxtLuas = (EditText) findViewById(R.id.txtLuas);
        etxtTinggi= (EditText)findViewById(R.id.txtTinggi);
        etxtVolume= (EditText)findViewById(R.id.txtVolume);

        btnProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d,t,r, v,l;
                d = Double.parseDouble(etxtDiameter.getText().toString());
                t = Double.parseDouble(etxtTinggi.getText().toString());
                r = d/2.0 ;
                DecimalFormat df = new DecimalFormat("#.##");
                v = Math.PI * Math.pow(r,2) * t;
                String volume = df.format(v);
                etxtVolume.setText(volume);
//                Menghitung luas Alas
                double luasAlas = Math.PI * Math.pow(r,2);
                double luasSamping = 2 * Math.PI * r * t;
                l = luasAlas + luasSamping;
                String luas = df.format(l);
                etxtLuas.setText(luas);
            }
        });
    }
}