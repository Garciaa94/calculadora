package com.pucese.micalculadora.presenter;

public interface MainActivityPresenter {
    void suma(String number1,String number2);
    void areaT(String number1,String number2);
    void limpiar(String number1,String number2);
    void showResult(String result);
    void showerror(String error);
}
