package com.rozdoum.socialcomponents.main.editProfile;

import com.rozdoum.socialcomponents.main.pickImageBase.PickImageView;

public interface EditProfileView extends PickImageView {
    void setName(String username);

    void setProfilePhoto(String photoUrl);

    String getNameText();

    void setNameError(String string);
}
