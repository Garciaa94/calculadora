package com.pucese.micalculadora.presenter;

import com.pucese.micalculadora.interactor.MainActivityInteractorImpl;
import com.pucese.micalculadora.interactor.MainActivityinteractor;
import com.pucese.micalculadora.view.MainActivityView;

public class MainActivityPresenterImpl implements MainActivityPresenter{
    private MainActivityView activityView;
    private MainActivityinteractor interactor;

    public MainActivityPresenterImpl(MainActivityView activityView){
        this.activityView=activityView;
        interactor=new MainActivityInteractorImpl(this);
    }


    @Override
    public void showResult(String result) {
        activityView.showResult(result);
    }

    @Override
    public void showerror(String error) {
        activityView.showerror(error);

    }

    public void suma(String number1,String number2){
            interactor.suma(number1,number2);
    }

    @Override
    public void areaT(String number1, String number2) {
        interactor.areaT(number1,number2);
    }

    @Override
    public void limpiar(String number1, String number2) {
        interactor.limpiar(number1,number2);

    }

}
