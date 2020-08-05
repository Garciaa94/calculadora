package com.pucese.micalculadora.interactor;

import com.pucese.micalculadora.presenter.MainActivityPresenter;

public class MainActivityInteractorImpl implements MainActivityinteractor {
private MainActivityPresenter presenter;


    public MainActivityInteractorImpl(MainActivityPresenter presenter){
        this.presenter=presenter;
    }
    @Override
    public void suma(String number1, String number2) {
        Double resultado=Double.valueOf(number1)+Double.valueOf(number2);
        presenter.showResult(String.valueOf(resultado));
    }


    public void areaT(String number1, String number2) {
        Double resultado = ((Double.valueOf(number1))*(Double.valueOf(number2)))/2;
        presenter.showResult(String.valueOf(resultado));
    }

    @Override
    public void limpiar(String number1, String number2) {
        Double resultado = 0.0;
        presenter.showResult(String.valueOf(resultado));
    }
}
