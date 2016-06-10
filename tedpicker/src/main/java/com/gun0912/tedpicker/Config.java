/*
 * Copyright (c) 2016. Ted Park. All Rights Reserved
 */

package com.gun0912.tedpicker;

import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;

/**
 * Created by jay on 3/5/15.
 */
public class Config {

    private int toolbarTitleRes = R.string.toolbar_title;
    private int selectedTitleRes = R.string.selected_image;
    private int noImageRes = R.string.no_image;

    private int tabBackgroundColor;
    private int tabSelectionIndicatorColor;

    private int selectedBottomColor;

    private int selectionLimit = Integer.MAX_VALUE;
    private int selectionMin = 0;

    private int cameraHeight = R.dimen.ted_picker_camera_height;

    private int cameraBtnImage = R.drawable.ic_camera;
    private int cameraBtnBackground = R.drawable.btn_bg;

    private int selectedCloseImage = R.drawable.ic_clear;
    private int selectedBottomHeight = R.dimen.ted_picker_selected_image_height;

    private int savedDirectoryName = R.string.default_directory;

    private int gridHorizontalSpacing = R.dimen.ted_picker_grid_horizontal_spacing;
    private int gridVerticalSpacing = R.dimen.ted_picker_grid_vertical_spacing;

    private boolean isSelectedCheckEnabled = false;

    private boolean isCameraEnabled = true;

    private int closeImageHeight = R.dimen.ted_picker_close_image_height;
    private int closeImageWidth = R.dimen.ted_picker_close_image_width;
    private int closeImageMargin = R.dimen.ted_picker_close_image_margin;

    private boolean layoutAnimationDisabled = false;
    private boolean flashOn = false;


    public boolean isCameraEnabled() {
        return isCameraEnabled;
    }

    public void setCameraEnabled(boolean isEnabled) {
       isCameraEnabled = isEnabled;
    }

    public boolean isSelectedCheckEnabled() {
        return isSelectedCheckEnabled;
    }

    public void setIsSelectedCheckEnabled(boolean isSelectedCheckEnabled) {
       this.isSelectedCheckEnabled = isSelectedCheckEnabled;
    }

    public int getCameraHeight() {
        return cameraHeight;
    }

    public void setCameraHeight(@DimenRes int dimenRes) {
        if (dimenRes <= 0)
            throw new IllegalArgumentException("Invalid value for cameraHeight");

        this.cameraHeight = dimenRes;
    }

    public int getSavedDirectoryName() {
        return savedDirectoryName;
    }

    public void setSavedDirectoryName(@StringRes int stringRes) {
        if (stringRes <= 0)
            throw new IllegalArgumentException("Invalid value for savedDirectoryName");

        this.savedDirectoryName = stringRes;
    }

    public int getGridHorizontalSpacing() {
        return gridHorizontalSpacing;
    }

    public void setGridHorizontalSpacing(int horizontalSpacing) {
        if (horizontalSpacing <= 0)
            throw new IllegalArgumentException("Invalid value for horizontalSpacing");

        gridHorizontalSpacing = horizontalSpacing;
    }

    public int getGridVerticalSpacing() {
        return gridVerticalSpacing;
    }

    public void setGridVerticalSpacing(int verticalSpacing) {
        if (verticalSpacing <= 0)
            throw new IllegalArgumentException("Invalid value for horizontalSpacing");

        gridVerticalSpacing = verticalSpacing;
    }

    public int getSelectedBottomHeight() {
        return selectedBottomHeight;
    }

    public void setSelectedBottomHeight(@DimenRes int dimenRes) {
        if (dimenRes <= 0)
            throw new IllegalArgumentException("Invalid value for selectedBottomHeight");

        this.selectedBottomHeight = dimenRes;
    }

    public int getSelectedBottomColor() {
        return selectedBottomColor;
    }

    public void setSelectedBottomColor(@ColorRes int colorRes) {
        if (colorRes <= 0)
            throw new IllegalArgumentException("Invalid value for selectedBottomColor");

        this.selectedBottomColor = colorRes;
    }

    public int getToolbarTitleRes() {
        return toolbarTitleRes;
    }

