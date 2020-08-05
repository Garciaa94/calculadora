package com.pucese.micalculadora.view;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.pucese.micalculadora.R;
import com.pucese.micalculadora.presenter.MainActivityPresenter;
import com.pucese.micalculadora.presenter.MainActivityPresenterImpl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainActivityView
{
    private MainActivityPresenter presenter;
    private EditText editText1;
    private EditText editText2;
    private TextView tvResul;
    private Button btnborrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText) findViewById(R.id.edtNumbre1);
        editText2=(EditText) findViewById(R.id.edtNumbre2);
        tvResul=(TextView) findViewById(R.id.tvResult);
        presenter=new MainActivityPresenterImpl(this);


      /*  btnborrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                editText1.setText("");
                editText2.setText("");
            }
        });*/


    }
    public void suma (View view){
        String number1=editText1.getText().toString();
        String number2=editText2.getText().toString();
        presenter.suma(number1,number2);


    }

    public void areaT (View view){
        String number1=editText1.getText().toString();
        String number2=editText2.getText().toString();
        presenter.areaT(number1,number2);


    }

    public void limpiar (View view){
        String number1=editText1.getText().toString();
        String number2=editText2.getText().toString();
        presenter.limpiar(number1,number2);

    }






    @Override
    public void showResult(String result) {
        tvResul.setText(result);
    }

    @Override
    public void showerror(String error) {
        tvResul.setText(error);
    }



}