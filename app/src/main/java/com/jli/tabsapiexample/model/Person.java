package com.jli.tabsapiexample.model;

import android.support.annotation.NonNull;

import com.jli.tabsapiexample.model.minor.ContactDetail;

import java.util.List;
import java.util.Map;

public class Person extends BaseData {

    String mName;
    String mSortName;
    String mGivenName;
    String mImageUrl;
    String mGender;
    String mSummary;
    String mNationalIdentity;
    String mBiography;
    String mBirthdate;
    String mDeathDate;

    List<ContactDetail> mContactDetails;

    Map<String, String> mExtra;


    public Person(@NonNull String id, @NonNull String type, String name, String sortName,
                  String givenName, String imageUrl, String gender, String summary, String identity,
                  String biography, String birthdate, String deathDate, List<ContactDetail> contacts,
                  Map<String, String> extra) {
        super(id, type);
        mName = name;
        mSortName = sortName;
        mGivenName = givenName;
        mImageUrl = imageUrl;
        mGender = gender;
        mSummary = summary;
        mNationalIdentity = identity;
        mBiography = biography;
        mBirthdate = birthdate;
        mDeathDate = deathDate;
        mContactDetails = contacts;
        mExtra = extra;
    }
}