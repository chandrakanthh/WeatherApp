package com.example.weathercomb.ui.home

import dagger.Module
import dagger.Provides
import com.example.weathercomb.di.qualifiers.ViewModelInjection
import com.example.weathercomb.di.InjectionViewModelProvider

@Module
class HomeModule {

    @Provides
    @ViewModelInjection
    fun providehomeVM(
        fragment: homeFragment,
        viewModelProvider: InjectionViewModelProvider<HomeVM>
    ): HomeVM = viewModelProvider.get(fragment)
}