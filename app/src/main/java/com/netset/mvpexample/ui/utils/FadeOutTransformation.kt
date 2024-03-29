package com.netset.mvpexample.ui.utils

import android.view.View

import androidx.viewpager.widget.ViewPager

class FadeOutTransformation : ViewPager.PageTransformer {
    override fun transformPage(page: View, position: Float) {

        page.translationX = -position * page.width

        page.alpha = 1 - Math.abs(position)


    }
}