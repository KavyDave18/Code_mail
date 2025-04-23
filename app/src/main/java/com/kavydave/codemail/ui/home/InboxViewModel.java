package com.kavydave.codemail.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InboxViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public InboxViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Your Inbox mails are here...");
    }
    public LiveData<String> getText() {
        return mText;
    }
}