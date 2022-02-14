package com.example.weathercomb.di.components

import com.example.weathercomb.App
import dagger.BindsInstance
import dagger.Component


interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: App): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)

}