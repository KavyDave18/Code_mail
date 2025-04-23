package com.kavydave.codemail.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Welcome to home page.\nI am kavy dave working on Android development an anthusiastic developer.\nPlease help me my college gives me too much burden...");
    }

    public LiveData<String> getText() {
        return mText;
    }
}