    public void setToolbarTitleRes(@StringRes int toolbarTitleRes) {
        if (toolbarTitleRes <= 0)
            throw new IllegalArgumentException("Invalid value for toolbarTitleRes");

        this.toolbarTitleRes = toolbarTitleRes;
    }

    public int getSelectedTitleRes() {
        return selectedTitleRes;
    }

    public void setSelectedTitleRes(@StringRes int selectedTitleRes) {
        if (selectedTitleRes <= 0)
            throw new IllegalArgumentException("Invalid value for selectedTitleRes");

        this.selectedTitleRes = selectedTitleRes;
    }

    public int getNoImageRes() {
        return noImageRes;
    }

    public void setNoImageRes(@StringRes int noImageRes) {
        if (noImageRes <= 0)
            throw new IllegalArgumentException("Invalid value for noImageRes");

        this.noImageRes = noImageRes;
    }


    public int getTabBackgroundColor() {
        return tabBackgroundColor;
    }

    public void setTabBackgroundColor(@ColorRes int colorRes) {
        if (colorRes <= 0)
            throw new IllegalArgumentException("Invalid value for tabBackgroundColor");


        this.tabBackgroundColor = colorRes;

    }


    public int getTabSelectionIndicatorColor() {
        return tabSelectionIndicatorColor;
    }

    /**
     * Sets selected tab indicator color.
     */
    public void setTabSelectionIndicatorColor(@ColorRes int colorRes) {
        if (colorRes <= 0) throw new IllegalArgumentException("Invalid value for tabSelectionIndicatorColor");


        this.tabSelectionIndicatorColor = colorRes;

    }

    public int getSelectionLimit() {
        return selectionLimit;
    }

    /**
     * Limit the number of images that can be selected. By default the user can
     * select infinite number of images.
     *
     * @param selectionLimit
     */
    public void setSelectionLimit(int selectionLimit) {
        this.selectionLimit = selectionLimit;

    }

    public int getSelectionMin() {
        return selectionMin;
    }

    public void setSelectionMin(int selectionmin) {
        selectionMin = selectionmin;

    }


    public int getCameraBtnImage() {
        return cameraBtnImage;
    }

    public void setCameraBtnImage(@DrawableRes int drawableRes) {
        if (drawableRes <= 0) throw new IllegalArgumentException("Invalid value for cameraBtnImage");
        this.cameraBtnImage = drawableRes;
    }

    public int getCameraBtnBackground() {
        return cameraBtnBackground;
    }

    public void setCameraBtnBackground(@DrawableRes int drawableRes) {
        if (drawableRes <= 0) throw new IllegalArgumentException("Invalid value for cameraBtnBackground");
        this.cameraBtnBackground = drawableRes;
    }


    public int getSelectedCloseImage() {
        return selectedCloseImage;
    }

    public void setSelectedCloseImage(@DrawableRes int drawableRes) {
        if (drawableRes <= 0) throw new IllegalArgumentException("Invalid value for selectedCloseImage");

        this.selectedCloseImage = drawableRes;
    }

    public int getCloseImageHeight() {
        return closeImageHeight;
    }

    public void setCloseImageHeight(@DimenRes int dimenRes) {
        if (dimenRes <= 0) throw new IllegalArgumentException("Invalid value for closeImageHeight");

        this.closeImageHeight = dimenRes;
    }

    public int getCloseImageWidth() {
        return closeImageWidth;
    }

    public void setCloseImageWidth(@DimenRes int dimenRes) {
        if (dimenRes <= 0) throw new IllegalArgumentException("Invalid value for closeImageWidth");

        this.closeImageWidth = dimenRes;
    }

    public int getCloseImageMargin() {
        return closeImageMargin;
    }

    public void setCloseImageMargin(@DimenRes int dimenRes) {
        if (dimenRes <= 0) throw new IllegalArgumentException("Invalid value for closeImageMargin");

        this.closeImageMargin = dimenRes;
    }

    public void setLayoutAnimationDisabled(boolean value) {
        layoutAnimationDisabled = value;
    }

    public boolean isLayoutAnimationDisabled() {
        return layoutAnimationDisabled;
    }


    public boolean isFlashOn(){
        return flashOn;
    }

    public void setFlashOn(boolean flashOn){
        this.flashOn = flashOn;
    }
}
