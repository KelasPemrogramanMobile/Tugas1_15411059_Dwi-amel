package com.example.cathlineadelia.tugas_dwi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edNama) EditText edNama;
    @BindView(R.id.edNpm) EditText edNpm;
    @BindView(R.id.edNilaiTugas) EditText edNilaiTugas;
    @BindView(R.id.edQuiz) EditText edQuiz;
    @BindView(R.id.edUts) EditText edUts;
    @BindView(R.id.edUas) EditText edUas;

    @BindView(R.id.txtLihat1) TextView txtlihat1;
    @BindView(R.id.txtLihat2) TextView txtlihat2;
    @BindView(R.id.txtLihat3) TextView txtlihat3;
    @BindView(R.id.txtLihat4) TextView txtlihat4;
    @BindView(R.id.txtLihat5) TextView txtlihat5;
    @BindView(R.id.txtLihat6) TextView txtlihat6;

    @OnClick(R.id.btnSave)
    void Save (){
        String nama = edNama.getText().toString();
        String npm = edNpm.getText().toString();
        String nilaitugas = edNilaiTugas.getText().toString();
        String nilaiquiz = edQuiz.getText().toString();
        String nilaiuts = edUts.getText().toString();
        String nilaiuas = edUas.getText().toString();
        txtlihat1.setText(nama);
        txtlihat2.setText(npm);
        txtlihat3.setText(nilaitugas);
        txtlihat4.setText(nilaiquiz);
        txtlihat5.setText(nilaiuts);
        txtlihat6.setText(nilaiuas);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
