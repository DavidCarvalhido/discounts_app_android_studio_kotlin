package com.daviddev.discountsapp.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.daviddev.discountsapp.R
import com.daviddev.discountsapp.onboarding.screens.FirstOnboardingScreen
import com.daviddev.discountsapp.onboarding.screens.SecondOnboardingScreen
import com.daviddev.discountsapp.onboarding.screens.ThirdOnboardingScreen

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_onboarding, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FirstOnboardingScreen(),
            SecondOnboardingScreen(),
            ThirdOnboardingScreen()
        )

        val adapter = ViewPagerAdapter(fragmentList, requireActivity().supportFragmentManager, lifecycle)

        //view.sliderViewPager.adapter = adapter

        return view
    }
}