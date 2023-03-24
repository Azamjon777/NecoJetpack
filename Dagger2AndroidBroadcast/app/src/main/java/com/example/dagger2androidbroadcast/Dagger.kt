package com.example.dagger2androidbroadcast

import com.example.dagger2androidbroadcast.data.NewsRepository
import com.example.dagger2androidbroadcast.data.NewsRepositoryImpl
import com.example.dagger2androidbroadcast.data.NewsService
import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Qualifier

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
    fun inject(fragment: NewsDetailsFragment)
}

@Module(includes = [NetworkModule::class, AppBindModule::class])
class AppModule

@Module
class NetworkModule {

    @Provides
    fun provideProductionNewsService(): NewsService {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://androidbrodcast.dev")
            .build()
        return retrofit.create()
    }

    @Provides
    @Stage
    fun provideStageNewsService(): NewsService {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://stage.androidbrodcast.dev")
            .build()
        return retrofit.create()
    }
}

@Module
interface AppBindModule {

    @Suppress("FunctionName")
    @Binds
    fun bindNewsRepositoryImpl_to_NewsRepository(
        newsRepositoryImpl: NewsRepositoryImpl
    ): NewsRepository
}

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Prod


@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Stage