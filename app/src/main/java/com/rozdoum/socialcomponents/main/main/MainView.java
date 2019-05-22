package com.rozdoum.socialcomponents.main.main;

import android.view.View;

import com.rozdoum.socialcomponents.main.base.BaseView;
import com.rozdoum.socialcomponents.model.Post;

public interface MainView extends BaseView {
    void openCreatePostActivity();
    void hideCounterView();
    void openPostDetailsActivity(Post post, View v);
    void showFloatButtonRelatedSnackBar(int messageId);
    void openProfileActivity(String userId, View view);
    void refreshPostList();
    void removePost();
    void updatePost();
    void showCounterView(int count);
}
