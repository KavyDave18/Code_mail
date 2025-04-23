package com.kavydave.codemail.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OutboxViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private final MutableLiveData<String> mText;

    public OutboxViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("These are your outbox mails..");
    }

    public LiveData<String> getText() {
        return mText;
    }
}