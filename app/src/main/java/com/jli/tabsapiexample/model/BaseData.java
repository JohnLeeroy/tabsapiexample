package com.jli.tabsapiexample.model;

import android.support.annotation.NonNull;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class BaseData {
    @PrimaryKey
    private String mId;
    private String mType;

    public BaseData(@NonNull String id, @NonNull String type) {
        mId = id;
        mType = type;
    }

    public String getType() { return mType; }
    public String getId() { return mId; }
}
