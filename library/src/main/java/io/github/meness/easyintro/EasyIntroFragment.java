/*
 * Copyright 2016 Alireza Eskandarpour Shoferi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.meness.easyintro;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import io.github.meness.easyintro.enums.SlideTransformer;
import io.github.meness.easyintro.enums.ToggleIndicators;

public class EasyIntroFragment extends Fragment implements IEasyIntro {

    @Override
    public void withTranslucentStatusBar(boolean b) {
        getEasyIntro().withTranslucentStatusBar(b);
    }

    public final EasyIntro getEasyIntro() {
        return (EasyIntro) getContext();
    }

    @Override
    public void withPageIndicator(boolean b) {
        getEasyIntro().withPageIndicator(b);
    }

    @Override
    public void withStatusBarColor(@ColorInt int statusBarColor) {
        getEasyIntro().withStatusBarColor(statusBarColor);
    }

    @Override
    public void withNextSlide() {
        getEasyIntro().withNextSlide();
    }

    @Override
    public void withPreviousSlide() {
        getEasyIntro().withPreviousSlide();
    }

    @Override
    public void withSlideTo(int page) {
        getEasyIntro().withSlideTo(page);
    }

    @Override
    public Fragment getCurrentSlide() {
        return getEasyIntro().getCurrentSlide();
    }

    @Override
    public void withOffScreenPageLimit(int limit) {
        getEasyIntro().withOffScreenPageLimit(limit);
    }

    @Override
    public void withTransparentStatusBar(boolean b) {
        getEasyIntro().withTransparentStatusBar(b);
    }

    @Override
    public void withTransparentNavigationBar(boolean b) {
        getEasyIntro().withTransparentNavigationBar(b);
    }

    @Override
    public void withFullscreen(boolean b) {
        getEasyIntro().withFullscreen(b);
    }

    @Override
    public void withTranslucentNavigationBar(boolean b) {
        getEasyIntro().withTranslucentNavigationBar(b);
    }

    @Override
    public void withSlide(Fragment slide) {
        getEasyIntro().withSlide(slide);
    }

    @Override
    public void withSlideTransformer(SlideTransformer transformer) {
        getEasyIntro().withSlideTransformer(transformer);
    }

    @Override
    public boolean isRightIndicatorVisible() {
        return getEasyIntro().isRightIndicatorVisible();
    }

    @Override
    public void withRightIndicatorDisabled(boolean b) {
        getEasyIntro().withRightIndicatorDisabled(b);
    }

    @Override
    public boolean isRightIndicatorDisabled() {
        return getEasyIntro().isRightIndicatorDisabled();
    }

    @Override
    public void withRemoveSlide(Class<? extends Fragment> aClass) {
        getEasyIntro().withRemoveSlide(aClass);
    }

    @Override
    public boolean isLeftIndicatorVisible() {
        return getEasyIntro().isLeftIndicatorVisible();
    }

    @Override
    public void withLeftIndicatorDisabled(boolean b) {
        getEasyIntro().withLeftIndicatorDisabled(b);
    }

    @Override
    public boolean isLeftIndicatorDisabled() {
        return getEasyIntro().isLeftIndicatorDisabled();
    }

    @Override
    public void withToggleIndicators(ToggleIndicators indicators) {
        getEasyIntro().withToggleIndicators(indicators);
    }

    @Override
    public void withSmoothScroll(boolean b) {
        getEasyIntro().withSmoothScroll(b);
    }

    @Override
    public boolean isSmoothScrollEnabled() {
        return getEasyIntro().isSmoothScrollEnabled();
    }

    @Override
    public void withVibrateOnSlide(int intensity) {
        getEasyIntro().withVibrateOnSlide(intensity);
    }

    @Override
    public void withVibrateOnSlide() {
        getEasyIntro().withVibrateOnSlide();
    }

    @Override
    public void withRtlSwipe() {
        getEasyIntro().withRtlSwipe();
    }

    @Override
    public void withPageMargin(int marginPixels) {
        getEasyIntro().withPageMargin(marginPixels);
    }

    @Override
    public int getPageMargin() {
        return getEasyIntro().getPageMargin();
    }

    @Override
    public void setPageMarginDrawable(Drawable d) {
        getEasyIntro().setPageMarginDrawable(d);
    }

    @Override
    public void setPageMarginDrawable(@DrawableRes int resId) {
        getEasyIntro().setPageMarginDrawable(resId);
    }

    @Override
    public void withToggleIndicatorsSound(boolean b) {
        getEasyIntro().withToggleIndicatorsSound(b);
    }

    @Override
    public void getIndicatorsContainerHeight(IndicatorsContainerHeight containerHeight) {

    }

    @Override
    public void withReplaceSlide(Fragment oldFragment, Fragment newFragment) {
        getEasyIntro().withReplaceSlide(oldFragment, newFragment);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getEasyIntro().getIndicatorsContainerHeight(new IndicatorsContainerHeight() {
            @Override
            public void call(int height) {
                getView().setPadding(0, 0, 0, height);
            }
        });
    }
}
