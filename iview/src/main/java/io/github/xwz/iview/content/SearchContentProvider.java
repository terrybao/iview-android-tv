package io.github.xwz.iview.content;

import android.database.Cursor;

import io.github.xwz.base.content.SearchProviderBase;

public class SearchContentProvider extends SearchProviderBase {

    public static String AUTHORITY = "io.github.xwz.iview.search";

    @Override
    protected String getAuthority() {
        return AUTHORITY;
    }

    @Override
    protected Cursor getSuggestions(String query) {
        return ContentManager.getInstance().searchShowsCursor(query);
    }
}
