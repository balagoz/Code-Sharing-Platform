package com.rozdoum.socialcomponents.main.search.posts;

import com.rozdoum.socialcomponents.main.base.BaseFragmentView;
import com.rozdoum.socialcomponents.model.Post;

import java.util.List;

public interface SearchPostsView extends BaseFragmentView {
    void onSearchResultsReady(List<Post> posts);
    void showLocalProgress();
    void hideLocalProgress();
    void showEmptyListLayout();
}
