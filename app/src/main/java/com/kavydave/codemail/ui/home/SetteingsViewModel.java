package com.kavydave.codemail.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SetteingsViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private final MutableLiveData<String> mText;

    public SetteingsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Wait the Setting is being opend");
    }

    public LiveData<String> getText() {
        return mText;
    }
}