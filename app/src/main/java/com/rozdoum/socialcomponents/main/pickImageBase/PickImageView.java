package com.rozdoum.socialcomponents.main.pickImageBase;

import android.net.Uri;

import com.rozdoum.socialcomponents.main.base.BaseView;

public interface PickImageView extends BaseView {
    void hideLocalProgress();

    void loadImageToImageView(Uri imageUri);
}
