package id.sch.smktelkom_mlg.tugas01.xirpl5004.reg_swimclub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    EditText etAl;
    RadioButton rbP, rbL;
    CheckBox cbBebas, cbDada, cbPunggung, cbKupu;
    Spinner spU;
    Button bOk;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editName);
        etAl = (EditText) findViewById(R.id.editAl);
        rbP = (RadioButton) findViewById(R.id.radioButtonP);
        rbL = (RadioButton) findViewById(R.id.radioButtonL);
        cbBebas = (CheckBox) findViewById(R.id.checkBoxBebas);
        cbDada   =   (CheckBox) findViewById(R.id.checkBoxDada);
        cbPunggung   =   (CheckBox) findViewById(R.id.checkBoxPunggung);
        cbKupu   =   (CheckBox) findViewById(R.id.checkBoxKupu);
        spU   =   (Spinner) findViewById(R.id.spinnerUsia);
        bOk =   (Button) findViewById(R.id.buttonOk);
        tvResult = (TextView) findViewById(R.id.textViewResult);

    }
}
