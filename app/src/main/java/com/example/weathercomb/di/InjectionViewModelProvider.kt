package com.example.weathercomb.di


import androidx.lifecycle.ViewModel
import javax.inject.Inject

class InjectionViewModelProvider<VM : ViewModel> @Inject constructor(
    private val lazyViewModel: dagger.Lazy<VM>
) {

}