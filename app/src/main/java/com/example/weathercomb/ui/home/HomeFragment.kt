package com.example.weathercomb.ui.home

import javax.inject.Inject
import com.example.weathercomb.R
import com.example.weathercomb.di.qualifiers.ViewModelInjection
import com.example.weathercomb.ui.base.BaseFragment

class HomeFragment : BaseFragment() {

    override fun layoutRes() = R.layout.fragment_home

    companion object {
        fun newInstance(): HomeFragment {
            return HomeFragment()
        }
    }

    @Inject
    @ViewModelInjection
    lateinit var viewModel: HomeVM

}