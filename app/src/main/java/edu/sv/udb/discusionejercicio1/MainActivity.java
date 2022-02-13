package edu.sv.udb.discusionejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edt1;
    private EditText edt2;
    private TextView txtV1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        txtV1 = findViewById(R.id.txtV1);
    }

    public void calcular(View view){
        String valor1 = edt1.getText().toString();
        String valor2 = edt2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        if (num1%num2 == 0){
            txtV1.setText("el numero " + num1 + " es divisible entre el " + num2);
        }else{
            txtV1.setText("el numero " + num1 + " no es divisible entre el " + num2);
        }


    }
}