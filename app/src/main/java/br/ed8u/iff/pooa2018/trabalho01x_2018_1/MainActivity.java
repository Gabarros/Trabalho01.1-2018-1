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
    private TextView tvNLatas;
    private TextView tvNGaloes;

    public void calcular(){
        float lata_de_tinta;
        float galao_de_tinta;

        galao_de_tinta = (float) 3.6;

        float area = Float.parseFloat(etArea.getText().toString());
        float resultado;
        float preco;
        lata_de_tinta = (float) 18.0;

        switch (rgPrincipal.getCheckedRadioButtonId()){
            case R.id.rb1:
                resultado = area / (lata_de_tinta * 6);
                resultado = (float) Math.ceil(resultado);
                preco = (resultado * 80);

                tvResultado.setText(String.valueOf(preco));
                tvNLatas.setText(String.valueOf(resultado));
                tvNGaloes.setText("0");
                break;

            case R.id.rb2:

                resultado = area / (galao_de_tinta * 6);
                resultado = (float) Math.ceil(resultado);
                preco = resultado * 25;

                tvResultado.setText(String.valueOf(preco));
                tvNGaloes.setText(String.valueOf(resultado));
                tvNLatas.setText("0");
            case R.id.rb3:

                break;

        }

    }

    public void limpar(){
        etArea.setText("");
        tvResultado.setText("R$ 00,00");
        tvNGaloes.setText("0");
        tvNLatas.setText("0");
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
        tvNLatas = (TextView) findViewById(R.id.tvNLatas);
        tvNGaloes = (TextView) findViewById(R.id.tvNGaloes);

        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if (rgPrincipal.isSelected()){

                  calcular();

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
