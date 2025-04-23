package com.kavydave.codemail.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Trash123ViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private final MutableLiveData<String> mText;

    public Trash123ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This all are Trash mails....");
    }

    public LiveData<String> getText() {
        return mText;
    }
}