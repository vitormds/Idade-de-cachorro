package idadedecachorro.cursoandroid.com.idadedecachorro;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixatexto;
    private Button botaoIdade;
    private TextView resultadoIdade;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixatexto = (EditText) findViewById(R.id.caixatextoid);
        botaoIdade = (Button) findViewById(R.id.botaoidadeid);
        resultadoIdade = (TextView) findViewById(R.id.resultadoidade);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                caixatexto.getText();

                String textoDigitado = caixatexto.getText().toString();
                if ( textoDigitado.isEmpty()){

                    resultadoIdade.setText("Digite Um número");

                }else{

                    int vlDigitado = Integer.parseInt(textoDigitado);
                    int resul = vlDigitado * 7;
                    resultadoIdade.setText( "A idade do cachorro: "+resul);
                }
            }
        });
    }
}
