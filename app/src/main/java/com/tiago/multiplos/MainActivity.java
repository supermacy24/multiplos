package com.tiago.multiplos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verify(View view) {


        //--------------------SACA O TEXTO DO EDITTEXT---------------------//
        EditText texto = (EditText) findViewById(R.id.numero);
        String n = (texto.getText().toString()); //------------------------GUARDA O VALOR NUMA STRING


        if (n.matches("")) {
            TextView textView1 = (TextView) findViewById(R.id.textView3);
            textView1.setText("Por favor insira um número");
        } else {
            int numero = Integer.parseInt(n); //--------------------------------PASSA DE STRING PARA INT

            //--------------------CARREGA O TEXTO NA TEXTVIEW-----------------//
            //TextView textView = (TextView) findViewById(R.id.textView3);
            //textView.setText("O seu número é múltiplo de" + numero);


            int i = 0;
            int[] mul= new int[i];
            for (i = 1; i <= numero; i++) {



                    if (numero % i == 0) {


                        System.out.println(i);
                        System.out.println(mul);
                    }
                TextView textView = (TextView) findViewById(R.id.textView3);
                textView.setText("O seu número é múltiplo de " + mul[i] );


            }


            // public void multiplos(){}
        }
    }
}
