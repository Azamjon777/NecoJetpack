package com.example.cryptoapp.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006H\'J,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\u0006H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/cryptoapp/api/ApiService;", "", "getFullPriceList", "Lio/reactivex/Single;", "Lcom/example/cryptoapp/pojo/CoinPriceInfoRawData;", "apiKey", "", "fSyms", "tSyms", "getTopCoinsInfo", "Lcom/example/cryptoapp/pojo/CoinInfoListOfData;", "limit", "", "tSym", "Companion", "app_debug"})
public abstract interface ApiService {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.cryptoapp.api.ApiService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "top/totalvolfull")
    public abstract io.reactivex.Single<com.example.cryptoapp.pojo.CoinInfoListOfData> getTopCoinsInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "tsym")
    java.lang.String tSym);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "pricemultifull")
    public abstract io.reactivex.Single<com.example.cryptoapp.pojo.CoinPriceInfoRawData> getFullPriceList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "fsyms")
    java.lang.String fSyms, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "tsyms")
    java.lang.String tSyms);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/cryptoapp/api/ApiService$Companion;", "", "()V", "CURRENCY", "", "QUERY_PARAM_API_KEY", "QUERY_PARAM_FROM_SYMBOLS", "QUERY_PARAM_LIMIT", "QUERY_PARAM_TO_SYMBOL", "QUERY_PARAM_TO_SYMBOLS", "app_debug"})
    public static final class Companion {
        private static final java.lang.String QUERY_PARAM_API_KEY = "api_key";
        private static final java.lang.String QUERY_PARAM_LIMIT = "limit";
        private static final java.lang.String QUERY_PARAM_TO_SYMBOL = "tsym";
        private static final java.lang.String QUERY_PARAM_TO_SYMBOLS = "tsyms";
        private static final java.lang.String QUERY_PARAM_FROM_SYMBOLS = "fsyms";
        private static final java.lang.String CURRENCY = "USD";
        
        private Companion() {
            super();
        }
    }
}