package id.sch.smktelkom_mlg.tugas01.xirpl5004.reg_swimclub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editNama);
        etAl = (EditText) findViewById(R.id.editAl);
        rbP = (RadioButton) findViewById(R.id.radioButtonP);
        rbL = (RadioButton) findViewById(R.id.radioButtonL);
        cbBebas = (CheckBox) findViewById(R.id.checkBoxBebas);
        cbDada   =   (CheckBox) findViewById(R.id.checkBoxDada);
        cbPunggung   =   (CheckBox) findViewById(R.id.checkBoxPunggung);
        cbKupu   =   (CheckBox) findViewById(R.id.checkBoxKupu);
        spU   =   (Spinner) findViewById(R.id.spinnerUsia);
        bOk =   (Button) findViewById(R.id.buttonOk);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = etNama.getText().toString();
                String al = etAl.getText().toString();

                String jk = null;
                if (rbP.isChecked()) {
                    jk = rbP.getText().toString();
                }
                else if(rbL.isChecked()) {
                    jk = rbL.getText().toString();
                }

                String gy = "\nGaya yang dikuasai:\n";
                int lengy = gy.length();
                if (cbBebas.isChecked()) gy+=cbBebas.getText() + "\n";
                if (cbDada.isChecked()) gy+=cbDada.getText() + "\n";
                if (cbPunggung.isChecked()) gy+=cbPunggung.getText() + "\n";
                if (cbKupu.isChecked()) gy+=cbKupu.getText() + "\n";

                if (nama == null || al == null || jk == null || gy == null) {
                    tvHasil.setText("Form ada yang belum terisi!");
                }
                else {
                    tvHasil.setText("Selamat! Anda berhasil bergabung. Data Anda:" + "\nNama: " + nama + " \nAlamat: " + al + "\nJenis Kelamin: " + jk + " \nKelompok Usia: " + spU.getSelectedItem().toString() + gy);
                }
            }
        });

    }
}
