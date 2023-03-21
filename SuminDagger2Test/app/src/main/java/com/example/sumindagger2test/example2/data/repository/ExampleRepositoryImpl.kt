package com.example.sumindagger2test.example2.data.repository

import com.example.sumindagger2test.example2.data.datasource.ExampleLocalDataSource
import com.example.sumindagger2test.example2.data.datasource.ExampleRemoteDataSource
import com.example.sumindagger2test.example2.data.mapper.ExampleMapper
import com.example.sumindagger2test.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper,
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }

}