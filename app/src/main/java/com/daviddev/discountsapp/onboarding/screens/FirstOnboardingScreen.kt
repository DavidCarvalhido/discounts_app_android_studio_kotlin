package com.daviddev.discountsapp.onboarding.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.daviddev.discountsapp.R

class FirstOnboardingScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_onboarding_first, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.textView)

        /*view.next.setOnClickListener {
            viewPager?.currentItem = 1
        }*/
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}