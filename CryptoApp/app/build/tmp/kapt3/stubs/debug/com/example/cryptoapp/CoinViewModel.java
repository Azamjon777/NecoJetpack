package com.example.cryptoapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0010H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lcom/example/cryptoapp/CoinViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "db", "Lcom/example/cryptoapp/database/AppDatabase;", "priceList", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/cryptoapp/pojo/CoinPriceInfo;", "getPriceList", "()Landroidx/lifecycle/LiveData;", "loadData", "", "onCleared", "app_debug"})
public final class CoinViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.cryptoapp.database.AppDatabase db = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.cryptoapp.pojo.CoinPriceInfo>> priceList = null;
    
    public CoinViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.cryptoapp.pojo.CoinPriceInfo>> getPriceList() {
        return null;
    }
    
    public final void loadData() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}