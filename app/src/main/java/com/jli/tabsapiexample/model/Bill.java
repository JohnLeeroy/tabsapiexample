package com.jli.tabsapiexample.model;

import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by johnli on 1/16/16.
 */
public class Bill extends BaseData{

    public Bill(@NonNull String id, @NonNull String type) {
        super(id, type);
    }


    public Bill(@NonNull String id, @NonNull String type, String billId, String title, String legislativeName,
                String legislativeSessionId, String[] classification, String[] subjects) {
        super(id, type);
        mBillId = billId;
        mTitle = title;
        mLegislativeSessionId = legislativeSessionId;
        mLegislativeSessionName = legislativeName;
        mClassification = classification;
        mSubjects = subjects;
    }

    String mBillId;
    String mTitle;
    String mLegislativeSessionName;
    String mLegislativeSessionId;
    String[] mClassification;
    String[] mSubjects;

}
