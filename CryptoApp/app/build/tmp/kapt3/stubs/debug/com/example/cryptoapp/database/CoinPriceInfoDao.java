package com.example.cryptoapp.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0003H\'J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\'\u00a8\u0006\f"}, d2 = {"Lcom/example/cryptoapp/database/CoinPriceInfoDao;", "", "getPriceInfoAboutCoin", "Landroidx/lifecycle/LiveData;", "Lcom/example/cryptoapp/pojo/CoinPriceInfo;", "fSym", "", "getPriceList", "", "insertPriceList", "", "priceList", "app_debug"})
public abstract interface CoinPriceInfoDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM full_price_list ORDER BY lastUpdate")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.cryptoapp.pojo.CoinPriceInfo>> getPriceList();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM full_price_list WHERE fromSymbol == :fSym LIMIT 1")
    public abstract androidx.lifecycle.LiveData<com.example.cryptoapp.pojo.CoinPriceInfo> getPriceInfoAboutCoin(@org.jetbrains.annotations.NotNull()
    java.lang.String fSym);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertPriceList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.cryptoapp.pojo.CoinPriceInfo> priceList);
}