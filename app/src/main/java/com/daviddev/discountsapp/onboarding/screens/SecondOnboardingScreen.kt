package com.daviddev.discountsapp.onboarding.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.daviddev.discountsapp.R

class SecondOnboardingScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_onboarding_second, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.sliderViewPager)

        /*view.next.setOnClickListener {
            viewPager?.currentItem = 2
        }*/
        return view
    }
}