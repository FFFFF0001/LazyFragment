package com.mifind.lazyfragvpdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by wei on 2017/2/9.
 */

public class Fragment1 extends BaseFragment {

    private WebView webView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_1, container, false);
        webView = new WebView(getContext());
        view.addView(webView);
        return view;
    }

    @Override
    protected void onPageLoad() {
        String summary = "<html><body>This is <b>First</b> Page.</body></html>";
        webView.loadData(summary, "text/html", null);
    }

}
