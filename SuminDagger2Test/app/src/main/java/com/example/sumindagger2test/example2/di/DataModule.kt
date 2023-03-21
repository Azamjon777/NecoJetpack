package com.example.sumindagger2test.example2.di

import com.example.sumindagger2test.example2.data.datasource.ExampleLocalDataSource
import com.example.sumindagger2test.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.sumindagger2test.example2.data.datasource.ExampleRemoteDataSource
import com.example.sumindagger2test.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {
//abstract class DataModule {
//класс преобразовали в интерфейс так как, здесь содержатся методы без реализации

    //если нужно доставить реализацию для интерфеса, предпочтительней способ снизу с исп-ем @Binds
    //а не @Provides
    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}