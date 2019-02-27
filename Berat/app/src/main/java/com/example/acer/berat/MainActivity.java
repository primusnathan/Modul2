package com.example.acer.berat;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText edittinggi, editpria, editwanita;
    private Button btnOk;
    private TextView txttinggi, txtpria, txtwanita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        initEvent();
    }
    private void initUI(){
        edittinggi = (EditText) findViewById(R.id.edittinggi);
        txtpria = (TextView)findViewById(R.id.txtpria);
        txtwanita = (TextView)findViewById(R.id.txtwanita);
        editwanita = (EditText)findViewById(R.id.editwanita);
        editpria = (EditText)findViewById(R.id.editpria);
        editwanita = (EditText)findViewById(R.id.editwanita);
        btnOk = (Button)findViewById(R.id.btnOk);

    }
    private void initEvent(){
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungPria();
                hitungWanita();

            }
        });
    }
    private void hitungPria(){
        int tinggi = Integer.parseInt(edittinggi.getText().toString());
        double pria = (tinggi-100)-((tinggi-100)*0.1);
        editpria.setText(pria+"");

    }
    private void hitungWanita(){
        int tinggi = Integer.parseInt(edittinggi.getText().toString());
        double wanita = (tinggi-100)-((tinggi-100)*0.15);
        editwanita.setText(wanita+"");
    }
}
