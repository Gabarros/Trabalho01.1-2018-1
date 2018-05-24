package br.ed8u.iff.pooa2018.trabalho01x_2018_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etArea;

    private RadioGroup rgPrincipal;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;

    private Button btOk;
    private Button btLimpar;

    private TextView tvResultado;


    public void calcular(){
        float lata_de_tinta;
        float galao_de_tinta;

        float area = Float.parseFloat(etArea.getText().toString());
        float resultado;
        float preco;

        lata_de_tinta = 18;
        galao_de_tinta = (float) 3.6;

        if (rb1.isChecked()){
            resultado = area / (galao_de_tinta * 6);
            resultado += 0.5;
            resultado = Math.round(resultado);
            preco = resultado * 80;

            tvResultado.setText(String.valueOf(preco));
        }

        if (rb2.isChecked()){
            resultado = area / (lata_de_tinta * 6);
            resultado += 0.5;
            resultado = Math.round(resultado);
            preco = resultado * 25;

            tvResultado.setText(String.valueOf(preco));
        }
        if (rb3.isChecked()){

        }
    }

    public void limpar(){
        etArea.setText("");
        tvResultado.setText("R$ 00,00");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etArea = (EditText) findViewById(R.id.etArea);

        rgPrincipal = (RadioGroup) findViewById(R.id.rgPrincipal);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb1);
        rb3 = (RadioButton) findViewById(R.id.rb3);

        btOk = (Button) findViewById(R.id.btOk);
        btLimpar = (Button) findViewById(R.id.btLimpar);

        tvResultado = (TextView) findViewById(R.id.tvResultado);

        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if (rgPrincipal.isSelected()){

                  calcular();
                  //  etArea.setText("funcionei");

               // }
            }
        });

        btLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpar();

            }
        });






    }


}
